package controllers

import javax.inject._

import play.api.mvc._
import play.api.libs.json.{JsError, JsSuccess, Json}
import model._

@Singleton
class WannaTagController @Inject()( components: ControllerComponents ) extends AbstractController( components ) {

  def getWannaTags( compare: String, postDate: Long, limit: Int ) = Action {
    val json = """
    {
      "wannatagId": 1111,
      "title": "sample1",
      "body": "this wannatag is sample1.",
      "username": "sample user A",
      "postDate": 1234567890123,
      "isOwner": true
    }
    """

    Json.parse( json ).validate[WannaTag] match {
      case wannatags: JsSuccess[WannaTag] => Ok( Json.toJson( wannatags.get ) )
      case _: JsError => BadRequest( Json.toJson( "{}" ))
    }
  }

  def saveWannaTag = Action( parse.json ) { implicit request =>
    request.body.validate[WannaTag].map{
      case wannatag => {
        println( wannatag.wannatagId )
        println( wannatag.title )
        println( wannatag.body )
        println( wannatag.username )
        println( wannatag.postDate )
        println( wannatag.isOwner )
        Ok( "saved!" )
      }
    }.recoverTotal{
      case _ => {
        println( "error" )
        BadRequest( "Error!" )
      }
    }
    Ok( "saved!")
  }

  def deleteWannaTag( postDate: Long ) = Action( Ok( "Deleted!" ) )

}
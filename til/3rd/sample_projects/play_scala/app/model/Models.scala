package model

import play.api.libs.json.Json

case class WannaTag( wannaTagId: Int, title: String, body: String, username: String, postDate: Long, isOwner: Boolean )
object WannaTag {
  implicit def jsonWrites = Json.writes[WannaTag]
  implicit def jsonReads = Json.reads[WannaTag]
}

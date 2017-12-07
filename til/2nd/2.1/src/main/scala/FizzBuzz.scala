package com.github.tiloom6.tiloom6doc.til.fizzbuzz

final case class FizzBuzz( from: Int, to: Int ) {

  def toArray = ( from to to ).map( FizzBuzzer.convert ).toArray

}
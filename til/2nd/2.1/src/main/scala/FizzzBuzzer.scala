package com.github.tiloom6.tiloom6doc.til.fizzbuzz

final object FizzBuzzer {

  def convert( number: Int ) = number match {
    case n if ( n % 15 == 0 ) => "FizzBuzz"
    case n if ( n % 3 == 0 ) => "Fizz"
    case n if ( n % 5 == 0 ) => "Buzz"
    case _ => number.toString
  }

}
package com.github.tiloom6.tiloom6doc.til.test.fizzbuzz

import org.scalatest._

class FizzBuzzerSpec extends FlatSpec with DiagrammedAssertions {
  import com.github.tiloom6.tiloom6doc.til.fizzbuzz._

  it should "3の倍数だったら'Fizz'" in {
    assert( FizzBuzzer.convert( 3 ) === "Fizz" )
  }

  it should "5の倍数だったら'Buzz'" in {
    assert( FizzBuzzer.convert( 5 ) === "Buzz" )
  }

  it should "3と5の倍数だったら'FizzBuzz'" in {
    assert( FizzBuzzer.convert( 15 ) === "FizzBuzz" )
  }

  it should "3もしくは5の倍数ではなかったら'数字'" in {
    assert( FizzBuzzer.convert( 2 ) === "2" )
  }
}
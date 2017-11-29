import org.scalatest._

class FizzBuzzTypeSpec extends FlatSpec with DiagrammedAssertions {
  it should "3の倍数だったら'Fizz'" in {
    assert(FizzBuzz.convert(3) === "Fizz")
  }

  it should "5の倍数だったら'Buzz'" in {
    assert(FizzBuzz.convert(5) === "Buzz")
  }

  it should "3と5の倍数だったら'FizzBuzz'" in {
    assert(FizzBuzz.convert(15) === "FizzBuzz")
  }

  it should "3もしくは5の倍数ではなかったら'数字'" in {
    assert(FizzBuzz.convert(2) === "2")
  }
}
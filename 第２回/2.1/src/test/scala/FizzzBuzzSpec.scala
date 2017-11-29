import org.scalatest._

class FizzBuzzTypeSpec extends FlatSpec with DiagrammedAssertions {
  it should "3の倍数だったら'Fizz'" in {
    assert(FizzBuzz.convert(3) === "Fizz")
  }

  it should "3の倍数ではなかったら'数字'" in {
    assert(FizzBuzz.convert(2) === "2")
  }

  it should "5の倍数だったら'Buzz'" in {
    assert(FizzBuzz.convert(5) === "Buzz")
  }
}
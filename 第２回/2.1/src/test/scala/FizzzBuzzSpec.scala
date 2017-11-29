import org.scalatest._

class FizzBuzzTypeSpec extends FlatSpec with DiagrammedAssertions {
  it should "3の代わりに'Fizz'" in {
    val value = FizzBuzz.convert(3)
    assert(value === "Fizz")
  }

  it should "6の代わりに'Fizz'" in {
    val value = FizzBuzz.convert(6)
    assert(value === "Fizz")
  }
}
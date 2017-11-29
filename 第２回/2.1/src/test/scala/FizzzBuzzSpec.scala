import org.scalatest._

class FizzBuzzTypeSpec extends FlatSpec with DiagrammedAssertions {
  it should "3の代わりに'Fizz'" in {
    val value = FizzBuzz.convert(3)
    assert(value === "Fizz")
  }
}
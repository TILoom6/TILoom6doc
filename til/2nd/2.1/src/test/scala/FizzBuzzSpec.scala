import org.scalatest._

class FizzBuzzSpec extends FlatSpec with DiagrammedAssertions {
  it should "1から100までの数にFizzBuzzを適用する" in {
    val expectation = Array(
      "1", "2", "Fizz", "4", "Buzz",
      "Fizz", "7", "8", "Fizz", "Buzz",
      "11", "Fizz", "13", "14", "FizzBuzz"
    )
    val result = new FizzBuzz(1, 100).toArray()
    assert(result.length === 100)
    assert(result.slice(0, 15) === expectation)
  }
}
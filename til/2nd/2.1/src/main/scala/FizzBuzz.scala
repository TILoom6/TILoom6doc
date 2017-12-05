class FizzBuzz(val from:Int, val to:Int) {
  def toArray(): Array[String] = {
    Range(from, to + 1, 1).map(i => FizzBuzzer.convert(i)).toArray
  }
}
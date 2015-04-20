package week1


object test {
  def main(args: Array[String]) {
    trait Generator[+T] {
      def generate: T
    }

    val integers = new Generator[Int] {
      val rand = new java.util.Random()
      def generate = rand.nextInt()
    }

    println(integers.generate)
  }
}




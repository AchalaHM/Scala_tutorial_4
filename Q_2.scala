object Q_2 extends App {

  println("Enter the number : ")
  val user_input: Int = scala.io.StdIn.readInt()

  user_input match {
    case x if 0 >= x => println("Negative/Zero")
    case x if x % 2 == 0 => println("Even number is given ")
    case x if x % 2 != 0 => println("Odd number is given ")
  }
}

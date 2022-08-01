object Q_1 extends App {
  def interest(amount : Double) : Double =
    amount match {

      case x if x < 20000 => x * 0.02;
      case x if x < 200000 => x * 0.04;
      case x if x < 2000000 => x * 0.035;
      case x if x >= 2000000 => x * 0.065;
    }

  println(interest(15000))
  println(interest(100000))
  println(interest(457500.00))
  println(interest(3500000))
}

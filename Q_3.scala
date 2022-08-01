object Q_3 {

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny",toUpper(_)))
    println(formatNames("Niroshan".substring(0,2), toUpper(_)) + formatNames("Niroshan".substring(2),toLower(_)))
    println(formatNames("Saman",toLower(_)))
    println(formatNames("Kumara".substring(0,1), toUpper(_)) + formatNames("Kumara".substring(1,5),toLower(_)) + formatNames("Kumara".substring(5),toUpper(_)))
  }

  def toUpper(text: String): String ={
    text.toUpperCase()
  }

  def toLower(text: String): String={
    text.toLowerCase()
  }

  def formatNames(name: String, func: String => String):String ={
    func(name)
  }
}

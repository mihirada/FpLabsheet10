object question1 {

  def convertFahrenheit(cTem:Int) : Double ={
    val fTem = (cTem * 9/5) + 32
    fTem
  }
  def calculateAverage(input: List[Int]) : Double = {
    (input.map(in=>convertFahrenheit(in)).reduce((x,y)=>x+y))/ input.length
  }

  def main(args: Array[String]) : Unit ={
    val myList = List(0, 10, 20, 30)
    val averageTemperature = calculateAverage(myList)
    println(s"Average Fahrenheit Temperatuer :$averageTemperature")
  }

}

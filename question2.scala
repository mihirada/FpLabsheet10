object question2 {
  def countLetterOccurances(mylist:List[String]): Int ={
    mylist.map(l=>l.length).reduce((x,y)=>x+y)
  }

  def main(args: Array[String]) : Unit ={
    val input = List("apple","banana","cherry","date")
    val output = countLetterOccurances(input)
    println(s"Total count of Letters : $output")
  }
}

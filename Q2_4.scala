object Q2_4 {
  def main(args: Array[String]): Unit = {
    printf("Enter a number: ")
    val number = scala.io.StdIn.readInt()
    val pattern = patternMatching(number)
  }

  def patternMatching(num: Int): Unit = {
    if(num <= 0) {
      print("Negative / Zero is input")
    }
    else if(num % 2 == 0){
      print("Even number is given")
    }
    else{
      print("Odd number is given")
    }
  }
}

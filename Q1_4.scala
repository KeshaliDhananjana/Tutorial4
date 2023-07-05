object Q1_4 {
  def main(args: Array[String]): Unit = {
    print("Enter the amount: ")
    val amount = scala.io.StdIn.readDouble()
    val interest = calculateInterest(amount: Double)
    print(s"Interest amount: Rs." + interest)
  }

  def calculateInterest(amount: Double): Double = {
    if (amount <= 20000) {
      return amount * 0.02
    }
    else if (amount <= 200000) {
      return amount * 0.04
    }
    else if (amount <= 2000000) {
      return amount * 0.035
    }
    else {
      return amount * 0.065
    }
  }
}

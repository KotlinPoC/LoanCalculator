package abcbank
/**
 *  Loan Calculator class, converted from the original Java
 *  
 **/
class LoanCalculator {
  var loanAmount:Double = 0.toDouble()
  var numberOfYears:Int = 0
  var yearlyInterestRate:Double = 0.toDouble()
  //calculate the monthly payment
  val monthlyPayment:Double
  get() {
    val monthlyPayment:Double
    val monthlyInterestRate:Double
    val numberOfPayments:Int
    if (numberOfYears != 0 && yearlyInterestRate != 0.0)
    {
      monthlyInterestRate = yearlyInterestRate / 1200
      numberOfPayments = numberOfYears * 12
      monthlyPayment = ((loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow((1 + monthlyInterestRate), numberOfPayments.toDouble()))))
      monthlyPayment = Math.round(monthlyPayment * 100) / 100.0
    }
    else
    monthlyPayment = 0.0
    return monthlyPayment
  }
  val totalCostOfLoan:Double
  get() {
    return monthlyPayment * numberOfYears.toDouble() * 12.0
  }
  val totalInterest:Double
  get() {
    return totalCostOfLoan - loanAmount
  }
  // no default no arg constructor generated if a constructor with args is delcared pmc
  constructor() {}
  constructor(loanAmount:Double, numberOfYears:Int,
              yearlyInterestRate:Double) {
    this.loanAmount = loanAmount
    this.numberOfYears = numberOfYears
    this.yearlyInterestRate = yearlyInterestRate
  }
  inner class LoanCalculator {
    var loanAmount:Double = 0.toDouble()
    var numberOfYears:Int = 0
    var yearlyInterestRate:Double = 0.toDouble()
    //calculate the monthly payment
    val monthlyPayment:Double
    get() {
      val monthlyPayment:Double
      val monthlyInterestRate:Double
      val numberOfPayments:Int
      if (numberOfYears != 0 && yearlyInterestRate != 0.0)
      {
        monthlyInterestRate = yearlyInterestRate / 1200
        numberOfPayments = numberOfYears * 12
        monthlyPayment = ((loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow((1 + monthlyInterestRate), numberOfPayments.toDouble()))))
        monthlyPayment = Math.round(monthlyPayment * 100) / 100.0
      }
      else
      monthlyPayment = 0.0
      return monthlyPayment
    }
    val totalCostOfLoan:Double
    get() {
      return monthlyPayment * numberOfYears.toDouble() * 12.0
    }
    val totalInterest:Double
    get() {
      return totalCostOfLoan - loanAmount
    }
    // no default no arg constructor generated if a constructor with args is delcared pmc
    constructor() {}
    constructor(loanAmount:Double, numberOfYears:Int,
                yearlyInterestRate:Double) {
      this.loanAmount = loanAmount
      this.numberOfYears = numberOfYears
      this.yearlyInterestRate = yearlyInterestRate
    }
    public override fun toString():String {
      return (loanAmount + "," + numberOfYears + "," +
              yearlyInterestRate)
    }
  }
  public override fun toString():String {
    return (loanAmount + "," + numberOfYears + "," +
            yearlyInterestRate)
  }
}
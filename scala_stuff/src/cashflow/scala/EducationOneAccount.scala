package cashflow.scala

import java.time.LocalDateTime
import java.time.temporal.TemporalAmount

import cashflow.scala.EducationOneAccount.CheckingAccount

class EducationOneAccount {
  abstract class Account{
    var amount: Double
    val accountOwnerId: Long

//    def this(amount: Double, accountOwnerId: Long) = this(amount, accountOwnerId)

    def deposit(amountToDeposit: Double): Unit = {
      amount += amountToDeposit
    }

//    def deposit(amountToDeposit: Double, cashflow: Cashflow): Unit ={
//      if(cashflow.currency == "USD"){
//
//      }
//    }

    def withdraw(amountToWithdraw: Double): String = {
      if(amountToWithdraw > amount){
        println("Insufficient balance in the account to be withdrawn")
      }else{
        amount -= amountToWithdraw
      }
      s"total Balance remaining in the account after withdrawal: $amount"
    }
  }

  class CheckingAccount extends Account{

    override var amount: Double = _
    override val accountOwnerId: Long = _
  }
}

object EducationOneAccount{
  def main(args: Array[String]): Unit ={
    val checkAccount = new EducationOneAccount
    checkAccount

  }
}

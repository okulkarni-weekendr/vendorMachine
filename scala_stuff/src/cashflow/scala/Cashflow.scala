package cashflow.scala

import java.time.{LocalDate, LocalDateTime}
import java.time.temporal.TemporalAmount

class Cashflow(val amount: Double, val currency: String, val due: LocalDateTime){
  def this(amount: Double, due: LocalDateTime) = this(amount, "USD", due)

  def this(amount: Double) = this(amount, "GBP", LocalDateTime.now())

  val settle: LocalDate = due.toLocalDate.plusDays(2)
  private lazy val processedAt = LocalDateTime.now

  def rollForward(): Cashflow = {
    val retval = new Cashflow(amount, currency, due.plusDays(1))
    retval.processedAt
    retval
  }
}

object Cashflow{
  def main(args: Array[String]): Unit = {
    val c1 = new Cashflow(100.23)
    println(c1.currency)
    val c2 = new Cashflow(300.00, LocalDateTime.now)
    Thread.sleep(1000)
    println(c1.settle)
    println(c2.rollForward())
    println(c1.processedAt)
  }
}

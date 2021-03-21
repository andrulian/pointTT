package tasks

import scala.io.StdIn

/* Написать программу, которая принимает строку в консоли и говорит это валидный email или нет */
object Third extends App {

  val pattern = """(?=[^\s]+)(?=(\w+)@([\w\.]+))""".r

  def readInp: String = StdIn.readLine("email: ")

  pattern.findFirstMatchIn(readInp) match {
    case Some(_) => println("Valid email")
    case None => println("Invalid email")
  }

}

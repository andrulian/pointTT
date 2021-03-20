package tasks

/* Написать программу, которая принимает строку в консоли и говорит это валидный email или нет */
object Third extends App {

  val pattern = """^[a-zA-Z0-9\.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9]
      |(?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$""".r

  val valid = "valid@email.com"
  val invalid = "valid#em.ail.com"



}

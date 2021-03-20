package tasks

/* Есть строка, нужно используя методы коллекций скалы, сгруппировать буквы по символу, отсортировать группы по
* количеству символов и сджойнить группы в одну строку. Пример: “abcaba” -> “aaabbc” или “aacbc” -> “aaccb”
*/
object First extends App {

  val t = "asdasdaaaweqbbbbasdasd".groupBy(_.toLower).toSeq.map(_._2).sortBy(- _.length).mkString

  // группы с одинаковым кол-вом символов могут быть в произвольном порядке, например “qwe” или “eqw”
  assert(t == "aaaaaaassssddddbbbbwqe" ||
         t == "aaaaaaassssddddbbbbweq" ||
         t == "aaaaaaassssddddbbbbqwe" ||
         t == "aaaaaaassssddddbbbbqew" ||
         t == "aaaaaaassssddddbbbbewq" ||
         t == "aaaaaaassssddddbbbbeqw"
  )

}

package tasks

/* Написать функцию, которая будет проверять являются ли два дерева одинаковыми. Желателен рекурсивный подход без
* переменных.
*/
object Second extends App {

  case class TreeNode[X](value: X, left: Option[TreeNode[X]], right: Option[TreeNode[X]])
  def isSameTree[X](p: Option[TreeNode[X]], q: Option[TreeNode[X]]): Boolean = {
    ???
  }

  val simpleP = TreeNode(1, None, None)
  val simpleQ = TreeNode(1, None, None)
  assert(isSameTree(Some(simpleP), Some(simpleQ)))
  val p = TreeNode(1, Some(TreeNode(2, None, None)), None)
  val q = TreeNode(1, None, Some(TreeNode(2, None, None)))
  assert(!isSameTree(Some(p), Some(q)))

}

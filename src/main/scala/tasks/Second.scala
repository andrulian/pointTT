package tasks

/* Написать функцию, которая будет проверять являются ли два дерева одинаковыми. Желателен рекурсивный подход без
* переменных.
*/
object Second extends App {

  case class TreeNode[X](value: X, left: Option[TreeNode[X]], right: Option[TreeNode[X]])

  /*
  def isSameTree[X](p: Option[TreeNode[X]], q: Option[TreeNode[X]]): Boolean = {
    (p, q) match {
      case (Some(f), Some(s)) =>
        if (f.value != s.value || f.left.isEmpty != s.left.isEmpty || f.right.isEmpty != s.right.isEmpty) false
        else if (f.left.exists(fl => s.left.exists(sl => !isSameTree(Some(fl), Some(sl))))) false
        else !f.right.exists(fr => s.right.exists(sr => !isSameTree(Some(fr), Some(sr))))
    }
  }
  */

  def isSameTree(p: Option[TreeNode[Int]], q: Option[TreeNode[Int]]): Boolean =
    (p, q) match {

      case (None, None) => true
      case (None, _)    => false
      case (_, None)    => false
      case (
        Some(TreeNode(pValue, pLeft, pRight)),
        Some(TreeNode(qValue, qLeft, qRight))
        ) =>
        pValue == qValue && isSameTree(pLeft, qLeft) && isSameTree(
          pRight,
          qRight
        )
    }

  val simpleP = TreeNode(1, None, None)
  val simpleQ = TreeNode(1, None, None)

  assert(isSameTree(Some(simpleP), Some(simpleQ)))

  val p = TreeNode(1, Some(TreeNode(2, None, None)), None)
  val q = TreeNode(1, None, Some(TreeNode(2, None, None)))

  assert(!isSameTree(Some(p), Some(q)))

}

package u03

import u03.Lists.List._
import Lists._
import u02.Optionals.Option

object Task2 {

  def max(l: List[Int]): Option[Int] = {
    def _max(l:List[Int], n:Option[Int]): Option[Int] = l match {
      case Cons(h,_) => _max(filter(l)(_>h),Option.Some(h))
      case _ => n
    }
    _max(l,Option.None())
  }

}

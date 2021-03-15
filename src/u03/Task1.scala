package u03

import u03.Lists.List._

object Task1 {

  import Lists._

  def drop[A](l: List[A], nElemToDelete: Int): List[A] = l match {
    case Cons(_,t) if nElemToDelete > 0 => drop(t,nElemToDelete-1)
    case Cons(h,t) => Cons(h,t)
    case _ => Nil()
  }

  def flatMap[A,B](l: List[A])(f: A => List[B]): List[B] = l match {
    case Cons(h,t) => append(f(h), flatMap(t)(f))
    case _ => Nil()
  }

  def mapFlatMap[A,B](l: List[A])(mapper: A=>B): List[B] = l match {
    case Cons(_,_) => flatMap(l)(x => Cons(mapper(x),Nil()))
    case _ => Nil()
  }

  def filterFlatMap[A](l: List[A])(pred: A=>Boolean): List[A] = l match {
    case Cons(h,t) => ???
    case _ => Nil()
  }

}

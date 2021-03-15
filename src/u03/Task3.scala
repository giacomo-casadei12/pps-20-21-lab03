package u03

import u03.Lists.List._
import Lists._
import u02.SumTypes.Teacher
import Task1._

object Task3 {

  def getCourse[Person](p: Person): List[String] = p match {
    case Teacher(_,c) => Cons(c,Nil())
    case _ => Nil()
  }

  def extractCourses[Person](l: List[Person]): List[String] = l match {
    case Cons(h,t) => flatMap(filter(l)(_.isInstanceOf[Teacher]))(getCourse(_))
    case _ => Nil[String]()
  }

}

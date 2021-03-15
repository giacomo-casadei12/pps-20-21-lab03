package u03

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u03.Lists.List
import u03.Lists.List._

object Task1Test {

  import Task1._

  val l = Cons(10, List.Cons(20, List.Cons(30, List.Nil())))

  @Test def dropTest(): Unit ={
    assertEquals(Cons(20,Cons(30,Nil())), drop(l,1))
    assertEquals(Cons(30,Nil()), drop(l,2))
    assertEquals(Nil(), drop(l,4))
  }

  @Test def flatMapTest() = {
    assertEquals(Cons(11, List.Cons(21, List.Cons(31, List.Nil()))), flatMap(l)(v => Cons(v+1, Nil())))
    assertEquals(Cons(11,Cons(12,Cons(21,Cons(22,Cons(31,Cons(32,Nil())))))),flatMap(l)(v => Cons(v+1,Cons(v+2,Nil()))))
  }

  @Test def mapWithFlatMapTest() = {
    assertEquals(Cons(11, List.Cons(21, List.Cons(31, List.Nil()))), mapFlatMap(l)(v => v+1))
    assertEquals(Cons("10", List.Cons("20", List.Cons("30", List.Nil()))), mapFlatMap(l)(v => v.toString()))
  }

  @Test def filterWithFlatMap() = {
    assertEquals(List.Cons(20, List.Cons(30, List.Nil())), filterFlatMap(l)(v => v>15))
  }
}

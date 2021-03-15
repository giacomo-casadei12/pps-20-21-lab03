package u03
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u03.Lists.List
import u03.Lists.List._
import Task2._
import u02.Optionals.Option

object Task2Test {

  val l = Cons(10, List.Cons(20, List.Cons(30, List.Nil())))

  @Test def testMax() = {
    assertEquals(Option.Some(30),max(l))
    assertEquals(Option.None(),max(Nil()))
  }

}

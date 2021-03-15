package u03

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u03.Lists.List
import u03.Lists.List._
import Task3._
import u02.SumTypes.{Person, Student, Teacher}


object Task3Test {
  val listWithTeachers: List[Person] = Cons(Student("mario",2015), Cons(Teacher("viroli","oop"), Cons(Teacher("ricci","conc"), List.Nil())))
  val listWithoutTeachers: List[Person] = Cons(Student("mario",2015), Cons(Student("casadei",2020), Cons(Student("bazzocchi",2020), List.Nil())))
  val listWithOnlyTeachers: List[Person] = Cons(Teacher("ghini","so"), Cons(Teacher("viroli","oop"), Cons(Teacher("ricci","conc"), List.Nil())))

  @Test def testExtractCourses() = {
    assertEquals(List.Cons("oop",List.Cons("conc",Nil())), extractCourses(listWithTeachers))
    assertEquals(Nil(), extractCourses(Nil()))
    assertEquals(Nil(),extractCourses(listWithoutTeachers))
    assertEquals(List.Cons("so", List.Cons("oop",List.Cons("conc",Nil()))), extractCourses(listWithOnlyTeachers))
  }

}

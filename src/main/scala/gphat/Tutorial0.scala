package gphat

/* Import a thing */
import scala.collection.Map
/* Import a few things */
import scala.collection.{Map,SortedMap}
/* Import all the things */
import scala.collection._

/* Make a class, more on that later. */
class Tutorial0 {

  /* Vals are immutable values */
  val foo: String = ""

  /* Vars are mutable values */
  var bar: String = ""

  /* Lazy values are not computed until they are used! */
  lazy val baz = "Something expensive to compute!"

  /* Unlike Java, Scala does not have primitive types. */
  // Unit is nothing, like void
  val a: Any = 1        // This can be any-damned thing!
  val c: Boolean = true // true or false
  val d: String = "asd" // self-explanatory
  val e: Int = 1
  val f: Long = 1
  val g: Double = 1.0
  val h: Float = 1.0F
  val i: Short = 1
  val j: Char = 'c'
  val k: Byte = '1'
}
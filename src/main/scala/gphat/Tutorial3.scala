/* Case classes can be seen as plain and immutable data-holding objects that
 * should exclusively depend on their constructor arguments.
 * Case classes get toString, equals and hashCode automatically.
 * They also get a companion object which has an apply and unapply method,
 * which we'll cover in a sec.
 */
case class Person3(name: String, age: Int) {

  def sayHi = println("Hello, " + name + "!")
}

object Hi3 {

  def main(args: Array[String]) = {
    // Create an instance of the case class. Notice the lack of new.
    val p = Person3("Cory", 32)
    p.sayHi

    // Why no new? Scala has syntactic sugar that Foo(x) get turned into
    // Foo.apply(x).
    //
    // The aforementioned unapply returns the attributes given to the
    // constructor: unapply() returns (name: String, age: Int)
  }
}

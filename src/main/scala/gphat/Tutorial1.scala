package gphat

/**
 * Your average, everyday hello world.
 *
 * Object? Yup. An object is a singleton.  It's effectively a bag of static
 * methods, in Java-speak.
 */
object Tutorial1 {

  /**
   * A main method to serve as the entry point of a program, just like
   * Java and C before it.
   *
   * Note the def for a function declaration, the type *after* the argument
   * name and the equals sign.
   */
  def main(args: Array[String]): Unit = {
    println("Hi!")
  }

  /**
   * Here's another function.  Defined for no other reason that to demonstrate
   * the arguments, the ability to set a default and how to specify a return
   * value.
   */
  def upper(anArg: String = "someValue"): String = {
    anArg.toUpperCase
  }

  /* Note that you can invoke functions in scala as either positional or
   * named. upper(anArg = "Cory") or upper("Cory").
   */

  /*
   * Inference is great. Scala can infer the type of a val or var. Note
   * This function has no return type, and the string in it isn't typed.
   * Scala can figure it out for us!
   */
   def something() = {
     val foo = "bar"
     foo
   }
}

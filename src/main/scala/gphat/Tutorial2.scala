package gphat

/**
 * A class. Scala makes things easy and squeezes the constructor right up top
 * with the name of the class.
 */
class Person2(name: String, age: Int) {

  /**
   * You can also make multiple forms of a method, and even of a constructor,
   */
  def this(name: String) = {
    this(name, 0)
  }

  /**
   * Since everything is an expression, even functions, we can skip a function
   * body and just put the expression if it's stylistically and syntactically
   * acceptable.
   *
   * Note this function has no arguments and also no parentheses. This means
   * you don't have to use parens when calling the function either. Yay,
   * brevity!
   */
  def sayHi = println("Hello, " + name + "!")
}

/**
 * Since there is no concept of static, you need to use an object for things
 * like factory methods or constants; traditional static uses.  You can
 * make an object of the same name as a class. This is referred to as a
 * companion object.
 */
object Person2 {

  def defaultName = "Baby"
}

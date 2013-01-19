object Hi4 {
  /* An anonymous function, stored in a val.
   *
   *         (params)       => function body
   */
  val foo = (name: String) => println("Hello, " + name + "!")

  def main(args: Array[String]) = {
    // Call foo, since it's just a Function!
    foo("Cory")
  }
}

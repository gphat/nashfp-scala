object Tutorial6 {

  /**
   * Comprehensions are a way of creating a list from an existing list.
   */
  val numbers = List(1, 2, 3, 4, 5, 6, 7)

  // Using a for-expression
  val doubles = for(i <- numbers) yield i * 2

  // Using map
  val doubles2 = numbers.map({ i => i * 2 })


  /**
   * We can curry functions
   */
  def twoArgs(x: Int, y: Int) = println(x + " " + y)

  def oneArg(y: Int) = twoArgs(6, y)


  /**
   * We can also use pattern matching to find simple things…
   */
  val maybe = true
  maybe match {
    case true => println("So true!")
    case false => println("So false!")
  }

  /**
   * And more interesting things
   */
   val bar: Any = "wheee!"
   bar match {
    // You can even inspect the value and be specific with guards
    case x: Int if x > 100 => println("Got a big number: " + x)
    case x: Int => println("Got a small number:" + x)
    case x: String => println("Got string: " + x)
    case _ => "Got something unknown!"
   }
}
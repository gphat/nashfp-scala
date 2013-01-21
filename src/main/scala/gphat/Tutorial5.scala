package gphat

class Vehicle(wheels: Int) {

  def rev = println("Vroom")

  def start() {
    println("Running")
  }
}

/**
 * Traits are like java's interfaces, but you can actually implement the
 * methods (if you want)
 */
trait Towable {

  def getTowed = {
    println("Awww")
  }
}

/**
 * Scala is single-inheritance, but you can put as many traits as you like.
 */
class Car extends Vehicle(4) with Towable {

  // Want variable wheels for a Car?
  // class Car(wheels: Int) extends Vehicle(wheels) with Towable {

  /* Override! */
  override def start() {
    println("Running like a car!")
  }
}

object Tutorial5 {

  def main(args: Array[String]): Unit = {
    val car = new Car()
    car.rev

    car match {
      case c: Towable => println("We can tow it!")
      case _ => println("Can't town it :(")
    }
    // traits also work at runtime
    // var c = new Car() with Towable
  }
}
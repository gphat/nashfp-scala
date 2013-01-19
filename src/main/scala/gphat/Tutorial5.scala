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

  /* Override! */
  override def start() {
    println("Running like a car!")
  }
}

object Whatever {
  val car = new Car()
  car.rev
}
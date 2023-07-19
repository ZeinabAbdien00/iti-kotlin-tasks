class Picture {
    fun main() {

        val shape1 = Rectangle(5.0, 6.0)
        val shape2 = Triangle(6.0, 5.0)
        val shape3 = Circle(6.0)
        println("Sum all Areas = " + sumAreas(shape1, shape2, shape3))
    }

    private fun sumAreas(shape1: Rectangle, shape2: Triangle, shape3: Circle): Double {
        println("Rectangle Area = " + shape1.calcArea())
        println("Triangle Area = " + shape2.calcArea())
        println("Circle Area = " + shape3.calcArea())

        return shape1.calcArea() + shape2.calcArea() + shape3.calcArea()
    }
}
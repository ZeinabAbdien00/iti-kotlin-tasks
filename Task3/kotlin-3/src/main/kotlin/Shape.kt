abstract class Shape {

    var dim: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    abstract fun calcArea(): Double

}
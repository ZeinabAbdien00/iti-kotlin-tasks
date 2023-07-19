class Rectangle constructor() : Shape() {

    private var height: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    constructor(width: Double, height: Double) : this() {
        this.height = height
        dim = width
    }

    override fun calcArea(): Double {
        return dim * height
    }
}
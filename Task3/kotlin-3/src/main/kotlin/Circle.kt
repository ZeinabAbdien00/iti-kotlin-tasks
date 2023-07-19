class Circle constructor() : Shape() {

    constructor(rad: Double) : this() {
        dim = rad
    }

    override fun calcArea(): Double {
        return 3.14 * dim * dim
    }
}
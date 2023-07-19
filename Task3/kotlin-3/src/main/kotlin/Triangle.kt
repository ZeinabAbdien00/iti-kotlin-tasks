class Triangle constructor() : Shape() {

    private var height: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    constructor(base: Double, height: Double) : this() {
        this.height = height
        dim = base
    }

    override fun calcArea(): Double {
        return 0.5 * dim * height
    }
}
fun main(args: Array<String>) {
    println("Get Full Info Task")
    val alice = Client("Alice", PersonalInfo(email = "alice@gmail.com"), Address(country = "Germany", city = "Munich"))
    println(alice.getFullInfo())
    println("------------")
    println(Client("Bob").getFullInfo())
    println("----------------------------------")
    println("Sum Complex Task")
    println((ComplexNumber(7.0, 8.0) plus ComplexNumber(5.0, 6.0)))
    println("----------------------------------")
    println("Subtract Complex Task")
    println((Complex(5.0, 3.0) - Complex(5.0, 8.0)))
    println("----------------------------------")
    println("Toggle String  Task")
    println("ZeInAb AbDiEn".toggleCase())


}

/**********************************************************************************/

data class Client(val name: String, val perInfo: PersonalInfo = PersonalInfo(), val address: Address = Address())

fun Client.getFullInfo() =
    name + "\n" + perInfo.email + "\n" + address.city + "\n" + address.country + "\n" + address.street

data class PersonalInfo(val email: String = "Unspecified")
data class Address(
    val country: String = "Unspecified",
    val city: String = "Unspecified",
    val street: String = "Unspecified"
)

/**********************************************************************************/

data class ComplexNumber(val real: Double, val imaginary: Double) {
    override fun toString(): String {
        return "$real + ${imaginary}i"
    }
}

infix operator fun ComplexNumber.plus(other: ComplexNumber): String {
    return ComplexNumber(this.real + other.real, this.imaginary + other.imaginary).toString()
}

/**********************************************************************************/

class Complex(private val real: Double, private val imaginary: Double) {
    operator fun minus(other: Complex): String {
        return Complex(real - other.real, imaginary - other.imaginary).toString()
    }

    override fun toString(): String {
        return "$real + ${imaginary}i"
    }

}

/**********************************************************************************/

fun String.toggleCase(): String {
    val result = StringBuilder(this.length)
    for (char in this) {
        val toggledChar = if (char.isLetter()) {
            if (char.isUpperCase()) char.toLowerCase() else char.toUpperCase()
        } else {
            char
        }
        result.append(toggledChar)
    }
    return result.toString()
}


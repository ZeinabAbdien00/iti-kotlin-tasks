fun main(args: Array<String>) {

    var fasterRunner: String? = null
    var secondFasterRunner: String? = null
    var valueFasterRunner: Int? = null
    var valueSecondFasterRunner: Int? = null


    val marathon = HashMap<String, Int>()
    marathon["Ahmed"] = 341
    marathon["Mohamed "] = 273
    marathon["Ismail"] = 278
    marathon["Hend"] = 329
    marathon["Aly"] = 445
    marathon["Hossam"] = 402
    marathon["Ola"] = 388
    marathon["Alaa"] = 275
    marathon["Basma"] = 243
    marathon["Nada"] = 412
    marathon["Mina"] = 334
    marathon["Saad"] = 393
    fasterRunner = marathon.keys.toTypedArray()[0]
    secondFasterRunner = marathon.keys.toTypedArray()[0]
    valueFasterRunner = marathon[fasterRunner]
    valueSecondFasterRunner = marathon[secondFasterRunner]
    marathon.forEach { (key: String, value: Int) ->
        if (value > valueFasterRunner!!) {
            fasterRunner = key
            valueFasterRunner = value
        }
    }
    println(fasterRunner)
    marathon.forEach { (key: String, value: Int) ->
        if (value < marathon[fasterRunner]!! && value > valueSecondFasterRunner!!) {
            secondFasterRunner = key
            valueSecondFasterRunner = value
        }
    }
    println(secondFasterRunner)

}
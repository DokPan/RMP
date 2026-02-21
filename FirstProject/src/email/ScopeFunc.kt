package scope

data class Person(val name : String, var email : String?)
fun mail() {
    // let
    "hello".let {
        println(it)
    }

    var num = readln().toIntOrNull()

    num?.let {
        println(it)
    }

    // with
    val tom = Person("Tom", null)

    var email = with(tom) {
        if(email == null)
            email = "default@email.ru"
        email
    }

    // run
    var email1 = tom.run {
        if(email == null)
            email = "default@email.ru"
        email
    }
    // apply
    val bob = Empoyee()
    bob
        .name("Боб")
        .age(18)
        .company("АКТ")
        .apply {
            age = 19
        }

    // also
    bob.also {
        it.age = 20
    }

    // try / catch

    try {
        throw ArithmeticException("Не дели на ноль")
        // код с исключением
    }
    catch (e:ArithmeticException) {
        println(e.localizedMessage)
    }
    catch (e:Exception) {
        println(e.localizedMessage)
    }
    finally {
        // постобработка
    }

    var data = try {
        readln().toInt()
    }
    catch(e:Exception) {
        null
    }
}

data class Empoyee(var name : String = "", var age : Int = 0, var company : String = "") {
    fun age (_age : Int) : Empoyee = apply {
        age = _age
    }

    fun name (_name : String) : Empoyee = apply {
        name = _name
    }

    fun company (_company : String) : Empoyee = apply {
        company = _company
    }
}
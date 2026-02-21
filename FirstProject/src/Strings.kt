fun main(){
    val str1 = "String"
    val str2 = "String another"

    println(str1+str2)
    println("$str1, $str2")

    println(str1[0])
    println(str1.last())
    println(str2.length)

    println("String" == str1)
    println("String">str1)
    println("String".equals(str1,ignoreCase = true))

    println(str1.lowercase())
    println(str2.uppercase())

    str1.filter { it.isLowerCase() }.let(::println)

    val str3 = "   qwe   "
    println(str3.trim())
    println(str3.trimStart()+"|")
    println(str3.trimEnd()+"|")

    println(str1.contains("String"))
    println(str1.startsWith("String"))
    println(str1.endsWith("String"))

    val str4 ="apple, pear, banana"
    println(str4.split(","))

    println(str2.replace("no","avosi"))
    println(str2.substring(3,6))

    val regex = "[0-9]+".toRegex()
    regex.findAll("111 qwe 234")
        .map { it.value}.toList()
        .let{println(it)}

}


package me.kfeng.sample

object HighOrder {
    def printFunc(element: String) {
        println(element)
    }

    def map(func: (String) => Unit, strings: Array[String]) {
        for (x <- strings) {
            func(x)
        }
    }

    def main(args: Array[String]) {
        val stringArr = Array("Hello", "World")
        map(printFunc, stringArr)

        stringArr.map((name: String ) => println("Hello %s".format(name)) )
    }
}

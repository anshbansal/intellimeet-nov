package com.ttnd.im

/**
 * Demo 03
 *
 * using delegate with metaClass
 * Adding multiple instance methods at once
 * Adding multiple static methods at once
 * Adding methods with different args
 *
 */

String.metaClass.mingle = {->
    List chars = delegate.toCharArray() as List
    Collections.shuffle(chars)
    chars.join("")
}

println "hello".mingle()

Integer.metaClass {
    isEven {-> delegate % 2 == 0}
    isOdd {-> delegate % 2 != 0}
}

assert 6.isEven()
assert !6.isOdd()

Class.metaClass {
    //NOTE THAT static here needs to be in quotes.
    'static' {
        fqn {-> delegate.name}
        another {-> delegate.getClass()}
    }
}

assert Integer.fqn() == "java.lang.Integer"
assert String.another() == "class java.lang.Class"


String.metaClass.groovy << {Integer number ->
    delegate * number
} << {String s ->
    delegate + s
} << {->
    delegate + ' Groovy rocks.'
}

assert 'GroovyGroovy' == 'Groovy'.groovy(2)
assert 'Hello world from Groovy' == 'Hello world'.groovy(' from Groovy')
assert 'It is true. Groovy rocks.' == 'It is true.'.groovy()

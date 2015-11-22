package com.ttnd.im

import groovy.transform.ToString

/**
 * Demo 01
 *
 * Adding instance methods
 * Adding static methods
 * Adding constructors
 *
 * @ToString annotation
 * How to see the see the available properties and their defaults
 *
 * Incorrect Addition of constructor when already present
 * StackOverflow error in case of incorrect use of methods
 *
 * Can invoke methods via Strings
 */

//Adding instance method
String.metaClass.hello = {
    println "hello world from intelli meet"
}

"aseem".hello()


//Adding static methods
String.metaClass.static.staticHello << {
    println "Static hello from intelli meet"
}

String.staticHello()


//Adding constructors
@ToString(includeNames = true)
class Person {
    String name
}

Person.metaClass.constructor << { String name ->
    new Person(name: name)
}

println(new Person("aseem"))


//Beware of this
try {
    Person.metaClass.constructor << {
        new Person()
    }
} catch (any) {
    println any
}

try {
    String.metaClass.static.staticHello << {
        String.staticHello()
    }

    "aseem".staticHello()
} catch (Error any) {
    println any
}

//Can invoke methods via Strings
def methodName = "hello"
"aseem"."$methodName"()


package com.ttnd.im

/**
 * Demo 05
 *
 * Every object has a separate metaclass
 * Every class has a metaclass
 * The object metaclass is a copy of class's metaclass
 */

class Demo5Class1 {}

Demo5Class1 obj1 = new Demo5Class1()
obj1.metaClass.hello = {
    println "hello"
}
obj1.hello()

Demo5Class1 obj2 = new Demo5Class1()
try {
    obj2.hello()
} catch (any) {
    println ">>>" * 30
    println any
    println ">>>" * 30
}

println Demo5Class1.metaClass
println obj1.metaClass
println obj2.metaClass


Demo5Class1.metaClass.classHello = {
    println "class hello"
}


Demo5Class1 obj3 = new Demo5Class1()
obj3.classHello()


try {
    obj1.classHello()
} catch (any) {
    println ">>>" * 30
    println any
    println ">>>" * 30
}

println Demo5Class1.metaClass
println obj1.metaClass
println obj2.metaClass
println obj3.metaClass
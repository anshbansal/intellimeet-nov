package com.ttnd.im

/**
 * Demo 07
 *
 * Expando - What using it maps to
 */


def expando = new Expando()
expando.companyName = "TTN"

//Maps to
expando.setProperty("companyName", "TTN")

println expando.companyName

//Maps to
println expando.getProperty("companyName")

expando.sayHello = {
    println "Hello"
}

expando.sayHello("Hello")

//expando.methodMissing("sayHello", ["Hello"])


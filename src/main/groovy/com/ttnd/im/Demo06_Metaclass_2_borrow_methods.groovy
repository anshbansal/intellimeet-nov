package com.ttnd.im

/**
 * Demo 06
 *
 * Borrowing methods from other classes
 */

class Demo06Person {
    String name
}

class MortgageLender {
    def borrowMoney() {
        "able to buy house"
    }
}

def p1 = new Demo06Person()
try {
    p1.buyHouse()
} catch (any) {
    println "Not able to buy house"
}

def lender = new MortgageLender()

//Can borrow methods from other classes
Demo06Person.metaClass.buyHouse = lender.&borrowMoney

def p = new Demo06Person()
println p.buyHouse()

p.metaClass.hello << {
    println "I bought a house. I am happy"
}

p.hello()

try {
    new Demo06Person().hello()
} catch(any) {
    println "This person doesn’t know how to speak"
}


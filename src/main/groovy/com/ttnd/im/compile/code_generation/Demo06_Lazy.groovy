package com.ttnd.im.compile.code_generation

import groovy.transform.ToString

@ToString
class Demo06_SomeBean {
    @Lazy LinkedList myField
}

def bean1 = new Demo06_SomeBean()

println bean1

try {
    println bean1.@myField
} catch (any){
    println "No bean"
}

println bean1.myField

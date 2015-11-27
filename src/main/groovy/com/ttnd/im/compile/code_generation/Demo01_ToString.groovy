package com.ttnd.im.compile.code_generation

import groovy.transform.ToString

@ToString(includes = 'name', includePackage = false, includeNames = true)
class Demo01_Person {

    String name
    int age
}

println new Demo01_Person(name: "Aseem", age: 23)

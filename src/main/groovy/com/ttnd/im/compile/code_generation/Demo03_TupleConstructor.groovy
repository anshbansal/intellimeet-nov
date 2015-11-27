package com.ttnd.im.compile.code_generation

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@TupleConstructor
@ToString
class Demo03_Person {
    String firstName
    String lastName
}

// traditional map-style constructor
println new Demo03_Person(firstName: 'Jack', lastName: 'Nicholson')
// generated tuple constructor
println new Demo03_Person('Jack', 'Nicholson')
// generated tuple constructor with default value for second property
println new Demo03_Person('Jack')

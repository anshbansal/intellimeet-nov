package com.ttnd.im.compile.code_generation

import groovy.transform.Canonical

@Canonical
class Demo04_Person {
    String firstName
    String lastName
}



def p1 = new Demo04_Person(firstName: 'Jack', lastName: 'Nicholson')

def p2 = new Demo04_Person('Jack', 'Nicholson')

assert p1 == p2
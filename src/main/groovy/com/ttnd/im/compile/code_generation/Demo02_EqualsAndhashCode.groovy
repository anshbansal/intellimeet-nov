package com.ttnd.im.compile.code_generation

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Demo02_Person {
    String firstName
    String lastName
}

def p1 = new Demo02_Person(firstName: 'Jack', lastName: 'Nicholson')
def p2 = new Demo02_Person(firstName: 'Jack', lastName: 'Nicholson')

assert p1 == p2


@EqualsAndHashCode(includes = ['firstName'])
class Demo02_Person01 {
    String firstName
    String lastName
}

def p3 = new Demo02_Person01(firstName: 'Jack', lastName: 'qwer')
def p4 = new Demo02_Person01(firstName: 'Jack', lastName: 'asdf')

assert p3 == p4
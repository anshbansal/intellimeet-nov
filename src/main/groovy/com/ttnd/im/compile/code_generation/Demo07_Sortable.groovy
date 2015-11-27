package com.ttnd.im.compile.code_generation

import groovy.transform.Sortable

@Sortable
class Demo07_Person {

    String first
    String last
    Integer born
}

def people = [
        new Demo07_Person(first: 'Johnny', last: 'Depp', born: 1963),
        new Demo07_Person(first: 'Keira', last: 'Knightley', born: 1985),
        new Demo07_Person(first: 'Geoffrey', last: 'Rush', born: 1951),
        new Demo07_Person(first: 'Orlando', last: 'Bloom', born: 1977)
]

assert people[0] > people[2]
assert people.sort()*.last == ['Rush', 'Depp', 'Knightley', 'Bloom']
assert people.sort(false, Person.comparatorByFirst())*.first == ['Geoffrey', 'Johnny', 'Keira', 'Orlando']
assert people.sort(false, Person.comparatorByLast())*.last == ['Bloom', 'Depp', 'Knightley', 'Rush']
assert people.sort(false, Person.comparatorByBorn())*.last == ['Rush', 'Depp', 'Bloom', 'Knightley']

package com.ttnd.im

import groovy.transform.ToString

class Human {
    String firstName
    String lastName
}

//TODO Add a fullName method to Human class


assert new Human(firstName: "abc", lastName: "def").fullName() == "abc def"

//TODO Add method to String class to repeat a String n times


assert String.repeat("Aseem", 5) == "AseemAseemAseemAseemAseem"

//TODO Add new constructor to Human class
//Input is a single String fullName
//firstName and lastName should be initialized after the constructor has been called


Human human = new Human("aseem bansal")
assert human.firstName == "aseem"
assert human.lastName  == "bansal"

//TODO Add @ToString annotation to the Human class and make sure package is not shown
//NOTE The docs for @ToString are currently incorrect.
// The default value of includePackage is true not false
assert human.toString() == "Human(aseem, bansal)"

//TODO Ctrl + Click on ToString annotation that you just added
//That way you can check what are the options and what are the actual defaults

//TODO Try adding an existing constructor

//TODO Try adding an existing method. Get an overflow

//TODO Try adding constraints for String size - maxLength, minLength



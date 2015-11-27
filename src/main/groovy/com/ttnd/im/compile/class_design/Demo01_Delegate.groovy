package com.ttnd.im.compile.class_design


class Address {
    String streetName
}

class Demo01_Person {

//    @Delegate
//    Address address2

    @Delegate
    Address address

}

Address address = new Address(streetName: "dummy street")
//Address address2 = new Address(streetName: "dummy street2")


def person = new Demo01_Person(address: address)
//def person = new Demo01_Person(address: address, address2: address2)

println person.streetName
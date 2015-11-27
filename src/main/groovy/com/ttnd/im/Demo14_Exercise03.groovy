package com.ttnd.im

//Hint There will be 4 methods here
class Distance {
    private int cmValue = 0

}

//Hint There will be 2 methods here
class DistanceCategoryClass {

}

use (DistanceCategoryClass) {
    Distance d = 3.meters + 4.km
    assert 400300 == d.toCentimeters
    assert 4003 == d.toMeters
    assert 4 == d.toKilometer
}


//Hint There will be 2 methods and something else here
@Category(Object)
class DistanceCategoryClassWithCategory {

}

use (DistanceCategoryClassWithCategory) {
    Distance d = 3.meters + 4.km
    assert 400300 == d.toCentimeters
    assert 4003 == d.toMeters
    assert 4 == d.toKilometer
}
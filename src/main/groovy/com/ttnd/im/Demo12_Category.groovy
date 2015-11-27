package com.ttnd.im

/**
 * Demo 12
 *
 * Category class
 */


class UtilCategory {

    static Number getTwice(Number self) {
        return self * 2
    }

    static String trimSpace(String self) {
        self.tokenize(" ").join(" ")
    }

    static Number max(Number self, Number otherNumber) {
        return Math.max(self, otherNumber)
    }
}

use(UtilCategory) {
    assert 47 == 3 + 10.twice + 5.twice + 7.getTwice()
    assert 43 == 40.max(43)

    assert "Hello Dear Friends" == "Hello     Dear    Friends".trimSpace()
}


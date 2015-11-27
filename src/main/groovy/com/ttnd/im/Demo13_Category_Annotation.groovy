package com.ttnd.im

/**
 * Demo 13
 *
 * Category annotation
 */


@Category(Number)
class UtilCategory2 {

    Number getTwice() {
        this * 2
    }

    Number max(Number otherNumber) {
        Math.max(this, otherNumber)
    }
}

use(UtilCategory2) {
    assert 47 == 3 + 10.twice + 5.twice + 7.getTwice()
    assert 43 == 40.max(43)
}

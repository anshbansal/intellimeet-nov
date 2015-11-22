package com.ttnd.im

/**
 * Demo 02
 *
 * Using delegate with Closures
 * A bigger example of Closure delegation
 * Closure delegation strategies
 */

def closure = {}

class StringUtils {
    static String add(String... strs) {
        strs.join(",")
    }
}

class NumberUtils {
    static int add(int... ints) {
        int result = 0
        for (int i: ints) {
            result += i
        }
        return result
    }
}

try {
    closure.add("aseem", "bansal")
} catch (any) {
    println any
    println ">" * 30
}

closure.delegate = StringUtils
assert closure.add("aseem", "bansal") == "aseem,bansal"

closure.delegate = NumberUtils
assert closure.add(1, 2) == 3



//Simple Example of implementing constraints in a groovy class
class Validations {
    private Closure delegatedBy

    Validations(delegatedBy) {
        this.delegatedBy = delegatedBy
    }

    List<String> errors = []

    boolean isValid() {
        delegatedBy.call()
        errors.size() == 0
    }

    def methodMissing(String name, args) {
        Map rangeMap = args[0]
        int min = rangeMap.min
        int max = rangeMap.max

        int propertyValue = delegatedBy.owner."$name"

        if (propertyValue < min) {
            errors.add("$name is less than $min")
        }
        if (propertyValue > max) {
            errors.add("$name is greater than $max")
        }
    }
}

class ClosureHuman1 {
    int age

    def constraints = {
        'age'(max: 23, min: 5)
    }
}

ClosureHuman1 human1 = new ClosureHuman1()
human1.constraints.delegate = new Validations(human1.constraints)
println human1.constraints.isValid()
println human1.constraints.errors


//Closure delegation has multiple strategies
Closure.DELEGATE_FIRST
Closure.DELEGATE_ONLY
Closure.OWNER_FIRST
Closure.OWNER_ONLY
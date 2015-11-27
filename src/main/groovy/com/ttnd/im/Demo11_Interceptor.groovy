package com.ttnd.im

/**
 * Demo 11
 *
 * Intercepting method calls
 * Calling original methods
 */

class Interception implements GroovyInterceptable {

    def definedMethod() {
        System.out.println('aseem')
    }

    def invokeMethod(String name, Object args) {
        System.out.println('invokedMethod')

        //Invoking original method
        //metaClass.getMetaMethod(name, args).invoke(this, args)

    }
}

new Interception().definedMethod()
package com.ttnd.im.compile.code_generation

import groovy.transform.IndexedProperty

class Demo05_SomeBean {
    @IndexedProperty String[] someArray = new String[2]
    @IndexedProperty List someList = []
}

def bean = new Demo05_SomeBean()
bean.setSomeArray(0, 'value')
bean.setSomeList(0, 123)

assert bean.someArray[0] == 'value'
assert bean.someList == [123]
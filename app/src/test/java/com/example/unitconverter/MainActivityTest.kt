package com.example.unitconverter

import org.junit.Assert.*

import org.junit.Test

class MainActivityTest {

    @Test
    fun convertMilesTest() {
        val km = 3.2186
        val mi = 2.0
        /**val mainActivity: MainActivity= MainActivity()**/
        val testConverter: converter= converter()
        val test = testConverter.convertMiles(mi)
        assertEquals(km, test,0.01)
    }

}
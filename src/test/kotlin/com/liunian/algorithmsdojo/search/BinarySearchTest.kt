package com.liunian.algorithmsdojo.search

import org.junit.Assert.assertTrue
import org.junit.Test

class BinarySearchTest {

    @Test
    fun search() {
        val subject = arrayOf(1, 3, 6, 9, 10, 15, 19, 22, 35, 40, 51, 99, 100)
        val result = BinarySearch().search(subject, 22)
        assertTrue(result == 7)
    }

}
package com.liunian.algorithmsdojo.sort

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class SelectionSortTest {

    @Test
    fun testSort() {
        val subject = arrayOf(5, 2, 4, 6, 1, 3)
        SelectionSort().sort(subject)
        assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6), subject)
    }
}
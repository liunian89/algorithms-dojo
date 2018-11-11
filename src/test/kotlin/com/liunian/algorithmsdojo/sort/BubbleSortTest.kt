package com.liunian.algorithmsdojo.sort

import org.junit.Assert
import org.junit.Test

class BubbleSortTest {

    @Test
    fun testSort() {
        val subject = arrayOf(5, 2, 4, 6, 1, 3)
        BubbleSort().sort(subject)
        Assert.assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6), subject)
    }

    @Test
    fun testSingle() {
        val subject = arrayOf(1)
        BubbleSort().sort(subject)
        Assert.assertArrayEquals(arrayOf(1), subject)
    }

}
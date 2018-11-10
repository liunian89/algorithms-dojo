package com.liunian.algorithmsdojo.sort

import org.junit.Assert
import org.junit.Test

class MergeSortTest {

    @Test
    fun testSort() {
        val subject = arrayOf(5, 2, 4, 6, 1, 3)
        MergeSort().sort(subject, 0, 5)
        Assert.assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6), subject)
    }


    @Test
    fun testSingleElementArray() {
        val subject = arrayOf(1)
        MergeSort().sort(subject, 0, 0)
        Assert.assertArrayEquals(arrayOf(1), subject)
    }
}
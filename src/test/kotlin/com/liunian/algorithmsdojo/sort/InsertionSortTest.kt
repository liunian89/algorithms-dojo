package com.liunian.algorithmsdojo.sort

import org.junit.Assert
import org.junit.Assert.assertArrayEquals
import org.junit.Test
import java.util.*

class InsertionSortTest {

    @Test
    fun testSort() {
        val subject = arrayOf(5, 2, 4, 6, 1, 3)
        val result = InsertionSort().sort(subject)
        assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6), result)
    }

    @Test
    fun testAnotherSort() {
        val subject = arrayOf(5, 2, 4, 6, 1, 3)
        val result = InsertionSort().sortTedious(subject)
        assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6), result)
    }

    @Test
    fun testSingleElementArray() {
        val subject = arrayOf(1)
        InsertionSort().sort(subject)
        Assert.assertArrayEquals(arrayOf(1), subject)
    }

    @Test
    fun testDuplicates() {
        val withDuplicates = arrayOf(5, 2, 4, 3, 6, 1, 3)
        val result = InsertionSort().sort(withDuplicates)
        assertArrayEquals(arrayOf(1, 2, 3, 3, 4, 5, 6), result)
    }

    @Test
    fun testPerformance() {
        val size = 100000
        val array = Array(size, init = { 0 })

        val start = System.currentTimeMillis()

        array.forEachIndexed { index, _ -> array[index] = Random().nextInt(size) }

        InsertionSort().sort(array)

        println("Used ${System.currentTimeMillis() - start} milli seconds to sort $size records")

    }

    @Test
    fun testSortDesc() {
        val subject = arrayOf(5, 2, 4, 6, 1, 3)
        InsertionSort().sortDesc(subject)
        Assert.assertArrayEquals(arrayOf(6, 5, 4, 3, 2, 1), subject)
    }

}
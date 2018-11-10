package com.liunian.algorithmsdojo.sort

import org.junit.Assert.assertArrayEquals
import org.junit.Test
import java.util.*

class InsertionSortTest {


    private val subject = arrayOf(5, 2, 4, 6, 1, 3)


    @Test
    fun testSort() {
        val result = InsertionSort().sort(subject)
        assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6), result)
    }

    @Test
    fun testAnotherSort() {
        val result = InsertionSort().sortTedious(subject)
        assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6), result)
    }


    private val withDuplicates = arrayOf(5, 2, 4, 3, 6, 1, 3)

    @Test
    fun testDuplicates() {
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


}
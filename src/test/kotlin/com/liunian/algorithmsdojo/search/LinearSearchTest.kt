package com.liunian.algorithmsdojo.search

import org.hamcrest.Matchers
import org.junit.Assert.assertThat
import org.junit.Test

class LinearSearchTest {

    @Test
    fun testSearch() {
        val result = LinearSearch().search(arrayOf(1, 2, 3, 4, 5, 6), 4)
        assertThat(result, Matchers.`is`(3))
    }

    @Test
    fun testNotFound() {
        val result = LinearSearch().search(arrayOf(1, 2, 3, 4, 5, 6), 0)
        assert(result == null)
    }
}
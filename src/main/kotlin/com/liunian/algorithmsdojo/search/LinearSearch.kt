package com.liunian.algorithmsdojo.search

class LinearSearch {

    fun search(array: Array<Int>, target: Int): Int? {
        var targetIndex: Int? = null

        for (i in 0 until array.size) {
            if (array[i] == target) {
                targetIndex = i
                return targetIndex
            }
        }
        return targetIndex
    }
}
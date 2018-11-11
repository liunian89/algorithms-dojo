package com.liunian.algorithmsdojo.search

/**
 * Search item in sorted array
 */
class BinarySearch {

    /**
     * return target index
     */
    fun search(array: Array<Int>, target: Int): Int? {
        var min = 0
        var max = array.size - 1
        while (array[(min + max) / 2] != target && min != max) {

            val index = (min + max) / 2
            if (array[index] > target) {
                max = index - 1
            } else {
                min = index + 1
            }
        }

        if (array[(min + max) / 2] != target) {
            return null
        }
        return (min + max) / 2
    }

}
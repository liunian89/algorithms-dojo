package com.liunian.algorithmsdojo.sort

class InsertionSort {

    fun sort(toSort: Array<Int>): Array<Int> {

        for (i in 1 until toSort.size) {
            val current = toSort[i]

            // check left hand from the current position, push current number to left when smaller
            var j = i - 1
            while (j >= 0 && toSort[j] > current) {
                toSort[j + 1] = toSort[j]
                j--
            }

            toSort[j + 1] = current
        }

        return toSort
    }

    fun sortTedious(toSort: Array<Int>): Array<Int> {

        for (i in 1 until toSort.size) {
            val current = toSort[i]

            // check left hand from the current position, push current number to left when smaller
            for (j in i - 1 downTo 0) {
                if (toSort[j] > current) {
                    toSort[j + 1] = toSort[j]
                    toSort[j] = current
                }

                if (toSort[j] < current) break
            }

        }

        return toSort
    }

    // Exercise 2.1-2
    fun sortDesc(array: Array<Int>) {
        for (i in 1 until array.size) {
            val current = array[i]

            var j = i - 1
            while (j >= 0 && array[j] < current) {
                array[j + 1] = array[j]
                j--
            }

            array[j + 1] = current
        }
    }
}
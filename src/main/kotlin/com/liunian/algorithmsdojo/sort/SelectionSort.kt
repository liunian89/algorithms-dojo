package com.liunian.algorithmsdojo.sort

class SelectionSort {

    fun sort(array: Array<Int>) {

        for (i in 0 until array.size) {
            var minIndex = i

            for (j in i until array.size) {
                if (array[j] < array[minIndex]) {
                    minIndex = j
                }
            }

            array[minIndex] = array[i].also { array[i] = array[minIndex] }
        }
    }
}
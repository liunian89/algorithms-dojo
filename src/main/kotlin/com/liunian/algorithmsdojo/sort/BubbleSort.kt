package com.liunian.algorithmsdojo.sort

class BubbleSort {

    fun sort(array: Array<Int>) {
        for (i in 0 until array.size) {
            for (j in array.size - 1 downTo i + 1) {
                if (array[i] > array[j]) {
                    array[i] = array[j].also { array[j] = array[i] }
                }
            }
        }
    }
}
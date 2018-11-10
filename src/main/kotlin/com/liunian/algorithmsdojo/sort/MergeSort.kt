package com.liunian.algorithmsdojo.sort

class MergeSort {

    /**
     * both begin and end index are inclusive)
     */
    fun sort(array: Array<Int>, begin: Int, end: Int) {
        println()
        println("[BEGIN] $begin >> $end")
        if (begin < end) {
            println("Match condition ")
            val mid = (begin + end) / 2

            println("[L] $begin >> $mid")
            sort(array, begin, mid)

            println("[R] ${mid + 1} >> $end")
            sort(array, mid + 1, end)

            println("[M] $begin >> $end")
            merge(array, begin, mid, end)
        }
        println("[ END ] $begin >> $end")
    }

    private fun merge(array: Array<Int>, begin: Int, mid: Int, end: Int) {
        val left = array.sliceArray(IntRange(begin, mid))
        val right = array.sliceArray(IntRange(mid + 1, end))

        var i = begin
        var l = 0
        var r = 0

        while (l < left.size && r < right.size && i < end + 1) {
            if (l < left.size && r < right.size) {
                if (left[l] <= right[r]) {
                    array[i] = left[l]
                    l++
                } else {
                    array[i] = right[r]
                    r++
                }
            }
            i++
        }

        val remain =
                if (left.size == l) right.sliceArray(IntRange(r, right.size - 1))
                else left.sliceArray(IntRange(l, left.size - 1))
        remain.forEach { array[i] = it; i++ }
    }

}
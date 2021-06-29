package com.tinyIT.car_managent

fun main() {
    println(evenlySpaced(2, 4, 6))
    println(evenlySpaced(4, 6, 2))
    println(evenlySpaced(4, 6, 3))
}

fun evenlySpaced(a: Int, b: Int, c: Int): Boolean {
    var small: Int = 0
    var medium: Int = 0
    var large: Int = 0

    when {
        //validating a
        a < b && b < c -> {
            small = a
            medium = b
            large = c
        }
        a > b && c > a -> {
            small = b
            medium = a
            large = c
        }
        a > b && b > c -> {
            small = c
            medium = b
            large = a
        }
        //validating b
        b < a && a < c -> {
            small = b
            medium = a
            large = c
        }
        b > a && c > b -> {
            small = a
            medium = b
            large = c

        }
        b > a && a > c -> {
            small = c
            medium = a
            large = b
        }
        //validating c
        c < b && b < a -> {
            small = c
            medium = b
            large = a

        }
        c > b && a > c -> {
            small = b
            medium = c
            large = a

        }
        c > b && b > a -> {
            small = a
            medium = b
            large = c
        }

    }
    //calculate the differences
    return differences(small, medium, large)

}

fun differences(small: Int, medium: Int, large: Int): Boolean {
    var diffSmallMedium: Int
    var diffMediumLage: Int

    diffSmallMedium = medium - small
    diffMediumLage = large - medium

    return (diffSmallMedium == diffMediumLage)

}

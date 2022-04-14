package com.kata.kataforfun.services

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KataForFunServiceTest {

    @Test
    fun should_replace_3_by_kata_when_input_contains_3_or_divisible_by_3() {
        val kataForFunService = KataForFunService()
        val result = kataForFunService.convertNumber(3)
        assertEquals("KataKata", result)
    }

    @Test
    fun should_replace_3_by_kata_when_input_contains_5_or_divisible_by_5() {
        val kataForFunService = KataForFunService()
        val result = kataForFunService.convertNumber(5)
        assertEquals("ForFor", result)
    }

    @Test
    fun should_replace_3_by_kata_when_input_contains_7() {
        val kataForFunService = KataForFunService()
        val result = kataForFunService.convertNumber(7)
        assertEquals("Fun", result)
    }

    @Test
    fun should_return_inputNumber_if_no_match() {
        val kataForFunService = KataForFunService()
        val result = kataForFunService.convertNumber(1)
        assertEquals("1", result)
    }
}
package com.kata.kataforfun.services

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KataForFunServiceIntegrationTest {

    @Test
    fun should_return_1_when_input_is_1() {
        val kataForFunService = KataForFunService()
        assertEquals("1", kataForFunService.convertNumber(1))
    }

    @Test
    fun should_return_KataKata_when_input_is_3() {
        val kataForFunService = KataForFunService()
        assertEquals("KataKata", kataForFunService.convertNumber(3))
    }

    @Test
    fun should_return_ForFor_when_input_is_5() {
        val kataForFunService = KataForFunService()
        assertEquals("ForFor", kataForFunService.convertNumber(5))
    }

    @Test
    fun should_return_Fun_when_input_is_7() {
        val kataForFunService = KataForFunService()
        assertEquals("Fun", kataForFunService.convertNumber(7))
    }

    @Test
    fun should_return_Kata_when_input_is_9() {
        val kataForFunService = KataForFunService()
        assertEquals("Kata", kataForFunService.convertNumber(9))
    }

    @Test
    fun should_return_KataFor_when_input_is_51() {
        val kataForFunService = KataForFunService()
        assertEquals("KataFor", kataForFunService.convertNumber(51))
    }

    @Test
    fun should_return_ForKata_when_input_is_53() {
        val kataForFunService = KataForFunService()
        assertEquals("ForKata", kataForFunService.convertNumber(53))
    }

    @Test
    fun should_return_KataKataKata_when_input_is_33() {
        val kataForFunService = KataForFunService()
        assertEquals("KataKataKata", kataForFunService.convertNumber(33))
    }

    @Test
    fun should_return_KataFun_when_input_is_27() {
        val kataForFunService = KataForFunService()
        assertEquals("KataFun", kataForFunService.convertNumber(27))
    }

    @Test
    fun should_return_KataForFor_when_input_is_15() {
        val kataForFunService = KataForFunService()
        assertEquals("KataForFor", kataForFunService.convertNumber(15))
    }
}
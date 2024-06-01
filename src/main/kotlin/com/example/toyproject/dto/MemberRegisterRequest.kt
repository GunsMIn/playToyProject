package com.example.toyproject.dto

import com.example.toyproject.entity.Member
import java.time.LocalDate

data class MemberRegisterRequest(
    var email: String = "",
    var password: String = "",
    val name: String = "",
    var age: Long = 0,
    val birthDate: LocalDate,
    val gender: Member.Gender
)
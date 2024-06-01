package com.example.toyproject.dto

import com.example.toyproject.entity.Member

fun MemberRegisterRequest.toEntity(): Member {
    return Member(
        email = this.email,
        password = this.password,
        name = this.name,
        age = this.age,
        birthDate = this.birthDate,
        gender = this.gender
    )
}


fun Member.toResponse(): MemberRegisterResponse {
    return MemberRegisterResponse(
        email = this.email,
        name = this.name
    )
}
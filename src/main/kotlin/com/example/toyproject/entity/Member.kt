package com.example.toyproject.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column
    var email: String = "",
    @Column
    var password: String,
    @Column
    var name: String = "",
    @Column
    var age: Long = 0L,
    @Column
    var birthDate: LocalDate = LocalDate.now(),
    @Column
    @Enumerated(EnumType.STRING)
    var gender: Gender = Gender.NOT_CHECK
) {
    enum class Gender(val gender: String) {
        MAN("남자"),
        WOMAN("여자"),
        NOT_CHECK("미선택")
    }
}
package com.example.toyproject.entity

import jakarta.annotation.Nullable
import jakarta.persistence.*
import java.time.LocalDateTime
import javax.validation.constraints.Size

@Entity
class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false, length = 30)
    @Size(max = 30)
    var title: String,

    @Column(length = 300)
    @Size(max = 300)
    var content: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    var member: Member,

    @Column(nullable = false)
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(nullable = false)
    var updatedAt: LocalDateTime = LocalDateTime.now()
)
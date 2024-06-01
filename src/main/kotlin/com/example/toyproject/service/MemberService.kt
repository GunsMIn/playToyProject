package com.example.toyproject.service

import com.example.toyproject.dto.MemberRegisterRequest
import com.example.toyproject.dto.MemberRegisterResponse
import com.example.toyproject.dto.toEntity
import com.example.toyproject.dto.toResponse
import com.example.toyproject.entity.Member
import com.example.toyproject.repository.MemberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MemberService @Autowired constructor(private val memberRepository: MemberRepository) {

    fun save(memberRegisterRequest: MemberRegisterRequest): MemberRegisterResponse {

        val member = memberRepository.save(memberRegisterRequest.toEntity())
        return member.toResponse()
    }

}
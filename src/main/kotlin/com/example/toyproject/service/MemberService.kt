package com.example.toyproject.service

import com.example.toyproject.entity.Member
import com.example.toyproject.repository.MemberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MemberService @Autowired constructor(private val memberRepository: MemberRepository) {

    fun save(member: Member): Member = memberRepository.save(member)
}
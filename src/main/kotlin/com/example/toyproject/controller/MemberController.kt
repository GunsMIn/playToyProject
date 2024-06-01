package com.example.toyproject.controller

import com.example.toyproject.entity.Member
import com.example.toyproject.service.MemberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.example.toyproject.dto.MemberRegisterRequest
import com.example.toyproject.dto.MemberRegisterResponse

@RestController
@RequestMapping("/members")
class MemberController @Autowired constructor(private val memberService: MemberService){

    @PostMapping("/create")
    fun create(@RequestBody memberRegisterRequest: MemberRegisterRequest): MemberRegisterResponse = memberService.save(memberRegisterRequest)
}
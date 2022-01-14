package com.aksrua.lms.member.service;

import com.aksrua.lms.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

	private final MemberRepository memberRepository;

	public String register() {
		return "";
	}

}

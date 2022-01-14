package com.aksrua.lms.member.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.aksrua.lms.member.entity.Member;
import com.aksrua.lms.member.model.CreateMemberDto;
import com.aksrua.lms.member.repository.MemberRepository;
import java.time.LocalDateTime;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


class MemberServiceTest {

	@Autowired
	MemberRepository memberRepository;

	@Test
	void 빌더_패턴_NULL_체크() {
		Member member = Member.builder()
			.userId("cla@naver.com")
			.userName("만겸")
			.password("1111")
			.registrationDate(LocalDateTime.now())
			.build();

		assertThat(member.getUserId()).isEqualTo("cla@naver.com");
	}


	@Test
	void 회원_등록_테스트() {
		Member member = Member.builder()
			.userId("cla@naver.com")
			.userName("만겸")
			.password("1111")
			.registrationDate(LocalDateTime.now())
			.build();

//		memberRepository.save(member);

		Optional<Member> inputMember = memberRepository.findById("cla@naver.com");

		assertThat(1).isEqualTo(1);
	}

	void 회원_등록_테스트_중복_테스트() {

	}


	void 회원_등록_테스트_메일_전송_테스트() {

	}

	void 가입안내_메일_전송_테스트() {

	}

}

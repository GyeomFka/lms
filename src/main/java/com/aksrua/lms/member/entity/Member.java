package com.aksrua.lms.member.entity;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Getter;

@Getter
@Entity
@Builder
public class Member {

	@Id
	private String userId;

	private String userName;
	private String password;
	private LocalDateTime registrationDate;

	private boolean isEmailAuth;
	private LocalDateTime emailAuthDate;
	private String emailAuthKey;

	private String resetPasswordKey;
	private LocalDateTime resetPasswordLimitDate;

}

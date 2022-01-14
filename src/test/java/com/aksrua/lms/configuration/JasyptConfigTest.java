package com.aksrua.lms.configuration;

import static org.assertj.core.api.Assertions.assertThat;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;

class JasyptConfigTest {

    @Test
    void jasypt() {
        String host = "smtp.gmail.com";
        String username = "myMail";
        String password = "mailKey";

        String encryptHost = jasyptEncrypt(host);
        String encryptUsername = jasyptEncrypt(username);
        String encryptPassword = jasyptEncrypt(password);

		System.out.println("encryptHost = " + encryptHost);
		System.out.println("encryptUsername = " + encryptUsername);
		System.out.println("encryptPassword = " + encryptPassword);

        assertThat(host).isEqualTo(jasyptDecryt(encryptHost));
        assertThat(username).isEqualTo(jasyptDecryt(encryptUsername));
        assertThat(password).isEqualTo(jasyptDecryt(encryptPassword));

    }


    private String jasyptEncrypt(String input) {
		/**
		 * @key = -Djasypt.encryptor.password={key}
		 */
		String key = "key";
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setAlgorithm("PBEWithMD5AndDES");
        encryptor.setPassword(key);
        return encryptor.encrypt(input);
    }


    private String jasyptDecryt(String input) {
		/**
		 * @key = -Djasypt.encryptor.password={key}
		 */
    	String key = "key";
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setAlgorithm("PBEWithMD5AndDES");
        encryptor.setPassword(key);
        return encryptor.decrypt(input);
    }

}

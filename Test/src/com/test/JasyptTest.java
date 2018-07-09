package com.test;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class JasyptTest {

	public static void main(String[] args) {
		
		String encryptedPassword = "4WYLbT2p56eijTLrjbmRofZqjMkk9X84";
		String value = "Original Text: Eclipse";
		try {
            String mpCryptoPassword = "password";
            
            StandardPBEStringEncryptor decryptor = new StandardPBEStringEncryptor();
            decryptor.setPassword(mpCryptoPassword);
            System.out.println(decryptor.decrypt(encryptedPassword));

        } catch (Exception e) {
            e.printStackTrace();
        }
		

	}

}

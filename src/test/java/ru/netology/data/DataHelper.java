package ru.netology.data;

import com.github.javafaker.Faker;
import lombok.*;

import java.util.Locale;

public class DataHelper {
    private static Faker faker = new Faker(new Locale("ru"));
    private DataHelper() {
    }



    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static AuthInfo getRandomAuthInfo() {
        return new AuthInfo(faker.name().username(), faker.internet().password());
    }

    public static VerificationCode getRandomVerificationCode() {
        return new VerificationCode(faker.numerify("######"));
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    @Value
    public static class VerificationCode {
        private String code;
    }



}

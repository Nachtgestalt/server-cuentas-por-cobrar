package com.loschidos.servidorcuentasporcobrar.security;

public class SecurityConstants {
    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 14_000; // 4 HORAS
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "authorization";
    public static final String SIGN_UP_URL = "/users/sign-up";
}

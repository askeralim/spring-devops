package com.monogo.demo.model;

public class Token {
    private String token;

    public Token() {
    }

    public Token(String token) {
        this.token = token;
    }
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Message{");
        sb.append(" token='").append(token).append('\'');
        return sb.toString();
    }
}

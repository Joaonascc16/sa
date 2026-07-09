package com.senai.revisao2.dtos;

public class LoginDto {

    private String email;

    private String senha;

    public LoginDto() {
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

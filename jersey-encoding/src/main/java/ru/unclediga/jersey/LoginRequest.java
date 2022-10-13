package ru.unclediga.jersey;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LoginRequest {
    String login;
    String password;

    public LoginRequest() {
    }

    public LoginRequest(String login, String ticket) {
        this.login = login;
        this.password = ticket;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

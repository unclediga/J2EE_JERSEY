package ru.unclediga.jersey;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LoginResponse {
    public static final LoginResponse UNAUTHORIZED_ENTITY = new LoginResponse(0, "UNAUTHORIZED", null);
    int user_id;
    String fio;
    String ticket;

    public LoginResponse() {
    }

    public LoginResponse(int user_id, String fio, String ticket) {
        this.fio = fio;
        this.ticket = ticket;
        this.user_id = user_id;
    }

    public String getFio() {
        return fio;
    }

    public String getTicket() {
        return ticket;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "user_id=" + user_id +
                ", fio='" + fio + '\'' +
                ", ticket='" + ticket + '\'' +
                '}';
    }
}

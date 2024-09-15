package org.example.disasternotifyserver.test;

public class Message<T> {
    private StatusEnum status; // 상태 코드
    private String message; // 메시지 내용
    private T data; // 데이터

    // Getter 및 Setter
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}


package com.aprendiendo.aws.models.response;
import com.aprendiendo.aws.Status;

public class BodyResponse {
    private String uuid;
    private Status status;

    public BodyResponse(String uuid, Status status) {
        this.uuid = uuid;
        this.status = status;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

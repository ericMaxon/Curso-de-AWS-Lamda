package com.aprendiendo.aws;

import java.util.Map;

public class Request <E> {
    private Map<String, String> path;
    private E body;

    public Map<String, String> getPath() {
        return path;
    }

    public void setPath(Map<String, String> path) {
        this.path = path;
    }

    public E getBody() {
        return body;
    }

    public void setBody(E body) {
        this.body = body;
    }
}

package com.online.bookstore.OnlineBookStoreApplication.pojo;

public class ApiResponse {
    public boolean success;
    public boolean flag;
    public String message;
    public String total;
    public Object data;
    public Object objectData;

    public ApiResponse(boolean success) {
        this.success = success;
    }

    public ApiResponse() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getObjectData() {
        return objectData;
    }

    public void setObjectData(Object objectData) {
        this.objectData = objectData;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setSuccess(Object data) {
        this.success = true;
        this.data = data;
    }

    public void setError(String message) {
        this.success = false;
        this.message = message;
        this.data = null;
    }

}

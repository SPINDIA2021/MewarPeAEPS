package com.satmatgroup.mewarpe.scanner;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ScannerFalseResponse {

    @SerializedName("statuscode")
    @Expose
    private String statuscode;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("data")
    @Expose
    private String data;

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

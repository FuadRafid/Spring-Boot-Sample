package com.fuadrafid.springboot.dto.response.externalapi.getemployee;

public class ExternalApiGetEmployeeReponseDto {
    private GetEmployeeResponseData[] data;

    private String status;

    public GetEmployeeResponseData[] getData() {
        return data;
    }

    public void setData(GetEmployeeResponseData[] data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
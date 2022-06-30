package com.jobPortal.Jobportal.modal;

public class EmployeeDto
{
    private String userId;
    private String EmployeeName;
    private String eMailId;
    private String password;
    private String Qualification;

    public EmployeeDto(String userId, String employeeName, String eMailId, String password, String qualification) {
        this.userId = userId;
        EmployeeName = employeeName;
        this.eMailId = eMailId;
        this.password = password;
        Qualification = qualification;
    }

    public EmployeeDto() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String geteMailId() {
        return eMailId;
    }

    public void seteMailId(String eMailId) {
        this.eMailId = eMailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }
}

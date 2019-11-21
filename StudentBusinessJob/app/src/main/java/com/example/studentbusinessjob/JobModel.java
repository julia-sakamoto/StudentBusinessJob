package com.example.studentbusinessjob;

public class JobModel {
    String jobTitle;
    String jobDescription;
    String contactEmail;
    String businessOwner;

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setBusinessOwner(String businessOwner) {
        this.businessOwner = businessOwner;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getBusinessOwner() {
        return businessOwner;
    }
}

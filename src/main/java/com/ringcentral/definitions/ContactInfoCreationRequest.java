package com.ringcentral.definitions;


/**
 * Contact Information
 */
public class ContactInfoCreationRequest {
    /**
     * For User extension type only. Extension user first name
     */
    public String firstName;
    /**
     * For User extension type only. Extension user last name
     */
    public String lastName;
    /**
     * Extension user company name
     */
    public String company;
    /**
     *
     */
    public String jobTitle;
    /**
     * Email of extension user
     */
    public String email;
    /**
     * Extension user contact phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
     */
    public String businessPhone;
    /**
     * Extension user mobile (**non** Toll Free) phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) (with &#039;+&#039; sign) format
     */
    public String mobilePhone;
    /**
     *
     */
    public ContactBusinessAddressInfo businessAddress;
    /**
     * If &#039;True&#039; then contact email is enabled as login name for this user. Please note that email should be unique in this case. The default value is &#039;False&#039;
     */
    public Boolean emailAsLoginName;
    /**
     *
     */
    public PronouncedNameInfo pronouncedName;
    /**
     * Extension user department, if any
     */
    public String department;

    public ContactInfoCreationRequest firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactInfoCreationRequest lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactInfoCreationRequest company(String company) {
        this.company = company;
        return this;
    }

    public ContactInfoCreationRequest jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public ContactInfoCreationRequest email(String email) {
        this.email = email;
        return this;
    }

    public ContactInfoCreationRequest businessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
        return this;
    }

    public ContactInfoCreationRequest mobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public ContactInfoCreationRequest businessAddress(ContactBusinessAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }

    public ContactInfoCreationRequest emailAsLoginName(Boolean emailAsLoginName) {
        this.emailAsLoginName = emailAsLoginName;
        return this;
    }

    public ContactInfoCreationRequest pronouncedName(PronouncedNameInfo pronouncedName) {
        this.pronouncedName = pronouncedName;
        return this;
    }

    public ContactInfoCreationRequest department(String department) {
        this.department = department;
        return this;
    }
}

package com.ringcentral.definitions;


public class PersonalContactRequest {
    /**
     * First name of the contact
     * Example: Charlie
     */
    public String firstName;
    /**
     * Last name of the contact
     * Example: Williams
     */
    public String lastName;
    /**
     * Middle name of the contact
     * Example: J
     */
    public String middleName;
    /**
     * Nick name of the contact
     * Example: The Boss
     */
    public String nickName;
    /**
     * Company name of the contact
     * Example: Example, Inc.
     */
    public String company;
    /**
     * Job title of the contact
     * Example: CEO
     */
    public String jobTitle;
    /**
     * Email of the contact
     * Example: charlie.williams@example.com
     */
    public String email;
    /**
     * 2nd email of the contact
     * Example: charlie-example@gmail.com
     */
    public String email2;
    /**
     * 3rd email of the contact
     * Example: theboss-example@hotmail.com
     */
    public String email3;
    /**
     * Date of birth of the contact
     * Format: date-time
     */
    public String birthday;
    /**
     * The contact home page URL
     * Example: http://www.example.com
     */
    public String webPage;
    /**
     * Notes for the contact
     * Example: #1 Customer
     */
    public String notes;
    /**
     * Home phone number of the contact in e.164 (with &quot;+&quot;) format
     * Example: +15551234567
     */
    public String homePhone;
    /**
     * 2nd home phone number of the contact in e.164 (with &quot;+&quot;) format
     * Example: +15551234567
     */
    public String homePhone2;
    /**
     * Business phone of the contact in e.164 (with &quot;+&quot;) format
     * Example: +15551234567
     */
    public String businessPhone;
    /**
     * 2nd business phone of the contact in e.164 (with &quot;+&quot;) format
     * Example: +15551234567
     */
    public String businessPhone2;
    /**
     * Mobile phone of the contact in e.164 (with &quot;+&quot;) format
     * Example: +15551234567
     */
    public String mobilePhone;
    /**
     * Business fax number of the contact in e.164 (with &quot;+&quot;) format
     * Example: +15551234567
     */
    public String businessFax;
    /**
     * Company number of the contact in e.164 (with &quot;+&quot;) format
     * Example: +15551234567
     */
    public String companyPhone;
    /**
     * Phone number of the contact assistant in e.164 (with &quot;+&quot;) format
     * Example: +15551234567
     */
    public String assistantPhone;
    /**
     * Car phone number of the contact in e.164 (with &quot;+&quot;) format
     * Example: +15551234567
     */
    public String carPhone;
    /**
     * Other phone number of the contact in e.164 (with &quot;+&quot;) format
     * Example: +15551234567
     */
    public String otherPhone;
    /**
     * Other fax number of the contact in e.164 (with &quot;+&quot;) format
     * Example: +15551234567
     */
    public String otherFax;
    /**
     * Callback phone number of the contact in e.164 (with &quot;+&quot;) format
     * Example: +15551234567
     */
    public String callbackPhone;
    /**
     *
     */
    public ContactAddressInfo homeAddress;
    /**
     *
     */
    public ContactAddressInfo businessAddress;
    /**
     *
     */
    public ContactAddressInfo otherAddress;
    /**
     * Contact ringtone. Max number of symbols is 64
     */
    public String ringtoneIndex;

    public PersonalContactRequest firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonalContactRequest lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonalContactRequest middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public PersonalContactRequest nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public PersonalContactRequest company(String company) {
        this.company = company;
        return this;
    }

    public PersonalContactRequest jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public PersonalContactRequest email(String email) {
        this.email = email;
        return this;
    }

    public PersonalContactRequest email2(String email2) {
        this.email2 = email2;
        return this;
    }

    public PersonalContactRequest email3(String email3) {
        this.email3 = email3;
        return this;
    }

    public PersonalContactRequest birthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public PersonalContactRequest webPage(String webPage) {
        this.webPage = webPage;
        return this;
    }

    public PersonalContactRequest notes(String notes) {
        this.notes = notes;
        return this;
    }

    public PersonalContactRequest homePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public PersonalContactRequest homePhone2(String homePhone2) {
        this.homePhone2 = homePhone2;
        return this;
    }

    public PersonalContactRequest businessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
        return this;
    }

    public PersonalContactRequest businessPhone2(String businessPhone2) {
        this.businessPhone2 = businessPhone2;
        return this;
    }

    public PersonalContactRequest mobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public PersonalContactRequest businessFax(String businessFax) {
        this.businessFax = businessFax;
        return this;
    }

    public PersonalContactRequest companyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
        return this;
    }

    public PersonalContactRequest assistantPhone(String assistantPhone) {
        this.assistantPhone = assistantPhone;
        return this;
    }

    public PersonalContactRequest carPhone(String carPhone) {
        this.carPhone = carPhone;
        return this;
    }

    public PersonalContactRequest otherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
        return this;
    }

    public PersonalContactRequest otherFax(String otherFax) {
        this.otherFax = otherFax;
        return this;
    }

    public PersonalContactRequest callbackPhone(String callbackPhone) {
        this.callbackPhone = callbackPhone;
        return this;
    }

    public PersonalContactRequest homeAddress(ContactAddressInfo homeAddress) {
        this.homeAddress = homeAddress;
        return this;
    }

    public PersonalContactRequest businessAddress(ContactAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }

    public PersonalContactRequest otherAddress(ContactAddressInfo otherAddress) {
        this.otherAddress = otherAddress;
        return this;
    }

    public PersonalContactRequest ringtoneIndex(String ringtoneIndex) {
        this.ringtoneIndex = ringtoneIndex;
        return this;
    }
}

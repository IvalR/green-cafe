package org.ival.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

    public String loginName;
    public String password;
    public String fullName;
    public String email;
    public String mobilePhoneNumber;
    public String address;
    public String workPhoneNumber;

}

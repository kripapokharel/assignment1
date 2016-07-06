package Model;

import java.io.Serializable;

/**
 * Created by kp26842 on 6/30/2016.
 */
public class User extends Person implements Serializable {
    String userName;
    String email;
    String phoneNo;
    String passWord;
    String profilePic;
    String confirmPassword;


    public User() {
    }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public User(String firstName, String lastName, Long SSN, String DOB, String gender, String userName) {
        super(firstName, lastName, SSN, DOB, gender);
        this.userName = userName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public String getUserName() {

        return userName;
    }

    public String getDOB() {

        return DOB;
    }

    public String getEmail() {

        return email;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public void setDOB(String DOB) {

        this.DOB = DOB;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}

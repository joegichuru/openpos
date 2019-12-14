package ke.nexthub.openpos.models;

import java.io.Serializable;

/**
 * OpenPos
 *
 * @author joe
 * @since 12/14/19
 **/
public class User implements Serializable {
    private long id;
    private String screenName;
    private String fname;
    private String lname;
    private String phone;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

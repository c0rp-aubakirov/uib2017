package kz.uib.parking.model;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public class User extends AbstractModel {

    String login;
    String password;
    String email;
    String nickname;
    Double balance; // количество денег
    Boolean isActivated;

    //... и т.д.

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }
}

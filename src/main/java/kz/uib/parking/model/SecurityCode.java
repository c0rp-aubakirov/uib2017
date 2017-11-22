package kz.uib.parking.model;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public class SecurityCode extends AbstractModel{

    // секретный код для активации пользователей. Должен генерироваться рандомом
    String securityCode;
    String userId;

    public String getSecurityCode() {
        return this.securityCode;
    }

    public void setSecurityCode(final String securityCode) {
        this.securityCode = securityCode;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }
}

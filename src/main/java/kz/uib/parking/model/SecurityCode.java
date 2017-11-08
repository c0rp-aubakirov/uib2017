package kz.uib.parking.model;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public class SecurityCode extends AbstractModel{

    // секретный код для активации пользователей. Должен генерироваться рандомом
    String securityCode;
    String userId;

}

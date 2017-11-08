package kz.uib.parking.controller;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public class RegistrationContoller {

    /**
     *
     * Регистрация юзера
     *
     * POST метод
     *
     *         Принимает на вход body в виде:
     {
            "phoneNumber":"String", # Логин/Login
            "nickName":"String",
            "deviceId":"String" # уникальный id устройства. возможно это будет FCM токен
            "email":"String"
     }
     * @return Возвращает статус регистрации
     */
    public String registerNewUser() {
        return "registration status";
    }

    /**
     *
     * POST метод
     *
     * Принимает на вход body в виде:
     {
        "phoneNumber":"",
        "securityCode":"",
        "password" : "SHA512 String"
     }

     Метод должен сверить security code, а потом выставить новый пароль пользователю

     * @return возвращает статус проверки и выдает токен для других API
     */
    public String checkSecurityCode() {
        return "security token for another API";
    }

    /**
     *
     * Отправляет новый security code для регистрации
     *
     * POST метод
     *
     * Принимает на вход body в виде:
     *
     {
        "phoneNumber":""
     }
     * @return возвращет статус отправки.
     */
    public String generateNewRegistrationSecurityCode() {
        return "Отправляет статус генерации кода";
    }

    /**
     *
     * GET метод
     *
     * Принимает параметр в виде query string
        ?phoneNumber=+77772200051
     * @return возвращает true/false
     */
    public String isNumberAvailable() {
        return "true/false";
    }

    /**
     *
     * Отправляет новый security code для регистрации
     *
     * POST метод
     *
     * Принимает на вход body в виде:
     *
     {
        "phoneNumber":"String", # Login 77772200051 (11 цифр)
        "password":"SHA512 String"
     }
     * @return возвращает токен для использования других API
     */
    public String login() {
        return "TOKEN";
    }
}

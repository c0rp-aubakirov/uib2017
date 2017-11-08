package kz.uib.parking.controller;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public class UserInfoController {

    /**
     * GET метод
     *
     {
        "token":"String",
        "phoneNumber":"String"
     }
     * @return возвращает модель #kz.uib.parking.model.User в виде json
     */
    public String getUserInfo() {
        return "User as JSON";
    }

    /**
     *
     * Метод должен уничтожать токен пользователя
     *
     * POST метод

     Принимает данные в body в виде:

     {
        "phoneNumber":"String",
        "token":"String"
     }
     * @return возвращает статус вызова метода
     */
    public String logout() {
        return "logout status";
    }

    /**
     * Бонусный метод продумайте сами
     * @return
     */
    public String changePassword() {
        return "";
    }

    /**
     * Бонусный метод продумайте сами
     * @return
     */
    public String changeNickname() {
        return "";
    }
}

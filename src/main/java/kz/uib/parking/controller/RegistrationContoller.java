package kz.uib.parking.controller;

import javax.servlet.http.HttpServletRequest;
import kz.uib.parking.exception.UserNotFoundException;
import kz.uib.parking.repository.json.JsonFileSecurityCodeRepository;
import kz.uib.parking.service.RegistrationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
@RestController
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

        // Validation

        final RegistrationService registrationService = new RegistrationService();


//        registrationService.registerNewUser();

        // Send security code

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
    @RequestMapping(method = RequestMethod.POST)
    public String checkSecurityCode(final HttpServletRequest request) throws UserNotFoundException {


        final String phoneNumber = "";
        final String securityCode = "";
        final String sha512Password = "";

        // Validation

        final RegistrationService registrationService = new RegistrationService();

        registrationService.checkSecurityCodeValid(securityCode, phoneNumber, sha512Password);


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

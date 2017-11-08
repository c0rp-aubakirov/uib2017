package kz.uib.parking.model;

import java.util.UUID;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public class User {

    String id; // UUID пользователя. Должно генерится во время создания ровно один раз

    String login;
    String password;
    String email;
    Double balance; // количество денег

    //... и т.д.
}

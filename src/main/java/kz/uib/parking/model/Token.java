package kz.uib.parking.model;

import java.util.Date;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public class Token extends AbstractModel {

    // Кому был выдан токен
    User user;

    // Сам токен
    String token;

    // Дата выдачи токена
    Date timestamp;
}

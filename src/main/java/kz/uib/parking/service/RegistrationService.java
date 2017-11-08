package kz.uib.parking.service;

import kz.uib.parking.model.SecurityCode;
import kz.uib.parking.model.User;
import kz.uib.parking.repository.json.JsonFileUserRepository;
import kz.uib.parking.repository.interfaces.SecurityCodeRepositoryInterface;
import kz.uib.parking.repository.interfaces.UserRepositoryInterface;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public class RegistrationService {

    private final UserRepositoryInterface userRepository;
    private final SecurityCodeRepositoryInterface securityCodeRepository;

    public RegistrationService(
        final JsonFileUserRepository userRepository,
        final SecurityCodeRepositoryInterface securityCodeRepository) {
        this.userRepository = userRepository;
        this.securityCodeRepository = securityCodeRepository;
    }

    /** Метод должен создать нового юзера и создать новый security code. Юзер пока без пароля
     *
     * @param phoneNumber номер юзера, он же логин
     * @param nickName никнейм юзера
     * @param email емейл юзера
     */
    public void registerNewUser(final String phoneNumber, final String nickName, final String email) {
        final SecurityCode code = new SecurityCode();
        securityCodeRepository.addOne(code);

        final User user = new User();
        userRepository.addOne(user);
    }

    /**
     * Проверяет есть ли у этого юзера такой security code в базе данных
     * @param securityCode сам код
     * @param phoneNumber номер юзера, он же логин
     * @return true или false
     */
    public Boolean checkSecurityCodeValid(final String securityCode, final String phoneNumber) {
        final User userByPhoneNumber = userRepository.findUserByPhoneNumber(phoneNumber);
        return securityCodeRepository.checkIfUserSecurityCode(securityCode, userByPhoneNumber.getId());
    }

    /**
     * Создаем новый security code для этого юзера
     * TODO здесь важно удалить предыдущий код если он есть. Этого не сделано
     * @param phoneNumber номер юзера, он же логин
     */
    public void generateNewSecurityCode(final String phoneNumber) {
        //TODO Тут требуются доработки
        securityCodeRepository.addOne(new SecurityCode());
    }

    public String isNumberAvailable() {
        //TODO Тут требуются доработки
        return "true/false";
    }

    public String login() {
        //TODO Тут требуются доработки
        return "TOKEN";
    }

}

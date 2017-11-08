package kz.uib.parking.repository;

import java.util.List;
import kz.uib.parking.model.User;
import kz.uib.parking.repository.interfaces.UserRepositoryInterface;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public class JsonFileUserRepository implements UserRepositoryInterface {

    private final String filename;

    public JsonFileUserRepository(final String filename) {
        this.filename = filename;
    }

    @Override
    public void writeUsers(final List<User> users) {
        throw new UnsupportedOperationException("#writeUsers()");
    }

    @Override
    public List<User> readUsers() {
        throw new UnsupportedOperationException("#readUsers()");
    }

    @Override
    public void addOneUserToDB(final User user) {
        throw new UnsupportedOperationException("#addOneUserToDB()");
    }

    @Override
    public User findUserById(final String id) {
        throw new UnsupportedOperationException("#findUserById()");
    }

    @Override
    public Boolean isUserInDB(final String id) {
        throw new UnsupportedOperationException("#isUserInDB()");
    }
}

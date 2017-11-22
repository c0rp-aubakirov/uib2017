package kz.uib.parking.repository.json;

import com.google.gson.Gson;
import java.util.List;
import kz.uib.parking.repository.interfaces.RepositoryInterface;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public abstract class JsonRepository<T> implements RepositoryInterface<T> {

    public Gson gson = new Gson();
    private final String filename;

    public JsonRepository(final String filename) {
        this.filename = filename;
    }

    @Override
    public void addOne(final T t) {
        throw new UnsupportedOperationException("#addOne()");
    }

    @Override
    public void deleteOne(final T t) {
        throw new UnsupportedOperationException("#deleteOne()");
    }

    @Override
    public void deleteOneById(final String id) {
        throw new UnsupportedOperationException("#deleteOneById()");
    }

    @Override
    public void getById(final String id) {
        throw new UnsupportedOperationException("#getById()");
    }

    @Override
    public List<T> findAll() {
        throw new UnsupportedOperationException("#findAll()");
    }

    @Override
    public void addAll(final List<T> list) {
        throw new UnsupportedOperationException("#addAll()");
    }

    @Override
    public boolean checkIfExists(final String id) {
        throw new UnsupportedOperationException("#checkIfExists()");
    }

    public String getFilename() {
        return this.filename;
    }
}

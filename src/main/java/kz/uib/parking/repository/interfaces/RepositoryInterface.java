package kz.uib.parking.repository.interfaces;

import java.util.List;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public interface RepositoryInterface<T> {

    public void addOne(final T t);

    public void deleteOne(final T t);

    public void deleteOneById(final String id);

    public void getById(final String id);

    public List<T> findAll();

    public void addAll(final List<T> list);

    public boolean checkIfExists(final String id);
}

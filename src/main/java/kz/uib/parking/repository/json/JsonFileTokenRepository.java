package kz.uib.parking.repository.json;

import kz.uib.parking.model.Token;
import kz.uib.parking.repository.interfaces.TokenRepositoryInterface;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public class JsonFileTokenRepository extends JsonRepository<Token> implements TokenRepositoryInterface {
    public JsonFileTokenRepository(final String filename) {
        super(filename);
    }

    @Override
    public void readTokenByUserId(final String userId) {
        throw new UnsupportedOperationException("#readTokenByUserId()");
    }

    @Override
    public void removeTokenByUserId(final String userId) {
        throw new UnsupportedOperationException("#removeTokenByUserId()");
    }
}

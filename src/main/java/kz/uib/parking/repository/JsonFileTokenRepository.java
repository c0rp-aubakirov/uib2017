package kz.uib.parking.repository;

import java.util.List;
import kz.uib.parking.model.Token;
import kz.uib.parking.repository.interfaces.TokenRepositoryInterface;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public class JsonFileTokenRepository implements TokenRepositoryInterface {

    public JsonFileTokenRepository(final String filename) {
        this.filename = filename;
    }

    private final String filename;

    @Override
    public void addOneTokenToDB(final Token token) {
        throw new UnsupportedOperationException("#addOneTokenToDB()");
    }

    @Override
    public void readTokenByUserId(final String userId) {
        throw new UnsupportedOperationException("#readTokenByUserId()");
    }

    @Override
    public void readTokenByTokenId(final String tokenId) {
        throw new UnsupportedOperationException("#readTokenByTokenId()");
    }

    @Override
    public void removeTokenByUserId(final String userId) {
        throw new UnsupportedOperationException("#removeTokenByUserId()");
    }

    @Override
    public void removeTokenByTokenId(final String tokenId) {
        throw new UnsupportedOperationException("#removeTokenByTokenId()");
    }

    @Override
    public List<Token> readTokens() {
        throw new UnsupportedOperationException("#readTokens()");
    }

    @Override
    public void writeTokens(final List<Token> tokenList) {
        throw new UnsupportedOperationException("#writeTokens()");
    }
}

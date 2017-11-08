package kz.uib.parking.repository.interfaces;

import java.util.List;
import kz.uib.parking.model.Token;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public interface TokenRepositoryInterface {

    public void addOneTokenToDB(final Token token);

    public void readTokenByUserId(final String userId);

    public void readTokenByTokenId(final String tokenId);

    public void removeTokenByUserId(final String userId);

    public void removeTokenByTokenId(final String tokenId);

    public List<Token> readTokens();

    public void writeTokens(final List<Token> tokenList);
}

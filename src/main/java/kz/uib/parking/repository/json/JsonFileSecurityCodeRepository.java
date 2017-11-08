package kz.uib.parking.repository.json;

import kz.uib.parking.model.SecurityCode;
import kz.uib.parking.repository.interfaces.SecurityCodeRepositoryInterface;

/**
 * @author Sanzhar Aubakirov (c0rp.aubakirov@gmail.com)
 */
public class JsonFileSecurityCodeRepository extends JsonRepository<SecurityCode> implements SecurityCodeRepositoryInterface {

    public JsonFileSecurityCodeRepository(final String filename) {
        super(filename);
    }

    @Override
    public SecurityCode getBySecurityCode(final String securityCode) {
        throw new UnsupportedOperationException("#getBySecurityCode()");
    }

    @Override
    public Boolean checkIfUserSecurityCode(final String securityCode,
        final String userId) {
        throw new UnsupportedOperationException("#checkIfUserSecurityCode()");
    }
}

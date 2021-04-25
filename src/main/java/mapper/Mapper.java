package mapper;

import java.util.List;

/**
 * The Interface Mapper.
 */
public interface Mapper {
    /**
     * Validation user exists in contract by user's id.
     *
     * @param listUserId list id of user.
     * @param contractId contract id
     * @return the int.
     */
    int validationSmt(List<Integer> listUserId, Integer contractId);
}

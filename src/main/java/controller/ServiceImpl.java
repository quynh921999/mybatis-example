package controller;

import mapper.Mapper;

public class ServiceImpl implements Service {
    Mapper mapper;
    /**
     * {@inheritDoc}
     */
    @Override
    public String handle() {
        if (mapper.validationSmt(List<Integer> userID, Integer contractID) < 1) {
            return "validation";
        }
        return null;
    }

}

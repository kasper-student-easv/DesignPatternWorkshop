package dk.easv.designpatternworkshop.dal;

import java.util.List;

public interface ConfigRepository {
    String getConfigById(int id) throws Exception;
    List<String> getAllConfigs() throws Exception;
}
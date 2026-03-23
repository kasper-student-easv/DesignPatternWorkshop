package dk.easv.designpatternworkshop.Repository;

import dk.easv.designpatternworkshop.dal.ConfigRepository;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ApiConfigRepository implements ConfigRepository {

        private final String baseUrl = "http://10.5.10.10:8080/fox/commands/";

        @Override
        public String getConfigById(int id) throws Exception {
            URL url = new URL(baseUrl + "get/" + id);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder content = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            return content.toString();
        }

        @Override
        public List<String> getAllConfigs() throws Exception {
            // Example: fetch multiple configs
            List<String> configs = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                configs.add(getConfigById(i));
            }
            return configs;
        }
    }


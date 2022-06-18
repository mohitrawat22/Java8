package PMC;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class JsonString {
    public static void main(String[] args) throws ParseException {
        JSONObject parentJSON = new JSONObject();
        JSONObject processJSON = new JSONObject();
        processJSON.put("Active", "Y");
        parentJSON.put("JBoss", processJSON);
        System.out.println(parentJSON);

        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse("{\n" +
                "  \"JBoss\": {\n" +
                "    \"Active\": \"Yes\"\n" +
                "  },\n" +
                "  \"TradeMonitor\": {\n" +
                "    \"Active\": \"Yes\"\n" +
                "  },\n" +
                "  \"BasketServer\": {\n" +
                "    \"Active\": \"Yes\"\n" +
                "  },\n" +
                "  \"AppiaBuy\": {\n" +
                "    \"Active\": \"Yes\",\n" +
                "    \"Application Directory\": \"/home\"\n" +
                "  },\n" +
                "  \"AppiaSell\": {\n" +
                "    \"Active\": \"Yes\",\n" +
                "    \"Application Directory\": \"/home\"\n" +
                "  },\n" +
                "  \"Simulator\": {\n" +
                "    \"Active\": \"Yes\"\n" +
                "  }\n" +
                "}");
        Iterator<String> keys = json.keySet().iterator();
        System.out.println(json.containsKey("AppiaBuy"));
        System.out.println(json.size());
        while(keys.hasNext()) {
            String key = keys.next();

        }
    }
}

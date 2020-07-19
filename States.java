import java.util.HashMap;

public class States {

    private HashMap<String, String> states;
    private HashMap<Integer, String> mapToHashMap;

    public States() {
        states = new HashMap<String, String>();
        mapToHashMap = new HashMap<Integer, String>();
        int i = 0;

        states.put("Alabama", "Montgomery");
        states.put("Alaska", "Juneau");
        states.put("Arizona", "Phoenix");
        states.put("Arkansas", "Little Rock");
        states.put("Colorado", "Denver");
        states.put("Connecticut", "Hartford");
        states.put("Delaware", "Dover");
        states.put("Florida", "Tallahassee");
        states.put("Georgia", "Atlanta");
        states.put("Hawaii", "Honolulu");
        states.put("Idaho", "Boise");
        states.put("Illinois", "Springfield");
        states.put("Indiana", "Indianapolis");
        states.put("Iowa", "Des Moines");
        states.put("Kalifornien", "Sacramento");
        states.put("Kansas", "Topeka");
        states.put("Kentucky", "Frankfort");
        states.put("Louisiana", "Baton Rouge");
        states.put("Maine", "Augusta");
        states.put("Maryland", "Annapolis");
        states.put("Massachusetts", "Boston");
        states.put("Michigan", "Lansing");
        states.put("Minnesota", "Saint Paul");
        states.put("Mississippi", "Jackson");
        states.put("Missouri", "Jefferson City");
        states.put("Montana", "Helena");
        states.put("Nebraska", "Lincoln");
        states.put("Nevada", "Carson City");
        states.put("New Hampshire", "Concord");
        states.put("New Jersey", "Trenton");
        states.put("New Mexico", "Santa Fe");
        states.put("New York", "Albany");
        states.put("North Carolina", "Raleigh");
        states.put("North Dakota", "Bismarck");
        states.put("Ohio", "Columbus");
        states.put("Oklahoma", "Oklahoma City");
        states.put("Oregon", "Salem");
        states.put("Pennsylvania", "Harrisburg");
        states.put("Rhode Island", "Providence");
        states.put("South Carolina", "Columbia");
        states.put("South Dakota", "Pierre");
        states.put("Tennessee", "Nashville");
        states.put("Texas", "Austin");
        states.put("Utah", "Salt Lake City");
        states.put("Vermont", "Montpelier");
        states.put("Virginia", "Richmond");
        states.put("Washington", "Olympia");
        states.put("West Virginia", "Charleston");
        states.put("Wisconsin", "Madison");
        states.put("Wyoming", "Cheyenne");

        for (String stat : states.keySet()) {
            mapToHashMap.put(i, stat);
            i++;
        }
        
    }

    public HashMap get_States() {
        return states;
    }

    public HashMap get_mapping() {
        return mapToHashMap;
    }


}
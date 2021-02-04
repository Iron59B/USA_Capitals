import java.util.HashMap;

public class States {

    private HashMap<String, String> states;
    private HashMap<Integer, String> mapToHashMap;

    public States(String region) {
        states = new HashMap<String, String>();
        mapToHashMap = new HashMap<Integer, String>();
        int i = 0;

        if (region.toLowerCase().equals("usa")) {
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

        }

        else if (region.toLowerCase().equals("europe")) {
            states.put("Österreich", "Wien");
            states.put("Island", "Reykjavik");
            states.put("Norwegen", "Oslo");
            states.put("Schweden", "Stockholm");
            states.put("Finnland", "Helsinki");
            states.put("Russland", "Moskau");
            states.put("Weißrussland", "Minsk");
            states.put("Estland", "Tallin");
            states.put("Lettland", "Riga");
            states.put("Litauen", "Vilnius");
            states.put("Ukraine", "Kiew");
            states.put("Irland", "Dublin");
            states.put("England", "London");
            states.put("Schottland", "Edinburgh");
            states.put("Nordirland", "Belfast");
            states.put("Wales", "Cardiff");
            states.put("Belgien", "Brüssel");
            states.put("Niederlande", "Amsterdam");
            states.put("Luxemburg", "Luxemburg");
            states.put("Frankreich", "Paris");
            states.put("Spanien", "Madrid");
            states.put("Andorra", "Andorra");
            states.put("Portugal", "Lissabon");
            states.put("Deutschland", "Berlin");
            states.put("Tschechien", "Prag");
            states.put("Polen", "Warschau");
            states.put("Slowakei", "Bratislava");
            states.put("Slowenien", "Ljubljana");
            states.put("Ungarn", "Budapest");
            states.put("Italien", "Rom");
            states.put("Vatikan", "Vatikan");
            states.put("San Marino", "San Marino");
            states.put("Kroatien", "Zagreb");
            states.put("Malta", "Valletta");
            states.put("Zypern", "Nikosia");
            states.put("Kosovo", "Pristina");
            states.put("Bosnien", "Sarajevo");
            states.put("Serbien", "Belgrad");
            states.put("Albanien", "Tirana");
            states.put("Montenegro", "Podgorica");
            states.put("Rumänien", "Bukarest");
            states.put("Bulgarien", "Sofia");
            states.put("Moldawien (Moldau)", "Chisinau");
            states.put("Türkei", "Ankara");
            states.put("Griechenland", "Athen");
            states.put("Monaco", "Monaco");
            states.put("Schweiz", "Bern");
            states.put("Liechtenstein", "Vaduz");
            states.put("Dänemark", "Kopenhagen");
            states.put("Nordmazedonien", "Skopje");
        }

        else System.out.println("wrong arg");

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

    public int size() {
        return states.size();
    }


}
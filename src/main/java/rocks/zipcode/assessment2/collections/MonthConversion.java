package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    TreeMap<Integer, String> myMap;

    public MonthConversion(){
        this.myMap = new TreeMap<>();
    }


    public void add(Integer monthNumber, String monthName) {
        this.myMap.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        try{
            return myMap.get(monthNumber);
        } catch (NullPointerException e){
            return null;
        }
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        try {
            for (Map.Entry<Integer, String> entry : this.myMap.entrySet()) {
                if (entry.getValue().equals(monthName)) {
                    return entry.getKey();
                }
            }
        }catch (NullPointerException e){
            return null;
        }
        return null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        if (this.myMap.containsKey(monthNumber)){
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        if (this.myMap.containsValue(monthName)){
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return this.myMap.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        this.myMap.put(monthNumber, monthName);
    }
}

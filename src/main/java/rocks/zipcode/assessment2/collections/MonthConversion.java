package rocks.zipcode.assessment2.collections;

import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    Map<Integer,String> track;
    public MonthConversion(){
        track= new TreeMap<Integer,String>();
    }
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        track.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        boolean found = false;
        String returnValue ="";
        for(Map.Entry<Integer,String> entry : track.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if(key==monthNumber) {
                found = true;
                returnValue = value;
            }
        }
        if(found == false)
            returnValue=null;
        return returnValue;
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        boolean found = false;
        Integer returnValue =0;
        for(Map.Entry<Integer,String> entry : track.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if(value.equals(monthName)) {
                found = true;
                returnValue = key;
            }
        }
        if(found == false)
            returnValue=null;
        return returnValue;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        boolean found = false;
        for(Map.Entry<Integer,String> entry : track.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if(key==monthNumber) {
                found = true;
            }
        }
        return found;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        boolean found = false;

        for(Map.Entry<Integer,String> entry : track.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if(value.equals(monthName)) {
                found = true;
            }
        }
        return found;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {

        return track.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        boolean found = false;
        String returnValue ="";
        for(Map.Entry<Integer,String> entry : track.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if(key==monthNumber) {
                found = true;
                track.put(monthNumber,monthName);
            }
        }
    }
}

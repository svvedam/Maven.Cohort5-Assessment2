package rocks.zipcode.assessment2.collections;

import java.util.*;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    public List items;
    HashMap<String, Integer> qtyCount;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List strings) {
        items = new ArrayList<String>();
        qtyCount  = new HashMap<String,Integer>();
        for(int i =0; i<strings.size();i++){
            items.add(strings.get(i));
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
           items = new ArrayList<String>();
           qtyCount  = new HashMap<String,Integer>();

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {

        items.add(item);

    }


    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        /*HashMap<String, Integer> qtyCount = new HashMap<String,Integer>();

        Integer returnValue=0;
        for(Object str: items){
            if(!qtyCount.containsKey(str))
                qtyCount.put(str.toString(),1);
            else
                qtyCount.put(str.toString(), qtyCount.get(str.toString())+1);

        }
        for (Map.Entry<String, Integer> entry : qtyCount.entrySet()) {
            String key = entry.getKey();
            if(key.equals(item))
                qtyCount.remove(key);
        }*/
        items.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        HashMap<String, Integer> qtyCount = new HashMap<String,Integer>();

        Integer returnValue=0;
        for(Object str: items){
            if(!qtyCount.containsKey(str))
                qtyCount.put(str.toString(),1);
            else
                qtyCount.put(str.toString(), qtyCount.get(str.toString())+1);

        }
        for (Map.Entry<String, Integer> entry : qtyCount.entrySet()) {
            String key = entry.getKey();
            if(key.equals(item))
                returnValue = entry.getValue();
        }
        return returnValue;
    }
}

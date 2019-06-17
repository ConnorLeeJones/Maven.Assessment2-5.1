package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    HashMap<String, Integer> myMap;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.myMap = new HashMap<>();
        if (strings.size() > 0) {
            for (String item : strings) {
                Integer count = this.myMap.get(item);
                if (count == null) {
                    this.myMap.put(item, 1);
                } else {
                    this.myMap.put(item, count + 1);
                }
            }
        }

    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.myMap = new HashMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if (this.myMap.containsKey(item)) {
            this.myMap.put(item, myMap.get(item) + 1);
        } else {
            this.myMap.put(item, 1);
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        Integer count = this.myMap.get(item);
        if (count > 1){
            this.myMap.put(item, count - 1);
        } else {
            this.myMap.remove(item);
        }
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        if (this.myMap.containsKey(item)) {
            return this.myMap.get(item);
        } else {
            return 0;
        }
    }
}

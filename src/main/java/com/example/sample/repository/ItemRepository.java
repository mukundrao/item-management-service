package com.example.sample.repository;

import com.example.sample.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ItemRepository {

    Map<Integer,Item> itemMap = new HashMap<>();

    public void addItem(Item item){
        itemMap.put(item.getId(),item);
    }

    public Item getItemById(int id){
        if(!itemMap.containsKey(id)){
            return null;
        }
        return itemMap.get(id);
    }

    public List<Item> getAllItems(){
        List<Item> items = new ArrayList<>();
        if (itemMap.isEmpty()){
            return null;
        }
        for(Map.Entry<Integer,Item> entry : itemMap.entrySet()){
            items.add(entry.getValue());
        }
        return items;
    }

    public String deleteAllItems() {
        if(itemMap.isEmpty()){
            return "Already Empty";
        }
        itemMap.clear();
        return "Cleared";
    }
}

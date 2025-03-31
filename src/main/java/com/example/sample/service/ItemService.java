package com.example.sample.service;

import com.example.sample.model.Item;
import com.example.sample.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public String addItem(Item item){
        itemRepository.addItem(item);
        return "Item added successfully!";
    }

    public Item getItem(int id){
        return itemRepository.getItemById(id);
    }

    public List<Item> getAllItems(){
        return itemRepository.getAllItems();
    }


}

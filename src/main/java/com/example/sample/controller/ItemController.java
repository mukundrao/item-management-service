package com.example.sample.controller;

import com.example.sample.model.Item;
import com.example.sample.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping
    public String addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

    @GetMapping
    public Item getItemByRequestParam(@RequestParam("id") int id){
        return itemService.getItem(id);
    }

    @GetMapping("/id/{id}")
    public Item getItemByPathParam(@PathVariable("id") int id){
        return itemService.getItem(id);
    }

    @GetMapping("/getAllItems")
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }
    @DeleteMapping("/deleteAllItems")
    public String deleteAllItems(){
        return itemService.deleteAllItems();
    }

}

package com.learning.java.controller;

import com.learning.java.model.entity.Contacts;
import com.learning.java.service.ContactsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by krvh271 on 1/9/18.
 */
@RestController
public class ContactsController {

    @Autowired
    ContactsService contactsService;

    @GetMapping(path = "contacts")
    public ResponseEntity<List<Contacts>> getContacts(){
        return contactsService.getContacts();
    }

    @GetMapping(path = "contacts/{id}")
    public ResponseEntity<Contacts> getContacts(@PathVariable Long id){
        return contactsService.getContactById(id);
    }



}

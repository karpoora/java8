package com.learning.java.service;

import com.learning.java.model.entity.Contacts;
import com.learning.java.repository.ContactsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Created by krvh271 on 1/9/18.
 */
@Service
public class ContactsService {

    @Autowired
    ContactsRepository contactsRepository;

    public ResponseEntity<Contacts> createContacts(Contacts contacts){
        return null;
    }

    public ResponseEntity<List<Contacts>> getContacts() {
        List<Contacts> allContacts = contactsRepository.findAll();
        return new ResponseEntity<List<Contacts>>(allContacts,HttpStatus.OK);
    }

    public ResponseEntity<Contacts> getContactById(Long id) {
        Optional<Contacts> optionalContact = contactsRepository.findById(id);
        return !optionalContact.isPresent() ? new ResponseEntity<Contacts>(HttpStatus.NO_CONTENT) : new ResponseEntity<Contacts>(optionalContact.get(), HttpStatus.OK);
    }
}

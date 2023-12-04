package com.react.react.Apicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.react.react.AppEntity.Contact;
import com.react.react.AppRepository.ContactRepository;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {
    private final ContactRepository contactRepository;

    @Autowired
    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @PostMapping("/submit")
    public Contact submitContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    // Add other endpoints as needed (e.g., GET, PUT, DELETE)
}
package com.react.react.ApiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.react.AppEntity.Contact;
import com.react.react.AppRepository.ContactRepository;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact submitContact(Contact contact) {

        return contactRepository.save(contact);
    }

}

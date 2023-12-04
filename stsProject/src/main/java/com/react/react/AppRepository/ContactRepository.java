package com.react.react.AppRepository;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.react.react.AppEntity.Contact;

@EntityScan(basePackages = "com.react.react.AppEntity")
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}


package com.ironlady.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ironlady.entity.Enquiry;

public interface EnquiryRepository extends JpaRepository<Enquiry, Long> {
}

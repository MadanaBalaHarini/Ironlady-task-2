
package com.ironlady.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ironlady.entity.Enquiry;
import com.ironlady.repository.EnquiryRepository;

@Service
public class EnquiryService {

    private final EnquiryRepository repository;

    public EnquiryService(EnquiryRepository repository) {
        this.repository = repository;
    }

    public Enquiry create(Enquiry enquiry) {
        enquiry.setStatus("New");
        return repository.save(enquiry);
    }

    public List<Enquiry> getAll() {
        return repository.findAll();
    }

    public Enquiry update(Long id, Enquiry enquiry) {
        Enquiry e = repository.findById(id).orElseThrow();
        e.setName(enquiry.getName());
        e.setEmail(enquiry.getEmail());
        e.setProgram(enquiry.getProgram());
        e.setStatus(enquiry.getStatus());
        return repository.save(e);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

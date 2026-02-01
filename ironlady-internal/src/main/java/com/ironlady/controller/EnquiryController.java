package com.ironlady.controller;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ironlady.entity.Enquiry;
import com.ironlady.service.EnquiryService;

@RestController
@RequestMapping("/enquiries")
@CrossOrigin
public class EnquiryController {

    private final EnquiryService service;

    public EnquiryController(EnquiryService service) {
        this.service = service;
    }

    @PostMapping
    public Enquiry create(@RequestBody Enquiry enquiry) {
        return service.create(enquiry);
    }

    @GetMapping
    public List<Enquiry> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Enquiry update(@PathVariable Long id, @RequestBody Enquiry enquiry) {
        return service.update(id, enquiry);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

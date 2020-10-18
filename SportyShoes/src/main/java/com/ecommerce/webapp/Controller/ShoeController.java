package com.ecommerce.webapp.Controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.webapp.Pojo.ShoeDetails;
import com.ecommerce.webapp.Exception.ShoeNotFound;
import com.ecommerce.webapp.Repository.ShoeRepository;


@RestController
@RequestMapping("/api/v1")
public class ShoeController {
	
	@Autowired
	public ShoeRepository shoerepo;
	// get all shoe details
	@GetMapping("/shoeDetails")
	public List<ShoeDetails> getAllShoeDetails(){
		
		return this.shoerepo.findAll();
	}
	
	// get all shoe details by id
    @GetMapping("/shoeDetails/{id}")
    public ShoeDetails getShoeDetailsById(@PathVariable(value="id") long shoeDetailsId){
    	
    	return this.shoerepo.findById(shoeDetailsId).orElseThrow(()-> new ShoeNotFound("Shoe Not Found With Id "+shoeDetailsId));
    	
    }
    
    // creat new shoe details
    @PostMapping("/shoeDetails")
	public ShoeDetails addShoeDetails(@RequestBody ShoeDetails shoedetails) {
		
		return this.shoerepo.save(shoedetails);
	}
    
    // update shoe details
    @PutMapping("/shoeDetails/{id}")
   	public ShoeDetails updateShoeDetails(@RequestBody ShoeDetails shoedetails, @PathVariable(value="id") long shoeDetailsId){
    	// 1. find the record or find the shoe details
      ShoeDetails fetchedShoeDetails = this.shoerepo.findById(shoeDetailsId).orElseThrow(()-> new ShoeNotFound("Shoe Not Found With Id "+shoeDetailsId));
   		// 2. Set new values
      
      fetchedShoeDetails.setCompany(shoedetails.getCompany());
      fetchedShoeDetails.setCategory(shoedetails.getCategory());
      fetchedShoeDetails.setSize(shoedetails.getSize());
      fetchedShoeDetails.setPrice(shoedetails.getPrice());
   		return this.shoerepo.save(fetchedShoeDetails);
   	}
    
    // delete the shoe details by id
    @DeleteMapping("/shoeDetails/{id}")
   	public  void deleteShoeDetailsById(@PathVariable(value="id") long shoeDetailsId) {
    	// 1. find the record or find the shoe details
        ShoeDetails fetchedShoeDetails = this.shoerepo.findById(shoeDetailsId).orElseThrow(()-> new ShoeNotFound("Shoe Not Found With Id "+shoeDetailsId));
        
   		this.shoerepo.delete(fetchedShoeDetails);
   	}
    
}

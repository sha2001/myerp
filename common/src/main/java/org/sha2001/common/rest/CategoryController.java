package org.sha2001.common.rest;

import org.sha2001.common.domain.Dictionary;
import org.sha2001.common.repository.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

import org.sha2001.common.repository.DictionaryRepository;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("api/dictionary")
public class CategoryController {

	@Autowired
	private DictionaryRepository dictionaryRepository; 
	
    @RequestMapping("/")
    public Iterable<Dictionary> getItems() {   
        return dictionaryRepository.findAll();
    }
    
    @RequestMapping("/{category}")
    public List<Dictionary> getItems(@PathVariable(value="category") String category) {
    	return dictionaryRepository.findByCategory(category);
    }
    
    @RequestMapping(path="/",method=RequestMethod.POST)
    void saveItem(@RequestBody Dictionary item) {
        dictionaryRepository.save(item);
    }
    
    @RequestMapping(path="/categories")
    public List<String> getCategories() {
    	return dictionaryRepository.getCategories();
    }
}

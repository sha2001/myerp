package org.sha2001.common.rest;

import org.sha2001.common.domain.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.sha2001.common.repository.DictionaryRepository;

import java.util.List;

import javax.websocket.server.PathParam;

@RestController
@EnableAutoConfiguration
@RequestMapping("dictionary")
public class CategoryController {

	@Autowired
	private DictionaryRepository dictionaryRepository; 
	
    @RequestMapping("/items")
    public Iterable<Dictionary> getItems() {
        return dictionaryRepository.findAll();
    }
    
    @RequestMapping("/items/{category}")
    public List<Dictionary> getItems(@PathParam(value="category") String category) {
    	return dictionaryRepository.findByCategory(category);
    }
    
    @RequestMapping(path="/items",method=RequestMethod.POST)
    void saveItem(@RequestBody Dictionary item) {
        dictionaryRepository.save(item);
    	
    }
}

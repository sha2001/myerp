package org.sha2001.common.rest;

import org.sha2001.common.domain.Dictionary;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("dictionary")
public class CategoryController {

    @RequestMapping("/items")
    List<Dictionary> getEmployees() {
        return null;
    }

}

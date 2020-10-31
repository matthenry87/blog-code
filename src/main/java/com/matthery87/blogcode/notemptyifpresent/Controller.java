package com.matthery87.blogcode.notemptyifpresent;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Validated
@RestController
public class Controller {

    @GetMapping
    public Map<String, String> get(@NotEmptyIfPresent @RequestParam(required = false) String string,
                                   @NotEmptyIfPresent @RequestParam(required = false) List<String> strings) {

        HashMap<String, String> map = new HashMap<>();

        map.put("string", string);

        return map;
    }

}

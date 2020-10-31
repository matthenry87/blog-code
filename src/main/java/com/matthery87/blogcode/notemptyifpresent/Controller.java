package com.matthery87.blogcode.notemptyifpresent;

import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Map<String, String> post(@Validated @RequestBody RequestObject requestObject) {

        return new HashMap<>();
    }

    @Getter
    @Setter
    private static class RequestObject {

        @NotEmptyIfPresent
        private String string;
    }
}

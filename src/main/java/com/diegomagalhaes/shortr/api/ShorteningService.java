package com.diegomagalhaes.shortr.api;

import com.diegomagalhaes.shortr.api.configuration.APIProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;


@RestController
public class ShorteningService {

    private APIProperties props;

    @Autowired
    public ShorteningService(@Qualifier("APIProperties") APIProperties apiProperties) {
        this.props = apiProperties;
    }

    @RequestMapping("test")
    Callable<String> test(){
        return () -> props.getConfig().getBlocked().getBlockedExtensions().toString();
    }
}

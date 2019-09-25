package org.example.config;

import org.others.AutoHelloInport;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

//@Configuration
@Component
@Import({AutoHelloInport.class})
public class AutoConfig {
}

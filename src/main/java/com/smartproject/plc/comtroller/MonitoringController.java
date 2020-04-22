package com.smartproject.plc.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MonitoringController {
	@RequestMapping(value="/test")
    public String test() throws Exception {
    	
        return "/monitoring/test";
    }
}

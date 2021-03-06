package com.example.sampleapp.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

@RestController 
@SpringBootApplication
public class DemoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoappApplication.class, args);
	}
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getHello() {
	return "Hello from Server" + "\n";
	}

	@RequestMapping(value = "/venk", method = RequestMethod.GET)
        public String getVenk() {
        return "Hello venk from Server" + "\n";
        }

	@RequestMapping(value = "/sanoj/{paramId}", method = RequestMethod.GET)
        public String getSanojWithParam(@PathVariable String paramId) {
        System.out.print("id is " + paramId);
        return "Hello from Server with Param : " + paramId + "\n";
        }

	@RequestMapping(value = "/hello/{paramId}", method = RequestMethod.GET)
	public String getHelloWithParam(@PathVariable String paramId) {
	System.out.print("id is " + paramId);
	return "Hello from Server with Param : " + paramId + "\n";
	}
	@RequestMapping(value = "/test/{paramId}", method = RequestMethod.GET)
	public String getTestWithParam(@PathVariable String paramId) {
	System.out.print("id is " + paramId);
	return "Hello from Server with Param : " + paramId + "\n";
	}
	@RequestMapping(value = "/devops", method = RequestMethod.GET)
        public String getDevops() {
        return "Hello from Devops Server" + "\n";
        }
	@RequestMapping(value = "/devops/{paramId}", method = RequestMethod.GET)
        public String getDevopsWithParam(@PathVariable String paramId) {
        System.out.print("id is " + paramId);
        return "Hello from Server with Param : " + paramId + "\n";
        }

}

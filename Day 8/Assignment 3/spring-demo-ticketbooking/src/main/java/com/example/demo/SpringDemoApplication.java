package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demo.contr.TicketController","com.example.demo.interrepo.TicketRepo","com.example.demo.interrepo.TIcketFromToPlace",
	"com.example.demo.modeltick.TicketBooking","com.example.demo.serv.TicketBookingServ","com.example.demo.serv.TicketBookingServiceimpl","com.example.demo.SpringDemoApplication"})
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}

package com.jsm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;



@Service
public class PriceService {

	public List<Double> getPrice() {
		List <Double> l=new ArrayList<>();
		double random = new Random().nextDouble();
		double gstart = 50000.0;
		double gend = 51000.0;
		double gresult = gstart + (random * (gend - gstart));
		gresult=Double.parseDouble(String.format("%.2f", gresult));
		
		double sstart = 600.0;
		double send = 650.0;
		double sresult = sstart + (random * (send - sstart));
		sresult=Double.parseDouble(String.format("%.2f", sresult));
		
		l.add(gresult);
		l.add(sresult);
		return l;
	}
	
}

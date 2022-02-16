package com.consigliere.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consigliere.entity.Consigliere;
import com.consigliere.entity.ConsigliereCrypto;
import com.consigliere.entity.ConsigliereGainers;
import com.consigliere.entity.ConsigliereLosers;
import com.consigliere.repository.ConsigliereRepository;

@Service
public class ConsigliereService {

	@Autowired
	ConsigliereRepository consigliereRepository;

	private String stockURL = "https://financialmodelingprep.com/api/v3/stock_market";
	private String cryptoURL = "https://financialmodelingprep.com/api/v3/quotes";
	private String apiKey = "7825c8d4418bcd81f005e276a9ee2c0c";
	private String gainers = "/gainers";
	RestTemplate restTemplate = new RestTemplate();

	public ConsigliereGainers[] fetchGainers() {

		String url = stockURL + gainers + "?apikey=" + apiKey;
		ConsigliereGainers[] stockGain = restTemplate.getForObject(url, ConsigliereGainers[].class);
		return stockGain;

	}

	private String losers = "/losers";
	RestTemplate lrestTemplate = new RestTemplate();

	public ConsigliereLosers[] fetchLosers() {

		String url = stockURL + losers + "?apikey=" + apiKey;
		ConsigliereLosers[] stockLosers = lrestTemplate.getForObject(url, ConsigliereLosers[].class);
		return stockLosers;
	}
	
	private String crypto = "/crypto";
	RestTemplate crestTemplate = new RestTemplate();

	public ConsigliereCrypto[] fetchCrypto() {

		String url = cryptoURL + crypto + "?apikey=" + apiKey;
		ConsigliereCrypto[] crypto = crestTemplate.getForObject(url, ConsigliereCrypto[].class);
		return crypto;
	}

	public void saveConsigliere(Consigliere consigliere) {
		consigliereRepository.save(consigliere);
	}

	public Consigliere findConsigliereLogIn(String email, String password) {
		return consigliereRepository.findConsigliereLogIn(email, password);
	}
	
	public List<Consigliere> getConsigliere() {
		return consigliereRepository.findAll();

	}



}

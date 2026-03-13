package br.com.posterius.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import br.com.posterius.cloud.Ibge;
import br.com.posterius.cloud.IbgeResponse;

@Service
public class IbgeService {
	@Autowired
	private Ibge ibge;

	@Cacheable(value = "estados", condition = "#estados.equalsIgnoreCase('MG')")
	public List<IbgeResponse> findAllCities(String state) {
		return ibge.findAllCities(state);
	}
}

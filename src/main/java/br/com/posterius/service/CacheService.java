package br.com.posterius.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import br.com.posterius.entity.CompanyEntity;

@Service
public class CacheService {
	@Autowired
	private CacheManager cacheManager;
	
	@Autowired
	private CompanyService companyService;
	
	public void evictAllCacheValues(String cacheName) {
		Objects.requireNonNull(cacheManager.getCache(cacheName)).clear();
	}
	
	@CachePut("companies")
	public List<CompanyEntity> updateCacheCompanies() {
		return companyService.findAll();
	}
}

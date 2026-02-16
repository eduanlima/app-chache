package br.com.posterius.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.posterius.service.CacheService;

@RestController
@RequestMapping("/cache")
public class CacheController {
	@Autowired
	private CacheService cacheService;
	
	@PostMapping
	public void clear(@RequestParam("cacheName") String cacheName) {
		cacheService.evictAllCacheValues(cacheName);
	}
	
	@PutMapping
	public void update() {
		cacheService.updateCacheCompanies();
	}
}

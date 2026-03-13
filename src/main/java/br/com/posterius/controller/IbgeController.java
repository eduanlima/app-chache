package br.com.posterius.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.posterius.cloud.IbgeResponse;
import br.com.posterius.service.IbgeService;

@RestController
@RequestMapping("/ibge")
public class IbgeController {
	@Autowired
	private IbgeService ibgeService;
	
	@GetMapping
	public ResponseEntity<List<IbgeResponse>> findAllCities(@RequestParam String state){
		return ResponseEntity.ok(ibgeService.findAllCities(state));
	}
}

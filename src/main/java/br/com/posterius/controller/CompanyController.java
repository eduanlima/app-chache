package br.com.posterius.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.posterius.entity.CompanyEntity;
import br.com.posterius.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	
	@GetMapping
	public ResponseEntity<List<CompanyEntity>> findAll(){
		return ResponseEntity.ok(companyService.findAll());
	}
}

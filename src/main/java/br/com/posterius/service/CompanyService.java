package br.com.posterius.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.posterius.entity.CompanyEntity;
import br.com.posterius.repository.CompanyRepository;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	
	public List<CompanyEntity> findAll() {
		return (List<CompanyEntity>) companyRepository.findAll();
	}
}

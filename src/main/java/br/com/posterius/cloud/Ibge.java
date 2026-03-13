package br.com.posterius.cloud;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "ibge-ms", url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados")
public interface Ibge {
	@RequestMapping(method = RequestMethod.GET, value = "/{estado}/minicipios")
	List<IbgeResponse> findAllCities(@PathVariable String state);
}

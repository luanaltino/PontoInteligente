package com.luanaltino.pontointeligente.api.services;

import java.util.Optional;

import com.luanaltino.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	
	/**
	 * Retorna empresa com base no cnpj
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscaPorCnpj(String cnpj);
	
	/**
	 * Cadastra uma empresa
	 *  
	 * @param empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);

}

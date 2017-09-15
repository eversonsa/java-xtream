package com.estudo.java.stream.principal;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.estudo.java.stream.model.Produto;
import com.estudo.java.stream.util.Repositorio;

public class ExecutaSistema {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		List<Produto> produto = new ArrayList<>();
		produto.add(new Produto(1, "sabonete", new Date(), new BigDecimal("2.50")));
		produto.add(new Produto(2, "escova", new Date(), new BigDecimal("7.80")));
		produto.add(new Produto(3, "shampoo", new Date(), new BigDecimal("32.40")));
			
		
		Repositorio repositorio = new Repositorio();
		
		//Adicionar e listar os arquivos XML
		
		repositorio.getProdutos().adcicionarProdutos(produto); 
		repositorio.getProdutos().buscarProdutos(produto);
		
	}
}

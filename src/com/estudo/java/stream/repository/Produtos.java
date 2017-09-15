package com.estudo.java.stream.repository;

import java.io.FileNotFoundException;
import java.util.List;

import com.estudo.java.stream.model.Produto;

public interface Produtos {
	
	public void buscarProdutos(List<Produto> produto) throws FileNotFoundException;
	public void adcicionarProdutos(List<Produto> produto);
}

package com.estudo.java.stream.util;

import com.estudo.java.stream.repository.Produtos;
import com.estudo.java.stream.repository.infra.ProdutossXtream;

public class Repositorio {
	
	public Produtos getProdutos(){
		 return new ProdutossXtream();
	}
}

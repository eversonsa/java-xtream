package com.estudo.java.stream.repository.infra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import com.estudo.java.stream.model.Produto;
import com.estudo.java.stream.repository.Produtos;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

public class ProdutossXtream implements Produtos{
	
	private XStream xstream = new XStream(new DomDriver());
	
	@SuppressWarnings("unchecked")
	@Override
	public void buscarProdutos(List<Produto> produtos) throws FileNotFoundException {
		XStream.setupDefaultSecurity(xstream);
		xstream.addPermission(AnyTypePermission.ANY);
		xstream.alias("produto", Produto.class); 
	    produtos = (List<Produto>) xstream.fromXML(new FileInputStream("./produto.xml"));
	    for(Produto p : produtos){
			System.out.println(p.getNome() + " " + p.getDataValidade() + " " + p.getValor());
		}
	}

	@Override
	public void adcicionarProdutos(List<Produto> produto) {
		xstream.alias("produto", Produto.class);
		OutputStream os = null;
		try {
			 os = new FileOutputStream("./produto.xml");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		xstream.toXML(produto, os);
	}

}

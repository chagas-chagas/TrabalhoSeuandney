package br.edu.cesmac.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.edu.cesmac.model.Jornalista;

public class JornalistaView {
	
	BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
	
	public Jornalista ler() throws NumberFormatException, IOException {
		Jornalista jornalista = new Jornalista();
		
		System.out.println("Dados do Jornalista");
		System.out.println("Código: ");
		jornalista.setIdJornalista(Integer.parseInt(buffReader.readLine()));
		System.out.println("Nome: ");
		jornalista.setNomeJornalista(buffReader.readLine());		
		
		return jornalista;
	}

}

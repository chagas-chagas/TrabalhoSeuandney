package br.edu.cesmac.manipulador;

import java.util.ArrayList;
import java.util.List;

import br.edu.cesmac.model.Jornalista;

public class ManipuladorJornalista {
	List<Jornalista> jornalistas = new ArrayList<Jornalista>();
	
	public void cadastrar (Jornalista jornalista) {
		this.jornalistas.add(jornalista);
	}
	
	public void alterar (Jornalista jornalista) {
		for (Jornalista j : jornalistas) {
			if (j.getIdJornalista() == jornalista.getIdJornalista()) {
				this.jornalistas.set(this.jornalistas.indexOf(j),jornalista);
			}
			
		}
	}
	
	public void excluir (Jornalista jornalista) {
		this.jornalistas.remove(jornalista);
	}
	
	public void listar() {
		System.out.println("=============== JORNALISTAS CADASTRADOS ===============");
		for (Jornalista j : jornalistas) {
			System.out.println("Código " + j.getIdJornalista() + " - " + j.getNomeJornalista());
			
		} 
		System.out.println("=================================================== \n\n");
		
	}

	public List<Jornalista> getJornalistas() {
		return jornalistas;
	}
	
	
}

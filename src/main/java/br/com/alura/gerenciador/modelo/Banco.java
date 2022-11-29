package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsuario = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");

		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		lista.add(empresa);
		lista.add(empresa2);

		Usuario u1 = new Usuario();
		u1.setLogin("login");
		u1.setSenha("12345");

		Usuario u2 = new Usuario();
		u2.setLogin("login");
		u2.setSenha("12345");

		listaUsuario.add(u1);
		listaUsuario.add(u2);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);

	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {

		Iterator<Empresa> it = lista.iterator();
		while (it.hasNext()) {
			Empresa empresaRemove = it.next();
			if (empresaRemove.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		for (Empresa empresaBusca : lista) {
			if (empresaBusca.getId() == id) {
				return empresaBusca;
			}
		}
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {

		for (Usuario user : listaUsuario) {
			if (user.ehIgual(login, senha)) {
				return user;
			}
		}
		return null;
	}

}

package application;

import entities.GerenciadorDeLog;
import entities.Usuario;
import services.fileConversion.TxtConverter;
import services.fileFinder.FindFileTxt;
import utils.ClassScanner;

public class Program {

	public static void main(String[] args) {
		
		GerenciadorDeLog gl = new GerenciadorDeLog(new TxtConverter(), new FindFileTxt());
		
		System.out.print("Nome de Usuário: ");
		String nome = ClassScanner.sc.next();
		
		gl.registraLog(new Usuario(nome));
		
		System.out.println("Acessos: " + gl.quantidadeDeAcessosDistintos());

	}

}

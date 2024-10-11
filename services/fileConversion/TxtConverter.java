package services.fileConversion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import entities.Usuario;

public class TxtConverter implements FileConversionService {

	@Override
	public void salvarObjetoEmArquivo(Usuario usuario, File caminhoDoArquivo) {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoDoArquivo, true))) {
			
			bw.write(usuario.getNome() + " " + usuario.getAccessInstant());
			bw.newLine();
			
		} catch (IOException e) {
			System.out.println("Error: Usuário " + usuario + " Não pôde ser inserido no diretório " + caminhoDoArquivo.getParent());
			e.printStackTrace();
		}
		
	}

}

package services.fileConversion;

import java.io.File;

import entities.Usuario;

public interface FileConversionService {
	
	void salvarObjetoEmArquivo(Usuario usuario, File caminhoDoArquivo);
	
	

}

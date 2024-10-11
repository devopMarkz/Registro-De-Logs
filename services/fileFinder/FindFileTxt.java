package services.fileFinder;

import java.io.File;

public class FindFileTxt implements FileFinderService {

	@Override
	public File getFile() {
		createPath();
		return new File("C:\\Users\\marcos.andre\\Desktop\\Suprimentos CPL\\arquivos java\\hashcode e equals\\atividade_set\\src\\RegistroDeLogs\\logs.txt");
	}
	
	private void createPath() {
		new File("C:\\Users\\marcos.andre\\Desktop\\Suprimentos CPL\\arquivos java\\hashcode e equals\\atividade_set\\src\\RegistroDeLogs").mkdir();
	}

}

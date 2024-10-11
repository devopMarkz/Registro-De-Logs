package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import services.fileConversion.FileConversionService;
import services.fileFinder.FileFinderService;

public class GerenciadorDeLog {
	
	private FileConversionService fileConversionService;
	private FileFinderService fileFinderService;
	
	public GerenciadorDeLog(FileConversionService fileConversionService, FileFinderService fileFinderService) {
		this.fileConversionService = fileConversionService;
		this.fileFinderService = fileFinderService;
	}
	
	
	public void registraLog(Usuario usuario) {
		fileConversionService.salvarObjetoEmArquivo(usuario, fileFinderService.getFile());
	}
	
	
	public Integer quantidadeDeAcessosDistintos() {
		Set<Usuario> conjunto = new HashSet<Usuario>(listarAcessos());
		return conjunto.size();
	}
	
	private HashSet<Usuario> listarAcessos(){
		
		Set<Usuario> conjunto = new HashSet<>();
		
		try(Scanner sc = new Scanner(new BufferedReader(new FileReader(fileFinderService.getFile())))) {
			
			while (sc.hasNextLine()) {
				String[] coluna = sc.nextLine().split(" ");
				conjunto.add(new Usuario(coluna[0], Instant.parse(coluna[1])));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		return (HashSet<Usuario>) conjunto;
		
	}

}

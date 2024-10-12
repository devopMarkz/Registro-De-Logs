# Registro de Logs

Este é um sistema de **Registro de Logs** desenvolvido em Java, projetado para registrar eventos em arquivos de log e fornecer funcionalidades de conversão e localização de arquivos no sistema de arquivos. O design do sistema segue o princípio da abstração, onde a classe GerenciadorDeLog opera sobre interfaces, permitindo flexibilidade na implementação dos logs.

## Estrutura do Projeto

src/  
│  
├── application/  
│   └── Program.java  
│  
├── model/  
│   ├── entities/  
│   │   ├── GerenciadorDeLog.java  
│   │   └── Usuario.java  
│   │  
│   ├── services/  
│   │   ├── fileConversion/  
│   │   │   ├── FileConversionService.java  
│   │   │   └── TxtConverter.java  
│   │   └── fileFinder/  
│   │       ├── FileFinderService.java  
│   │       └── FindFileTxt.java  
│   │  
│   └── utils/  
│       └── ClassScanner.java  
│  
└── RegistroDeLogs/  
    └── logs.txt  
 


## Principais Diretórios

- **application**:
  - **Program.java**: Contém o ponto de entrada da aplicação, onde o fluxo principal do programa é executado.

- **model.entities**:
  - **GerenciadorDeLog.java**: Gerencia a criação e registro de logs. Utiliza interfaces para garantir flexibilidade e a possibilidade de troca da implementação de logs sem afetar o restante do sistema.
  - **Usuario.java**: Representa um usuário no sistema, contendo as informações necessárias para identificar e gerenciar os dados do usuário.

- **model.services.fileConversion**:
  - **FileConversionService.java**: Interface ou classe responsável por fornecer os serviços de conversão de arquivos, abstraindo os detalhes de implementação.
  - **TxtConverter.java**: Implementação específica para conversão de arquivos de texto. Realiza operações de leitura e escrita em arquivos `.txt`.

- **model.services.fileFinder**:
  - **FileFinderService.java**: Interface ou classe que define os serviços de busca de arquivos no sistema, proporcionando uma maneira centralizada de procurar arquivos.
  - **FindFileTxt.java**: Implementação que realiza a busca específica de arquivos de texto (`.txt`) no sistema de arquivos, utilizando as regras definidas pelo `FileFinderService`.

- **model.utils**:
  - **ClassScanner.java**: Ferramenta utilitária para chamar funções de escrita no teclado/entrada de dados.

- **RegistroDeLogs**:
  - **logs.txt**: Arquivo de log gerado automaticamente pelo sistema. Armazena os eventos registrados pelo `GerenciadorDeLog.java`.

## Funcionalidades

- **Registro de Logs**: 
  - O sistema registra logs em arquivos `.txt`, utilizando a classe `GerenciadorDeLog.java`.
  - A implementação dos logs pode ser facilmente alterada, pois o `GerenciadorDeLog` interage apenas com interfaces, garantindo flexibilidade.

- **Conversão de Arquivos**: 
  - O sistema oferece funcionalidades para conversão de arquivos, como a conversão de arquivos de texto através da classe `TxtConverter.java`, localizada no pacote `model.services.fileConversion`.

- **Localização de Arquivos**: 
  - O sistema possui um serviço de busca de arquivos no sistema de arquivos, com suporte para localizar arquivos de texto (.txt) utilizando a classe `FindFileTxt.java`, no pacote `model.services.fileFinder`.

- **Scanner de Classes**: 
  - O utilitário `ClassScanner.java`, encontrado no pacote `model.utils`, oferece a capacidade de realizar entrada de dados no sistema múltiplas vezes, sem precisar instanciar um objeto Scanner no programa principal e fechá-lo com `sc.close()`;

## Contato

Caso tenha dúvidas, sugestões ou precise de suporte, entre em contato:

- Nome: Marcos André
- Email: marcosdev2002@gmail.com

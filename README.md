# Bump64

> Ferramenta CLI simples para decodificar textos em base64 utilizando a biblioteca java.util.Base64.

## Pre-requisitos
Este projeto foi construido sob a versão 21.0.11 do [JDK](https://www.oracle.com/java/technologies/downloads/).

## Instalação

Clone este repositório:

```bash
git clone https://github.com/HenrBmp/Bump64.git
cd Bump64
```

Compile o código:
```bash
javac -sourcepath src -d bin src/Main.java
cd bin
jar cfe ../dist/bump64.jar Main .
```

Dentro do diretorio dist, crie um arquivo bump64.bat com o seguinte conteúdo, personalizando-o com o caminho para o diretório em que você clonou o repositório:

```bash
@echo off
java -jar "caminho\para\Bump64\dist\bump64.jar" %1
```

Adicione o caminho para o diretório dist ao seu path:

No **windows**: No menu iniciar, pesquise por "path" → abra "Editar variáveis de ambiente do sistema", clique em "Variáveis de ambiente...", "Path", "Novo" e insira o caminho.

No **Linux**: Edite o arquivo "~/.bashrc" (se você utiliza bash) e adicione a seguinte linha:
```bash
export PATH=$PATH;caminho/para/Bump64/dist
```

## Utilização

Utilize digitando o comando "bump64" no seu terminal. Você pode adicionar seu texto codificado como argumento:
```bash
bump64 <texto codificado aqui>
```
Ou pode apenas executar o comando, e a ferramenta ira solicitar o texto codificado:
```bash
bump64
Insira o texto codificado:
```

## Licença
Este projeto está sobre a licença MIT.

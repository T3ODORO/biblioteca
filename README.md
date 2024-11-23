# 📚 Sistema de Biblioteca Escolar 📖

Este repositório contém uma aplicação desenvolvida em Java com Spring Boot para gerenciar informações de livros e usuários de uma biblioteca escolar. O projeto segue o padrão REST e inclui operações CRUD (Create, Read, Update, Delete) para facilitar a administração de dados. Além disso, o sistema implementa boas práticas de design de software e validação de dados.

<p align="center">
    <b>Projeto desenvolvido para estudo de APIs RESTful e práticas em Java Spring.</b>
</p>

---

## ✨ Funcionalidades

### 📘 Gerenciamento de Livros
- Cadastro de livros com informações detalhadas (título, ISBN, disponibilidade, editora e autores).
- Atualização de dados, permitindo editar detalhes dos livros cadastrados.
- Exclusão lógica, desativando o livro sem removê-lo do banco de dados.
- Listagem de livros cadastrados com filtros relevantes.

### 👤 Gerenciamento de Usuários
- Cadastro de usuários com validação de dados.
- Atualização de informações dos usuários, incluindo nome, senha e tipo (funcionário ou cliente).
- Exclusão lógica, desativando o usuário sem removê-lo do banco de dados.

### 🔒 Validação e Segurança
- Validação automática de entradas usando anotações do Bean Validation.
- Operações transacionais para garantir a consistência de dados.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3** (Spring Data JPA, Spring Web, Validation)
- **Hibernate** para persistência de dados
- **PostgreSql** como banco de dados relacional
- **Lombok** para redução de boilerplate no código

---

## 📋 Pré-requisitos

Certifique-se de ter as ferramentas necessárias instaladas antes de executar a aplicação:

- **Java 17**: [Instalar Java](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- **Maven**: [Instalar Maven](https://maven.apache.org/install.html)
- **PostgreSql**: Configure um banco de dados local com as credenciais:
  - URL: `jdbc:postgresql://localhost:5432/[nome-banco]`
  - Usuário: `[seu-usuario]`
  - Senha: `[sua-senha]`

---

## 🚀 Como Executar

### 1️⃣ Configure o Banco de Dados
- Certifique-se de que o PostgreSql está rodando.
- Crie o banco de dados com o nome `biblioteca`.
- Atualize as credenciais no arquivo `application.properties` localizado em `src/main/resources`.

### 2️⃣ Execute a Aplicação
- No terminal, execute:
  ```bash
  mvn spring-boot:run
  
## 3️⃣ Acesse o Sistema

Após executar a aplicação, o backend estará disponível em: 

**`http://localhost:8080`**

---

## 🧪 Endpoints da API

### 📘 Livros
- **POST** `/livros`: Cadastrar um novo livro.
- **GET** `/livros`: Listar todos os livros.
- **GET** `/livros/{id}`: Obter detalhes de um livro específico.
- **PUT** `/livros`: Atualizar informações de um livro.
- **DELETE** `/livros/{id}`: Desativar um livro.

### 👤 Usuários
- **POST** `/usuarios`: Cadastrar um novo usuário.
- **GET** `/usuarios/{id}`: Obter informações de um usuário específico.
- **PUT** `/usuarios`: Atualizar informações de um usuário.
- **DELETE** `/usuarios/{id}`: Desativar um usuário.

---

## 📄 Licença

Este projeto foi desenvolvido apenas para fins educacionais e não possui uma licença específica.

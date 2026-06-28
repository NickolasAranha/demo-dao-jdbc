# Projeto JDBC com Padrão DAO

Este repositório contém o código-fonte de um projeto prático desenvolvido como parte de um módulo bônus de **Acesso a Banco de Dados com JDBC**, do curso de Java ministrado pelo professor **Nelio Alves**.

## 📌 Sobre o Projeto

O objetivo principal deste projeto é demonstrar, na prática, como realizar a conexão e manipulação de um banco de dados relacional utilizando Java puro (JDBC), sem o auxílio de frameworks ORM (como Hibernate ou JPA). 

A aplicação simula um sistema simples com duas entidades relacionais: **Departamento (Department)** e **Vendedor (Seller)**. A regra de negócio estabelece que todo vendedor pertence a um departamento, permitindo trabalhar com chaves estrangeiras e junções (JOINs) no banco de dados.

## Conhecimentos e Tecnologias Aplicadas

* **Java:** Lógica de programação, Orientação a Objetos, Tratamento de Exceções e coleções (`List`).
* **JDBC (Java Database Connectivity):** Uso das classes `Connection`, `Statement`, `PreparedStatement` e `ResultSet` para interagir diretamente com o banco.
* **MySQL:** Criação e estruturação do banco de dados relacional.
* **Padrões de Projeto (Design Patterns):**
  * **DAO (Data Access Object):** Isolamento da lógica de acesso a dados em classes específicas (`DepartmentDao` e `SellerDao`), separando-a da regra de negócio.
  * **Factory Pattern:** Uso de uma classe `DaoFactory` para instanciar as implementações dos DAOs sem expor os detalhes de sua criação.

## Funcionalidades Implementadas (CRUD)

Foram implementadas as operações básicas de CRUD (Create, Read, Update, Delete) para as entidades:

- **Inserção:** Adicionar novos vendedores/departamentos no banco de dados.
- **Busca por ID:** Recuperar um registro específico através do seu identificador.
- **Busca por Departamento:** Listar todos os vendedores pertencentes a um departamento específico.
- **Busca de todos (FindAll):** Retornar todos os registros da tabela.
- **Atualização:** Modificar os dados de um registro já existente.
- **Deleção:** Remover um registro do banco a partir de seu ID.

## Estrutura do Projeto

A arquitetura do projeto foi dividida de forma limpa e organizada:

- `application`: Contém as classes principais (`Program`) para testar as operações do DAO.
- `db`: Classes utilitárias para abrir/fechar conexões com o banco e tratar exceções personalizadas de integridade relacional.
- `model.entities`: Classes de domínio (`Department`, `Seller`).
- `model.dao`: Interfaces DAO que definem os contratos de acesso a dados.
- `model.dao.impl`: Implementações concretas das interfaces DAO voltadas para JDBC.

## 🎓 Créditos

Este projeto foi desenvolvido acompanhando as aulas do professor **Nelio Alves** (DevSuperior). Ele serviu para consolidar fortemente os conceitos de arquitetura em camadas e manipulação manual de banco de dados em Java.

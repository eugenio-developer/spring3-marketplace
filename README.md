# Marketplace API

## Descrição
Este projeto é uma API para um marketplace, desenvolvida utilizando Java Spring para o back-end. A API oferece funcionalidades como cadastro de produtos, categorias, pedidos, pagamentos e usuários.

## Tecnologias Utilizadas
- **Java**
- **SpringBoot**
- **JPA**
- **Hibernate**
- **Postman**
- **H2** (banco de dados em memória)
- **Maven**

## Boas Práticas Utilizadas
- **Modelo em Camadas**: O projeto segue uma arquitetura em camadas, garantindo uma separação clara de responsabilidades.
- **Entities**: Representação das tabelas do banco de dados como classes Java.
- **Repository**: Interfaces que lidam com a persistência dos dados, utilizando JPA e Hibernate.
- **Service**: Contém a lógica de negócios e serve como intermediário entre o repositório e os recursos.
- **Resource**: Controladores RESTful que expõem os endpoints da API.
- **Tratamento de Exceções Personalizadas**: Melhorias na robustez e clareza dos erros da aplicação.
- **Padrão SOLID**: Garantia de um código mais coeso, flexível e fácil de manter.

## Utilização
Para utilizar a aplicação, siga os passos abaixo:

1. Clone o repositório para a sua máquina local:
    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd seu-repositorio
    ```
3. Compile e construa o projeto usando Maven:
    ```bash
    mvn clean install
    ```
4. Execute a aplicação:
    ```bash
    mvn spring-boot:run
    ```
5. A aplicação estará disponível em `http://localhost:8080`.

## Modelo de Domínio
O modelo de domínio da aplicação é composto pelas seguintes entidades:

- **Product**: Representa os produtos disponíveis no marketplace.
    - Atributos: `id`, `name`, `description`, `price`, `imgUrl`
- **Category**: Representa as categorias dos produtos.
    - Atributos: `id`, `name`
- **Order**: Representa os pedidos realizados no marketplace.
    - Atributos: `id`, `moment`, `orderStatus`
- **OrderItem**: Representa os itens dos pedidos.
    - Atributos: `id`, `quantity`, `price`
- **Payment**: Representa os pagamentos dos pedidos.
    - Atributos: `id`, `paymentMoment`
- **User**: Representa os usuários do marketplace.
    - Atributos: `id`, `name`, `email`
- **OrderStatus**: Enumeração que define os possíveis status dos pedidos.
    - Valores: `WAITING_PAYMENT`, `PAID`, `SHIPPED`, `DELIVERED`, `CANCELED`

## Considerações Finais
Este projeto foi desenvolvido com foco em seguir as melhores práticas de desenvolvimento, garantindo um código limpo, organizado e fácil de manter. A integração de tecnologias como SpringBoot, JPA e Hibernate, além do uso de princípios SOLID e tratamento de exceções personalizadas, contribui para a robustez e escalabilidade da aplicação.


![image](https://github.com/user-attachments/assets/8431f9b6-0e82-4456-ba54-006254ef9102)
![image](https://github.com/user-attachments/assets/c2e293e1-f541-4789-bb16-7b991a6e2dc6)



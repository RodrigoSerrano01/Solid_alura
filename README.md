# Solid_alura
Projeto Solid da alura


**Curso de SOLID - alura**

 Conceitos aprendidos
- Single Responsibility Principle;
- Open Closed Principle;
- Liskov Substitution Principle;
- Interface segregation Principle;
- Dependency inversion principle.



**1.Aula 1 - Resumo de Programação Orientada a Objeto**
- ***Coesão***
  - Uma classe coesa faz bem uma única coisa;
As classes coesas não devem ter várias responsabilidades.
- ***Encapsulamento***
    - Getters e Setters não são formas eficientes de aplicar encapsulamento;
    - É interessante fornecer acesso apenas ao que é necessário em nossas classes;
    - O encapsulamento torna o uso das nossas classes mais fácil e intuitivo.
- ***Acoplamento***
    - Acoplamento é a dependência entre classes;
    - acoplamento nem sempre é ruim, e que é impossível criar um sistema sem nenhum acoplamento;
    - Devemos controlar o nível de acoplamento na nossa aplicação.

**2.Aula 2 - Melhorando a coesão.**
- Classes/Métodos/Funções/módulos devem ter uma única responsabilidade bem definida;
- Segundo o ***Princípio de Responsabilidade (SRP)***, uma classe deve ter um e apenas um motivo para ser alterada;
- Como realizar uma refatoração no nosso sistema, para aplicar o SRP;
- Como extrair uma classe.

**3.Aula 3- Reduzindo o acoplamento.**
- Cada classe deve conhecer e ser responsável por suas próprias regras de negócio;
- ***O princípio Aberto/Fechado (OCP)*** diz que um sistema deve ser aberto para extensões, mas fechado para modificações;
- Significa que devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar muitas classes já existentes;
- Uma classe que tende a crescer “Para sempre” é uma forte candidata a sofrer alguma espécie de refatoração.

**4.Aula 4- Herança indesejada.**
- Embora a herança favoreçam o reaproveitamento de código, ela pode trazer efeitos colaterais quando não utilizada da maneira correta;
- ***O princípio de substituição de Liskov (LSP)*** diz que devemos poder substituir as classes base por suas classes derivadas em qualquer lugar, sem problemas.

**5.Aula 5 - Trabalhando com abstrações.**
- É mais interessante e mais seguro para o nosso código depender de interfaces(classes abstratas, assinaturas de métodos e interfaces em si) do que das implementações de uma classe;
- As interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento.
- ***O Princípio de inversão de dependência(DIP)*** diz que implementações devem depender de abstrações e abstrações não devem depender de implementações;
- ***O Princípio de segregação de Interface(ISP)*** diz que uma classe não deve ser obrigada a ter um método, que ela não precisa.

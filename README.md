# Sistemas_Operacionais_I

Conteúdo das aulas e exercícios propostos na matéria, cursada no 3º semestre do curso de análise e desenvolvimento de sistemas.

## Configuração do projeto

Todas as aulas e exercícios foram feitos utilizando as seguintes ferramentas:
* [Eclipse-JEE](https://www.eclipse.org/downloads/packages/release/2020-12/r/eclipse-ide-enterprise-java-developers) - versão 2018-12
* [WindowBuilder](https://www.eclipse.org/windowbuilder/)

## Informações gerais

### Aula processos 
Prática feita em aula no Windows contendo exemplos de como abrir um processo, fazer a leitura de um processo no console e encerrar um processo no sistema

### Aula semáforo 
Práticas feitas em aula sobre o uso de semáforos para prevenção de deadlocks e tratamento de Threads
 
- O arquivo [ThreadProcessador](AulaSemaforo/src/view/ThreadProcessador.java) contém um exemplo simples do funcionamento de 4 Threads rodando simultaneamente, 
onde elas iniciam um processamento que varia de 0 a 10 segundos em região não crítica, depois tentam pegar o semáforo de 1 permissão para entrar na zona crítica
 e processar mais 0 a 10 segundos e depois sair da zona crítica e liberar o semáforo.
 
 - O arquivo [Estacionamento](AulaSemaforo/src/view/Estacionamento.java) contém um exemplo onde 10 carros (Threads) percorrem 1000mts até chegarem a um estacionamento
 com 3 vagas (semáforo). Chegando lá eles tentam pegar uma vaga, ficam estacionados de 0,5 a 1 segundo e então saem do estacionamento, liberando o semáforo.
 
 ### Aula Thread
 Práticas feitas em aula sobre o uso de Threads em Java
 
 - O arquivo [MainBuffer](AulaThread/src/view/MainBuffer.java) mostra duas Threads concatenando simultaneamente uma String de 32768 caracteres, sendo que uma irá concatenar
a String normalmente `texto += "a"`, e a outra utilizará um StringBuffer para concatenar `buffer.append("a")`. Após rodar o sistema exibe em console o tempo que cada Thread usou
para rodar o processo.

- O arquivo [MainCalc](AulaThread/src/view/MainCalc.java) pega dois números inteiros (10 e 2 no exemplo) e roda 4 Threads, onde cada uma efetua uma operação matemática diferente
entre os dois números (soma, subtração, multiplicação e divisão). No exemplo, o professor primeiramente mostrou as Threads rodando simultaneamente sem nenhuma restrição, onde cada
operação era calculada em ordem aleatória, e depois explicou como utilizar o método `Thread.sleep()` para ordenar o calculo, que é a forma como o código final está rodando.

### ExerciciosProcessos
Exercícios propostos pelo professor para aprender a mexer com processos

- [Exercício 1](ExerciciosProcessos/src/ex1/view/MainEx1.java) - Criar em Eclipse, um novo projeto com uma classe 
Controller no package controller e uma classe Main no
package view. A classe Controller deve ter 2 métodos.
O primeiro, chamado ip, que recebe o nome do Sistema Operacional como
parâmetro e, de acordo com o S.O., faz a chamada de configuração de IP e
filtra a saída do processo, retornando um String com o nome do Adaptador
Ethernet e o IPv4 apenas (Não importa o número de adaptadores ethernet,
devem aparecer todos). Os adaptadores que não tiverem IPv4 não devem
ser mostrados.
O segundo, chamado ping, que recebe o nome do Sistema Operacional
como parâmetro e, de acordo com o S.O., faz a chamada de ping com 10
iterações, filtra a saída, pegando apenas o tempo e dá a saída, em ms, do
tempo médio do ping.
A Classe Main deve ter a possibilidade de o usuário escolher a ação que
quer fazer e, dependendo da escolha, instanciar a Classe
Controller e chamar o método escolhido. A opção de finalizar a
aplicação também deve estar disponível. 

- [Exercício 2](ExerciciosProcessos/src/ex2/view/MainEx2.java) - Fazer, em java, uma aplicação que liste os processos ativos, permita ao
usuário entrar com o nome ou o PID do processo e o mate.
A aplicação deverá funcionar, minimamente em Windows e Linux (Alunos
com Mac podem fazer para os 3 SO).
É notório que cada SO tem comandos diferentes para as ações
supracitadas. Pesquisar os comandos para cada SO.
A aplicação deverá ter, no package view, uma classe que tenha um método
main que dê ao usuário a possibilidade de ver os processos ativos ou matar
os processos (Por Nome ou PID).
No package controller, deverá ter:
  1) Uma classe que tenha um método que identifique o SO;
  2) Um método que, recebendo o SO, no qual está rodando, como
parâmetro de entrada, selecione o comando para listar os processos
ativos;
  3) Um método que, recebendo o SO, no qual está rodando, e o PID do
processo, como parâmetros de entrada, selecione o comando para
matar o processo e o finalize;
  4) Um método que, recebendo o SO, no qual está rodando, e o Nome
do processo, como parâmetros de entrada, selecione o comando
para matar o processo e o finalize;

- [Exercício 3](ExerciciosProcessos/src/ex3/view/MainEx3.java) - Utilizando o Framework Window Builder, criar, em Eclipse, um projeto Java
que simula o Executar (Run) do Windows.
No package view, deve ser criado, com auxílio do framework, uma tela com um JTextField e 3 botões (OK, Cancelar e
Procurar).
No package controller, devemos ter :
  1) Uma classe que receba o JTextField pelo construtor, implementa um
ActionListener para executar a ação do botão Procurar. No método
ActionPerformed, deve ter uma busca de arquivos executáveis
Windows, via JFileChooser, e seleciona o arquivo a ser executado e
escreve seu caminho completo no JTextField.
  2) Uma classe que receba o JTextField e o próprio JFrame da tela pelo
construtor, implementa um ActionListener para executar a ação do
botão OK. No método ActionPerformed, deve tentar executar o que
está escrito no JTextField (O usuário pode digitar o caminho por conta
própria, ao invés de procurar). Caso o arquivo seja inválido, dar uma
mensagem de erro. Uma vez executado, sem erro, a tela deverá ser
finalizado pelo método dispose().
  3) Uma classe que receba o próprio JFrame da tela pelo construtor,
implementa um ActionListener para executar a ação do botão
Cancelar. O método actionPerformed deve proceder um dispose() da
tela.

### SO_ArquivosDiretorio
 Práticas feitas em aula sobre manipulação de arquivos em Java, usando métodos para descobrir, por exemplo:
 - Se um determinado endereço contém um diretório ou arquivo;
 - Ler um diretório, exibindo no console todos os seus arquivos e diretórios;
 - Ler um arquivo, exibindo no console seu conteúdo;
 - Criar ou concatenar um arquivo existente com texto digitado em um JOptionPane;
 - Abrir um arquivo em sistema.
 
 ### Exercícios de Semáforos
Exercícios propostos pelo professor para aprender a mexer com semáforos

- [Exercício 1](SO_Semaphore1/src/view/CruzaPorta.java) - 4 pessoas caminham, cada uma em um
corredor diferente. Os 4 corredores terminam
em uma única porta. Apenas 1 pessoa pode
cruzar a porta, por vez. Considere que cada
corredor tem 200m. e cada pessoa anda de 4 a
6 m/s. Cada pessoa leva de 1 a 2 segundos
para abrir e cruzar a porta. Faça uma
aplicação em java que simule essa situação.

- [Exercício 2](SO_Semaphore2/src/view/Cruzamento.java) - Fazer uma aplicação que gerencie a figura
abaixo:

![Imagem exibindo um cruzamento com 1 carro vindo de cada direção](https://github.com/juliobarcellos/Sistemas_Operacionais_I/blob/master/SO_Semaphore2/cruzamento.png)

Para tal, usar uma variável sentido,
que será alterado pela Thread que
controla cada carro com a
movimentação do carro. Quando a
Thread tiver a possibilidade de ser
executada, ela deve imprimir em
console o sentido que o carro está
passando. Só pode passar um carro
por vez no cruzamento.

- [Exercício 3](SO_Semaphore3/src/view/Formula1.java) - Você foi contratado para automatizar um treino de Fórmula 1.
As regras estabelecidas pela direção da provas são simples:
  * No máximo 5 carros das 7 escuderias (14 carros no total)
presentes podem entrar na pista simultaneamente, mas apenas
um carro de cada equipe. O segundo carro deve ficar à espera,
caso um companheiro de equipe já esteja na pista.
  * Cada piloto deve dar 3 voltas na pista. 
  * O tempo de cada volta deverá ser exibido e a volta mais rápida de cada piloto deve ser
armazenada para, ao final, exibir o grid de largada, ordenado do menor tempo para o maior.

- [Exercício 4](SO_Semaphore4/src/view/MainBanco.java) - Um banco deve controlar Saques e Depósitos.
  - O sistema pode permitir um Saque e um Depósito
Simultâneos, mas nunca 2 Saques ou 2 Depósitos
Simultâneos.
  - Para calcular a transação (Saque ou Depósito), o método deve
receber o código da conta, o saldo da conta e o valor a ser
transacionado.
  - Deve-se montar um sistema que deve considerar que 20
transações simultâneas serão enviadas ao sistema
(aleatoriamente essas transações podem ser qualquer uma das
opções) e tratar todas as transações, de acordo com as regras
acima.

- [Exercício 5](SO_Semaphore5/src/view/Servidor.java) - 

- [Exercício 6](SO_Semaphore6/src/view/Overcooked.java) - 

### Exercícios de Threads
Exercícios propostos pelo professor para aprender a mexer com Threads

- [Exercício 1](SO_Threads_1/src/view/Main_Ex1.java) - No método Main preencher um vetor de números inteiros com 1000 valores aleatórios entre 1 e 100.
Após isso, rodar duas Threads simultâneas que percorram o vetor, uma utilizando um For comum `for (int i = 0; i < v.length; i++)` e a outra usando um ForEach `for (int i : v)`
Calcular e exibir o tempo que cada Thread levou para percorrer o vetor.

- [Exercício 2](SO_Threads_2/src/view/Main_Ex2.java) - Fazer uma aplicação que rode 5 Threads que cada uma delas imprima no console o seu número.

- [Exercício 3](SO_Threads_3/src/view/Main_Ex3.java) - Fazer uma aplicação que insira números aleatórios em uma matriz 3 x 5 e tenha 3 Threads, 
onde cada Thread calcula a soma dos valores de cada linha, imprimindo a identificação da linha e o resultado da soma.

- [Exercício 4](SO_Threads_4/src/view/Main_Ex4.java) - Fazer uma aplicação de uma corrida de sapos, com 5 Threads, cada Thread controlando 1 sapo. 
  - Deve haver um tamanho máximo para cada pulo do sapo (em metros) e a distância máxima para que os sapos percorram. 
  - A cada salto, um sapo pode dar uma salto de 0 até o tamanho máximo do salto (valor aleatório).
  - Após dar um salto, a Thread, para cada sapo, deve mostrar no console, qual foi o tamanho do salto e quanto o sapo percorreu. 
  - Assim que o sapo percorrer a distância máxima, a Thread deve apresentar que o sapo chegou e qual sua colocação.

- [Exercício 5](SO_Threads_5/src/view/Main_Ex5.java) - Utilizando o Java SWING, criar uma tela, semelhante à tela abaixo, para criar uma corrida de carros, tipo drag race.
  ![Tela de programa contendo duas caixas de texto uma embaixo da outra, uma contendo o texto "Carro1" e a outra "Carro2". No centro temos um campo exibindo o vencedor e o 
  perdedor embaixo, e por fim, um botão de "correr"](https://github.com/juliobarcellos/Sistemas_Operacionais_I/blob/master/SO_Threads_5/Exemplo.png)
  - A aplicação deve ter a distância que os carros devem correr e a velocidade máxima dos carros. 
  - Os carros (Jlabel) devem, a cada 100 mS, dar uma arrancada de velocidade que pode estar entre 0 e a velocidade máxima (definida aleatoriamente).
  - Assim que o primeiro carro chegar, o JTextField Vencedor deve receber o nome deste e o JTextField Perdedor receberá o nome do outro carro.
  - Assim que a corrida se inicia, o botão Correr deve sumir

- [Exercício 6](SO_Threads_6/src/view/Main_Ex6.java) - Fazer, com o Java SWING, uma aplicação de
caça-níquel, conforme figura abaixo.
![Tela de programa contendo 3 caixas de texto com números, que funcionará como caça níquel, e um botão "jogar"](https://github.com/juliobarcellos/Sistemas_Operacionais_I/blob/master/SO_Threads_6/Exemplo.png)

O caça níquel tem 3 JTextFields, independentes, que giram, aleatoriamente, de 1 a 150 vezes e apresentará um número de 1 a 7. 
Quando iniciado, o botão Jogar deve desaparecer.

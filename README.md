## Padr-o-de-Desenvolvimento-Visitor

# Visitor 

 A sua ideia é separar as operações que serão executadas em determinada estrutura de sua representação. 
 Assim, incluir ou remover operações não terá nenhum efeito sobre a interface da estrutura, permitindo que o resto do 
 sistema funcione sem depender de operações específicas.
  O visitor tambem permite definir uma nova operação sem mudar as classes dos elementos sobre os quais opera.
  
  
##  Estrutura padrão de projeto Visitor
  
![teste](http://i66.tinypic.com/1zd88ko.png)

  A classe client que é a classe Sistema possui uma Element que contem um método accept, neste caso o elementy que é
  uma classe base que é herdada pela concretElement do sistema, ou seja os elementos que estarei utilizando na aplicação. 
  O método accept recebe como parametro o visitor.
  Visitor nada mais é que uma interface que realizara o concretVisitor, já a interface contem apenas um método visit que 
  recebe como parametro o concretElemente.
  
  
##  Funcionalidade

  Basicamente o funcionamento ocorre da seguinte maneira:
   O client diz que nosso concretElement aceita um visitor, desta forma quando é chamado um método accept ele chama do
   visitor a sua função visit que pode alterar o estado do elemento concreto emplementando as funcionalidades ou até 
  mesmo alterar os seus atributos.
  
## Estrutura Codificada

![p1](http://i67.tinypic.com/30m7khe.jpg)

Foi criado uma classe Elemento que possui apenas um método accept que recebe como parametro a interface Visitor, desta forma
é garantido que todos os objetos que herdaram o elemento terão o método accept.
  





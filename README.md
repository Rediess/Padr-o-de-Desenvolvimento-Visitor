## Padr-o-de-Desenvolvimento-Visitor

# Visitor 

 A sua ideia é separar as operações que serão executadas em determinada estrutura de sua representação. 
 Assim, incluir ou remover operações não terá nenhum efeito sobre a interface da estrutura, permitindo que o resto do 
 sistema funcione sem depender de operações específicas.
  O visitor tambem permite definir uma nova operação sem mudar as classes dos elementos sobre os quais opera.
  
  
##  Estrutura padrão de projeto Visitor
  
![teste](http://i66.tinypic.com/1zd88ko.png)

  A classe client que é a classe Sistema possui uma Element que contem um método accept, neste caso o elementy que é
  uma classe base que é herdada pela concretElement do sistema, ou seja os elementos que utilizei na aplicação. 
  O método accept recebe como parametro o visitor.
  O Visitor nada mais é que uma interface que realizara o concretVisitor, já a interface contem apenas um método visit que 
  recebe como parametro o concretElemente.
  
  
##  Funcionalidade

  Basicamente o funcionamento ocorre da seguinte maneira:
   O client diz que nosso concretElement aceita um visitor, desta forma quando é chamado um método accept ele chama do
   visitor a sua função visit que pode alterar o estado do elemento concreto emplementando as funcionalidades ou até 
  mesmo alterar os seus atributos.
  
## Estrutura Codificada


 Foi criado uma classe Elemento que possui apenas um método accept que recebe como parametro a interface Visitor, desta forma
é garantido que todos os objetos que herdaram o elemento terão o método accept.
![p1](http://i67.tinypic.com/30m7khe.jpg)
-
-
-
 A interface visitor possui apenas um método visit que recebe como parametro um elementConcreto. 
![p2](http://i64.tinypic.com/2nrehih.jpg)
-
-
-
 O elementoConcreto que extende o Elemento possui um método accept, quando ele aceita o visitor ele chamao método visit do Visitor e passa como parametro ele mesmo.
![p3](http://i66.tinypic.com/2d0avc9.jpg)
-
-
-
  Desta forma no VisitorConcreto podemos manipular as informações do elementoConcreto. Neste exemplo está sendo mostrado a mensagem "Estou Visitando" e o nome correspondente a o elementoConcreto.
![p4](http://i64.tinypic.com/331nk1g.jpg)
-
-
-

 Na classe Sistema foi instanciado o ElementoConcreto e também o VisitorConcreto, já o elementoConcreto aceitara o visitorConcreto. 
![p5](http://i63.tinypic.com/qozic6.jpg)
-
-
-

 Rodando o programa o resultado sera "Estou visitando: comvisitor.estrutura.ElementoConcreto" que nada mais é que o pacote onde foi colocado o elemento concreto, e desta forma é possivel verificar que quando o elemento concreto aceita a visita do Visitor, o visitor
pode manipular todos as informações pertencentes a o elementoConcreto.
![p6](http://i65.tinypic.com/15yw4qx.jpg)



  





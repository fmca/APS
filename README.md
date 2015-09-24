Análise e Projeto de Sistemas
===

### Padrões de Projeto ###

Para todo padrão visto em sala existe um problema, uma possível solução (usando o padrão de projeto em questão) ilustrada em diagrama e um exemplo em código que pode ser acessado em <code>patterns/src/main/java/</code>.

## Adapter ##

##### Exemplo ######
> Como adaptar a interface da API externa do Facebook (com.facebook.api.FacebookService [fictícia]) para permitir a comunicação com a interface esperada pela sua aplicação?

##### Solução ######

![](https://github.com/fmca/APS/blob/master/patterns/src/main/resources/diagrams/adapter/Adapter.png?raw=true)


## Bridge ##

##### Exemplo ######
> Como desacoplar a abstração de uma Imagem da sua implementação para que possam variar de forma independente?

##### Solução ######

![](https://github.com/fmca/APS/blob/master/patterns/src/main/resources/diagrams/bridge/Bridge.png?raw=true)


## Composite ##

##### Exemplo ######
> Um sistema de gerenciamente de eventos recebe inscrições de estudantes e grupo de estudantes. Grupos de estudantes podem ser compostos por outros grupos de estudantes. (Ex: CIn contém citi, pet etc.). O sistema ainda deve estar preparado a enviar avisos aos inscritos. Como modelar as entidades para que possamos tratar grupos ou estudantes como um único objeto (uniformemente)?

##### Solução ######

![](https://github.com/fmca/APS/blob/master/patterns/src/main/resources/diagrams/composite/Composite.png?raw=true)

## Factory Method ##

##### Exemplo ######
> Companhias aéreas têm o mesmo procedimento do vôo com exceção do tipo de comida que é preparada. Na modelagem, como permitir que cada companhia instancie o seu próprio tipo de Comida?

##### Solução ######

![](https://github.com/fmca/APS/blob/master/patterns/src/main/resources/diagrams/factory_method/Factory Method.png?raw=true)

## Abstract Factory ##

##### Exemplo ######
> Um sistema bancário permite persistir dados tanto em banco de dados relacional quanto em XML. Existem repositórios específicos para cada tecnologia tanto para Cliente quanto para Conta. Como criar a família de repositórios de uma mesma tecnologia sem especificar as classes concretas?

##### Solução ######

![](https://github.com/fmca/APS/blob/master/patterns/src/main/resources/diagrams/abstract_factory/Abstract Factory.png?raw=true)

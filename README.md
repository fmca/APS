# Análise e Projeto de Sistemas

Este repositório contém artefatos complementares para os laboratórios da [disciplina Análise e Projeto de Sistemas do CIn-UFPE](www.cin.ufpe.br/~if718)

## Padrões de Projeto GoF

Para todo padrão visto na disciplina foi descrito abaixo um problema, uma possível solução (usando o padrão de projeto em questão) ilustrada em diagrama e um exemplo em código que pode ser acessado em <code>patterns/src/main/java/</code>.


### Adapter

> Como adaptar a interface da API externa do Facebook ```com.facebook.api.FacebookService``` (fictícia) para permitir a comunicação com a interface esperada pela sua aplicação?

 ```mermaid
 classDiagram
    class ISocialNetwork {
        <<interface>>
        +post()
    }
    class FacebookAdapter {
        -FacebookService fb
        +post(): void        
    }
    class FacebookService {
        +postOnTimeline()
    }
    link ISocialNetwork "patterns/src/main/java/adapter"
    link FacebookAdapter "patterns/src/main/java/adapter"
    link FacebookService "patterns/src/main/java/adapter"
    link YourApplication "patterns/src/main/java/lib/com/facebook/api"
    
    ISocialNetwork <-- YourApplication
    FacebookAdapter ..|> ISocialNetwork
    FacebookAdapter --> "fb.postOnTimeline(new Date())" FacebookService 
 ```


### Bridge

> Como desacoplar a abstração de uma Imagem da sua implementação para que possam variar de forma independente?

```mermaid
classDiagram
class Image {
    -ImageImpl imgImpl
    +save()
    +show()
}

class ImageImpl {
    <<interface>>
    +compress(String path)
    +load(String path)
}

class Picture {
    +save()
    +show()
}

class JPEGImpl {
    +compress(String path)
    +load(String path)
}

class PNGImpl {
    +compress(String path)
    +load(String path)
}

Picture <.. Image
Image --> ImageImpl
JPEGImpl --|> ImageImpl
PNGImpl --|> ImageImpl

link Picture "patterns/src/main/java/bridge"
link Image "patterns/src/main/java/bridge"
link ImageImpl "patterns/src/main/java/bridge"
link JPEGImpl "patterns/src/main/java/bridge"
link PNGImpl "patterns/src/main/java/bridge"
```


### Composite

> Um sistema de gerenciamente de eventos recebe inscrições de estudantes e grupo de estudantes. Grupos de estudantes podem ser compostos por outros grupos de estudantes. (Ex: CIn contém citi, pet etc.). O sistema ainda deve estar preparado a enviar avisos aos inscritos. Como modelar as entidades para que possamos tratar grupos ou estudantes como um único objeto (uniformemente)?

```mermaid
classDiagram
    class Subscriber {
        +warn()
    }

    class Student {
        +warn()
    }

    class Group {
        +warn()
    }

    Student --|> Subscriber
    Group --|> Subscriber
    Group o-- Subscriber: has multiple
```

### Factory Method

> Companhias aéreas têm o mesmo procedimento do vôo com exceção do tipo de comida que é preparada. Na modelagem, como permitir que cada companhia instancie o seu próprio tipo de Comida?


```mermaid
classDiagram
    class Airline {
        +makeFood() Food
    }

    class Food {
        <<interface>>
    }

    class TAP {
        +makeFood() Food
    }

    class TAM {
        +makeFood() Food
    }

    Airline ..> Food
    TAP ..> EatableFood
    TAM ..> CheapFood
    EatableFood ..|> Food
    CheapFood ..|> Food
    TAP --|> Airline
    TAM --|> Airline

    link Airline "patterns/src/main/java/factory_method"
    link TAP "patterns/src/main/java/factory_method"
    link TAM "patterns/src/main/java/factory_method"
    link EatableFood "patterns/src/main/java/factory_method"
    link CheapFood "patterns/src/main/java/factory_method"
    link Food "patterns/src/main/java/factory_method"
```

### Abstract Factory

> Um sistema bancário permite persistir dados tanto em banco de dados relacional quanto em XML. Existem repositórios específicos para cada tecnologia tanto para Cliente quanto para Conta. Como criar a família de repositórios de uma mesma tecnologia sem especificar as classes concretas?


```mermaid
classDiagram
    class FactoryRepository {
        <<interface>>
        +createRepAccount() RepositoryAccount
        +createRepClient() RepositoryClient
    }
    class FactoryRepositoryBDR {
        +createRepAccount() RepositoryAccount
        +createRepClient() RepositoryClient
    }
    class FactoryRepositoryXML {
        +createRepAccount() RepositoryAccount
        +createRepClient() RepositoryClient
    }
    class RepositoryAccount {
        <<interface>>
    }

    class RepositoryClient {
        <<interface>>
    }

    FactoryRepository <|.. FactoryRepositoryBDR
    FactoryRepository <|.. FactoryRepositoryXML
    FactoryRepositoryBDR ..> RepositoryAccountBDR
    FactoryRepositoryBDR ..> RepositoryClientBDR
    FactoryRepositoryXML ..> RepositoryAccountXML
    FactoryRepositoryXML ..> RepositoryClientXML
    RepositoryAccountXML ..|> RepositoryAccount
    RepositoryAccountBDR ..|> RepositoryAccount
    RepositoryClientXML ..|> RepositoryClient
    RepositoryClientBDR ..|> RepositoryClient
    


```

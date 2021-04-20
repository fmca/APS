# Análise e Projeto de Sistemas

[![GitHub Super-Linter](https://github.com/fmca/APS/workflows/Lint%20Code%20Base/badge.img)](https://github.com/marketplace/actions/super-linter)

Este repositório contém artefatos complementares para os laboratórios da [disciplina Análise e Projeto de Sistemas do CIn-UFPE](www.cin.ufpe.br/~if718)

## Padrões de Projeto GoF

Para todo padrão visto na disciplina foi descrito abaixo um problema, uma possível solução (usando o padrão de projeto em questão) ilustrada em diagrama e um exemplo em código que pode ser acessado em <code>patterns/src/main/java/</code>.


### Adapter

> Como adaptar a interface da API externa do Facebook ```com.facebook.api.FacebookService``` (fictícia) para permitir a comunicação com a interface esperada pela sua aplicação?


[![Adapter Diagram](https://mermaid.ink/img/eyJjb2RlIjoiY2xhc3NEaWFncmFtXG4gICAgICAgIGNsYXNzIElTb2NpYWxOZXR3b3JrIHtcbiAgICAgICAgICAgIDw8aW50ZXJmYWNlPj5cbiAgICAgICAgICAgICtwb3N0KClcbiAgICAgICAgfVxuICAgICAgICBjbGFzcyBGYWNlYm9va0FkYXB0ZXIge1xuICAgICAgICAgICAgLUZhY2Vib29rU2VydmljZSBmYlxuICAgICAgICAgICAgK3Bvc3QoKTogdm9pZCAgICAgICAgXG4gICAgICAgIH1cbiAgICAgICAgY2xhc3MgRmFjZWJvb2tTZXJ2aWNlIHtcbiAgICAgICAgICAgICtwb3N0T25UaW1lbGluZSgpXG4gICAgICAgIH1cbiAgICAgICAgbGluayBJU29jaWFsTmV0d29yayBcInBhdHRlcm5zL3NyYy9tYWluL2phdmEvYWRhcHRlclwiXG4gICAgICAgIGxpbmsgRmFjZWJvb2tBZGFwdGVyIFwicGF0dGVybnMvc3JjL21haW4vamF2YS9hZGFwdGVyXCJcbiAgICAgICAgbGluayBGYWNlYm9va1NlcnZpY2UgXCJwYXR0ZXJucy9zcmMvbWFpbi9qYXZhL2FkYXB0ZXJcIlxuICAgICAgICBsaW5rIFlvdXJBcHBsaWNhdGlvbiBcInBhdHRlcm5zL3NyYy9tYWluL2phdmEvbGliL2NvbS9mYWNlYm9vay9hcGlcIlxuICAgICAgICBcbiAgICAgICAgSVNvY2lhbE5ldHdvcmsgPC0tIFlvdXJBcHBsaWNhdGlvblxuICAgICAgICBGYWNlYm9va0FkYXB0ZXIgLi58PiBJU29jaWFsTmV0d29ya1xuICAgICAgICBGYWNlYm9va0FkYXB0ZXIgLS0-IFwiZmIucG9zdE9uVGltZWxpbmUobmV3IERhdGUoKSlcIiBGYWNlYm9va1NlcnZpY2UgIiwibWVybWFpZCI6e30sInVwZGF0ZUVkaXRvciI6ZmFsc2V9)](patterns/src/main/java/adapter)

<details>
  <summary>Source</summary>

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
</details>

### Bridge

> Como desacoplar a abstração de uma Imagem da sua implementação para que possam variar de forma independente?

[![Bridge Diagram](https://mermaid.ink/img/eyJjb2RlIjoiY2xhc3NEaWFncmFtXG5jbGFzcyBJbWFnZSB7XG4gICAgLUltYWdlSW1wbCBpbWdJbXBsXG4gICAgK3NhdmUoKVxuICAgICtzaG93KClcbn1cblxuY2xhc3MgSW1hZ2VJbXBsIHtcbiAgICA8PGludGVyZmFjZT4-XG4gICAgK2NvbXByZXNzKFN0cmluZyBwYXRoKVxuICAgICtsb2FkKFN0cmluZyBwYXRoKVxufVxuXG5jbGFzcyBQaWN0dXJlIHtcbiAgICArc2F2ZSgpXG4gICAgK3Nob3coKVxufVxuXG5jbGFzcyBKUEVHSW1wbCB7XG4gICAgK2NvbXByZXNzKFN0cmluZyBwYXRoKVxuICAgICtsb2FkKFN0cmluZyBwYXRoKVxufVxuXG5jbGFzcyBQTkdJbXBsIHtcbiAgICArY29tcHJlc3MoU3RyaW5nIHBhdGgpXG4gICAgK2xvYWQoU3RyaW5nIHBhdGgpXG59XG5cblBpY3R1cmUgPC4uIEltYWdlXG5JbWFnZSAtLT4gSW1hZ2VJbXBsXG5KUEVHSW1wbCAtLXw-IEltYWdlSW1wbFxuUE5HSW1wbCAtLXw-IEltYWdlSW1wbFxuXG5saW5rIFBpY3R1cmUgXCJwYXR0ZXJucy9zcmMvbWFpbi9qYXZhL2JyaWRnZVwiXG5saW5rIEltYWdlIFwicGF0dGVybnMvc3JjL21haW4vamF2YS9icmlkZ2VcIlxubGluayBJbWFnZUltcGwgXCJwYXR0ZXJucy9zcmMvbWFpbi9qYXZhL2JyaWRnZVwiXG5saW5rIEpQRUdJbXBsIFwicGF0dGVybnMvc3JjL21haW4vamF2YS9icmlkZ2VcIlxubGluayBQTkdJbXBsIFwicGF0dGVybnMvc3JjL21haW4vamF2YS9icmlkZ2VcIiIsIm1lcm1haWQiOnt9LCJ1cGRhdGVFZGl0b3IiOmZhbHNlfQ)](patterns/src/main/java/bridge)

<details>
  <summary>Source</summary>
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
</details>


### Composite

> Um sistema de gerenciamente de eventos recebe inscrições de estudantes e grupo de estudantes. Grupos de estudantes podem ser compostos por outros grupos de estudantes. (Ex: CIn contém citi, pet etc.). O sistema ainda deve estar preparado a enviar avisos aos inscritos. Como modelar as entidades para que possamos tratar grupos ou estudantes como um único objeto (uniformemente)?

[![Composite Diagram](https://mermaid.ink/img/eyJjb2RlIjoiY2xhc3NEaWFncmFtXG4gICAgY2xhc3MgU3Vic2NyaWJlciB7XG4gICAgICAgICt3YXJuKClcbiAgICB9XG5cbiAgICBjbGFzcyBTdHVkZW50IHtcbiAgICAgICAgK3dhcm4oKVxuICAgIH1cblxuICAgIGNsYXNzIEdyb3VwIHtcbiAgICAgICAgK3dhcm4oKVxuICAgIH1cblxuICAgIFN0dWRlbnQgLS18PiBTdWJzY3JpYmVyXG4gICAgR3JvdXAgLS18PiBTdWJzY3JpYmVyXG4gICAgR3JvdXAgby0tIFN1YnNjcmliZXI6IGhhcyBtdWx0aXBsZSIsIm1lcm1haWQiOnt9LCJ1cGRhdGVFZGl0b3IiOmZhbHNlfQ)](patterns/src/main/java/composite/)

<details>
  <summary>Source</summary>
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
</details>

### Factory Method

> Companhias aéreas têm o mesmo procedimento do vôo com exceção do tipo de comida que é preparada. Na modelagem, como permitir que cada companhia instancie o seu próprio tipo de Comida?

[![Factory Method Diagram](https://mermaid.ink/img/eyJjb2RlIjoiY2xhc3NEaWFncmFtXG4gICAgY2xhc3MgQWlybGluZSB7XG4gICAgICAgICttYWtlRm9vZCgpIEZvb2RcbiAgICB9XG5cbiAgICBjbGFzcyBGb29kIHtcbiAgICAgICAgPDxpbnRlcmZhY2U-PlxuICAgIH1cblxuICAgIGNsYXNzIFRBUCB7XG4gICAgICAgICttYWtlRm9vZCgpIEZvb2RcbiAgICB9XG5cbiAgICBjbGFzcyBUQU0ge1xuICAgICAgICArbWFrZUZvb2QoKSBGb29kXG4gICAgfVxuXG4gICAgQWlybGluZSAuLj4gRm9vZFxuICAgIFRBUCAuLj4gRWF0YWJsZUZvb2RcbiAgICBUQU0gLi4-IENoZWFwRm9vZFxuICAgIEVhdGFibGVGb29kIC4ufD4gRm9vZFxuICAgIENoZWFwRm9vZCAuLnw-IEZvb2RcbiAgICBUQVAgLS18PiBBaXJsaW5lXG4gICAgVEFNIC0tfD4gQWlybGluZVxuXG4gICAgbGluayBBaXJsaW5lIFwicGF0dGVybnMvc3JjL21haW4vamF2YS9mYWN0b3J5X21ldGhvZFwiXG4gICAgbGluayBUQVAgXCJwYXR0ZXJucy9zcmMvbWFpbi9qYXZhL2ZhY3RvcnlfbWV0aG9kXCJcbiAgICBsaW5rIFRBTSBcInBhdHRlcm5zL3NyYy9tYWluL2phdmEvZmFjdG9yeV9tZXRob2RcIlxuICAgIGxpbmsgRWF0YWJsZUZvb2QgXCJwYXR0ZXJucy9zcmMvbWFpbi9qYXZhL2ZhY3RvcnlfbWV0aG9kXCJcbiAgICBsaW5rIENoZWFwRm9vZCBcInBhdHRlcm5zL3NyYy9tYWluL2phdmEvZmFjdG9yeV9tZXRob2RcIlxuICAgIGxpbmsgRm9vZCBcInBhdHRlcm5zL3NyYy9tYWluL2phdmEvZmFjdG9yeV9tZXRob2RcIiIsIm1lcm1haWQiOnt9LCJ1cGRhdGVFZGl0b3IiOmZhbHNlfQ)](patterns/src/main/java/factory_method)

<details>
  <summary>Source</summary>
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
</details>

### Abstract Factory

> Um sistema bancário permite persistir dados tanto em banco de dados relacional quanto em XML. Existem repositórios específicos para cada tecnologia tanto para Cliente quanto para Conta. Como criar a família de repositórios de uma mesma tecnologia sem especificar as classes concretas?

[![Abstract Factory Diagram](https://mermaid.ink/img/eyJjb2RlIjoiY2xhc3NEaWFncmFtXG4gICAgY2xhc3MgRmFjdG9yeVJlcG9zaXRvcnkge1xuICAgICAgICA8PGludGVyZmFjZT4-XG4gICAgICAgICtjcmVhdGVSZXBBY2NvdW50KCkgUmVwb3NpdG9yeUFjY291bnRcbiAgICAgICAgK2NyZWF0ZVJlcENsaWVudCgpIFJlcG9zaXRvcnlDbGllbnRcbiAgICB9XG4gICAgY2xhc3MgRmFjdG9yeVJlcG9zaXRvcnlCRFIge1xuICAgICAgICArY3JlYXRlUmVwQWNjb3VudCgpIFJlcG9zaXRvcnlBY2NvdW50XG4gICAgICAgICtjcmVhdGVSZXBDbGllbnQoKSBSZXBvc2l0b3J5Q2xpZW50XG4gICAgfVxuICAgIGNsYXNzIEZhY3RvcnlSZXBvc2l0b3J5WE1MIHtcbiAgICAgICAgK2NyZWF0ZVJlcEFjY291bnQoKSBSZXBvc2l0b3J5QWNjb3VudFxuICAgICAgICArY3JlYXRlUmVwQ2xpZW50KCkgUmVwb3NpdG9yeUNsaWVudFxuICAgIH1cbiAgICBjbGFzcyBSZXBvc2l0b3J5QWNjb3VudCB7XG4gICAgICAgIDw8aW50ZXJmYWNlPj5cbiAgICB9XG5cbiAgICBjbGFzcyBSZXBvc2l0b3J5Q2xpZW50IHtcbiAgICAgICAgPDxpbnRlcmZhY2U-PlxuICAgIH1cblxuICAgIEZhY3RvcnlSZXBvc2l0b3J5IDx8Li4gRmFjdG9yeVJlcG9zaXRvcnlCRFJcbiAgICBGYWN0b3J5UmVwb3NpdG9yeSA8fC4uIEZhY3RvcnlSZXBvc2l0b3J5WE1MXG4gICAgRmFjdG9yeVJlcG9zaXRvcnlCRFIgLi4-IFJlcG9zaXRvcnlBY2NvdW50QkRSXG4gICAgRmFjdG9yeVJlcG9zaXRvcnlCRFIgLi4-IFJlcG9zaXRvcnlDbGllbnRCRFJcbiAgICBGYWN0b3J5UmVwb3NpdG9yeVhNTCAuLj4gUmVwb3NpdG9yeUFjY291bnRYTUxcbiAgICBGYWN0b3J5UmVwb3NpdG9yeVhNTCAuLj4gUmVwb3NpdG9yeUNsaWVudFhNTFxuICAgIFJlcG9zaXRvcnlBY2NvdW50WE1MIC4ufD4gUmVwb3NpdG9yeUFjY291bnRcbiAgICBSZXBvc2l0b3J5QWNjb3VudEJEUiAuLnw-IFJlcG9zaXRvcnlBY2NvdW50XG4gICAgUmVwb3NpdG9yeUNsaWVudFhNTCAuLnw-IFJlcG9zaXRvcnlDbGllbnRcbiAgICBSZXBvc2l0b3J5Q2xpZW50QkRSIC4ufD4gUmVwb3NpdG9yeUNsaWVudCIsIm1lcm1haWQiOnt9LCJ1cGRhdGVFZGl0b3IiOmZhbHNlfQ)](patterns/src/main/java/abstract_factory)

<details>
  <summary>Source</summary>
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
</details>

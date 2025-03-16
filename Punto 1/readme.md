# Diagramas UML

## Patrón Prototype - Lanzamiento de escenarios o mapas al servidor:

```mermaid
classDiagram
    %% Clase abstracta para obtener escenarios
    class GameScenario {
    <<abstract>>
      - scenarioName: String
      - scenarioDescription: String
      - scenarioType: String
      - scenarioBackground: String
      - RandomLocationsList: ArrayList~String~
      + GameScenario(GameScenario gameScenario)
      + clone() : GameScenario
      + getScenarioName() : String
      + setScenarioName(String scenarioName)
      + getScenarioDescription() : String
      + setScenarioDescription(String scenarioDescription)
      + getScenarioType() : String
      + setScenarioType(String scenarioType)
      + getScenarioBackground() : String
      + setScenarioBackground(String scenarioBackground)
    }
    
    %% Implementación concreta de un escenario básico
    class BasicScenario {
      + BasicScenario(BasicScenario target)
      + clone() : BasicScenario
    }
    
    %% Otra implementación concreta para otro escenario
    class ChrismasScenario {
      + ChrismasScenario(ChrismasScenario target)
      + clone() : ChrismasScenario
    }

    class Client{
    }

    Client ..> GameScenario
    GameScenario <|-- BasicScenario
    GameScenario <|-- ChrismasScenario

```


## Patrón Builder - Añadir accesorios a las armas

```mermaid
classDiagram
    %% La clase producto que contiene lo que el builder construya
    class WeaponAttachments {
        - sight: String
        - barrel: String
        - stock: String
        - grip: String
        - ammo: String
        + WeaponAttachments(sight: String, barrel: String, stock: String, grip: String, ammo: String)
        + getSight() : String
        + setSight(sight: String)
        + getBarrel() : String
        + setBarrel(barrel: String)
        + getStock() : String
        + setStock(stock: String)
        + getGrip() : String
        + setGrip(grip: String)
        + getAmmo() : String
        + setAmmo(ammo: String)
        + showLoadout() : void
    }

    %% Interfaz para la construcción de los accesorios del arma (Builder)
    class IWeaponAttachmentsBuilder {
        <<interface>>
        + setSight(sight: String) : IWeaponAttachmentsBuilder
        + setBarrel(barrel: String) : IWeaponAttachmentsBuilder
        + setStock(stock: String) : IWeaponAttachmentsBuilder
        + setGrip(grip: String) : IWeaponAttachmentsBuilder
        + setAmmo(ammo: String) : IWeaponAttachmentsBuilder
        + build() : WeaponAttachments
    }

    
    %% Implementación concreta del Builder de los accesorios del arma
    class WeaponAttachmentsBuilder {
        - sight: String = "Sight stock"
        - barrel: String = "Barrel stock"
        - stock: String = "Basic"
        - grip: String = "No grip"
        - ammo: String = "Standar"
        + setSight(sight: String) : IWeaponAttachmentsBuilder
        + setBarrel(barrel: String) : IWeaponAttachmentsBuilder
        + setStock(stock: String) : IWeaponAttachmentsBuilder
        + setGrip(grip: String) : IWeaponAttachmentsBuilder
        + setAmmo(ammo: String) : IWeaponAttachmentsBuilder
        + build() : WeaponAttachments
    }
    
    class Client{
    }
    
    Client ..>  IWeaponAttachmentsBuilder
    
    IWeaponAttachmentsBuilder <|.. WeaponAttachmentsBuilder
    WeaponAttachmentsBuilder --> WeaponAttachments

```


## Patrón Singleton - Administrador de partida privada

```mermaid
    %% Clase con el Singleton
    class GameManager {
        - instance: GameManager
        - players: List~Player~
        - gameStarted: boolean
        - GameManager()
        + getInstance() : GameManager
        + addPlayer(player: Player)
        + removePlayer(player: Player)
        + startGame()
        + endGame()
        - resetInstance()
    }

    %% Clase que se va usar para el ejemplo
    class Player {
        - name: String
        - id: String
        + Player(name: String, id: String)
        + getName() : String
        + getId() : String
    }

    
        class Client{
        
        }
        
    
        Client --> GameManager
        GameManager "1" -- "n" Player

```
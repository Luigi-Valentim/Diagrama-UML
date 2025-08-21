# 📱 POO — Modelagem e Diagramação do iPhone (2007)

Este projeto foi desenvolvido como parte de um **desafio prático do Bootcamp Santander Backend com Java** na plataforma [DIO](https://www.dio.me/).  
O objetivo é exercitar os conceitos de **Programação Orientada a Objetos (POO)**, aplicando **interfaces, classes e herança** para modelar um componente inspirado no **primeiro iPhone lançado em 2007**.

---

## 🚀 Objetivo do Desafio

Modelar e implementar, em **Java**, um sistema que simule o funcionamento básico de um iPhone, englobando suas principais funcionalidades:

- **Reprodutor Musical**
  - `tocar()`
  - `pausar()`
  - `selecionarMusica(String musica)`

- **Aparelho Telefônico**
  - `ligar(String numero)`
  - `atender()`
  - `iniciarCorreioVoz()`

- **Navegador na Internet**
  - `exibirPagina(String url)`
  - `adicionarNovaAba()`
  - `atualizarPagina()`

---

## 📐 Diagrama UML

O sistema foi modelado utilizando **UML (Unified Modeling Language)**.  

```mermaid
classDiagram
direction LR

class ReprodutorMusical {
  <<interface>>
  +tocar() void
  +pausar() void
  +selecionarMusica(musica String) void
}

class AparelhoTelefonico {
  <<interface>>
  +ligar(numero String) void
  +atender() void
  +iniciarCorreioVoz() void
}

class NavegadorInternet {
  <<interface>>
  +exibirPagina(url String) void
  +adicionarNovaAba() void
  +atualizarPagina() void
}

class IPhone {
  -String musicaAtual
  -boolean tocando
  -String urlAtual
  -int abas
  -boolean chamadaEmAndamento
  +IPhone()
  +tocar() void
  +pausar() void
  +selecionarMusica(musica String) void
  +ligar(numero String) void
  +atender() void
  +iniciarCorreioVoz() void
  +exibirPagina(url String) void
  +adicionarNovaAba() void
  +atualizarPagina() void
}

ReprodutorMusical <|.. IPhone
AparelhoTelefonico <|.. IPhone
NavegadorInternet <|.. IPhone

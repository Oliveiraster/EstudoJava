classDiagram
    class ReprodutorMusical {
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }
    
    class AparelhoTelefonico {
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
    }
    
    class NavegadorInternet {
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
    }
    
    class SmartPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    }
    
    SmartPhone ..|> ReprodutorMusical
    SmartPhone ..|> AparelhoTelefonico
    SmartPhone ..|> NavegadorInternet
package mobile;

import mobile.aplicativos.navegador.Navegador;
import mobile.aplicativos.realizadordechamada.Telefone;
import mobile.aplicativos.reprodutormusical.IPod;

public class Iphone implements IPod, Telefone, Navegador {

    @Override
    public void exibirPagina() {
        System.out.println("Página exibida...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba adicionada...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada..");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ligando para correio de voz...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica Selecionada");
    }
}



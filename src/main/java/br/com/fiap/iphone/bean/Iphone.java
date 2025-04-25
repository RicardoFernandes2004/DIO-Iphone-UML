package br.com.fiap.iphone.bean;

import java.util.Calendar;
import java.util.List;

public class Iphone implements Camera, Ipod, Telefone{
    private String modelo;
    private String cor;
    private int armazenamento; // em GB
    private int capacidadeBateria; // em mAh
    private int nivelBateria; // em %
    private List<Foto> galeria;
    private List<Musica> playlist;
    private List<Contato> contatos;
    private List<Mensagem> mensagens;
    private List<Email> emails;
    private boolean conectadoInternet;
    private Calendar calendario; // ou LocalDateTime, depende do uso
    private List<Voicemail> voicemails;


    @Override
    public void tirarFoto() {

    }

    @Override
    public void exibirFoto() {

    }

    @Override
    public void guardarNaGaleria() {

    }

    @Override
    public void exibirGaleria() {

    }

    @Override
    public void darZoom() {

    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica() {

    }

    @Override
    public void pular() {

    }

    @Override
    public void trocarModo(Modo modo) {

    }

    @Override
    public void telefonar(int numeroDeTelefone) {

    }

    @Override
    public void atender() {

    }

    @Override
    public void enviarMensagem() {

    }

    @Override
    public String receberMensagem() {
        return "";
    }

    @Override
    public void conectarNaInternet() {

    }

    @Override
    public void salvarNosContatos(Contato contato) {

    }

    @Override
    public void consultarContatos() {

    }

    @Override
    public void acessarCalendario() {

    }

    @Override
    public void mesclarChamada(Contato contato1, Contato contato2) {

    }

    @Override
    public void favoritarContato(Contato contato) {

    }

    @Override
    public void escutarVoiceMail(Voicemail voicemail) {

    }

    @Override
    public void receberEmail(Email email) {

    }
}

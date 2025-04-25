package br.com.fiap.iphone.bean;

public interface Telefone {
    public void telefonar(int numeroDeTelefone);
    public void atender();
    public void enviarMensagem();
    public String receberMensagem();
    public void conectarNaInternet();
    public void salvarNosContatos(Contato contato);
    public void consultarContatos();
    public void acessarCalendario();
    public void mesclarChamada(Contato contato1,Contato contato2);
    public void favoritarContato(Contato contato);
    public void escutarVoiceMail(Voicemail voicemail);
    public void receberEmail(Email email);
}

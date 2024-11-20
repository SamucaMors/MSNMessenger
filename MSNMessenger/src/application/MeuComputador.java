package application;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class MeuComputador {
    public static void main(String[] args) {
        /*
            NÃO SE SABE QUAL APP (CLASSE)
            MAS, QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
        */
        ServicoMensagemInstantanea smi = null;
        String appEscolhido = "telegram";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }else if(appEscolhido.equals("facebook")){
            smi = new FacebookMessenger();
        }else if(appEscolhido.equals("telegram")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}

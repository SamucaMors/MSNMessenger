public class MeuComputador {
    public static void main(String[] args) {

        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println();

        FacebookMessenger facebook = new FacebookMessenger();
        facebook.enviarMensagem();
        facebook.receberMensagem();
        System.out.println();


        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}

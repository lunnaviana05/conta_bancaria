public class Programa {
    public static void main(String[] args){
        conta minhaconta;
        minhaconta = new conta();
        minhaconta.numero=1;
        minhaconta.titular="Lunna Viana";
        minhaconta.saldo=100;

        conta minhaconta2;
        minhaconta2 = new conta();
        minhaconta2.numero=2;
        minhaconta2.titular="Selene Bitto";
        minhaconta2.saldo=2000;

        System.out.println(minhaconta.numero);
        System.out.println(minhaconta.titular);
        System.out.println(minhaconta.saldo);
    }
}

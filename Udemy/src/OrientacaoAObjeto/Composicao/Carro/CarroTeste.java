package OrientacaoAObjeto.Composicao.Carro;
public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println("Carro esta ligado? "+c1.estaLigado());
        System.out.println("Rotacao esta quanto? "+c1.motor.giros());
        c1.ligar();
        System.out.println("Agora o carro esta ligado? "+c1.estaLigado());
        System.out.println("Rotacao esta quanto? "+c1.motor.giros());
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println("Depois de acelerar como esta a Rotacao? "+c1.motor.giros());
        c1.frear();
        c1.frear();
        System.out.println("Depois de frear duas vezes como esta a Rotacao? "+c1.motor.giros());
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println("Depois de frear muitas vezes como esta a Rotacao? "+c1.motor.giros());
        System.out.println("Não passa de 600");
        //Faltou Encapsulamento!!
        //c1.motor.fatorInjecao = -30;
    }
}
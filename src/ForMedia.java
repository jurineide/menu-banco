import java.util.Scanner;

public class ForMedia {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        double media=0;
        double nota=0;

        for(int i=0; i<3; i++){
            System.out.println("diga sua nota");
            nota= leitura.nextDouble();
            media += nota;
        }
        System.out.println(media/3);
    }
}

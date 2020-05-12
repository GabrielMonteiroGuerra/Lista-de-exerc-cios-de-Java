import java.util.Scanner;



package primeiroprograma;


public class PrimeiroPrograma {

  
    public static void main(String[] args) {
        java.util.Scanner nota = new Scanner(System.in);
        float n1, n2, n3, n4, mf;
        System.out.println("Nota do primeiro Bimestre:");
        n1 = nota.nextFloat();
        System.out.println("Nota do segundo Bimestre:");
        n2 = nota.nextFloat();
        System.out.println("Nota do terceiro Bimestre:");
        n3 = nota.nextFloat();
        System.out.println("Nota do segundo Bimestre:");
        n4 = nota.nextFloat();
        mf = (n1+n2+n3+n4)/4;
        if(mf>=5)
        {
            System.out.println("Voce foi Aprovado!");
        }
        else
        {
            System.out.println("Voce foi Reprovado!");
        }
        System.out.println("A sua média final é:"+ mf +"Pontos");
    }
        
    }



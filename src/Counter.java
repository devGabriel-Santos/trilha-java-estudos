import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {

        int firstValue;
        int secondValue;

        Scanner input = new Scanner(System.in);

        System.out.println("Descubra a interação de dois valores");
        System.out.println("Aviso: O primeiro valor deve ser sempre maior que o segundo valor: ");
        System.out.println();


        System.out.print("Digite o primeiro valor: ");
        firstValue = input.nextInt();
        System.out.println();


        System.out.println("Digite o segundo valor: ");
        secondValue = input.nextInt();

        try {
            contar(firstValue, secondValue);
        }catch (ParamInvalidateException e){
            System.err.println("Error: " +e.getMessage());
        }
    }

    private static void contar(int parameter1, int parameter2) throws ParamInvalidateException {
        if (parameter1 < parameter2)
            throw new ParamInvalidateException();
        else {
            int interacao = parameter1 - parameter2;
            for (int i = 1; i <= interacao; i++){
                System.out.println("Contém interação "+ i + " com "+i);
            }
        }
    }
}

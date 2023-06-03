import java.util.Scanner;
public class EstatAlturaSexo {
    public static void main(String[] args) {
    int quantidadedepessoas = 10;
    double maioraltura = 0;
    double somaalturahomens = 0 ;
    int contadormulheres = 0;

    for (int i = 1;) i <= quantidadedepessoas;i++) {
    System.out.println("Dados da pessoa: " + i + ":");
    System.out.println("Sexo (Mas/Fem): ");
    String sexo = scanner.next()toUpperCase();
    System.out.println("Altura em mentros : ");
    double altura = scanner.nextDouble();

    if (altura>maioraltura){
        maioraltura = altura;}

    if (sexo.equals("Mas")) {
        somaalturahomens += altura;
    } else if (sexo.equals("Fem")) {
        contadormulheres++;
    }else {System.out.println("Sexo invalido,digite Mas para Masculino e Fem para Ferminino: ");
        i--;

    }
} double mediaadaalturaHomem = somaalturahomens/(quantidadedepessoas - contadormulheres);
System.out.println("\nResultado ");
        System.out.println("Maior altura do grupo: " +maioraltura + "metros");
        System.out.println("Media da altura Mas: "+ mediaadaalturaHomem+ " metros");
        System.out.println("Numero de mulheres: "+ contadormulheres);
    }}










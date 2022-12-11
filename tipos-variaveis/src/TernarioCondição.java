public class TernarioCondição {
    
    public static void main(String[] args) {

        int a, b;

        a = 6;
        b = 6;

        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE

        // String resultado = "";
        // if(a==b)
        //     resultado = "verdadeiro";
        // else
        //     resultado = "falso";
        
        // USANDO OPERADOR TERNARIO     
        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

    }
}
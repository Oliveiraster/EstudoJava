public class MinhaClasse {
    public static void main(String[] args) {
        // System.out.print("Ola, Mundo!");
        // // # Final = const
        // final String BR = "Brasil";
        // System.out.print(BR);

        String primeiroNome = "Raphael";
        String segundoNome = "Oliveira" ;
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metodo " +  primeiroNome.concat(" ").concat(segundoNome);
    }
}

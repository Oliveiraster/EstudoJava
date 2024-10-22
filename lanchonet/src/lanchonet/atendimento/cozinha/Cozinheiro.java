package lanchonet.atendimento.cozinha;


public class Cozinheiro {
    public void adicionarLancheNoBalcalcão(){
        System.out.println(
            "Adicionando lanche Natual Hamburger no Balcão.");
    }

    public void adicionarSucoBalcalcão(){
        System.out.println("Adicionando Suco no Balcão.");
    }

    public void adicionarComboNoBalcalcão(){
        adicionarLancheNoBalcalcão();
        adicionarSucoBalcalcão();
    }
    
    private void prepararLanche(){
        System.out.println(
                "Preparando lanche tipo Hamburguer");
    }
    
    private void prepararVitamina(){
        System.out.println(
                "Preparando vitamina.");
    }
    
    private void prepararCombo(){
        prepararVitamina();
        prepararLanche();
    }

    private void selecionarIngredientesLanche() {
        System.out.println(
                "Pão, Salada, Ovo e Carne.");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println(
                "Fruta, Leita e Suco.");
    }

    private void lavarIngredientes() {
        System.out.println(
                "Lavando ingredientes");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println(
                "Batendo Vitamina liquidificador.");
    }

    private void fritarIngredientesLanche() {
        System.out.println(
                "Fritando a Carne e Ovo para o Hamburguer");
    }



    private void pedirParaTrocarGas( Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}

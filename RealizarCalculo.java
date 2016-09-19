package operacoesmath;

public class RealizarCalculo {
    DadosOperacoes x = new DadosOperacoes();
    DadosOperacoes y = new DadosOperacoes();
    DadosOperacoes mensagem = new DadosOperacoes();
    DadosOperacoes escolha = new DadosOperacoes();
    DadosOperacoes resultado = new DadosOperacoes();
    
        public void Calculo(){
            switch(escolha.getEscolha()){
                case 1:
                    //calculo da area do quadrado
                    //lado * lado
                    resultado.setResultado(x.getX() * x.getX());
                    mensagem.setMensagem("Este é o resultado:"+resultado.getResultado());
                    
                    break;
                case 2:
                    //base * altura
                    //retangulo
                    resultado.setResultado(x.getX() * y.getY());
                    mensagem.setMensagem("Este é o resultado:"+resultado.getResultado() );
                    break;
                case 3:
                    //soma de dois numeros
                    // x + y
                    resultado.setResultado(x.getX() + y.getY());
                    mensagem.setMensagem("Este é o resultado:"+resultado.getResultado());
                    break;
                case 4:
                    //multiplicacao
                    // x * y
                    resultado.setResultado(x.getX() * y.getY());
                    mensagem.setMensagem("Este é o resultado:"+resultado.getResultado());
                    break;
                default:
                    mensagem.setMensagem("Esta opção não é valida");
                }
        }
}

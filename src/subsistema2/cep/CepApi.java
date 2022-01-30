package subsistema2.cep;

import com.dio.padrao.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia  = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "São Joaquim da Barra";

    }  public String recuperarEstado(String cep){
        return "SP";
    }

}

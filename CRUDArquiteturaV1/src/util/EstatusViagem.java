package util;

public enum EstatusViagem {
	

	/**
	 * a viagem foi solicitada e ainda n�o foi aprovada/reprovada
	 */
	SOLICITADA(0),

	/**
	 * Solicita��o da Viagem aprovada para ser realizada
	 */
	SOLICITACAO_APROVADA(1),
	
	/**
	 * A solicita��o da viagem foi reprovada
	 */
	SOLICITACAO_REPROVADA(2),
	
	/**
	 * viagem est� em andamento, ou seja saiu para Viagem
	 */
	VIAGEM_EM_ANDAMENTO(3),
	
	/**
	 * viagem j� foi realizada 
	 */
	VIAGEM_CONCLUIDA(4),
	
	/**
	 * viagem finalizada quando j� foi realizado o acerto
	 */
	VIAGEM_FINALIZADA(5)
	;
	private int valor=0;
	
	EstatusViagem(int val){
		this.valor = val;
	}
	public int estatusViagem(){
		return this.valor;
	}
	public static EstatusViagem getFromEstatusViagem(int val) {
        switch (val) {
        case 0:
            return SOLICITADA;
        case 1:
            return SOLICITACAO_APROVADA;
        case 2:
            return SOLICITACAO_REPROVADA;
        case 3:
            return VIAGEM_EM_ANDAMENTO;
        case 4:
        	return EstatusViagem.VIAGEM_CONCLUIDA;
        case 5:
        	return VIAGEM_FINALIZADA;
        default:
        	return SOLICITADA;
        }
    }

}

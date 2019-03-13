package com.cursomc.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa fisica"), 
	PESSOAJURIDICA(2, "Pessoa Juridica");

	private int cod;
	private String descricao;

	private TipoCliente(int code, String descricao) {
		this.cod = code;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for (TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
				}
		}
		
		throw new IllegalArgumentException("Codigo do tipo cliente invalido");
	}
}

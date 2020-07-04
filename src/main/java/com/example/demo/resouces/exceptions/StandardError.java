package com.example.demo.resouces.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer status; // para pegar o codigo http
	private String mensagem;
	private Long tempo;

	public StandardError(Integer status, String mensagem, Long tempo) {
		super();
		this.status = status;
		this.mensagem = mensagem;
		this.tempo = tempo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Long getTempo() {
		return tempo;
	}

	public void setTempo(Long tempo) {
		this.tempo = tempo;
	}

}

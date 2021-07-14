package entidades;

import exceptions.DomainError;

public final class Account {
	private Integer number;
	private String propietario;
	private Double balanco;
	private Double limitesaque;
	public Account(Integer number, String propietario, Double balanco, Double limitesaque) {
		this.number = number;
		this.propietario = propietario;
		this.balanco = balanco;
		this.limitesaque = limitesaque;
	}
	
	public final void Saque(double value) throws DomainError{
		if (value>limitesaque) {
			throw new DomainError("valor ultrapassa limite de saque");
		}
		if (value>balanco) {
			throw new DomainError("saldo insuficiente");
		}
		balanco-=value;
	}
	
	
	
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public Double getBalanco() {
		return balanco;
	}
	public Double getLimitesaque() {
		return limitesaque;
	}
	public void setLimitesaque(Double limitesaque) {
		this.limitesaque = limitesaque;
	}
	

}

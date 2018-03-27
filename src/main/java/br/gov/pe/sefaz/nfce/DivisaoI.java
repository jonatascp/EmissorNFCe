package br.gov.pe.sefaz.nfce;

import java.awt.image.BufferedImage;

public class DivisaoI {

	public final String textoObrigatorioI = "CNPJ:";
    public final String textoObrigatorioII = "Inscrição Estadual:";
    private boolean txibirLogo;
    private BufferedImage logoDefault;
    private BufferedImage logoContribuinte;
    private String emitenteRazaoSocial;
    private String emitenteCNPJ;
    private String emitenteInscricaoEstadual;
    private String emitenteEnderecoLogradouro;
    private String emitenteEnderecoNumero;
    private String emitenteEnderecoBairro;
    private String emitenteEnderecoMunicipio;
    private String emitenteEnderecoSiglaUF;
	
    public boolean isTxibirLogo() {
		return txibirLogo;
	}
	public void setTxibirLogo(boolean txibirLogo) {
		this.txibirLogo = txibirLogo;
	}
	public BufferedImage getLogoDefault() {
		return logoDefault;
	}
	public void setLogoDefault(BufferedImage logoDefault) {
		this.logoDefault = logoDefault;
	}
	public BufferedImage getLogoContribuinte() {
		return logoContribuinte;
	}
	public void setLogoContribuinte(BufferedImage logoContribuinte) {
		this.logoContribuinte = logoContribuinte;
	}
	public String getEmitenteRazaoSocial() {
		return emitenteRazaoSocial;
	}
	public void setEmitenteRazaoSocial(String emitenteRazaoSocial) {
		this.emitenteRazaoSocial = emitenteRazaoSocial;
	}
	public String getEmitenteCNPJ() {
		return emitenteCNPJ;
	}
	public void setEmitenteCNPJ(String emitenteCNPJ) {
		this.emitenteCNPJ = emitenteCNPJ;
	}
	public String getEmitenteInscricaoEstadual() {
		return emitenteInscricaoEstadual;
	}
	public void setEmitenteInscricaoEstadual(String emitenteInscricaoEstadual) {
		this.emitenteInscricaoEstadual = emitenteInscricaoEstadual;
	}
	public String getEmitenteEnderecoLogradouro() {
		return emitenteEnderecoLogradouro;
	}
	public void setEmitenteEnderecoLogradouro(String emitenteEnderecoLogradouro) {
		this.emitenteEnderecoLogradouro = emitenteEnderecoLogradouro;
	}
	public String getEmitenteEnderecoNumero() {
		return emitenteEnderecoNumero;
	}
	public void setEmitenteEnderecoNumero(String emitenteEnderecoNumero) {
		this.emitenteEnderecoNumero = emitenteEnderecoNumero;
	}
	public String getEmitenteEnderecoBairro() {
		return emitenteEnderecoBairro;
	}
	public void setEmitenteEnderecoBairro(String emitenteEnderecoBairro) {
		this.emitenteEnderecoBairro = emitenteEnderecoBairro;
	}
	public String getEmitenteEnderecoMunicipio() {
		return emitenteEnderecoMunicipio;
	}
	public void setEmitenteEnderecoMunicipio(String emitenteEnderecoMunicipio) {
		this.emitenteEnderecoMunicipio = emitenteEnderecoMunicipio;
	}
	public String getEmitenteEnderecoSiglaUF() {
		return emitenteEnderecoSiglaUF;
	}
	public void setEmitenteEnderecoSiglaUF(String emitenteEnderecoSiglaUF) {
		this.emitenteEnderecoSiglaUF = emitenteEnderecoSiglaUF;
	}
	public String getTextoObrigatorioI() {
		return textoObrigatorioI;
	}
	public String getTextoObrigatorioII() {
		return textoObrigatorioII;
	}
    
    
}

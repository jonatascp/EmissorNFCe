package br.gov.pe.sefaz.nfce;

import java.awt.image.BufferedImage;

public class DivisaoVIII {

	public final String textoObrigatorioI = "Consulta via leitor de QR Code";
    public final String textoObrigatorioII = "Protocolo de autorização:";
    private int qrCodeWidth;        
    private int qrCodeHeight;
    private BufferedImage qrCode;
    private String procoloDeAutorizacao;
    private String procoloDeAutorizacaoDataHora;
	
    public int getQrCodeWidth() {
		return qrCodeWidth;
	}
	public void setQrCodeWidth(int qrCodeWidth) {
		this.qrCodeWidth = qrCodeWidth;
	}
	public int getQrCodeHeight() {
		return qrCodeHeight;
	}
	public void setQrCodeHeight(int qrCodeHeight) {
		this.qrCodeHeight = qrCodeHeight;
	}
	public BufferedImage getQrCode() {
		return qrCode;
	}
	public void setQrCode(BufferedImage qrCode) {
		this.qrCode = qrCode;
	}
	public String getProcoloDeAutorizacao() {
		return procoloDeAutorizacao;
	}
	public void setProcoloDeAutorizacao(String procoloDeAutorizacao) {
		this.procoloDeAutorizacao = procoloDeAutorizacao;
	}
	public String getProcoloDeAutorizacaoDataHora() {
		return procoloDeAutorizacaoDataHora;
	}
	public void setProcoloDeAutorizacaoDataHora(String procoloDeAutorizacaoDataHora) {
		this.procoloDeAutorizacaoDataHora = procoloDeAutorizacaoDataHora;
	}
    
    
}

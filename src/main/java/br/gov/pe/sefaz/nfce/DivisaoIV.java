package br.gov.pe.sefaz.nfce;

import java.util.List;

public class DivisaoIV {

	public final String textoObrigatorioI = "QTD. TOTAL DE ITENS";
    public final String textoObrigatorioII = "VALOR TOTAL R$";
    public final String textoObrigatorioIII = "FORMA DE PAGAMENTO";
    public final String textoObrigatorioIV = "VALOR PAGO";
    private String qtdTotalDeItens;
    private String valorTotal;
    private List<String[]> pagamento;
	
    public String getQtdTotalDeItens() {
		return qtdTotalDeItens;
	}
	public void setQtdTotalDeItens(String qtdTotalDeItens) {
		this.qtdTotalDeItens = qtdTotalDeItens;
	}
	public String getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}
	public List<String[]> getPagamento() {
		return pagamento;
	}
	public void setPagamento(List<String[]> pagamento) {
		this.pagamento = pagamento;
	}
    
	public void addPagamento(String FormaDePagamento, String ValorPago) {
        this.pagamento.add(new String[]{FormaDePagamento, ValorPago});
    }
    
}

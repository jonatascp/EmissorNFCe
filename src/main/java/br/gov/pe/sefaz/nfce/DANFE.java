package br.gov.pe.sefaz.nfce;

public class DANFE {

	public DivisaoI divisaoI;
    public DivisaoII divisaoII;
    public DivisaoIII divisaoIII;
    public DivisaoIV divisaoIV;
    public DivisaoV divisaoV;
    public DivisaoVII divisaoVII;
    public DivisaoVIII divisaoVIII;
    
    public DANFE() {
    	this.divisaoI = new DivisaoI();
        this.divisaoII = new DivisaoII();
        this.divisaoIII = new DivisaoIII();
        this.divisaoIV = new DivisaoIV();
        this.divisaoV = new DivisaoV();
        this.divisaoVII = new DivisaoVII();
        this.divisaoVIII = new DivisaoVIII();
    }
}

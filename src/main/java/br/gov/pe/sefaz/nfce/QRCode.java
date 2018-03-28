package br.gov.pe.sefaz.nfce;

import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;

public class QRCode {

	private String chNFe = "";   //Chave de Acesso da NFC-e [44 bytes*]
    public void setChNFe(String value) throws Exception {
        if (value.length() != 44) throw new Exception("Campo chNFe não possui 44 bytes.");
        else this.chNFe = value;
    }    
    public String getChNFe() {
        return this.chNFe;
    }

    private String nVersao = "";   //Versão do QR Code [3 bytes*]
    public void setNVersao(String value) throws Exception {
        if (value.length() != 3) throw new Exception("Campo nVersao não possui 3 bytes.");
        else this.nVersao = value;
    }    
    public String getNVersao() {
        return this.nVersao;
    }
    
    private String tpAmb = "";   //Identificação do Ambiente (1-Produção, 2-Homologação) [1 bytes*]
    public void setTpAmb(String value) throws Exception {
        if (value.length() != 1) throw new Exception("Campo tpAmb não possui 1 bytes.");
        else this.tpAmb = value;
    }    
    public String getTpAmb() {
        return this.tpAmb;
    }

    private String cDest = "";   //Documento de Identificação do consumidor (CNPJ/CPF/ID Estrangeiro) [11 - 20 ou null bytes]
    public void setCDest(String value) throws Exception {
        if ((value != null) && ((value.length() < 11) || (value.length() > 20))) throw new Exception("Campo cDest não possui entre 11 e 20 bytes e não é nulo.");
        else this.cDest = value;
    }    
    public String getCDest() {
        return this.cDest;
    }
    
    private String dhEmi = "";   //Data e Hora de Emissão da NFC-e [50 bytes]
    public void setDhEmi(String value) throws Exception {
        if (value.length() > 50) throw new Exception("Campo dhEmi excedeu 50 bytes.");
        else this.dhEmi = value;
    }    
    public String getDhEmi(boolean Hex) {        
        if (Hex) return String.format("%040x", new java.math.BigInteger(1, this.dhEmi.getBytes(StandardCharsets.UTF_8)));
        else return this.dhEmi;
    }

    private String vNF = "";   //Valor Total da NFC-e [15 bytes]
    public void setVNF(String value) throws Exception {
        if (value.length() > 15) throw new Exception("Campo vNF excedeu 15 bytes.");
        else this.vNF = value;
    }    
    public String getVNF() {
        return this.vNF;
    }

    private String vICMS = "";   //Valor Total ICMS na NFC-e [15 bytes]
    public void setVICMS(String value) throws Exception {
        if (value.length() > 15) throw new Exception("Campo vICMS excedeu 15 bytes.");
        else this.vICMS = value;
    }    
    public String getVICMS() {
        return this.vICMS;
    }
    
    private String digVal = "";   //Digest Value da NFC-e [56 bytes*]
    public void setDigVal(String value) throws Exception {
        if (value.length() != 56) throw new Exception("Campo digVal não possui 56 bytes.");
        else this.digVal = value;
    }    
    public String getDigVal() {
        return this.digVal;
    }

    private String cIdToken = "";   //[6 bytes*]
    public void setCIdToken(String value) throws Exception {
        if (value.length() != 6) throw new Exception("Campo cIdToken não possui 6 bytes.");
        else this.cIdToken = value;
    }    
    public String getCIdToken() {
        return this.cIdToken;
    }
    
    private String cHashQRCode = "";   //[40 bytes*]
    public void setCHashQRCode(String value) throws Exception {
        if (value.length() != 40) throw new Exception("Campo cHashQRCode não possui 40 bytes.");
        else this.cHashQRCode = value;
    }        
    public String getCHashQRCode() {
        return this.cHashQRCode;
    }
    public String calcCHashQRCode() throws java.security.NoSuchAlgorithmException, Exception {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-1");
        byte[] hash = messageDigest.digest(this.getQueryStringForHash().getBytes(StandardCharsets.UTF_8));
        java.util.Formatter formatter = new java.util.Formatter();
        for (byte b : hash)
        {
            formatter.format("%02x", b);
        }
        String hashString = formatter.toString();
        formatter.close();
        this.setCHashQRCode(hashString);
        return this.getCHashQRCode();
    }
    
    private String Token = ""; //Token  [36 bytes]
    public void setToken(String value) throws Exception {
        if (value.length() > 36) throw new Exception("Token maior do que o permitido.");
        else this.Token = value;        
    }
    public String getToken() {
        return this.Token;
    }
    
    public String getQueryStringForHash() throws Exception {
        if (this.getChNFe() == "") throw new Exception("Campo chNFe ausente.");
        if (this.getNVersao() == "") throw new Exception("Campo nVersao ausente.");
        if (this.getTpAmb() == "") throw new Exception("Campo tpAmb ausente.");
        if (this.getDhEmi(false) == "") throw new Exception("Campo dhEmi ausente.");
        if (this.getVNF() == "") throw new Exception("Campo vNF ausente.");
        if (this.getVICMS() == "") throw new Exception("Campo vICMS ausente.");
        if (this.getDigVal() == "") throw new Exception("Campo digVal ausente.");
        if (this.getCIdToken() == "") throw new Exception("Campo cIdToken ausente.");
        if (this.getToken() == "") throw new Exception("Token ausente.");
        String returnString = "";
        returnString += "chNFe=" + this.getChNFe();
        returnString += "&nVersao=" + this.getNVersao();
        returnString += "&tpAmb=" + this.getTpAmb();
        if (this.getCDest() != "") returnString += "&cDest=" + this.getCDest();
        returnString += "&dhEmi=" + this.getDhEmi(true);
        returnString += "&vNF=" + this.getVNF();
        returnString += "&vICMS=" + this.getVICMS();
        returnString += "&digVal=" + this.getDigVal();
        returnString += "&cIdToken=" + this.getCIdToken() + this.getToken();
        return returnString;
    }
    
    public String getQueryStringForQRCode() throws Exception {
        if (this.getChNFe() == "") throw new Exception("Campo chNFe ausente.");
        if (this.getNVersao() == "") throw new Exception("Campo nVersao ausente.");
        if (this.getTpAmb() == "") throw new Exception("Campo tpAmb ausente.");
        if (this.getDhEmi(false) == "") throw new Exception("Campo dhEmi ausente.");
        if (this.getVNF() == "") throw new Exception("Campo vNF ausente.");
        if (this.getVICMS() == "") throw new Exception("Campo vICMS ausente.");
        if (this.getDigVal() == "") throw new Exception("Campo digVal ausente.");
        if (this.getCIdToken() == "") throw new Exception("Campo cIdToken ausente.");        
        if (this.getToken() == "") throw new Exception("Token ausente.");
        if (this.getCHashQRCode()== "") this.calcCHashQRCode();
        String returnString = "";
        returnString += "chNFe=" + this.getChNFe();
        returnString += "&nVersao=" + this.getNVersao();
        returnString += "&tpAmb=" + this.getTpAmb();
        if (this.getCDest() != "") returnString += "&cDest=" + this.getCDest();
        returnString += "&dhEmi=" + this.getDhEmi(true);
        returnString += "&vNF=" + this.getVNF();
        returnString += "&vICMS=" + this.getVICMS();
        returnString += "&digVal=" + this.getDigVal();
        returnString += "&cIdToken=" + this.getCIdToken();
        returnString += "&cHashQRCode=" + this.getCHashQRCode();
        return returnString;        
    }
    
    public BufferedImage generateQRCode(String URLBase, int Width, int Height) throws Exception {
        int qRCodeWidth = 900;
        int qRCodeHeight = 900;
        if (Width > 0) qRCodeWidth = Width;
        if (Height > 0) qRCodeHeight = Height;
        com.google.zxing.qrcode.QRCodeWriter qRCodeWriter = new com.google.zxing.qrcode.QRCodeWriter();
        com.google.zxing.common.BitMatrix bitMatrix = null;
        bitMatrix = qRCodeWriter.encode(URLBase + this.getQueryStringForQRCode(), com.google.zxing.BarcodeFormat.QR_CODE, qRCodeWidth, qRCodeHeight);
        return com.google.zxing.client.j2se.MatrixToImageWriter.toBufferedImage(bitMatrix);
    }
}

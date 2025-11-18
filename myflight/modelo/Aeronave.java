package pucrs.myflight.modelo;

public class Aeronave implements Contavel { 
	
    private static int totalAeronaves = 0; 
    
	private String codigo;
	private String descricao;
	
	public Aeronave(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
        totalAeronaves++; 
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
    
    public static int totalObjetos() {
        return totalAeronaves;
    }
}
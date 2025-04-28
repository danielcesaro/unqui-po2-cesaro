package parciales.planDeAhorros;

public class PlanDeAhorro {
	private Cliente 	  	titular;
	private String  	  	marca;
	private String  	  	modelo;
	private int 		  	cuotas;
	private int 		  	cuotasAbonadas;
	private SituacionPlan 	situacionPlan;
	private TipoRetribucion tipoRetribucion;
	
	public PlanDeAhorro(Cliente titular, String marca, String modelo, int cuotas, TipoRetribucion tipoRetribucion) {
		this.titular 		 = titular;
		this.marca   		 = marca;
		this.modelo  		 = modelo;
		this.cuotas  		 = cuotas;
		this.cuotasAbonadas  = 0;
		this.situacionPlan 	 = new Creado();
		this.tipoRetribucion = tipoRetribucion;
	}	
	
	public void ejecutarRetribucion() {
		
	}

	public int getCuotas() {
		return cuotas;
	}

	public int getCuotasAbonadas() {
		return cuotasAbonadas;
	}

	public void setCuotasAbonadas(int cuotasAbonadas) {
		this.cuotasAbonadas = cuotasAbonadas;
	}

	public void setSituacionPlan(SituacionPlan situacionPlan) {
		this.situacionPlan = situacionPlan;
	}

	public TipoRetribucion getTipoRetribucion() {
		return tipoRetribucion;
	}

	public void setTipoRetribucion(TipoRetribucion tipoRetribucion) {
		this.tipoRetribucion = tipoRetribucion;
	}
	
	

}

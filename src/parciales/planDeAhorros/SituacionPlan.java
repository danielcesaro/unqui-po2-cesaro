package parciales.planDeAhorros;

public interface SituacionPlan {
	
	public void pagarCuota(PlanDeAhorro plan);
	public void setearRetribucion(PlanDeAhorro plan, TipoRetribucion tipo);
	public void ejecutarRetribucion();
	public int  getCuotasPendientes();

}

package parciales.planDeAhorros;

public class Creado implements SituacionPlan {

	@Override
	public void pagarCuota(PlanDeAhorro plan) {
		plan.setCuotasAbonadas(plan.getCuotasAbonadas() + 1);
		plan.setSituacionPlan(new Vigente());
	}

	@Override
	public void setearRetribucion(PlanDeAhorro plan, TipoRetribucion tipo) {
		plan.setTipoRetribucion(tipo);
		
	}

	@Override
	public void ejecutarRetribucion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCuotasPendientes() {
		// TODO Auto-generated method stub
		return 0;
	}

}

package parciales.planDeAhorros;

public class Vigente implements SituacionPlan {

	@Override
	public void pagarCuota(PlanDeAhorro plan) {
		plan.setCuotasAbonadas(plan.getCuotasAbonadas() + 1);
		if (plan.getCuotas() == plan.getCuotasAbonadas()) {
			
		}
		
	}

	@Override
	public void setearRetribucion(PlanDeAhorro plan, TipoRetribucion tipo) {
		// TODO Auto-generated method stub
		
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

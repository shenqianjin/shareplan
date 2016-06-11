package attackforce.shareplan.dao;

import attackforce.shareplan.domain.Plan;

public interface PlanDao {

	public Plan selectPlanById(int id);
	public Plan selectAllPlans();
	
}

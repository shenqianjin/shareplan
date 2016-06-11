package attackforce.shareplan.service;

import java.util.List;

import attackforce.shareplan.domain.Person;
import attackforce.shareplan.domain.Plan;
import attackforce.shareplan.domain.vo.PersonVO;

public interface PlanService {
	public  List<Person> selectAllPerson();
    List<Person> getAllPerson();
    Person getPersonById(int id);
    List<Person> getPersonByName(String name);
    List<Plan> getAllPlans();
    Plan save(Plan plan);
    Plan update(Plan plan);
    Plan get(long id);
    long getNextId();

}

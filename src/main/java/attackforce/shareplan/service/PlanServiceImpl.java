package attackforce.shareplan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import attackforce.shareplan.dao.PersonDao;
import attackforce.shareplan.domain.Person;
import attackforce.shareplan.domain.Plan;

@Service
public class PlanServiceImpl implements PlanService {
    
    /*
     * this implementation is not thread-safe
     */
    private List<Person> personList;
    private List<Plan> plans;
    
    private PersonDao personDao;
    

	public  List<Person> selectAllPerson() {
		return personDao.selectAllPerson();
	}
    
    
    public PlanServiceImpl() {
        personList = new ArrayList<Person>();
        Person person1 = new Person("沈前进", "13388888888", "1@qq.com");
        Person person2 = new Person("刘杰", "18766666666", "2@qq.com");
        Person person3 = new Person("何博", "18723452345", "3@qq.com");
        Person person4 = new Person("杨浩", "189898898989", "3@qq.com");

        person1.setId(1);
        person2.setId(2);
        person3.setId(3);
        person4.setId(4);
        
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        
        plans = new ArrayList<Plan>();
        plans.add(new Plan(person1, "Core Java从入门到精通", "Java核心思想", "描述1", "备注1", "2016-06-11", "2016-06-18", ""));
        plans.add(new Plan(person2, "Core Java从入门到精通2", "Java核心思想2", "描述2", "备注2", "2016-06-11", "2016-06-25", ""));
        plans.add(new Plan(person3, "Core Java从入门到精通3", "Java核心思想3", "描述3", "备注3", "2016-06-11", "2016-07-02", ""));
        plans.add(new Plan(person4, "Core Java从入门到精通4", "Java核心思4", "描述4", "备注4", "2016-06-11", "2016-07-09", ""));

        plans.get(0).setId(1);
        plans.get(1).setId(1);
        plans.get(2).setId(1);
        plans.get(3).setId(1);
    }

    public List<Person> getAllPerson() {
        return personList;
    }
    
    public Person getPersonById(int id) {
        for (Person category : personList) {
            if (id == category.getId()) {
                return category;
            }
        }
        return null;
    }
    
    public List<Person> getPersonByName(String name) {
    	List<Person> resultList = new ArrayList<Person>();
        for (Person person : personList) {
            if (name != null && name.equals(person.getName())) {
            	resultList.add(person);
            }
        }
        return resultList;
    }

    public List<Plan> getAllPlans() {
        return plans;
    }

    public Plan save(Plan plan) {
        plan.setId(getNextId());
        plans.add(plan);
        return plan;
    }

    public Plan get(long id) {
        for (Plan plan : plans) {
            if (id == plan.getId()) {
                return plan;
            }
        }
        return null;
    }
    
    public Plan update(Plan plan) {
        int planCount = plans.size();
        for (int i = 0; i < planCount; i++) {
            Plan savedPlan = plans.get(i);
            if (savedPlan.getId() == plan.getId()) {
                plans.set(i, plan);
                return plan;
            }
        }
        return plan;
    }
    
    public long getNextId() {
        // needs to be locked
        long id = 0L;
        for (Plan plan : plans) {
            long planId = plan.getId();
            if (planId > id) {
                id = planId;
            }
        }
        return id + 1;
    }
}

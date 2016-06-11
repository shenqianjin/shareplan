package attackforce.shareplan.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import attackforce.shareplan.domain.Person;
import attackforce.shareplan.domain.Plan;
import attackforce.shareplan.service.PlanService;


@Controller
public class PlanController {

    @Autowired
    private PlanService planService;

    private static final Log logger = LogFactory.getLog(PlanController.class);

    @RequestMapping(value = "/input-plan")
    public String inputPlan(Model model) {
        List<Person> persons = planService.getAllPerson();
        model.addAttribute("persons", persons);
        model.addAttribute("plan", new Plan());
        return "PlanAddForm";
    }

    @RequestMapping(value = "/edit-plan/{id}")
    public String editPlan(Model model, @PathVariable long id) {
        List<Person> persons = planService.getAllPerson();
        model.addAttribute("persons", persons);
        Plan plan = planService.get(id);
        model.addAttribute("plan", plan);
        return "PlanEditForm";
    }

    @RequestMapping(value = "/save-plan")
    public String savePlan(@ModelAttribute Plan plan) {
    	List<Person> personList = planService.getPersonByName(plan.getPerson().getName());

    	Person person = new Person();
    	if(personList.size() > 0) {
    		person = personList.get(0);
    	}
    	plan.setPerson(person);
        planService.save(plan);
        logger.info("*** saving new plan... " + plan);
        return "redirect:/list-plans";
    }

    @RequestMapping(value = "/update-plan")
    public String updatePlan(@ModelAttribute Plan plan) {
        Person person = planService.getPersonById(plan.getPerson().getId());
        plan.setPerson(person);
        planService.update(plan);
        logger.info("=== updating editted plan... " + plan);
        return "redirect:/list-plans";
    }

    @RequestMapping(value = "/list-plans")
    public String listPlans(Model model) {
        logger.info("list-plans ... ");
        List<Plan> plans = planService.getAllPlans();
        model.addAttribute("plans", plans);
		return "PlanList";
    }
}
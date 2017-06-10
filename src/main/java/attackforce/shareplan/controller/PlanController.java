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

    @RequestMapping(value = "/plan/add")
    public String inputPlan(Model model) {
        List<Person> persons = planService.getAllPerson();
        model.addAttribute("persons", persons);
        model.addAttribute("plan", new Plan());
        return "plan/add";
    }
    @RequestMapping(value = "/plan/add_form")
    public String add_form(Model model) {
        List<Person> persons = planService.getAllPerson();
        model.addAttribute("persons", persons);
        model.addAttribute("plan", new Plan());
        return "plan/add_form";
    }

    @RequestMapping(value = "/plan/edit/{id}")
    public String editPlan(Model model, @PathVariable long id) {
        List<Person> persons = planService.getAllPerson();
        model.addAttribute("persons", persons);
        Plan plan = planService.get(id);
        model.addAttribute("plan", plan);
        return "plan/edit";
    }

    @RequestMapping(value = "/plan/save")
    public String savePlan(@ModelAttribute Plan plan) {
    	List<Person> personList = planService.getPersonByName(plan.getPerson().getName());

    	Person person = new Person();
    	if(personList.size() > 0) {
    		person = personList.get(0);
    	}
    	plan.setPerson(person);
        planService.save(plan);
        logger.info("*** saving new plan... " + plan);
        return "redirect:/plan/list";
    }

    @RequestMapping(value = "/plan/edit")
    public String updatePlan(@ModelAttribute Plan plan) {
        Person person = planService.getPersonById(plan.getPerson().getId());
        plan.setPerson(person);
        planService.update(plan);
        logger.info("=== updating editted plan... " + plan);
        return "redirect:/plan/list";
    }

    @RequestMapping(value = "/plan/list")
    public String listPlans(Model model) {
        logger.info("list-plans ... ");
        List<Plan> plans = planService.getAllPlans();
        model.addAttribute("plans", plans);
		return "plan/list";
    }
}
package attackforce.shareplan.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import attackforce.shareplan.domain.Person;
import attackforce.shareplan.service.PlanService;


@Controller
public class QueryForObjectController {

    @Autowired
    private PlanService planService;

    private static final Log logger = LogFactory.getLog(QueryForObjectController.class);

    @RequestMapping(value = "/getPersons")
    @ResponseBody
    public List<Person> inputPlan(Model model) {
        List<Person> persons = planService.getAllPerson();
        logger.info("get all persons: {}" + persons);
        return persons;
    }
}
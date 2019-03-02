package controllerpackage;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import beanpackage.Beanclas;
import repositrypackage.Repositry;
/**  repositrypackage. */
@EnableJpaRepositories("repositrypackage")
@EntityScan("beanpackage")
@RestController
public class ControllerClass {
/** Autowired. */
@Autowired
private Repositry rpt;
/** @return (List<Beanclas>) rpt.findAll() **this returns beanclass Details**.*/
@RequestMapping(value = "/company/getAll", method = RequestMethod.GET)
public List<Beanclas> getAll() {
return (List<Beanclas>) rpt.findAll();
}
}

package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beans")
public class Contr {
    @Autowired
    private ApplicationContext appContext;

    @RequestMapping
    public ResponseEntity getAllBeans() {
        return new ResponseEntity(appContext.getBeanDefinitionNames(), HttpStatus.OK);
    }
}

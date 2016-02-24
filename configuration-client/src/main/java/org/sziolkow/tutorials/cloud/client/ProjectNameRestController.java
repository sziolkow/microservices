package org.sziolkow.tutorials.cloud.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by slawomir.ziolkowski on 24.02.2016.
 */
@RestController
@RefreshScope
public class ProjectNameRestController {

    @Autowired
    private Environment environment;

    @RequestMapping("/project-name")
    String projectName() {
        String projectName = environment.getProperty("app.projectName");
        String port = environment.getProperty("app.port");

        return projectName + ":" + port;
    }
}

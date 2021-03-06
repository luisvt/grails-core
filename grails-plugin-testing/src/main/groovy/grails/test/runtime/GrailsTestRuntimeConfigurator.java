package grails.test.runtime;

import grails.core.GrailsApplication;
import org.grails.web.servlet.context.support.GrailsRuntimeConfigurator;
import grails.plugins.GrailsPluginManager;
import org.springframework.context.ApplicationContext;

public class GrailsTestRuntimeConfigurator extends GrailsRuntimeConfigurator {
    public GrailsTestRuntimeConfigurator(GrailsApplication application, ApplicationContext parent) {
        super(application, parent);
    }
    
    @Override
    protected void initializePluginManager() {
        if(parent.containsBean(GrailsPluginManager.BEAN_NAME)) {
            super.initializePluginManager();
        } else {
            this.pluginManager = new NoOpGrailsPluginManager();
        }
    }
}

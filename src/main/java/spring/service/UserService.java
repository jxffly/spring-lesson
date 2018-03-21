package spring.service;

import spring.model.common.User;

/**
 * Created by jinxiaofei on 16/4/13.
 */
public class UserService {
    private ResourceService resourceService;
    private TestService testService;
    private User user;

    public UserService(ResourceService resourceService, TestService testService, User user) {

        this.resourceService = resourceService;
        this.testService = testService;
        this.user = user;
    }


    public ResourceService getResourceService() {
        return resourceService;
    }


    public TestService getTestService() {
        return testService;
    }


    public User getUser() {
        return user;
    }


    public void sayHello() {
        System.out.println("hello spring");
    }


    public void setResourceService(ResourceService resourceService) {
        this.resourceService = resourceService;
    }


    public void setTestService(TestService testService) {
        this.testService = testService;
    }


    public void setUser(User user) {
        this.user = user;
    };
}

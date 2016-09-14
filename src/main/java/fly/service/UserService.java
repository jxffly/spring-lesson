package fly.service;

import fly.model.User;

/**
 * Created by jinxiaofei on 16/4/13.
 */
public class UserService {
    private ResourceService resourceService;
    private TestService testService;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService(ResourceService resourceService, TestService testService, User user) {

        this.resourceService = resourceService;
        this.testService = testService;
        this.user = user;
    }

    public ResourceService getResourceService() {
        return resourceService;
    }

    public void setResourceService(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    public TestService getTestService() {
        return testService;
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    public void sayHello(){
        System.out.println("hello spring");
    };
}

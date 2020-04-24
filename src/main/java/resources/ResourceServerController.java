package resources;

public class ResourceServerController implements ResourceServerControllerMBean {
    private final ResourceServerI resourceServer;

    public ResourceServerController(ResourceServerI resourceServer) {
        this.resourceServer = resourceServer;
    }
}

package resources;

public class ResourceServer implements ResourceServerI{
    private TestResource testResource;

    public ResourceServer(TestResource testResource) {
        this.testResource = testResource;
    }

    public ResourceServer() {
        testResource = new TestResource();
    }

    @Override
    public TestResource getTestResource() {
        return testResource;
    }

    @Override
    public void setTestResource(TestResource testResource) {
        this.testResource = testResource;
    }
}

package liveguru.stepDefinitions;

public class TestContext {
	//doi tuong duy nhat
	public DataContext dataContext;
	public TestContext() {
		dataContext =  new DataContext();
	}
	public DataContext getDataContext() {
		return dataContext;
	}
}

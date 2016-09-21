public class Test
{
  private int n = 2;
  public Test(int n)
  {
	this.n = n;
  }
  
  public void displayNumber()
  {
    System.out.println(n);
  }
  
  public void main(String[] args)
  {
    Test test = new Test(5);
    test.displayNumber();
  }
}
    

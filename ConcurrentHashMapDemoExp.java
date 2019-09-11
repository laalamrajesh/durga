import java.lang.*;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WriteThreasOne extends Thread 
{
	CommonClass cc=null;
	WriteThreasOne(CommonClass cc)
	{
		this.cc=cc;
	}
	@Override
	public void run()
	{
		System.out.println(this.getName());
		cc.commonMethod();
	}
}

class WriteThreasTwo extends Thread
{
	CommonClass cc = null;
	WriteThreasTwo(CommonClass cc)
	{
		this.cc=cc;
	}
	@Override
	public void run()
	{
		System.out.println(this.getName());
		cc.commonMethod();
	}
}  

class ConcurrentHashMapDemoExp 
{
      private final ConcurrentHashMap<Integer,String> conHashMap = new ConcurrentHashMap<Integer,String>();
     
	  public static void main(String[] args) 
	  {
			System.out.println("new");
			//ExecutorService  service = Executors.newFixedThreadPool(3);
			//ConcurrentHashMapDemoExp ob = new ConcurrentHashMapDemoExp();
			CommonClass cc = new CommonClass();
			WriteThreasOne wto = new WriteThreasOne(cc);
			wtt.setName("1st thread");
			wto.start();
			WriteThreasTwo wtt = new WriteThreasTwo(cc);
			wtt.setName("2nd thread");
			wtt.start();
	  }
	  
	  class CommonClass
	  {
	  		synchronized public void commonMethod()
	  		{
	  			System.out.println("1st state");
	  			System.out.println("2nd state");
	  			System.out.println("3rd state");
	  		}
	  }
	  
	  
	  
}

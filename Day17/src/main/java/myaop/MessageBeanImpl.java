package myaop;

public class MessageBeanImpl implements MessageBean{
	private String name;
	
	public void setName(String name){
		this.name=name;
	}
	
	public void sayHello(){
		//시간측정 시간(조인포인트)
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("안녕하세요. "+name+"님");
		//시간 종료(조인포인트)
	}
	

}

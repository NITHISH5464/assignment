package assignment9;

public class Sports {
	public void achiver(String name,int count) {
		System.out.println("SPORTSMAN NAME"+":"+name);
		System.out.println("MEDAL COUNT"+":"+count);	
	}
	public void achiver(String country,String sportsName,int rank) {
		System.out.println("country name"+":"+country);
		System.out.println("SPORTS NAME"+":"+sportsName);
		System.out.println("RANK"+":"+rank);
		
	}
	public void achiver(float weight,float height,long contact) {
		System.out.println("SPORTSMAN WEIGHT"+":"+weight);
		System.out.println("SPORTSMAN HEIGHT"+":"+height);
		System.out.println("NUMBER"+":"+contact);	
	}
	public void achiver(String tornament,long prize) {
		System.out.println("QURA TORNMENT"+":"+tornament);
		System.out.println("winning ammount"+":"+prize);
	}
	public static void main(String[] args) {
		Sports input=new Sports();
		input.achiver("NITHISH",2);
		//input.achiver(68.2, 6.20, 876543456787654l);
		input.achiver("international", 123456543213l);
		input.achiver("DUBAI MAIN","RUNNING", 1);
		
	}
	

}

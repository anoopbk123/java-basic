
public class Sample {
	public static void main(String args[]) {
		Samplethread s1=new Samplethread(1);
		Samplethread s2=new Samplethread(2);
		Samplethread s3=new Samplethread(3);
		Samplethread s4=new Samplethread(4);
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}
	

}

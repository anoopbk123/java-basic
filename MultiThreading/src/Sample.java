
public class Sample {
	public static void main(String args[]) {
		SampleThread s1=new SampleThread(1);
		SampleThread s2=new SampleThread(2);
		SampleThread s3=new SampleThread(3);
		SampleThread s4=new SampleThread(4);
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}

}

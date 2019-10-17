
public class StMain {

	public static void main(String[] args) {
		Student[] st=new Student[3];
		
		for(int i=0;i<3;i++){
			st[i]=new Student();
			st[i].input();
				
		}
		for(int l=0;l<3;l++){
			st[l].display();
		}
	     }
          }

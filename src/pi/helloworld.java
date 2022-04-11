package pi;

import java.util.ArrayList;
import java.util.List;

public class helloworld {
	public static void main(String[] args) {
		System.out.println("Hello world");
        Student st1 = new Student("Le Bao Phi",20,"Quang Tri");
        Student st2 = new Student("Nguyen Minh Vu",20,"Quang Tri");
        Student st3 = new Student("Le Thuy Trang",20,"Quang Tri");
        
        List<Student> sts = new ArrayList<Student>();
        sts.add(st1);
        sts.add(st2);
        sts.add(st3);
        
        for(Student st : sts) {
        	  System.out.println(st.toString());
        	}
        
	}
}

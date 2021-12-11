package backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import entity.Admin;
import entity.Employee;
import entity.User;

public class Exercise1 {
	User us1 = new Admin(1,"aaa", "aaa", "aaa", "123", 5);
	User us2 = new Employee(2,"bbb", "bbb", "bbb", "87673", "java");
	User us3 = new Admin(3,"ccc", "ccc", "ccc", "1c2c3c", 4);
	User us4 = new Employee(4,"ddd", "ddd", "ddd", "12ddd3", "dev");
	User us5 = new Employee(5,"eee", "eee", "eee", "12deedd3", "test");
	
	User[] users = {us1,us2,us3,us4,us5};
	List<User> userlist = new ArrayList<>(Arrays.asList(users));
	Scanner sc = new Scanner(System.in);
	public void question2() {
		for(User user:users) {
			System.out.println(user);
		}
	}
	public void question3() {
		System.out.println("nhập id cần tìm");
		int inid=sc.nextInt();
		for(User user:users) {
			if(user.getId()==inid) {
				System.out.println(user);
			}
		}
	}
	public void question4() {
		System.out.println("nhập id cần xoa");
		int in=sc.nextInt();
		for(int i=0; i<users.length;i++) {
			if(users[i].getId()==in) {
				userlist.remove(i);
				users = userlist.toArray(new User[0]);
				System.out.println(Arrays.toString(users));
			}
		}
	}
}

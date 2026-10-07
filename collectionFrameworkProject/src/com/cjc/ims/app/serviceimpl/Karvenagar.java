package com.cjc.ims.app.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cjc.ims.app.model.*;


public class Karvenagar implements Cjc {
	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
   //-------------Course------------------//
	@Override
	public void addCourse() {
		// TODO Auto-generated method stub
		Course c = new Course();
		System.out.println("Enter Course ID:");
		c.setCid(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Course Name:");
		c.setCname(sc.nextLine());
		clist.add(c);
		System.out.println(" Course Added Succesfully!!!!!");	
		
	}

	@Override
	public void viewCourse() {
		// TODO Auto-generated method stub
		Iterator<Course> itr = clist.iterator();
		  if(!itr.hasNext()) {
			  System.out.println("No Course Available");
			  return;
			  
		  }
		  System.out.println("/n-------COURSE LIST-------");
		  while (itr.hasNext()) {
			  Course c = itr.next();
			  System.out.println(c);
		  }
		
		
	}

	@Override
	public void addFaculty() {
		// TODO Auto-generated method stub
		Faculty f = new Faculty();
		System.out.println("Enter Faculty ID:");
		f.setFid(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Faculty name :");
		f.setFname(sc.nextLine());
		System.out.println("/n Available Courses:");
		Iterator<Course> itr = clist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Enter Course ID for Faculty:");
		  int cid = sc.nextInt();
		  Course selectedCourse = null;
		  Iterator<Course>itr2 = clist.iterator();
		  while(itr2.hasNext()){
			  Course c = itr2.next();
		  
		  
		  if(c.getCid()==cid) {
			  selectedCourse = c;
			 break;
		  }
		  }
		  
	
	      if(selectedCourse==null)	{
	    	  System.out.println("Course Not Found!");
	    	  return;
	}
	      f.setCourse(selectedCourse);
	      flist.add(f);
	      System.out.println("Faculty Added Successfully!!!!");

		  }
	
	@Override
	public void viewFaculty() {
		// TODO Auto-generated method stub
		Iterator<Faculty> itr = flist.iterator();
		if(!itr.hasNext()) {
			System.out.println("No Faculty Available!");
			return;
			
		}
		System.out.println("\n-------Faculty List---------");
		while (itr.hasNext()) {
		  Faculty f = itr.next();
		  System.out.println(f);
		}
		
	}

	@Override
	public void addBatch() {
		// TODO Auto-generated method stub
		Batch b = new Batch();
		System.out.println("Enter Batch ID:");
		b.setBid(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Batch Name:");
		b.setBname(sc.nextLine());
		System.out.println("\nAvailable Faculty:");
		Iterator<Faculty> itr= flist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		
			
		}
		System.out.println("\nEnter faculty ID For Batch:");
		int fid = sc.nextInt();
		Faculty selectedFaculty = null;
		Iterator<Faculty> itr2= flist.iterator();
		while (itr2.hasNext()) {
			Faculty f = itr2.next();
			if (f.getFid()==fid) {
				selectedFaculty =f;
				break;
			}
		}
		if (selectedFaculty == null) {
			System.out.println("Faculty not found!");
			 return;
			 
			
		}
		b.setFaculty(selectedFaculty);
		blist.add(b);
		System.out.println("Batch Added Successfully!!!");
		
		
	}

	@Override
	public void viewBatch() {
		// TODO Auto-generated method stub
		Iterator<Batch> itr = blist.iterator();
		if (!itr.hasNext()) {
			System.out.println("No Batch Available!!!");
			return;
		}
		System.out.println("\n-----BATCH LIST-----");
		while (itr.hasNext()) {
			Batch b = itr.next();
			System.out.println(b);
		}
		
	}

	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		Student s = new Student();

        System.out.print("Enter Student ID: ");
        s.setSid(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        s.setSname(sc.nextLine());

        System.out.println("\nAvailable Batches:");

        Iterator<Batch> itr = blist.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.print("\nEnter Batch ID for Student: ");
        int bid = sc.nextInt();

        Batch selectedBatch = null;

        Iterator<Batch> itr2 = blist.iterator();

        while (itr2.hasNext()) {

            Batch b = itr2.next();

            if (b.getBid() == bid) {
                selectedBatch = b;
                break;
            }
        }

        if (selectedBatch == null) {
            System.out.println("Batch Not Found!");
            return;
        }

        s.setBatch(selectedBatch);

        slist.add(s);

        System.out.println("Student Added Successfully!");
    }

    @Override
    public void viewStudent() {

        Iterator<Student> itr = slist.iterator();

        if (!itr.hasNext()) {
            System.out.println("No Student Available!");
            return;
        }

        System.out.println("\n----- STUDENT LIST -----");

        while (itr.hasNext()) {

            Student s = itr.next();

            System.out.println(s);
        }
		
	}

	
	

}

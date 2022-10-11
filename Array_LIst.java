import java.util.*;

class Arraylist
{

  //Object creation for Arraylist

  ArrayList < Integer > ar = new ArrayList < Integer > ();



  //to add the element to the Arraylist
  void add (int element)
  {


    ar.add (element);
    System.out.println ("Sucessfully added..");


  }

  //to get the speacific element in the Arraylist using index value
  void get (int element)
  {


    System.out.println (element + " th index of value is -> " +
			ar.get (element));


  }


  //to set the element in the Arraylist with index location position
  void set (int index, int element)
  {

    ar.set (index, element);


  }


  //remove an element in the Arraylist


  void remove (int index)
  {

    ar.remove (index);
    System.out.println ("Sucessfully Removed");

  }


  //to clear the entrie ArrayList

  void clear ()
  {

    ar.clear ();
    System.out.println ("ArrayList cleared...");

  }


  //to get the size of the ArrayList

  void size ()
  {

    System.out.println ("Size of ArrayList is :" + ar.size ());

  }


  //Display all the element in the ArrayList

  void Display ()
  {

    System.out.println (ar);


  }



}

public class Main
{
  public static void main (String[]args)
  {


    Arraylist ar = new Arraylist ();

    Scanner s = new Scanner (System.in);


    int ch;

    int element;
    int index;

    do
      {
	System.out.println ("----Arraylist Program----");
	System.out.println
	  ("1.add\n2.get\n3.set\n4.remove\n5.clear\n6.size\n7.Display\n");
	System.out.println ("Enter your choice:");

	ch = s.nextInt ();

	switch (ch)
	  {

	  case 1:

	    System.out.println ("Add element to Arraylist");

	    System.out.println ("Enter the element:");
	    element = s.nextInt ();

	    ar.add (element);

	    break;


	    case 2:System.out.println ("Get the element in Arraylist");

	    System.out.println ("Enter the index value:");
	    element = s.nextInt ();

	    ar.get (element);


	    break;

	    case 3:System.out.println ("Set the element  Arraylist");

	    System.out.println ("Enter the index value:");
	    index = s.nextInt ();

	    System.out.println ("Enter the element:");
	    element = s.nextInt ();

	    ar.set (index, element);



	    break;

	    case 4:System.out.println ("Remove element in the Arraylist");

	    System.out.println ("Enter the index value:");
	    index = s.nextInt ();

	    ar.remove (index);

	    break;

	    case 5:System.out.println ("clear the Arraylist");

	    ar.clear ();

	    break;

	    case 6:System.out.println ("size of Arraylist");

	    ar.size ();

	    break;

	    case 7:System.out.println ("Display");

	    ar.Display ();
	    break;


	  }



      }
    while (ch > 0 && ch <= 7);





  }
}


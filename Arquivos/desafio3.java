import java.util.ArrayList;
public class Main
{
  public static void main (String[]args)
  {

    String palavra = "ovo";
      ArrayList < String > ana = new ArrayList < String > ();

    for (int i = 0; i < palavra.length (); i++)
      {
	for (int j = 1; j < palavra.length (); j++)
	  {
	    if (palavra.charAt (i) == palavra.charAt (j) && i != j && i < j)
	      {
		if (palavra.charAt (i) == palavra.charAt (i + 1))
		  {
		    String z = palavra.substring (i, i + 1);
		      ana.add (z);
		  }
		else
		  {
		    String x = palavra.substring (i, j);
		    String a = palavra.substring (i + 1, j + 1);
		    String b = palavra.substring (i, i + 1);
		    ana.add (b);
		    ana.add (x);
		    ana.add (a);
		  }
	      }
	  }
      }

    System.out.println (ana.size ());
  }
}


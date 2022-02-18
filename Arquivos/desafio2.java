import java.util.Scanner;

public class Main
{

  public static void main (String[]args)
  {

    System.out.print ("Digite sua senha: ");
    Scanner scanner = new Scanner (System.in);
    String password = scanner.next ();

    int var_digito = 0;
    int var_min = 0;
    int var_max = 0;
    int var_especial = 0;

    if (password.length () < 6)
      {
	int minDigito = 6 - password.length ();
	  System.out.printf ("Adicione mais %d caracteres.\n", minDigito);
      }

    for (int i = 0; i < password.length (); i++)
      {
	char c = password.charAt (i);
	if (Character.isUpperCase (c))
	  {
	    var_max += 1;
	  }
	else if (Character.isLowerCase (c))
	  {
	    var_min += 1;
	  }
	else if (Character.isDigit (c))
	  {
	    var_digito += 1;
	  }
	else if (password.contains ("!") || password.contains ("@")
		 || password.contains ("#") || password.contains ("$")
		 || password.contains ("%") || password.contains ("^")
		 || password.contains ("&") || password.contains ("*")
		 || password.contains ("(") || password.contains (")")
		 || password.contains ("-") || password.contains ("+"))
	  {
	    var_especial += 1;
	  }

      }

    if (var_max == 0 || var_min == 0 || var_digito == 0 || var_especial == 0)
      {
	System.out.println
	  ("Sua senha ainda nC#o C) segura! \nC	 necessC!rio conter 6 caracteres entre:\n - Letras MaiC:sculas e MinC:sculas\n - NC:meros e Caracteres Especiais !@#$%^&*()-+ ");
      }
    else
      {
	System.out.println ("Sua senha estC! segura!");
      }

    scanner.close ();
  }
}


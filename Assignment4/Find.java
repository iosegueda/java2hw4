//Iris Osegueda
import java.io.*;

public class Find
{
	public static void main(String[] args)
    {
		String findWord = args[0];
		String line; // = reader.readLine(); 
		String fileName; // = args[i] then later declare the i
		BufferedReader reader;
		BufferedWriter writer; 
		
		if (args.length < 2 )
        {
            System.out.println( "Inappropriate number of input arguments." );
            System.exit( 0 );
        }

        try 
		{
			
			for (int i = 1; i < args.length; i++)
			{
				fileName = args[i];
				reader = new BufferedReader( new FileReader( fileName ) );
				line = reader.readLine();
				
				while ( line != null )
				{
					if ( line.contains(findWord) ) 
					{
						System.out.println( fileName + ": " + line );
					}
					line = reader.readLine();
				}
				reader.close();
			}
			
		}
		catch ( IOException ioe )
        {
            System.out.println( "Cannot Open File" );
        }
        catch ( Exception e )
        {
            e.printStackTrace();
        }
	}
}	
//Iris Osegueda
import java.io.*;

public class CatFiles
{
	public static void main(String[] args)
    {
		String inFile, line; 
		String lastFile = args[ args.length - 1 ]; 
		BufferedReader reader;
		
		if (args.length <= 2 )
        {
            System.out.println( "Inappropriate number of input arguments." );
            System.exit( 0 );
        }

        try
        {
			BufferedWriter writer = new BufferedWriter( new FileWriter( lastFile ) );
			writer.close();
			writer = new BufferedWriter( new FileWriter( lastFile, true ) );
			
			for ( int i = 0; i < ( args.length - 1 ); i++ )
			{
				inFile = args[i];
				reader = new BufferedReader( new FileReader( inFile ) );
				line = reader.readLine();
			
				while ( line != null )
				{
					writer.write( line );
					writer.newLine();
					line = reader.readLine();
				}
				reader.close();
				System.out.println( "A file has been copied" ); 
			}
			writer.close();
			System.out.println( "All files have been copied" ); 
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
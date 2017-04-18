//Iris Osegueda
import java.io.*;

public class CopyFile
{
	public static void main ( String[] arg )
	{
		if ( arg.length != 2 )
		{
			System.out.println( "Usage: java CopyFile <infile> <outfile>" );
            System.exit( 0 );
		}
	
	
		String inFile = arg[ 0 ];
		String outFile = arg[ 1 ];
		
		try 
		{
			
			BufferedReader reader = new BufferedReader( new FileReader( inFile ) );
			BufferedWriter writer = new BufferedWriter( new FileWriter( outFile ) );

			String line = reader.readLine();
			writer.close();
			writer = new BufferedWriter( new FileWriter( outFile, true ) );
			
			while ( line != null )  
			{
				writer.write( line );
				writer.newLine();
				line = reader.readLine();
			}
			reader.close();
			writer.close();
			System.out.println( "File has been copied" ); 
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
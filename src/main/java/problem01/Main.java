package problem01;

import com.sun.xml.internal.ws.util.StringUtils;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		
	    String str = String.valueOf(number);
	    char[] c = str.toCharArray(); // converting to a char array
	    int cnt = 0;

	    for(int i = 0; i< c.length;i++) {
	        if(c[i]=='3') // looking for 'a' only
	            cnt++;
	        if(c[i]=='6')
        	    cnt++;
	        if(c[i]=='9')
        	    cnt++;
  
	    }
		return cnt;
	}
}
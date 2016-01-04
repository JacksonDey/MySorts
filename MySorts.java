public class MySorts{
    
    //HELPER FUNCTIONS
    
    public static ArrayList populate( int size, int lo, int hi ) 
    {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }
     public static void shuffle( ArrayList al ) 
    {
	int randomIndex;
	//setup for traversal fr right to left
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }

    /*===================BUBBLE=================*/
      public static void bubbleSortV( ArrayList<Comparable> data ) {
    	int size = data.size() - 1;
    	for(int r = size ; 0 <  r; r--){//just to ensure its sorted
    	
	    	for(int e = size ; 0 <  e; e--){
	    		if(data.get(e).compareTo(data.get(e - 1)) < 0){
	    			Comparable old = data.get(e);
	    			data.set(e, data.get(e - 1));
	    			data.set(e - 1, old);
	    			System.out.println(data);
	    			
	    		}//end if
    		
    		}//end for loop
    		
    	}//end for loop
    	
    	

    }//end bubbleSortV -- O(?)


    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
    {
    	bubbleSortV(input);
    	return input;//for compiling 
    }//end bubbleSort -- O(?)


     /*===================SELECTION=================*/
    public static void selectionSortV( ArrayList<Comparable> data ) {
	//note: this version places greatest value at rightmost end,

	//maxPos will point to position of SELECTION (greatest value)
	int maxPos;

	for( int pass = data.size()-1; pass > 0; pass-- ) {
	    System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
	    maxPos = 0;
	    for( int i = 1; i <= pass; i++ ) {
		System.out.println( "maxPos: " + maxPos );//diag
		System.out.println( data );//diag
		if ( data.get(i).compareTo( data.get(maxPos) ) > 0 )
		    maxPos = i;
	    }
	    data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
	    System.out.println( "after swap: " +  data );//diag
	}
    }//end selectionSort -- worst and best case are O(n*n)

    public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input ) {
	//declare and initialize empty ArrayList for copying
	ArrayList<Comparable> data = new ArrayList<Comparable>();

	//copy input ArrayList into working ArrayList
	for( Comparable o : input )
	    data.add( o );

	//sort working ArrayList
	selectionSortV( data );

	return data;
    }//end selectionSort -- O(n*n)

    
    /*===================BOGO=================*/
    
    public static boolean isSorted( ArrayList<Comparable> al){
        boolean retBool = true;
        
        for(int a = 0; a < al.size() -1; a++ ){
            if(al.get(a).compareTo(al.get( a + 1)) > 0){
                retBool = false;
            }
        }
        return retBool;
    }
    public static ArrayList bogo( ArrayList<Comparable> data){
        while(!(isSorted(data))){
            shuffle(data);
        }
        return data;
    }



}//end class

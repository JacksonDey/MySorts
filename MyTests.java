public class MyTests{
    public static void main( String [] args ) {

	
	  ArrayList glen = new ArrayList<Integer>();
	  glen.add(7);
	  glen.add(1);
	  glen.add(5);
	  glen.add(12);
	  glen.add(3);
	  
	  //BOGO
	  System.out.println( "ArrayList glen before bogo sorting:\n" + glen );
	  MySorts.bogo(glen);
	  System.out.println( "ArrayList glen after sorting:\n" + glen );
	  
	  //SELECTION
	  System.out.println( "ArrayList glen before selection sorting:\n" + glen );\
	  MySorts.selectionSort(glen);
	  System.out.println( "ArrayList glen after sorting:\n" + glen );
	  
	  //BUBBLE
	  System.out.println( "ArrayList glen before bubble sorting:\n" + glen );\
	  MySorts.bubbleSort(glen);
	  System.out.println( "ArrayList glen after sorting:\n" + glen );
	  


	  ArrayList coco = MySorts.populate( 10, 1, 1000 );
	  
	  //BOGO
	  System.out.println( "ArrayList coco before bogo sorting:\n" + coco );
	  ArrayList cocoSorted = MySorts.bogo( coco );
	  System.out.println( "Sorted version of ArrayList coco:\n" 
	  + cocoSorted );

	  //SELECTION
	  System.out.println( "ArrayList coco before selection sorting:\n" + coco );
	  ArrayList cocoSorted = MySorts.selectionSort( coco );
	  System.out.println( "Sorted version of ArrayList coco:\n" 
	  + cocoSorted );

	  //BUBBLE
	  System.out.println( "ArrayList coco before bubble  sorting:\n" + coco );
	  ArrayList cocoSorted = MySorts.bubbleSort( coco );
	  System.out.println( "Sorted version of ArrayList coco:\n" 
	  + cocoSorted );

	  
	  
	 
	 

    }//end main


}//end class

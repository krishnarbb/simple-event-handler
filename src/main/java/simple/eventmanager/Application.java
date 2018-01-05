package simple.eventmanager;


public class Application {

    public static void main( String [] args ) {
        EventManager eventManager = new EventManager();
        EventListener  aEventListener   = new AEventListener();
        EventListener  bEventListener = new BEventListener();
        eventManager.addMoodListener( aEventListener );
        eventManager.addMoodListener( bEventListener );
        
        EventGenerator eventGenerator = new EventGenerator(eventManager);
        
        
        System.out.println( "Let's send ANNOYED event and find out what happens:" );
        eventGenerator.receivePinch();
        
        System.out.println("");
        System.out.println( "Let's send HAPPY event and find out what happens:" );
        eventGenerator.receiveHug();
        
    }
    
}

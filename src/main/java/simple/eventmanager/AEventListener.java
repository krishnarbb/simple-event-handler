package simple.eventmanager;

public class AEventListener implements EventListener {

    public void eventReceived(SomeEvent event) {
        if( event.eventArguments() == EventArguments.HAPPY )
        {
            System.out.println( "A received HAPPY" );
        }
        else if( event.eventArguments() == EventArguments.ANNOYED )
        {
            System.out.println( "A received ANNOYED " );
        }
        else
        {
            System.out.println( "A does not undertstand the event received" );
        }
    }
    
}

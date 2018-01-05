package simple.eventmanager;

public class BEventListener implements EventListener {

    public void eventReceived(SomeEvent event) {
        if( event.eventArguments() == EventArguments.HAPPY )
        {
            System.out.println( "B received HAPPY" );
        }
        else if( event.eventArguments() == EventArguments.ANNOYED )
        {
            System.out.println( "B received ANNOYED" );
        }
        else
        {
            System.out.println( "B does not understand the event" );
        }
    }
    
}

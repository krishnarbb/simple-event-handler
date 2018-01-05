package simple.eventmanager;

public class EventArguments {

    public static final EventArguments HAPPY   = new EventArguments( "happy" );
    public static final EventArguments ANNOYED = new EventArguments( "annoyed" );
    public static final EventArguments ANGRY   = new EventArguments( "angry" );
    
    private String _mood;
    
    public String toString() {
        return _mood;
    }
    
    private EventArguments( String mood ) {
        _mood = mood;
    }
    
}

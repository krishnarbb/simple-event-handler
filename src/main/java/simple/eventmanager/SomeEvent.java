package simple.eventmanager;

import java.util.EventObject;
//https://www.javaworld.com/article/2077333/core-java/mr-happy-object-teaches-custom-events.html
// should be immutable
public class SomeEvent extends EventObject {

    private EventArguments eventArguments;
    
    public SomeEvent( Object source, EventArguments mood ) {
        super( source );
        eventArguments = mood;
    }

    public EventArguments eventArguments() {
        return eventArguments;
    }
    
}

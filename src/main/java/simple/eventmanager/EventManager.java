package simple.eventmanager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EventManager {

    private List _listeners = new ArrayList();
    
    public synchronized void addMoodListener( EventListener l ) {
        _listeners.add( l );
    }
    
    public synchronized void removeMoodListener( EventListener l ) {
        _listeners.remove( l );
    }
    
    public synchronized void fireEvent(SomeEvent event) {
        Iterator listeners = _listeners.iterator();
        while( listeners.hasNext() ) {
            ( (EventListener) listeners.next() ).eventReceived( event );
        }
    }
}

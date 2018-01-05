package simple.eventmanager;

public class EventGenerator {
	
	EventManager eventManager;
	
	public EventGenerator(EventManager eventManager) {
		this.eventManager = eventManager;
	}
	
	public synchronized void receivePinch() {
		SomeEvent event = new SomeEvent( this, EventArguments.ANNOYED );
		eventManager.fireEvent(event);
    }

    public synchronized void receiveHug() {
    	SomeEvent event = new SomeEvent( this, EventArguments.HAPPY );
    	eventManager.fireEvent(event);
    }
}

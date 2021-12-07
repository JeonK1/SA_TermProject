package Pipe_Filter;

public class NotificationControlModule {
	
	private FilterManager FacilityManager;
	private FilterManager VisitorManager;
	private FilterRunner FacilityR;
	private FilterRunner VisitorR;
	
	public NotificationControlModule() {
		// Filter�� �ִٸ�
		this.FacilityManager = new FilterManager(new Target());
		FacilityManager.setFilter(new PriorityFilter());
		FacilityManager.setFilter(new MessagePackFilter());
		this.FacilityR = new FilterRunner();
		FacilityR.setFilterManager (FacilityManager);
		  
		   
		this.VisitorManager = new FilterManager(new Target());
		VisitorManager.setFilter(new DecryptFilter());
		VisitorManager.setFilter(new PriorityFilter());
		VisitorManager.setFilter(new MessagePackFilter());
		this.VisitorR = new FilterRunner();
		VisitorR.setFilterManager(VisitorManager);

    }
	// Priority Filter�� Facility ArrayList�� �ް� �̿� ���� priority ��� �� ���� �� return
	// 

    public void sendMessage(HMessage message) {
        // TODO implement here
		
		this.FacilityR.sendRequest (message.getFacilities()); // ���ڷ� message�� Facility ArrayList�� �ѱ� �� 	
		
		this.VisitorR.sendRequest(message.getVisitors()); // ���ڷ� message�� Visitor(String) ArrayList�� �ѱ� ��
    	  	
    }
}

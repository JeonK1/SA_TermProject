package Pipe_Filter;
import java.util.ArrayList;
import java.util.List;
public class InterceptingFilterDemo {
	// Notification Control Module
	
	// sendMessage
   public static void main (String [] args) {
	  // FilterManager : �� ���͸� �����ϴ� FilterChain�� ����
	  // FilterChain : ���� ���͵��� ������ �ְ�, �̿� ���� method�� ����ϴ� class
	  // Target : ���޹��� �޽��� ���� ���� class
	  // setFilter = addfilter sequential
//      FilterManager filterManager = new FilterManager (new Target());
//      filterManager.setFilter (new AuthenticationFilter ());
//      filterManager.setFilter (new DebugFilter ());
      
      // ���� ���
      // FilterManager filterManager = new FilterManager (new Target());
      // Target -> ��ȯ�� �޽����� �ް�, �̸� ���������� ����ϱ� ���ؼ� ����ϴ� �Լ��� ���� Class
      
      // filterManager.setFilter (new AuthenticationFilter ());
      // filterManager.setFilter (new DebugFilter ());
	   
      // 1. Filter �̸� ���� 2. Message(ArrayList of Facility, ArrayList of Visitor(Encrpyted to String))
      // 
      // FilterManager1 : Facility ArrayList -> reordered by priority Facility ArrayList
      // -> Message Packing(each of Facility -> (Facility + Message)) -> ArrayList of Packed Message
      // 
      // FilterManager2 : Visitor(Encrypted by String) ArrayList -> Decrypted Visitor ArrayLIst
	  // -> reordered by priority Visitor ArrayList
      // -> Message Packing(each of Visitor -> (Visitor + Message)) -> ArrayList of Packed Message
      
      // Target Use Packed Message ArrayList just print

      // Client : �ش� Filter���� ����� Class : Notification Module ������ ���� Filter �̿� Class
//      Client client = new Client ();
//      client.setFilterManager (filterManager);
//      client.sendRequest ("HOME");
      
      // Client -> Facility Filtering and Visitor Filtering
	   
	   // Target is print Packed Message List
	   
//	   FilterManager FacilityManager = new FilterManager(new Target());
//	   FacilityManager.setFilter(new PriorityFilter());
//	   FacilityManager.setFilter(new MessagePackFilter());
//	   
//	   FilterRunner Facility = new FilterRunner();
//	   Facility.setFilterManager (FacilityManager);
//	   Facility.sendRequest ("Facility ArrayList");
//	   
//	   FilterManager VisitorManager = new FilterManager(new Target());
//	   VisitorManager.setFilter(new DecryptFilter());
//	   VisitorManager.setFilter(new PriorityFilter());
//	   VisitorManager.setFilter(new MessagePackFilter());
//	   
//	   FilterRunner Visitor = new FilterRunner();
//	   Visitor.setFilterManager(VisitorManager);
//	   Visitor.sendRequest ("Visitor ArrayList");	   
	   NotificationControlModule nofi = new NotificationControlModule();
	   // sample

	   List<Facility> fs = new ArrayList<Facility>();	   
	   fs.add(new Facility((long) 1,"name1", "address1", "contact1"));
	   fs.add(new Facility((long) 4,"name4", "address4", "contact4"));
	   fs.add(new Facility((long) 2,"name2", "address2", "contact2"));
	   fs.add(new Facility((long) 3,"name3", "address3", "contact3"));
	   List<String> vs = new ArrayList<String>();
	   vs.add("1,name1,1,address1,contact1,UNVACCINATED");
	   vs.add("3,name3,3,address3,contact3,FIRST_VACCINATION_COMPLETED");
	   vs.add("4,name4,4,address4,contact4,UNVACCINATED");
	   vs.add("2,name2,2,address2,contact2,SECOND_VACCINATION_COMPLETED");
	   HMessage hm = new HMessage(fs, vs);
	   nofi.sendMessage(hm);
   }
}
public class VisitControlSystem {
    public static void main(String[] args) {
//        시설, 고객 데이터
//        Facility f1 = new Facility("cafe1", "서울", "1234");
//        Facility f2 = new Facility("cafe2", "제주", "5678");
//        Facility f3 = new Facility("cafe3", "강릉", "3456");
//        Visitor v1 = new Visitor("minjeong", 24, "제주", "010-1111-1111", Vaccination.UNVACCINATED);
//        Visitor v2 = new Visitor("kyewon", 25, "서울", "010-2222-2222", Vaccination.FIRST_VACCINATION_COMPLETED);
//        Visitor v3 = new Visitor("changseok", 26, "부산", "010-3333-3333", Vaccination.SECOND_VACCINATION_COMPLETED);
//        Visitor v4 = new Visitor("honggildong", 27, "경기", "010-4444-4444", Vaccination.SECOND_VACCINATION_COMPLETED);
//
//        ManagementServer managementServer = new ManagementServer();
//        ServerConnector serverConnector = new ServerConnector();
//        serverConnector.connectServer(managementServer);
//
//        VisitlistControlModule visitlistControlModule = new VisitlistControlModule(serverConnector);
//        SearchProcessModule searchProcessModule = new SearchProcessModule(serverConnector);
//
//        FHandler fHandler = new FHandler(visitlistControlModule);
//        CHandler cHandler = new CHandler(visitlistControlModule);
//        HHandler hHandler = new HHandler(searchProcessModule);
//
//        fHandler.createVisitlist(f1);
//        cHandler.addVisitorInfo(f1, v1, "20211001");
//        cHandler.addVisitorInfo(f1, v2, "20211002");
//        cHandler.addVisitorInfo(f1, v3, "20211003");
//
//        fHandler.createVisitlist(f2);
//        cHandler.addVisitorInfo(f2, v1, "20211101");
//        cHandler.addVisitorInfo(f2, v2, "20211102");
//        cHandler.addVisitorInfo(f2, v3, "20211103");
//
//        fHandler.createVisitlist(f3);
//        cHandler.addVisitorInfo(f3, v1, "20211201");
//        cHandler.addVisitorInfo(f3, v2, "20211202");
//        cHandler.addVisitorInfo(f3, v3, "20211203");

//        명부 개설, 방문기록 추가 테스트
//        cHandler.printVisitorsOf(f1);
//        cHandler.printVisitorsOf(f2);
//        cHandler.printVisitorsOf(f3);

//        searchFacilityList 테스트
//        ArrayList<Facility> facilityList = hHandler.searchFacilityList(v3, "20210901", "20211130");
//        if (facilityList.isEmpty()) {
//            System.out.println("해당하는 시설 없음");
//        } else {
//            for (Facility facility : facilityList) {
//                System.out.println(facility.getFname());
//            }
//        }

//        searchVisitorList 테스트
//        ArrayList<Visitor> visitorList = hHandler.searchVisitorList(f1, "20211001", "20211002");
//        if (visitorList.isEmpty()) {
//            System.out.println("해당하는 방문객 없음");
//        } else {
//            for (Visitor visitor : visitorList) {
//                System.out.println(visitor.getVname());
//            }
//        }
    }
}
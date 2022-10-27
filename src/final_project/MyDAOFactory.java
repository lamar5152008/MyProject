package final_project;

public class MyDAOFactory {
    private static final String DAO_SOURCE = "CSV";

    public static MyDAO getMyDAO(){
        MyDAO dao = null;
        switch(DAO_SOURCE) {
            case "CSV":
            dao = new MyDAO_CSV();
            break;
            case "XML":
            break;
            case "MySQL":
                break;


        }

        return dao;
    }
}

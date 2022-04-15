package Test.src;

public abstract class DaoFactory {

    static {
        try {
            System.out.println("Loading driver...");
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded.");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver loading failed");
            e.printStackTrace();
        }
    }

    private static ManagerDao managerDao;


    public static CrudDao<?> autowired(String qualifier, String scope) {
        if (!scope.equals("singleton") && !scope.equals("prototype")) {
            throw new RuntimeException("Invalid scope of bean " + scope);
        }
        if ("ManagerDao".equals(qualifier)) {
            return getManagerDaoSQL(scope);
        }
        throw new RuntimeException("Can not find bean for autowiring: " + qualifier);
    }
    private static ManagerDao getManagerDaoSQL (String scope) {
            if (scope.equals("prototype")) {
                return (ManagerDao) new ManagerDaoImpl();
            }
            if (managerDao == null) {
                managerDao = (ManagerDao) new ManagerDaoImpl();
            }
            return (ManagerDao) managerDao;
        }
    }


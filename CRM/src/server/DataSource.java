package server;



public class DataSource {

    public DataSource dataSource(){
        DriverManagerDataSource dm = new DriverManagerDataSource();
        dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dm.setUsername("Vadim");
        dm.setPassword("786512");
        dm.setUrl("jdbc:mysql://localhost:3306/users_base_chat?serverTimezone=Europe/Moscow");
        return dm;
    }
}

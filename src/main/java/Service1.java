import java.util.Map;

public class Service1 {

  private final Dao1 dao;

  public Service1(Dao1 dao) {
    this.dao = dao;
  }

  public Map<String, String> doStuff() {
    return dao.fetchData("Stuff");
  }
}

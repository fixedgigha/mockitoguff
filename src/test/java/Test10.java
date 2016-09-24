import java.util.Map;
import java.util.HashMap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class Test10 {

  @Test
  public void test1() {
    Dao1 dao = mock(Dao1.class);
    Service1 service = new Service1(dao);

    Map<String, String> data = new HashMap<>();
    data.put("Hello", "World");

    when(dao.fetchData("Stuff")).thenReturn(data);

    Map<String, String> result = service.doStuff();

    assertEquals(data, result);
  }
}

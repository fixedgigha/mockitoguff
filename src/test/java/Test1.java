import java.util.Map;
import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Test1 {

  @Mock
  Dao1 dao;

  @InjectMocks
  Service1 service;

  @Test
  public void test1() {
    Map<String, String> data = new HashMap<>();
    data.put("Hello", "World");

    when(dao.fetchData("Stuff")).thenReturn(data);

    Map<String, String> result = service.doStuff();

    assertEquals(data, result);
  }
}

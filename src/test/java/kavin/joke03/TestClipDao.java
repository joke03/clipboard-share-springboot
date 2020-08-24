package kavin.joke03;

import kavin.joke03.dao.ClipDao;
import kavin.joke03.entity.ClipItems;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AppRun.class})
public class TestClipDao {

    @Autowired
    ClipDao clipDao;

    @Test
    public void test1(){
        List<ClipItems> list = clipDao.findAll();
//        System.out.println(list);
        for (ClipItems items:list){
            System.out.println(items);
        }
    }

    @Test
    public void test2(){
        List<ClipItems> list = clipDao.findById(2);
        System.out.println(list);
    }

    @Test
    public void test3(){
        boolean result = clipDao.deleteById(3);
        System.out.println(result);
    }

    @Test
    public void test4(){
        ClipItems item = new ClipItems();
        item.setItem_content("insert general key of id");
        boolean result = clipDao.saveClipItem(item);
        System.out.println(result);
    }

}

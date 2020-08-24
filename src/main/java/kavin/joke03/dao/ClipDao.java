package kavin.joke03.dao;

import kavin.joke03.entity.ClipItems;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ClipDao {

    List<ClipItems> findAll();
    List<ClipItems> findById(int id);
    boolean deleteById(int id);
    boolean saveClipItem(ClipItems items);

}

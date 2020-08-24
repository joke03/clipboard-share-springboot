package kavin.joke03.service;

import kavin.joke03.entity.ClipItems;

import java.util.List;

public interface ClipService {

    //query
    public List<ClipItems> findAll();
    public List<ClipItems> findById(int id);

    //delete
    public boolean deleteById(int id);

    //save
    public boolean saveClipItems(ClipItems items);

}

package kavin.joke03.service.impl;

import kavin.joke03.dao.ClipDao;
import kavin.joke03.entity.ClipItems;
import kavin.joke03.service.ClipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClipServiceImpl implements ClipService {

    @Autowired
    ClipDao clipDao;

    @Override
    public List<ClipItems> findAll() {
        return clipDao.findAll();
    }

    @Override
    public List<ClipItems> findById(int id) {
        return clipDao.findById(id);
    }

    @Override
    public boolean deleteById(int id) {
        return clipDao.deleteById(id);
    }

    @Override
    public boolean saveClipItems(ClipItems items) {
        return clipDao.saveClipItem(items);
    }
}

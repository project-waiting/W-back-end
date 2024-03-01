package waiting.dao;

import waiting.vo.Store;

import java.util.List;

public interface StoreDao {

    void insert(Store store);

    List<Store> findbyId();
    List<Store> findAll();

    int update(Store store);

    int delete(Store store);
}

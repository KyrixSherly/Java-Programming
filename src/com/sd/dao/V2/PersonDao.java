package com.sd.dao.V2;

import java.util.List;

public interface PersonDao {
    public void insert(PersonV0 p);
    public List<PersonV0> findAll();
    public PersonV0 findById(int id);
    public void update(PersonV0 p);
    public void delete(int id);
}
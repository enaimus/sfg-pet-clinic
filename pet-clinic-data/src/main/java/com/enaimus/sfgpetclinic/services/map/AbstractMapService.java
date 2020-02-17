package com.enaimus.sfgpetclinic.services.map;

import com.enaimus.sfgpetclinic.models.BaseEntity;

import java.util.*;

public abstract class AbstractMapService <T extends BaseEntity, ID extends Long>{

    protected Map<Long ,T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());

    }

    T findById(ID id){
        return map.get(id);
    }

    T save (ID id, T object){
        if(object != null){
            if (object.getId()==null){
            object.setId(getNextId());
        }
        map.put(id, object);
        }
        return object;
    }

    void removeById(ID id){
        map.remove(id);
    }

    void remove(T object) {
        map.entrySet().removeIf(x -> x.equals(object));
    }

    private Long getNextId(){
        return Collections.max(map.keySet()) + 1;
    }

}

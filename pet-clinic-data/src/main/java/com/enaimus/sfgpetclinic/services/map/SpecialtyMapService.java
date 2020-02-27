package com.enaimus.sfgpetclinic.services.map;

import com.enaimus.sfgpetclinic.models.Specialty;
import com.enaimus.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Specialty object) {
        super.remove(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.removeById(aLong);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}

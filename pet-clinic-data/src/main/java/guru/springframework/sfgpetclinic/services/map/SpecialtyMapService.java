package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyMapService extends AbstractMapService<guru.springframework.sfgpetclinic.model.Specialty, Long> implements SpecialtyService {
    @Override
    public Set<guru.springframework.sfgpetclinic.model.Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(guru.springframework.sfgpetclinic.model.Specialty object) {
        super.delete(object);
    }

    @Override
    public guru.springframework.sfgpetclinic.model.Specialty save(guru.springframework.sfgpetclinic.model.Specialty object) {
        return super.save(object);
    }

    @Override
    public guru.springframework.sfgpetclinic.model.Specialty findById(Long id) {
        return super.findById(id);
    }
}

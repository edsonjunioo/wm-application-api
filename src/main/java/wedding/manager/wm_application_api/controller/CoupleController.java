package wedding.manager.wm_application_api.controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wedding.manager.wm_application_api.couple.Couple;
import wedding.manager.wm_application_api.couple.CoupleData;
import wedding.manager.wm_application_api.couple.CoupleDataResponse;
import wedding.manager.wm_application_api.couple.CoupleRepository;
import wedding.manager.wm_application_api.couple.CoupleUpdateData;

@RestController
@RequestMapping("couple")
public class CoupleController {

    CoupleRepository coupleRepository;

    @Autowired
    public CoupleController(CoupleRepository coupleRepository) {
        this.coupleRepository = coupleRepository;
    }

    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid CoupleData coupleData){
        coupleRepository.save(new Couple(coupleData));
    }

    @GetMapping
    public Page<CoupleDataResponse> list(@PageableDefault(size = 10, sort = {"fianceName"}) Pageable pageable) {
        return coupleRepository.findAllByActiveTrue(pageable).map(CoupleDataResponse::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid CoupleUpdateData coupleUpdateData){
        var couple = coupleRepository.getReferenceById(coupleUpdateData.id());
        couple.updateinfo(coupleUpdateData);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteCouple(@PathVariable Long id){
        var couple = coupleRepository.getReferenceById(id);
        couple.deleteLogical();
    }

}

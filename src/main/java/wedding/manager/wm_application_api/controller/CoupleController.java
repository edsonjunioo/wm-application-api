package wedding.manager.wm_application_api.controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wedding.manager.wm_application_api.couple.Couple;
import wedding.manager.wm_application_api.couple.CoupleData;
import wedding.manager.wm_application_api.couple.CoupleRepository;

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

}

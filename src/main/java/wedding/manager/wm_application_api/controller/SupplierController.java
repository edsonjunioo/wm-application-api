package wedding.manager.wm_application_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wedding.manager.wm_application_api.supplier.Supplier;
import wedding.manager.wm_application_api.supplier.SupplierData;
import wedding.manager.wm_application_api.supplier.SupplierRepository;

@RestController
@RequestMapping("supplier")
public class SupplierController {

    private SupplierRepository supplierRepository;

    @Autowired
    public SupplierController(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @PostMapping
    @Transactional
    public void create(@RequestBody SupplierData supplierData){
        supplierRepository.save(new Supplier(supplierData));
    }



}

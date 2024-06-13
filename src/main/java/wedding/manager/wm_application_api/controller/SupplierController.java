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
import wedding.manager.wm_application_api.supplier.Supplier;
import wedding.manager.wm_application_api.supplier.SupplierData;
import wedding.manager.wm_application_api.supplier.SupplierDataResponse;
import wedding.manager.wm_application_api.supplier.SupplierRepository;
import wedding.manager.wm_application_api.supplier.SupplierUpdateData;

import java.util.List;

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
    public void create(@RequestBody @Valid SupplierData supplierData){
        supplierRepository.save(new Supplier(supplierData));
    }

    @GetMapping
    public Page<SupplierDataResponse> list(@PageableDefault(size = 10, sort = {"name"}) Pageable pageable) {
        return supplierRepository.findAllByActiveTrue(pageable).map(SupplierDataResponse::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid SupplierUpdateData supplierUpdateData){
        var supplier = supplierRepository.getReferenceById(supplierUpdateData.id());
        supplier.updateinfo(supplierUpdateData);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteSupplier(@PathVariable Long id){
        var supplier = supplierRepository.getReferenceById(id);
        supplier.deleteLogical();
    }



}

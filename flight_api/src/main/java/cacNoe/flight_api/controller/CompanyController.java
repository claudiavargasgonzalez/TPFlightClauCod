package cacNoe.flight_api.controller;

import cacNoe.flight_api.models.Company;
import cacNoe.flight_api.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @GetMapping("")
    public List<Company> getAllCompanies(){
        return companyService.allCompanies();
    }

    @PostMapping("/add")
    public void createCompany(@RequestBody Company company){
        companyService.createCompany(company);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCompany(@PathVariable Long id){
        companyService.deleteCompanyById(id);
    }

    @PutMapping("/update")
    public Optional<Company> updateCompany(@RequestBody Company company){
        return companyService.updateCompany(company);
    }


}

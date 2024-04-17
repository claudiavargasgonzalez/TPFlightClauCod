package cacNoe.flight_api.service;

import cacNoe.flight_api.models.Company;
import cacNoe.flight_api.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    public List<Company> allCompanies() {
        return companyRepository.findAll();
    }

    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    public void deleteCompanyById(Long id) {
        companyRepository.deleteById(id);
    }

    public Optional<Company> updateCompany(Company company) {
        companyRepository.save(company);
        return companyRepository.findById(company.getId());
    }
}

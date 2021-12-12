package CRM.gl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import CRM.gl.entities.Customer;
// Service interface
@Service
public interface CustomerService {

	public List<Customer> findAll();

	Customer findById(int id);

	void save(Customer customer);

	void deleteById(int id);
}

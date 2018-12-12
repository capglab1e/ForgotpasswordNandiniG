package com.cg.capstore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.capstore.dto.Customer;
import com.cg.capstore.dto.Merchant;

@Repository("dao")
public class CapStoreDaoImpl implements ICapStoreDao {
	@PersistenceContext
EntityManager em;

	@Override
	public Customer fetchCustomerId(String cemail) {
		Customer customer = em.find(Customer.class, cemail);
		return customer;
	}

	@Override
	public Merchant fetchMerchantId(String memail) {
		Merchant merchant = em.find(Merchant.class, memail);
		return merchant;
	}

	@Override
	public Customer updatePwd(Customer cust) {
		Customer custRes=em.merge(cust);
		return custRes;
	}

}

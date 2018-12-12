package com.cg.capstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.capstore.dao.ICapStoreDao;
import com.cg.capstore.dto.Customer;
import com.cg.capstore.dto.Merchant;
@Service("service")
@Transactional
public class CapStoreServiceImpl implements ICapStoreService {
@Autowired
ICapStoreDao dao;

	@Override
	public Customer fetchCustomerId(String cemail) {
		
		return dao.fetchCustomerId(cemail);
	}

	@Override
	public Merchant fetchMerchantId(String memail) {

		return dao.fetchMerchantId(memail);
	}

	@Override
	public Customer updatePwd(Customer cust) {
		
		return dao.updatePwd(cust);
	}

	@Override
	public void updateCustomer(Customer customere) {
		// TODO Auto-generated method stub
		
	}

}

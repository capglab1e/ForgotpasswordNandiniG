package com.cg.capstore.dao;

import com.cg.capstore.dto.Customer;
import com.cg.capstore.dto.Merchant;

public interface ICapStoreDao {

	public Customer fetchCustomerId(String cemail);
	public Merchant fetchMerchantId(String memail);
	public Customer updatePwd(Customer cust);
}

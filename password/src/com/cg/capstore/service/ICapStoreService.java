package com.cg.capstore.service;

import com.cg.capstore.dto.Customer;
import com.cg.capstore.dto.Merchant;

public interface ICapStoreService {

public Customer fetchCustomerId(String cemail);
public Merchant fetchMerchantId(String memail);
public Customer updatePwd(Customer cust);
public void updateCustomer(Customer customere);
}

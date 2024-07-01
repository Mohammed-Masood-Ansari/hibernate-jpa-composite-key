package com.ibm.hibernate_composite_key_and_enum.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountDriver {

	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("ansari").createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		
		AccountId accountId = new AccountId("32463", "saving");
		
		Account account = new Account(accountId, "ansari", "ansari1997@gmail.com");
		
		et.begin();
		em.persist(account);
		et.commit();
	}
}

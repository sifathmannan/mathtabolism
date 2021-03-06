/**
 * 
 */
package com.mathtabolism.eao.account;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;

import com.mathtabolism.eao.BaseGeneratedEntityEAO;
import com.mathtabolism.entity.account.Account;

/**
 * @author mlaursen
 *
 */
@Stateless
public class AccountEAO extends BaseGeneratedEntityEAO<Account> {
  public AccountEAO() {
    super(Account.class);
  }
  
  /**
   * 
   * @param username the username to search by
   * @return an {@link Account} or null
   */
  public Account findAccountByUsername(String username) {
    Map<String, Object> parameters = new HashMap<>();
    parameters.put("username", username);
    
    return findOneResult(Account.Q_findByUsername, parameters);
  }
}

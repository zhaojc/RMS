package com.jgefroh.rms.client.util.ruleengine;

import java.util.Map;

import com.jgefroh.rms.client.mvp.models.AccountDTO;
import com.jgefroh.rms.client.util.ruleengine.BusinessRule.Result.Code;

/**
 * Defines the following business rules:
 * An account's nickname cannot be changed to null or empty.
 * @author Joseph Gefroh
 */
public class AccountHasEmailRule implements BusinessRule<AccountDTO>{

    //////////////////////////////////////////////////
    // Fields
    //////////////////////////////////////////////////
    
    public enum BusinessRuleID implements RuleID {
        ID;
    }
    
    public enum ReasonCode implements Code {
        MISSING_FIELD;
    }

    
    //////////////////////////////////////////////////
    // Methods
    //////////////////////////////////////////////////
    
    @Override
    public boolean isApplicable(final AccountDTO target, final Map<ContextID, Object> context) {
        if (target != null) {
            return true;
        }
        return false;
    }

    @Override
    public BusinessRuleResult execute(final AccountDTO target) {
        String email = target.getEmail();
        
        if (email == null || email.isEmpty()) {
            return BusinessRuleResult.createFail(BusinessRuleID.ID, ReasonCode.MISSING_FIELD, "The email was missing.");
        }
        return BusinessRuleResult.createPass(BusinessRuleID.ID);
    }

    @Override
    public RuleID getID() {
        return BusinessRuleID.ID;
    }
}

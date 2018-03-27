package com.bstek.crm.uflo.handle;

import org.springframework.stereotype.Component;
import com.bstek.uflo.env.Context;
import com.bstek.uflo.model.ProcessInstance;
import com.bstek.uflo.process.handler.DecisionHandler;

/** 
* 
* @author bob.yang
* @since 2017年9月24日
* 判断金额
*
*/
@Component
public class MoneyDecisionHandler implements DecisionHandler {

	public String handle(Context context, ProcessInstance processInstance) {

		return "大于等于2万";

	}

}

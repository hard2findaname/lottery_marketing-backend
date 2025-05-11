package org.example.domain.credit.service;

import org.example.domain.credit.model.entity.CreditAccountEntity;
import org.example.domain.credit.model.entity.TradeEntity;

/**
 * @Author atticus
 * @Date 2025/04/13 17:52
 * @description:
 */
public interface IUserCreditAdjustService {

    String createOrder(TradeEntity tradeEntity);
    //todo 将此处拆分，单一职责
    CreditAccountEntity queryUserCreditAccount(String userId);
}

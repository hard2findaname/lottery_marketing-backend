package org.example.domain.activity.service;

import org.example.domain.activity.model.entity.ActivityAccountEntity;
import org.example.domain.activity.model.entity.DeliveryOrderEntity;
import org.example.domain.activity.model.entity.SKURechargeEntity;
import org.example.domain.activity.model.entity.UnpaidActivityOrderEntity;

/**
 * @Author atticus
 * @Date 2024/10/16 20:44
 * @description: 抽奖活动订单
 */

public interface IRaffleActivityAccountQuotaService {


    /**
     * 创建 sku 账户充值订单，给用户增加抽奖次数
     * <p>
     * 1. 在【打卡、签到、分享、对话、积分兑换】等行为动作下，创建出活动订单，给用户的活动账户【日、月】充值可用的抽奖次数。
     * 2. 对于用户可获得的抽奖次数，比如首次进来就有一次，则是依赖于运营配置的动作，在前端页面上。用户点击后，可以获得一次抽奖次数。
     *
     * @param: skuRechargeEntity 活动商品充值实体对象
     * @return: void
     **/
    UnpaidActivityOrderEntity createOrder(SKURechargeEntity skuRechargeEntity);


    void updateOrder(DeliveryOrderEntity deliveryOrderEntity);

    /**
     * 查询活动账户 - 日，参与次数
     *
     *
     *
     * @param: activityId   活动ID
     * @param: userId       用户ID
     * @return: Integer     参与次数
     **/
    Integer queryAccountDailyLottery(Long activityId, String userId);

    ActivityAccountEntity queryActivityAccountEntity(Long activityId, String userId);

    Integer queryAccountTotalLottery(Long activityId, String userId);
}

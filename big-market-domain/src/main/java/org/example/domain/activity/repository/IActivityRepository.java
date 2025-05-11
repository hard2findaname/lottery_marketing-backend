package org.example.domain.activity.repository;

import org.example.domain.activity.model.aggregate.CreatePartakeOrderAggregate;
import org.example.domain.activity.model.aggregate.CreateQuotaOrderAggregate;
import org.example.domain.activity.model.entity.*;
import org.example.domain.activity.model.valobj.ActivitySKUStockKeyVO;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author atticus
 * @Date 2024/10/16 22:36
 * @description: 活动仓储接口
 */
public interface IActivityRepository {
    ActivitySkuEntity queryActivitySku(Long sku);

    ActivityEntity queryRaffleActivityByActivityId(Long activityId);

    ActivityCountEntity queryRaffleActivityCountByActivityCountId(Long activityCountId);

    void doSaveOrder(CreateQuotaOrderAggregate createOrderAggregate);
    void doSaveCreditPayOrder(CreateQuotaOrderAggregate createQuotaOrderAggregate);


    void cacheActivitySKUStockCount(String cacheKey, Integer stockCount);

    boolean subActivitySKUStock(Long sku,String cacheKey, Date endDateTime);

    void activitySKUStockConsumeSendQueue(ActivitySKUStockKeyVO activitySKUStockKeyVO);

    ActivitySKUStockKeyVO takeQueueValue();

    void clearQueueValue();

    void updateActivitySkuStock(Long sku);

    void clearActivitySkuStock(Long sku);

    ActivityAccountMonthEntity queryActivityAccountMonthByUserId(String userId, Long activityId, String month);

    ActivityAccountDayEntity queryActivityAccountDayByUserId(String userId, Long activityId, String day);

    ActivityAccountEntity queryActivityAccountByUserId(String userId, Long activityId);

    UserRaffleOrderEntity queryNoUsedRaffleOrder(PartakeRaffleActivityEntity partakeRaffleActivityEntity);

    void saveCreatePartakeOrderAggregate(CreatePartakeOrderAggregate createPartakeOrderAggregate);

    List<ActivitySkuEntity> queryActivitySkuListByActivityId(Long activityId);

    Integer queryAccountDailyLottery(Long activityId, String userId);

    ActivityAccountEntity queryActivityAccountEntity(Long activityId, String userId);

    Integer queryAccountTotalLottery(Long activityId, String userId);

    void updateOrder(DeliveryOrderEntity deliveryOrderEntity);

    UnpaidActivityOrderEntity queryUnpaidActivityOrder(SKURechargeEntity skuRechargeEntity);

    List<SKUProductEntity> querySkuProductListByActivityId(Long activityId);

    BigDecimal queryUserCreditAccountAmount(String userId);
}

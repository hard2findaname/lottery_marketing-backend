package org.example.domain.activity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author atticus
 * @Date 2025/05/11 11:12
 * @description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SKUProductEntity {
    private Long sku;
    /**
     * sku商品绑定的活动
     */
    private Long activityId;
    private Long activityCountId;
    private Integer stockCount;
    private Integer stockCountSurplus;
    /**
     * 商品金额
     */
    private BigDecimal productAmount;
    private ActivityCount activityCount;
    @Data
    public static class ActivityCount{
        private Integer totalAmount;
        private Integer monthAmount;
        private Integer dayAmount;

    }
}

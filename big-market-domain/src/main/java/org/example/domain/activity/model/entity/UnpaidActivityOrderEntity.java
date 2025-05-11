package org.example.domain.activity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author atticus
 * @Date 2025/05/11 9:51
 * @description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UnpaidActivityOrderEntity {
    private String userId;
    private String orderId;
    private String outBusinessNo;
    private BigDecimal payAmount;
}

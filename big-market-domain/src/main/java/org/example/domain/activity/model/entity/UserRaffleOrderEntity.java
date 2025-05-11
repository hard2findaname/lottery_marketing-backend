package org.example.domain.activity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.domain.activity.model.valobj.UserRaffleOrderStateVO;

import java.util.Date;

/**
 * @Author atticus
 * @Date 2024/10/30 23:00
 * @description: 用户抽奖订单
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRaffleOrderEntity {
    private String userId;
    /** 活动ID */
    private Long activityId;
    /** 活动名称 */
    private String activityName;

    /** 抽奖策略ID */
    private Long strategyId;
    /** 订单ID */
    private String orderId;

    /** 下单时间 */
    private Date orderTime;

    /** 订单状态；create-创建、used-已使用、cancel-已作废 */
    private UserRaffleOrderStateVO orderState;

    /** 创建时间 */
    private Date createTime;
    /** 结束时间*/
    private Date endDateTime;
}

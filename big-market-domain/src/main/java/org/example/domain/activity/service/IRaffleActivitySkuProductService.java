package org.example.domain.activity.service;

import org.example.domain.activity.model.entity.SKUProductEntity;

import java.util.List;

/**
 * @Author atticus
 * @Date 2025/05/11 11:11
 * @description:
 */
public interface IRaffleActivitySkuProductService {

    List<SKUProductEntity> querySkuProductListByActivityId(Long activityId);
}

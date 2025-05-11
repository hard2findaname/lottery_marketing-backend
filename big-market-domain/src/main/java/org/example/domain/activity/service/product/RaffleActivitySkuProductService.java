package org.example.domain.activity.service.product;

import lombok.extern.slf4j.Slf4j;
import org.example.domain.activity.model.entity.SKUProductEntity;
import org.example.domain.activity.repository.IActivityRepository;
import org.example.domain.activity.service.IRaffleActivitySkuProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author atticus
 * @Date 2025/05/11 11:20
 * @description:
 */
@Slf4j
@Service
public class RaffleActivitySkuProductService implements IRaffleActivitySkuProductService {
    @Resource
    private IActivityRepository repository;
    @Override
    public List<SKUProductEntity> querySkuProductListByActivityId(Long activityId) {
        return repository.querySkuProductListByActivityId(activityId);
    }
}

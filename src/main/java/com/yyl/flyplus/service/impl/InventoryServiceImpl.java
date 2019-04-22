package com.yyl.flyplus.service.impl;

import com.yyl.flyplus.mapper.InventoryMapper;
import com.yyl.flyplus.model.Inventory;
import com.yyl.flyplus.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 库存管理接口实现类
 * @Author: Godzilla
 * @CreateDate: 2019/4/22 14:46
 * @Version: 1.0
 */
@Service
public class InventoryServiceImpl implements InventoryService {
    private InventoryMapper inventoryMapper;
    @Override
    public List<Inventory> showInventory() {
        return inventoryMapper.showAll();
    }

    @Override
    public List<Inventory> addInventory() {
        return null;
    }

    @Override
    public List<Inventory> queryInventory() {
        return null;
    }
}

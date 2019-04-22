package com.yyl.flyplus.service;

import java.util.List;

import com.yyl.flyplus.model.Inventory;

/**
 * @Description: 库存管理接口
 * @Author: Godzilla
 * @CreateDate: 2019/4/22 14:36
 * @Version: 1.0
 */

public interface InventoryService {
    List<Inventory> showInventory();
    boolean addInventory(Inventory inventory);
    List<Inventory> queryInventory(String name,boolean type);
}

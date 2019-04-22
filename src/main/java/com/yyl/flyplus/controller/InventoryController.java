package com.yyl.flyplus.controller;

import com.yyl.flyplus.mapper.InventoryMapper;
import com.yyl.flyplus.model.Inventory;
import com.yyl.flyplus.service.InventoryService;
import com.yyl.flyplus.service.impl.InventoryServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description: 库存管理
 * @Author: Godzilla
 * @CreateDate: 2019/4/22 13:05
 * @Version: 1.0
 */
@Controller
@RequestMapping(value = "/inventory")
@Api(value = "InventoryController|库存管理的控制器")
public class InventoryController {
    private Logger LOG = LoggerFactory.getLogger(HealthController.class);
    @Autowired
    private InventoryServiceImpl inventoryServiceimpl;
    @ResponseBody
    @RequestMapping(value = "/show", method= RequestMethod.GET)
    @ApiOperation(value="展示库中所有商品,返回类型为List", notes="展示库中所有商品,返回类型为List")
    public List<Inventory> showInventory(){
        return inventoryServiceimpl.showInventory();
    }
}

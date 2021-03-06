package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.common.pojo.EasyUIDataGrid;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;


@Controller 
public class ItemController {


	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId) {
		TbItem tbItem = itemService.getTbItemById(itemId);
		return tbItem;
	}
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGrid getItemList(Integer page ,Integer rows){
		//调用服务查询商品列表
		EasyUIDataGrid result = itemService.getItemList(page, rows);
		return result;
	}
	
	 
}

package cn.e3mall.service;

import cn.e3mall.common.pojo.EasyUIDataGrid;
import cn.e3mall.pojo.TbItem;

public interface ItemService {
	TbItem getTbItemById (long itemId);
	EasyUIDataGrid  getItemList(int page ,int rows);
}

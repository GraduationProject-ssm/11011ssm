package com.entity.view;

import com.entity.WupinshenlingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物品申领
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-13 13:10:51
 */
@TableName("wupinshenling")
public class WupinshenlingView  extends WupinshenlingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WupinshenlingView(){
	}
 
 	public WupinshenlingView(WupinshenlingEntity wupinshenlingEntity){
 	try {
			BeanUtils.copyProperties(this, wupinshenlingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

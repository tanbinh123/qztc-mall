package com.bean.mall.service;

import com.bean.model.CmsPrefrenceArea;
import com.macro.mall.model.CmsPrefrenceArea;

import java.util.List;

/**
 * 优选专区Service
 * Created by macro on 2018/6/1.
 */
public interface CmsPrefrenceAreaService {
    /**
     * 获取所有优选专区
     * @return
     */
    List<CmsPrefrenceArea> listAll();
}
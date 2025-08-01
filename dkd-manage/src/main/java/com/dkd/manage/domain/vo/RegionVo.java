package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Region;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhangyu
 * @Date: 2025/08/01/15:13
 * @Description:
 */
@Data
public class RegionVo extends Region {
    //点位数量
    private Integer nodeCount;

}

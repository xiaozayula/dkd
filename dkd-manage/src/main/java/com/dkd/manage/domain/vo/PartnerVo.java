package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Partner;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhangyu
 * @Date: 2025/08/04/9:30
 * @Description:
 */
@Data
public class PartnerVo extends Partner {

    // 点位数量
    private Integer nodeCount;
}

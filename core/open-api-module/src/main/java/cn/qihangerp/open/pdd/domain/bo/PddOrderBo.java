package cn.qihangerp.open.pdd.domain.bo;

import lombok.Data;

import java.io.Serializable;

@Data
public class PddOrderBo implements Serializable {
    private String orderSn;
    private Long skuId;
    private Long erpGoodsSkuId;
    private Integer shopId;
    private String orderStatus;
    private String startTime;
    private String endTime;
}

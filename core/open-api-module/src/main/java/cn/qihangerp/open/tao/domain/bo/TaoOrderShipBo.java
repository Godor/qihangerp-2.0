package cn.qihangerp.open.tao.domain.bo;

import lombok.Data;

@Data
public class TaoOrderShipBo {
    private String tid;
    private Integer shopId;
    private String waybillCode;
    private String waybillCompany;
}

package heli.hrc.wmsspringboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author fsy
 * @since 2023-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="WmsTask对象", description="")
public class WmsTask implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.ID_WORKER)
    private String id;

    @ApiModelProperty(value = "操作类型 10.入库 20.整托出库 21.拆托出库 30.移库 40托盘移动")
    private Integer operateType;

    @ApiModelProperty(value = "托盘id")
    private String palletId;

    @ApiModelProperty(value = "起始点")
    private String fetchPosition;

    @ApiModelProperty(value = "目标点")
    private String deliverPosition;

    @ApiModelProperty(value = "送货点层高")
    private Integer deliverLevel;

    @ApiModelProperty(value = "agv车辆号")
    private Integer agvCarrierid;

    @ApiModelProperty(value = "取货点层高")
    private Integer fetchLevel;

    @ApiModelProperty(value = "优先级")
    private Integer priority;

    @ApiModelProperty(value = "订单完成时间")
    private String updateTime;

    @ApiModelProperty(value = "订单开始时间")
    private String startTime;

    @ApiModelProperty(value = "创建时间")
    private String createTime;

    @ApiModelProperty(value = "拆托出库时，库位库存的余量")
    private Integer storageStockNum;

    @ApiModelProperty(value = "关联任务号")
    private String srcTask;

    @ApiModelProperty(value = "指令下达状态0.临时状态 1.待下发 2.已下发 3.成功 4.取消 5.失败")
    private Integer status;

    @ApiModelProperty(value = "指令下达状态0.临时状态 1.已下发 2.完成")
    private Integer flag;

    private Boolean deleteFlag;

    @ApiModelProperty(value = "订单号")
    private String taskCode;

    @ApiModelProperty(value = "行号")
    private Integer detailId;

    @ApiModelProperty(value = "任务完成时间")
    private String finishTime;

    @ApiModelProperty(value = "0未反馈 1已反馈")
    private Boolean backFlag;

    @ApiModelProperty(value = "订单消耗时间")
    private String timeConsuming;

    private String goodsCode;

    private String goodsName;

    private Integer planNum;

    private Double weight;

    private String fetchName;

    private String deliverName;


}

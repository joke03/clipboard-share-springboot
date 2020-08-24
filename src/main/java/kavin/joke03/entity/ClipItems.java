package kavin.joke03.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@ApiModel(description = "剪切板类")
public class ClipItems implements Serializable {

    @ApiModelProperty(value = "ID",example = "123")
    public int id;
    @ApiModelProperty("剪切板内容")
    public String item_content;
    @ApiModelProperty("创建时间")
    public Date create_time;
    @ApiModelProperty("更新时间")
    public Date update_time;

}

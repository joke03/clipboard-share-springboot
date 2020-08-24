package kavin.joke03.controller;

import kavin.joke03.entity.ClipItems;
import kavin.joke03.service.impl.ClipServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "剪贴板管理")
@RestController
@RequestMapping("clip")
public class ClipController {

    @Autowired
    private ClipServiceImpl clipService;

    @ApiOperation("获取所有剪切板内容列表")
    @GetMapping("/getAll")
    public List<ClipItems> getAllItems(){
        return clipService.findAll();
    }


    @ApiOperation(value = "获取剪切板详细信息", notes = "路径参数ID")
    @GetMapping("/getById/{id}")
//    public List<ClipItems> getItemByID(@PathVariable(name = "id") int id, @RequestParam(name = "name") String name){
    public List<ClipItems> getItemByID(@PathVariable(name = "id") int id){
        return clipService.findById(id);
    }

    @ApiOperation(value = "删除剪切板数据")
    @DeleteMapping("/delete/{id}")
    public boolean deleteItemById(@ApiParam(name = "剪贴板条目ID", required = true) @PathVariable(name="id") int id){
        return clipService.deleteById(id);
    }

    @ApiOperation(value = "新增剪切板信息", notes = "insert数据", response = ClipItems.class)
    @PostMapping("/save")
    public boolean saveClipItem(@RequestBody ClipItems items){
        return clipService.saveClipItems(items);
    }



}

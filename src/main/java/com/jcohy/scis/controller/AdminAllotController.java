package com.jcohy.scis.controller;

import com.jcohy.scis.common.JsonResult;
import com.jcohy.scis.common.PageJson;
import com.jcohy.scis.model.*;
import com.jcohy.scis.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jiac on 2018/4/2.
 * ClassName  : com.jcohy.perfectteaching.controller
 * Description  :
 */
@Controller
@RequestMapping("/admin/allot")
public class AdminAllotController {

    @Autowired
    private AllotService allotService;

    @Autowired
    private ExpertService expertService;

    @Autowired
    private ProjectService projectService;

    @GetMapping("/list")
    @ResponseBody
    public PageJson<Allot> all(ModelMap map){
        List<Allot> allots = allotService.findAll();
        PageJson<Allot> page = new PageJson<>();
        page.setCode(0);
        page.setMsg("成功");
        page.setCount(allots.size());
        page.setData(allots);
        return page;
    }

    @GetMapping("/form")
    public String form(@RequestParam(required = false) Integer id, ModelMap map){
        List<Expert> experts = expertService.findAll();
        List<Project> projects = projectService.findAll();
        map.put("experts",experts);
        map.put("projects",projects);

        if(id != null){
            Allot allot = allotService.findById(id);
            map.put("allot",allot);
        }
        return "admin/allot/form";
    }

    @PostMapping("/save")
    @ResponseBody
    public JsonResult save(Allot allot){
        try {
            allotService.saveOrUpdate(allot);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonResult.fail(e.getMessage());
        }
        return JsonResult.ok();
    }

    @DeleteMapping("{id}/del")
    @ResponseBody
    public JsonResult del(@PathVariable("id") Integer id){
        try {
            allotService.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonResult.fail("删除失败");
        }
        return JsonResult.ok();
    }
}
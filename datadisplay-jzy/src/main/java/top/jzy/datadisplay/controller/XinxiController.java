package top.jzy.datadisplay.controller;

import top.jzy.datadisplay.domain.xinxiDO;
import top.jzy.datadisplay.services.xinxiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 学生信息列表
 * controller层
 *
 * @author WarMj
 * @date 2018-05-16
 */
@Controller
@RequestMapping("xinxi")
public class XinxiController {

  private final xinxiService xinxiService;

  public XinxiController(xinxiService xinxiService) {
    this.xinxiService = xinxiService;

  }

  /**
   * @return
   */
  @GetMapping("listxinxi")
  @ResponseBody
  public List<xinxiDO> listxinxi() {
    return xinxiService.listxinxi();
  }

}

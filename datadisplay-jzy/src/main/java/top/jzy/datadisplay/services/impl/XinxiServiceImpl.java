package top.jzy.datadisplay.services.impl;

import top.jzy.datadisplay.dao.XinxiDao;
import top.jzy.datadisplay.domain.xinxiDO;
import top.jzy.datadisplay.services.xinxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XinxiServiceImpl implements xinxiService {

  @Autowired
  private XinxiDao xinxiDao;

  /**
   *
   * @return
   */
  @Override
  public List<xinxiDO> listxinxi() {
    return xinxiDao.listxinxi();
  }
}

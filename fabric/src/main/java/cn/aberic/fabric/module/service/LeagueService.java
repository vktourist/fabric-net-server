package cn.aberic.fabric.module.service;

import cn.aberic.fabric.base.BaseService;
import cn.aberic.fabric.base.DTOService;
import cn.aberic.fabric.module.bean.dto.LeagueDTO;
import cn.aberic.fabric.module.bean.vo.LeagueVO;

import java.util.List;

/**
 * 描述：
 *
 * @author : Aberic 【2018/6/4 10:27】
 */
public interface LeagueService extends BaseService,DTOService<LeagueDTO> {

    List<LeagueVO> leagues();

}

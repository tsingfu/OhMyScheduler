package com.github.kfcfans.oms.server.service.alarm;

import com.github.kfcfans.oms.server.persistence.core.model.UserInfoDO;

import java.util.List;

/**
 * 报警接口
 *
 * @author tjq
 * @since 2020/4/19
 */
public interface Alarmable {

    void alarm(AlarmContent alarmContent, List<UserInfoDO> targetUserList);
}

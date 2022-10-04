package com.mwt.oes.service;

import com.mwt.oes.domain.TeacherNotice;

import java.util.List;
import java.util.Map;

/**
 * @author DAHUANG
 * @date 2022/9/03
 */
public interface TeacherNoticeService {
    public List<Map<String, Object>> getNoticesList();
    public List<Map<String, Object>> searchNoticeInfo(String noticeContent, String teaName);
    public boolean noticeContentIsExist(String noticeContent);
    public int insertNoticeInfo(TeacherNotice teacherNotice);
    public int updateNoticeInfo(TeacherNotice teacherNotice);
    public int deleteNotice(Integer noticeId);
}

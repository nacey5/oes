package com.mwt.oes.service;

import java.util.List;
import java.util.Map;

/**
 * @author DAHUANG
 * @date 2022/9/03
 */
public interface StudentSearchService {
    public List<Map<String, Object>> getSearchPapers(String keyword);
}

package com.mwt.oes.service;

import com.mwt.oes.domain.Admin;

import java.util.List;

/**
 * @author DAHUANG
 * @date 2022/9/03
 */
public interface AdminSystemService {
    public List<Admin> adminLogin(String ano, String psw);
    public boolean updateAdmin(Admin admin);
}

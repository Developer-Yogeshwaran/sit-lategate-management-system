package com.college.lateentry.service;

import com.college.lateentry.model.Admin;
import com.college.lateentry.util.JsonUtil;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    public boolean login(Admin admin) {
        Admin stored = JsonUtil.readAdmin();
        return stored != null &&
                stored.getUsername().equals(admin.getUsername()) &&
                stored.getPassword().equals(admin.getPassword());
    }
}

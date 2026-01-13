package com.college.lateentry.service;

import com.college.lateentry.model.LateEntry;
import com.college.lateentry.util.JsonUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LateEntryService {

    public void save(LateEntry entry) {
        List<LateEntry> list = JsonUtil.readLateEntries();
        list.add(entry);
        JsonUtil.writeLateEntries(list);
    }

    public List<LateEntry> getAll() {
        return JsonUtil.readLateEntries();
    }
}

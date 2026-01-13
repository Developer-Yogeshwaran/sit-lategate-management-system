package com.college.lateentry.util;

import com.college.lateentry.model.Admin;
import com.college.lateentry.model.LateEntry;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JsonUtil {

    private static final ObjectMapper mapper = new ObjectMapper();
    private static final String ADMIN_FILE = "src/main/resources/data/admin.json";
    private static final String LATE_FILE = "src/main/resources/data/late_entries.json";

    public static Admin readAdmin() {
        try {
            return mapper.readValue(new File(ADMIN_FILE), Admin.class);
        } catch (Exception e) {
            return null;
        }
    }

    public static List<LateEntry> readLateEntries() {
        try {
            return mapper.readValue(new File(LATE_FILE),
                    new TypeReference<List<LateEntry>>() {});
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public static void writeLateEntries(List<LateEntry> entries) {
        try {
            mapper.writeValue(new File(LATE_FILE), entries);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

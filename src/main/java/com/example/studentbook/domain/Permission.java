package com.example.studentbook.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Permission {

    ADMIN_READ("admin:read"),
    ADMIN_WRITE("admin:read"),
    ADMIN_UPDATE("admin:read"),
    ADMIN_DELETE("admin:read"),

    AUTHOR_READ("author:read"),
    AUTHOR_WRITE("author:read"),
    AUTHOR_UPDATE("author:read"),
    AUTHOR_DELETE("author:read"),

    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:read"),
    STUDENT_UPDATE("student:read"),
    STUDENT_DELETE("student:read");

    private final String permission;
}

package com.example.studentbook.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Set;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import static com.example.studentbook.domain.Permission.*;

@RequiredArgsConstructor
@Getter
public enum Role {
    ADMIN(
            Set.of(
                    ADMIN_READ,
                    ADMIN_WRITE,
                    ADMIN_UPDATE,
                    ADMIN_DELETE,

                    AUTHOR_READ,
                    AUTHOR_WRITE,
                    AUTHOR_UPDATE,
                    AUTHOR_DELETE,

                    STUDENT_READ,
                    STUDENT_WRITE,
                    STUDENT_UPDATE,
                    STUDENT_DELETE
            )
    ),
    AUTHOR(
            Set.of(
                    AUTHOR_READ,
                    AUTHOR_WRITE,
                    AUTHOR_UPDATE,
                    AUTHOR_DELETE
            )
    ),
    STUDENT(
            Set.of(
                    STUDENT_READ,
                    STUDENT_WRITE,
                    STUDENT_UPDATE,
                    STUDENT_DELETE
            )
    );

    private final Set<Permission> permissions;

    public List<? extends GrantedAuthority> getAuthorities(){
        List<SimpleGrantedAuthority> authorities = new java.util.ArrayList<>(getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.name())).toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }
}

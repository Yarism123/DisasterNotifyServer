package org.example.disasternotifyserver.user.entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Document(collection = "users") // 실제 MongoDB 컬렉션 이름
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements UserDetails {
    @Id
    @Column(name = "user_id", updatable = false, unique = true, nullable = false)
    private ObjectId id; // ObjectId 타입으로 변경

    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    private int city_code; // 도시
    private int county_code; // 시, 군

    @Builder.Default
    private List<String> roles = new ArrayList<>();

    /**
     * 멤버가 가지고 있는 권한(authority) 목록을 SimpleGrantedAuthority로 변환하여 반환
     * 나머지 Override 메서드들 전부 true로 반환하도록 설정
     * */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

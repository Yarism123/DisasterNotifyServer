package com.company.disasternotifyapp.user.role;

import jakarta.persistence.Column;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "roles")
public class Role {

    @Id @Column(name = "user_id")
    private ObjectId userId; // 사용자 ID
    private String role;    // 역할 정보
}
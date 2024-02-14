package com.pinsoft.blogsite.entity;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Arrays;
import java.util.List;
@Document
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User{
    @Id
    private String id;
    private String username;
    private String email;
    private String password;
}

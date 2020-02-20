package com.stevenpj.pactconsumer;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class User {

    private String name;
    private String colour;
    private String role;
    private LocalDateTime lastLogin;
    private List<Friend> friends;


}

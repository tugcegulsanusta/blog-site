package com.pinsoft.blogsite.dto;

import lombok.Data;

@Data
public class PostDto {
    private String header;
    private String content;
    private String base64img;
}

package com.domo.mysqlreplication.dto;

import lombok.*;

public class BoardDto {
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class Request {
        private String title;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response {
        private String title;
    }
}

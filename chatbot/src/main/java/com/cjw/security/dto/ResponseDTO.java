package com.cjw.security.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@Data
@AllArgsConstructor

public class ResponseDTO<T> {
        private String error;
        private List<T> data;
    }


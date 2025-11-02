package com.example.first.apiresponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse <T>{
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("message")
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("status_code")
    private Integer status_code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("data")
    private T  data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("listData")
    private List<T>  listData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("score")
    private Integer score;

}

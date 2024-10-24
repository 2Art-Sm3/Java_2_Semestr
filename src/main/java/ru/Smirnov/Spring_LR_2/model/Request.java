package ru.Smirnov.Spring_LR_2.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank
    @Size(max = 32)
//    @Pattern(regexp = "^(?!123$).*")
    private String uid;

    @NotBlank
    @Size(max = 32)
    private String operationUid;
    private String systemName;
    private String systemTime;
    private String source;
    @Min(value = 1)
    @Max(value = 100000)
    private int communicationId;
    private int templateId;
    private int productCode;
    private int smsCode;

}

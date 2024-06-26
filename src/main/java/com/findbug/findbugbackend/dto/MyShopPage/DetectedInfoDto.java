package com.findbug.findbugbackend.dto.MyShopPage;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDateTime;

@SuperBuilder(toBuilder = true)
@Jacksonized
@Getter
@Setter
public class DetectedInfoDto {
    public String cameraName;
    public LocalDateTime detectedDate;

}

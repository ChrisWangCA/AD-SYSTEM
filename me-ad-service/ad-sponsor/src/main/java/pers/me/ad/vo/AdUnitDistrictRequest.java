package pers.me.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Chris Wang
 * @version 1.0
 * @date 2022-10-12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdUnitDistrictRequest {

    private List<UnitDistrict> unitDistrict;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UnitDistrict{
        private Long unitId;
        private String province;
        private String city;
    }
}

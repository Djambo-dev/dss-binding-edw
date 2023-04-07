package ru.digital.league.x5.sign.bindings.edw.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class RawEntityDto {
    String store_id;
    String cost_point_id;

    String tm_personnel_no;

    String tm_full_nm;

    String tm_ad_login_txt;

    String um_personal_no;

    String um_full_nm;

    String um_ad_login_txt;
}

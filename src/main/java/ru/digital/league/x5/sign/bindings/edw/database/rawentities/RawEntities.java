package ru.digital.league.x5.sign.bindings.edw.database.rawentities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;
import java.io.Serializable;



@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(schema = "products")
public class RawEntities {

    @EmbeddedId
    RawEntitiesId id;
    @Column
    String tm_personnel_no;
    @Column
    String tm_full_nm;

    @Column
    String tm_ad_login_txt;

    @Column
    String um_personal_no;

    @Column
    String um_full_nm;

    @Column
    String um_ad_login_txt;


    @Embeddable
    @Builder(toBuilder = true)
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RawEntitiesId implements Serializable {

        @Column(nullable = false)
        String cost_point_id;

        @Column(nullable = false)
        String store_id;

    }

}

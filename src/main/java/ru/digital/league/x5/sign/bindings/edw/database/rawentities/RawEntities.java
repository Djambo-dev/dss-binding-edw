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
    String tmPersonnelNo;
    @Column
    String tmFullNm;

    @Column
    String tmAdLoginTxt;

    @Column
    String umPersonalNo;

    @Column
    String umFullNm;

    @Column
    String umAdLoginTxt;


    @Embeddable
    @Builder(toBuilder = true)
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RawEntitiesId implements Serializable {

        @Column(nullable = false)
        String costPointId;

        @Column(nullable = false)
        String storeId;

    }

}

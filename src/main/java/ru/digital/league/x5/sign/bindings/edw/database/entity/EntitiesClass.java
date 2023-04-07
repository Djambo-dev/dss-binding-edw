package ru.digital.league.x5.sign.bindings.edw.database.entity;

import lombok.*;

import javax.persistence.Table;

@Builder(toBuilder = true)
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(schema = "EntitiesClass")
public class EntitiesClass {
}

package com.example.Liqibase.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Setter
@Getter
public abstract class PersistentObject {
    /**
     * Identifier of entity -> primary key.
     */


    /**
     * Date when entity was created
     */
    @Column(name = "created_at", insertable = false, columnDefinition = "date DEFAULT CURRENT_DATE")

    private ZonedDateTime createdAt;
    /**
     * Last date when entity was updated.
     */

    @Column(name = "updated_at")
    private ZonedDateTime updatedAt;
    /**
     * Date when entity was deleted.
     */

    @Column(name = "deleted_at")
    private ZonedDateTime deletedAt;

    public boolean isDeleted() {
        return deletedAt != null && deletedAt.isBefore(ZonedDateTime.now());
    }
}

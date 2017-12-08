package org.jypj.dev.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author ChenYu
 */
@Data
@Builder
public class Customer {

    @Id
    public String id;
    public String firstName;
    public String lastName;


}
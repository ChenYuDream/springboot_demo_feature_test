package org.jypj.dev.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


/**
 * @author ChenYu
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class User {

    private String name;
    private String blog;


}
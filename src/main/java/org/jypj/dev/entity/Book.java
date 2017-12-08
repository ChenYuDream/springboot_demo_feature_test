package org.jypj.dev.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author yu_chen
 * @create 2017-12-08 14:28
 **/
@Data
@Builder
public class Book implements java.io.Serializable {


    private static final long serialVersionUID = 639693238121702578L;

    private String isbn;
    private String title;
}

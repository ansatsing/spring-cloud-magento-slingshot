package com.github.chen0040.commons.models;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;


/**
 * Created by xschen on 18/9/2017.
 */
@Getter
@Setter
public class MagentoEvent {
   private Date time = new Date();
   private String name;
   private String description;
   private String category;
   private long count;

   public MagentoEvent(){

   }
}

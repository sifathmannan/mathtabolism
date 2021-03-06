package com.mathtabolism.dto;

import java.util.Date;

/**
 * 
 * @author mlaursen
 *
 */
public interface AccountWeightDto extends GeneratedIdDto {

  /**
   * Sets the weight
   * @param weight the weight
   */
  void setWeight(Double weight);
  
  /**
   * Gets the weight
   * @return the weight
   */
  Double getWeight();
  
  /**
   * Sets the weigh in date
   * @param weighInDate the date
   */
  void setWeighInDate(Date weighInDate);
  
  /**
   * Gets the weigh in date
   * @return the weigh in date
   */
  Date getWeighInDate();
}

package com.github.mlaursen.mathtabolism.unit;

import com.github.mlaursen.mathtabolism.util.calculation.Addable;
import com.github.mlaursen.mathtabolism.util.calculation.Subtractable;

/**
 * @author mlaursen
 *
 */
public class Measurement implements Addable, Subtractable {
  private UnitMeasurement unitMeasurement;
  private double value;
  public Measurement(UnitMeasurement unitMeasurement, double value) {
    this.unitMeasurement = unitMeasurement;
    this.value = value;
  }
  /**
   * 
   * @param subtractable
   */
  @Override
  public void subtract(Subtractable subtractable) {
    if(subtractable != null && subtractable instanceof Measurement) {
      Measurement m = (Measurement) subtractable;
      this.value -= UnitConverter.convert(m, unitMeasurement).value;
    }
  }
  /**
   * 
   * @param addable
   */
  @Override
  public void add(Addable addable) {
    if(addable != null && addable instanceof Measurement) {
      Measurement m = (Measurement) addable;
      this.value += m.value;
    }
  }
  
  public double getValue() {
    return value;
  }
  
  public UnitMeasurement getUnitMeasurement() {
    return unitMeasurement;
  }
  
  @Override
  public boolean equals(Object object) {
    if(object != null && object instanceof Measurement) {
      Measurement m = (Measurement) object;
      return value == m.value
          && unitMeasurement == m.unitMeasurement;
    }
    return false;
  }
  
  @Override
  public String toString() {
    return "Measurement [unitMeasurement = " + unitMeasurement + ", value = " + value + "]";
  }
}

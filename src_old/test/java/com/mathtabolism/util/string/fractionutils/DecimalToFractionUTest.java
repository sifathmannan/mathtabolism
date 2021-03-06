/**
 * 
 */
package com.mathtabolism.util.string.fractionutils;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import static com.mathtabolism.util.string.FractionUtils.decimalToFraction;

/**
 * 
 * @author mlaursen
 */
public class DecimalToFractionUTest {
  
  @Test
  public void testSimpleDecimal() {
    assertThat(decimalToFraction(0.25), is("1/4"));
  }
  
  @Test
  public void testSimpleNegativeDecimal() {
    assertThat(decimalToFraction(-0.25), is("-1/4"));
  }
  
  @Test
  public void testMixedNegativeNumberFraction() {
    assertThat(decimalToFraction(-2.33), is("-2 1/3"));
  }
  
  @Test
  public void testMixedNumberFraction() {
    assertThat(decimalToFraction(2.33), is("2 1/3"));
  }
}

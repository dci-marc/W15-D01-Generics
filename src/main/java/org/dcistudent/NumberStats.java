package org.dcistudent;

public class NumberStats<T extends Number> {
  public Double calculateAverage(T[] numbers) {
    double sum = 0;

    for (T number : numbers) {
      sum += number.doubleValue();
    }

    return sum / numbers.length;
  }

  public Double findMax(T[] numbers) {
    double max = numbers[0].doubleValue();

    for (T number : numbers) {
      if (number.doubleValue() > max) {
        max = number.doubleValue();
      }
    }

    return max;
  }
}

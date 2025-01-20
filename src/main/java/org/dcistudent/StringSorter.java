package org.dcistudent;

import java.util.Collections;
import java.util.List;

public class StringSorter implements Sortable<String> {
  @Override
  public void sort(List<String> items) {
    Collections.sort(items);
  }
}

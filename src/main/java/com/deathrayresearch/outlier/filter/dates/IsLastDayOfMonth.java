package com.deathrayresearch.outlier.filter.dates;

import com.deathrayresearch.outlier.Row;
import com.deathrayresearch.outlier.filter.AbstractFilter;
import com.deathrayresearch.outlier.filter.ColumnReference;

import java.time.LocalDate;

/**
 *
 */
public class IsLastDayOfMonth extends AbstractFilter {

  public IsLastDayOfMonth(ColumnReference columnReference) {
    super(columnReference);
  }

  @Override
  public boolean matches(Row row) {
    LocalDate date = (LocalDate) row.get(columnName());
    return date.getDayOfMonth() == date.lengthOfMonth();
  }
}
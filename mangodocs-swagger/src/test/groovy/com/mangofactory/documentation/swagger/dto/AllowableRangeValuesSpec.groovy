package com.mangofactory.documentation.swagger.dto

import spock.lang.Specification

class AllowableRangeValuesSpec extends Specification {

  def "should pass coverage"() {
    expect:
      new AllowableRangeValues('1', '2').with {
        getMax()
        getMin()
      }
  }
}
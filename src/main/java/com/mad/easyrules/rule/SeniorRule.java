package com.mad.easyrules.rule;

import com.mad.easyrules.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

/** The type Senior rule. */
@Slf4j
@Rule(name = "Senior Rule", description = "Check if a person is considered a senior")
public class SeniorRule {

  /**
   * Is senior boolean.
   *
   * @param person the person
   * @return the boolean
   */
  @Condition
  public boolean isSenior(@Fact("person") Person person) {
    return person.getAge() >= 50;
  }

  /**
   * Mark as senior.
   *
   * @param person the person
   */
  @Action
  public void markAsSenior(@Fact("person") Person person) {
    person.setSenior(true);
    log.info(person.getName() + " is a senior citizen.");
  }
}

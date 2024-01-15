package com.mad.easyrules.rule;

import com.mad.easyrules.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

/** The type Discount rule. */
@Slf4j
@Rule(
    name = "Discount Rule",
    description = "Check if a person is eligible for a discount based on age")
public class DiscountRule {

  /**
   * Is eligible for discount boolean.
   *
   * @param person the person
   * @return the boolean
   */
  @Condition
  public boolean isEligibleForDiscount(@Fact("person") Person person) {
    int age = person.getAge();
    return age < 30 || age >= 50;
  }

  /**
   * Provide discount.
   *
   * @param person the person
   */
  @Action
  public void provideDiscount(@Fact("person") Person person) {
    int age = person.getAge();
    if (age < 30) {
      applyDiscount(person, 20);
    } else if (age >= 50) {
      applyDiscount(person, 25);
    }
  }

  private void applyDiscount(Person person, int discountPercentage) {
    person.setDiscount(discountPercentage + "%");
    log.info(
        person.getName()
            + " is eligible for a "
            + discountPercentage
            + "% discount! "
            + "Discounted price: $"
            + discountPercentage
            + "%");
  }
}

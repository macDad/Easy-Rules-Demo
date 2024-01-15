package com.mad.easyrules.service;

import com.mad.easyrules.model.Person;
import lombok.AllArgsConstructor;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.springframework.stereotype.Service;

/** The type Easy rules service. */
@Service
@AllArgsConstructor
public class EasyRulesService {

  private final Rules rules;
  private final RulesEngine rulesEngine;

  /**
   * Process discount person.
   *
   * @param person the person
   * @return the person
   */
  public Person processDiscount(Person person) {
    Facts facts = new Facts();
    facts.put("person", person);
    rulesEngine.fire(rules, facts);
    return person;
  }
}

package com.mad.easyrules.controller;

import com.mad.easyrules.model.Person;
import com.mad.easyrules.service.EasyRulesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** The type Person controller. */
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class PersonController {

  private final EasyRulesService easyRulesService;

  /**
   * Check discount person.
   *
   * @param name the name
   * @param age the age
   * @return the person
   */
  @GetMapping("/checkDiscount/{name}/{age}")
  public Person checkDiscount(@PathVariable String name, @PathVariable int age) {
    Person person = new Person(name, age);

    return easyRulesService.processDiscount(person);
  }
}

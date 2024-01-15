package com.mad.easyrules.config;

import com.mad.easyrules.rule.DiscountRule;
import com.mad.easyrules.rule.SeniorRule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** The type Easy rules configuration. */
@Configuration
public class EasyRulesConfiguration {

  /**
   * Easy rules rules.
   *
   * @return the rules
   */
  @Bean
  public Rules easyRules() {
    Rules rules = new Rules();
    rules.register(new DiscountRule());
    rules.register(new SeniorRule());
    return rules;
  }

  /**
   * Rules engine rules engine.
   *
   * @return the rules engine
   */
  @Bean
  public RulesEngine rulesEngine() {
    return new DefaultRulesEngine();
  }
}

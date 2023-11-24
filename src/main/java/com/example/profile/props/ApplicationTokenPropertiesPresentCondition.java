package com.example.profile.props;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ApplicationTokenPropertiesPresentCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        boolean bound = Binder
                .get(context.getEnvironment())
                .bind("api.token", ApplicationTokenProperties.class)
                .isBound();
        System.out.println("configuration present: " + bound);
        return bound;
    }
}

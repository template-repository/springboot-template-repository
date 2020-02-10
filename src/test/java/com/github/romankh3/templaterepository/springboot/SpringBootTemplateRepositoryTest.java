package com.github.romankh3.templaterepository.springboot;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit-level testing for {@link SpringBootTemplateRepository} object.
 */
public class SpringBootTemplateRepositoryTest {

    @Test
    public void shouldCreateJavaRepositoryTemplateMain() {
        SpringBootTemplateRepository main = new SpringBootTemplateRepository();
        Assert.assertNotNull(main);
    }

}

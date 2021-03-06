package com.fuadrafid.springboot.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(properties = {"spring.application.name = some name",
        "server.port = 1234"
})
@ExtendWith(SpringExtension.class)
@EnableConfigurationProperties(value = ApplicationProperties.class)
class ApplicationPropertiesTest {

    @Autowired
    private ApplicationProperties applicationProperties;

    @Test
    void test_AppProperties() {
        assertThat(applicationProperties.getApplicationName()).isEqualTo("some name");
        assertThat(applicationProperties.getPort()).isEqualTo("1234");
    }
}

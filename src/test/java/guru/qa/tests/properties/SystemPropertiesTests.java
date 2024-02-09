package guru.qa.tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {
    @Test
    void systemPropertyTest() {
        System.setProperty("browser", "chrome");

        System.out.println(System.getProperty("browser"));
    }

    @Test
    void systemProperty1Test() {
        System.setProperty("browser", "mozilla");

        System.out.println(System.getProperty("browser"));
    }

    @Test
    void systemProperty2Test() {
        System.out.println(System.getProperty("browser"));
    }

    @Test
    void systemProperty3Test() {
        System.out.println(System.getProperty("browser", "safari"));
    }

    @Test
    void systemProperty4Test() {
        System.setProperty("browser", "mozilla");

        System.out.println(System.getProperty("browser", "safari"));
    }

    @Test
    @Tag("property1")
    void systemProperty5Test() {
        System.out.println(System.getProperty("browser", "safari"));
    }

}

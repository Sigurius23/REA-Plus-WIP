package rea.fixture;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/** Parsed by the real Android lane; fixture code is never loaded or executed. */
public class AnnotationFixture {
  public static final String ROUTE = "/fixture/first";
  public static final String OTHER_ROUTE = "/fixture/second";
  public static final int COUNT = 7;

  public enum Mode { ACTIVE }

  @Retention(RetentionPolicy.RUNTIME)
  public @interface Nested { String value(); }

  @Retention(RetentionPolicy.RUNTIME)
  public @interface Marker {
    String route();
    boolean hasBody();
    int count();
    Nested nested();
    String[] routes();
    Mode mode();
  }

  @Marker(route = ROUTE, hasBody = true, count = COUNT, nested = @Nested(ROUTE),
      routes = { ROUTE, OTHER_ROUTE }, mode = Mode.ACTIVE)
  public String request() { return ROUTE; }

  @Marker(route = OTHER_ROUTE, hasBody = false, count = COUNT, nested = @Nested(OTHER_ROUTE),
      routes = { OTHER_ROUTE, ROUTE }, mode = Mode.ACTIVE)
  public String request(String suffix) { return OTHER_ROUTE + suffix; }
}

package org.springframework.test.context.aot;

import java.lang.Class;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.samples.petclinic.PetClinicIntegrationTests__TestContext001_ApplicationContextInitializer;
import org.springframework.samples.petclinic.service.ClinicServiceTests__TestContext005_ApplicationContextInitializer;
import org.springframework.samples.petclinic.system.CrashControllerTests__TestContext006_ApplicationContextInitializer;

/**
 * Generated mappings for {@link AotTestContextInitializers}.
 */
public class AotTestContextInitializers__Generated {
  public static Map<String, Supplier<ApplicationContextInitializer<? extends ConfigurableApplicationContext>>> getContextInitializers(
      ) {
    Map<String, Supplier<ApplicationContextInitializer<? extends ConfigurableApplicationContext>>> map = new HashMap<>();
    map.put("org.springframework.samples.petclinic.PetClinicIntegrationTests", () -> new PetClinicIntegrationTests__TestContext001_ApplicationContextInitializer());
    map.put("org.springframework.samples.petclinic.service.ClinicServiceTests", () -> new ClinicServiceTests__TestContext005_ApplicationContextInitializer());
    map.put("org.springframework.samples.petclinic.system.CrashControllerTests", () -> new CrashControllerTests__TestContext006_ApplicationContextInitializer());
    return map;
  }

  public static Map<String, Class<? extends ApplicationContextInitializer<?>>> getContextInitializerClasses(
      ) {
    Map<String, Class<? extends ApplicationContextInitializer<?>>> map = new HashMap<>();
    map.put("org.springframework.samples.petclinic.PetClinicIntegrationTests", PetClinicIntegrationTests__TestContext001_ApplicationContextInitializer.class);
    map.put("org.springframework.samples.petclinic.service.ClinicServiceTests", ClinicServiceTests__TestContext005_ApplicationContextInitializer.class);
    map.put("org.springframework.samples.petclinic.system.CrashControllerTests", CrashControllerTests__TestContext006_ApplicationContextInitializer.class);
    return map;
  }
}

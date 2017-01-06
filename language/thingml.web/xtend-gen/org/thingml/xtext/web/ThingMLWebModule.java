/**
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.web;

import com.google.inject.Provider;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.thingml.xtext.web.AbstractThingMLWebModule;

/**
 * Use this class to register additional components to be used within the web application.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class ThingMLWebModule extends AbstractThingMLWebModule {
  public ThingMLWebModule(final Provider<ExecutorService> arg0) {
    super(arg0);
  }
}

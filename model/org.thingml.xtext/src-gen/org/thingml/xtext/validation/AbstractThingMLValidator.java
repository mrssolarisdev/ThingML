/*
 * generated by Xtext 2.9.1
 */
package org.thingml.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractThingMLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE);
		return result;
	}
	
}

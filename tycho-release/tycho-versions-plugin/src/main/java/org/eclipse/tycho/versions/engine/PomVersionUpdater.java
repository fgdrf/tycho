/*******************************************************************************
 * Copyright (c) 2011, 2017 Sonatype Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sonatype Inc. - initial API and implementation
 *    Bachmann electronic GmbH. - #472579 Support setting the version for pomless builds
 *    Bachmann electronic GmbH. - #512326 Support product file names other than artifact id
 *******************************************************************************/
package org.eclipse.tycho.versions.engine;

import org.codehaus.plexus.component.annotations.Component;
import org.eclipse.tycho.versions.pom.PomFile;

/**
 * Updates pom version to match Eclipse/OSGi metadata.
 */
@Component(role = PomVersionUpdater.class, instantiationStrategy = "per-lookup")
public class PomVersionUpdater extends VersionUpdater {

    @Override
    protected void addVersionChange(VersionsEngine engine, PomFile pom, String osgiVersion) {
        engine.addVersionChange(new PomVersionChange(pom, osgiVersion));
    }

}

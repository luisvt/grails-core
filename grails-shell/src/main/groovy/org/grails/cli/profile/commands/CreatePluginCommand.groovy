/*
 * Copyright 2014 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.grails.cli.profile.commands

import groovy.transform.CompileStatic
import org.grails.build.parsing.CommandLine


/**
 * A command for creating a plugin
 *
 *
 * @author Graeme Rocher
 * @since 3.0
 */
@CompileStatic
class CreatePluginCommand extends CreateAppCommand {

    public static final String NAME = "create-plugin"

    @Override
    String getName() { NAME }

    @Override
    protected String getDefaultProfile() { "web-plugin" }
}

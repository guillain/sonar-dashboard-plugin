/*
 * Example Plugin for SonarQube
 * Copyright (C) 2009-2020 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonarsource.plugins.dashboard;

import org.sonar.api.Plugin;
import org.sonar.api.config.PropertyDefinition;

import org.sonarsource.plugins.dashboard.measures.ComputeSizeAverage;
import org.sonarsource.plugins.dashboard.measures.ComputeSizeRating;
import org.sonarsource.plugins.dashboard.measures.DashboardMetrics;
import org.sonarsource.plugins.dashboard.measures.SetSizeOnFilesSensor;

import static java.util.Arrays.asList;

/**
 * This class is the entry point for all extensions. It is referenced in pom.xml.
 */
public class DashboardPlugin implements Plugin {

  @Override
  public void define(Context context) {
    context
      .addExtensions(DashboardMetrics.class, SetSizeOnFilesSensor.class, ComputeSizeAverage.class, ComputeSizeRating.class);

  }
}

/**
 * Copyright 2011-2012 eBusiness Information, Groupe Excilys (www.excilys.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.excilys.ebi.gatling.core.config

object GatlingOptions {
	val DEFAULT_RUN_ID = "run"
}

case class GatlingOptions(
	var reportsOnlyDirectoryName: Option[String] = None,
	var noReports: Boolean = false,
	var configFilePath: Option[String] = None,
	var resultsDirectoryPath: Option[String] = None,
	var dataDirectoryPath: Option[String] = None,
	var requestBodiesDirectoryPath: Option[String] = None,
	var simulationSourcesDirectoryPath: Option[String] = None,
	var simulationBinariesDirectoryPath: Option[String] = None,
	var simulationClassNames: Option[List[String]] = None,
	var runName: String = GatlingOptions.DEFAULT_RUN_ID)
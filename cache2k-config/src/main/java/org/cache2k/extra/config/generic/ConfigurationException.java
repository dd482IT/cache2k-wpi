package org.cache2k.extra.config.generic;

/*-
 * #%L
 * cache2k config file support
 * %%
 * Copyright (C) 2000 - 2021 headissue GmbH, Munich
 * %%
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
 * #L%
 */

import org.cache2k.CacheException;

/**
 * Exception indicating something is wrong with the external (XML) configuration.
 * We do not use this exception inside the API and core package, instead
 * {@link IllegalArgumentException} is used.
 *
 * @author Jens Wilke
 */
public class ConfigurationException extends CacheException {

  public ConfigurationException(String message) {
    super(message);
  }

  public ConfigurationException(String message, Throwable cause) {
    super(message, cause);
  }

  public ConfigurationException(String message, String source) {
    super(message + " at " + source);
  }

  public ConfigurationException(String message, SourceLocation location) {
    super(message + " (" + location.getSource() + ":" + location.getLineNumber() + ")");
  }

}

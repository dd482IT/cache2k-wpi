package org.cache2k.annotation;

/*
 * #%L
 * cache2k API
 * %%
 * Copyright (C) 2000 - 2020 headissue GmbH, Munich
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

import javax.annotation.meta.TypeQualifierNickname;
import javax.annotation.meta.When;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Non null is the default. This annotation is rarely used.
 *
 * @author Jens Wilke
 * @see Nullable
 */
@Documented
@Target(value = {ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD,
  ElementType.TYPE_USE})
@TypeQualifierNickname
@javax.annotation.Nonnull(when = When.UNKNOWN)
@Retention(RetentionPolicy.RUNTIME)
public @interface NonNull {
}
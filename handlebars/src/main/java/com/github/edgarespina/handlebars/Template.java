/**
 * Copyright (c) 2012 Edgar Espina
 *
 * This file is part of Handlebars.java.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.edgarespina.handlebars;

import java.io.IOException;
import java.io.Writer;

/**
 * A compiled template created by {@link Handlebars#compile(String)}.
 *
 * @author edgar.espina
 * @since 0.1.0
 */
public interface Template {

  /**
   * Merge the template tree using the given context.
   *
   * @param context The context object. May be null.
   * @param writer The writer object. Required.
   * @throws IOException If a resource cannot be loaded.
   */
  void apply(Object context, Writer writer) throws IOException;

  /**
   * Merge the template tree using the given context.
   *
   * @param context The context object. May be null.
   * @return The resulting template.
   * @throws IOException If a resource cannot be loaded.
   */
  CharSequence apply(Object context) throws IOException;

  /**
   * Merge the template tree using the given context.
   *
   * @param context The context object. Required.
   * @param writer The writer object. Required.
   * @throws IOException If a resource cannot be loaded.
   */
  void apply(Context context, Writer writer) throws IOException;

  /**
   * Merge the template tree using the given context.
   *
   * @param context The context object. Required.
   * @return The resulting template.
   * @throws IOException If a resource cannot be loaded.
   */
  CharSequence apply(Context context) throws IOException;

  /**
   * Provide the raw text.
   *
   * @return The raw text.
   */
  String text();
}

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
package com.github.edgarespina.handlebars.cache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.github.edgarespina.handlebars.Template;
import com.github.edgarespina.handlebars.TemplateCache;

/**
 * A {@link TemplateCache} based on a {@link ConcurrentMap}.
 *
 * @author edgar.espina
 * @since 0.1.0
 */
public class ConcurrentMapCache implements TemplateCache {

  /**
   * NULL object.
   */
  private static final Object NULL = new Object();

  /**
   * The object storage.
   */
  private final ConcurrentMap<Object, Template> store =
      new ConcurrentHashMap<Object, Template>();

  @Override
  public void clear() {
    store.clear();
  }

  @Override
  public void evict(final Object key) {
    store.remove(key);
  }

  @Override
  public Template get(final Object key) {
    Template value = this.store.get(key);
    return value == NULL ? null : value;
  }

  @Override
  public void put(final Object key, final Template template) {
    store.put(key, template);
  }

}

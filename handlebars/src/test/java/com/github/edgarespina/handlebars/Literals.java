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

import java.util.HashMap;

public class Literals {
  public static <S, T> MapBuilder<S, T> $(final S key, final T value) {
    return new MapBuilder<S, T>().$(key, value);
  }

  @SuppressWarnings("serial")
  public static class MapBuilder<S, T> extends HashMap<S, T> {
    public MapBuilder() {
    }

    public MapBuilder<S, T> $(final S key, final T value) {
      put(key, value);
      return this;
    }
  }
}

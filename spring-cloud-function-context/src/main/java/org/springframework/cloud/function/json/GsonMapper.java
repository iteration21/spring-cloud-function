/*
 * Copyright 2012-2019 the original author or authors.
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

package org.springframework.cloud.function.json;

import java.lang.reflect.Type;

import com.google.gson.Gson;

/**
 * @author Dave Syer
 * @author Oleg Zhurakousky
 *
 */
public class GsonMapper implements JsonMapper {

	private final Gson gson;

	public GsonMapper(Gson gson) {
		this.gson = gson;
	}

	@Override
	public <T> T toObject(String json, Type type) {
		return this.gson.fromJson(json, type);
	}

	@Override
	public String toString(Object value) {
		return this.gson.toJson(value);
	}

}

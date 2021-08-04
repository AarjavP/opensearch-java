/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.opensearch.core.search;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.function.Function;

// typedef: _global.search._types.Profile

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_global/search/_types/profile.ts#L92-L94">API
 *      specification</a>
 */
@JsonpDeserializable
public class Profile implements JsonpSerializable {
	private final List<ShardProfile> shards;

	// ---------------------------------------------------------------------------------------------

	private Profile(Builder builder) {

		this.shards = ApiTypeHelper.unmodifiableRequired(builder.shards, this, "shards");

	}

	public static Profile of(Function<Builder, ObjectBuilder<Profile>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code shards}
	 */
	public final List<ShardProfile> shards() {
		return this.shards;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ApiTypeHelper.isDefined(this.shards)) {
			generator.writeKey("shards");
			generator.writeStartArray();
			for (ShardProfile item0 : this.shards) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Profile}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Profile> {
		private List<ShardProfile> shards;

		/**
		 * Required - API name: {@code shards}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>shards</code>.
		 */
		public final Builder shards(List<ShardProfile> list) {
			this.shards = _listAddAll(this.shards, list);
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 * <p>
		 * Adds one or more values to <code>shards</code>.
		 */
		public final Builder shards(ShardProfile value, ShardProfile... values) {
			this.shards = _listAdd(this.shards, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 * <p>
		 * Adds a value to <code>shards</code> using a builder lambda.
		 */
		public final Builder shards(Function<ShardProfile.Builder, ObjectBuilder<ShardProfile>> fn) {
			return shards(fn.apply(new ShardProfile.Builder()).build());
		}

		/**
		 * Builds a {@link Profile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Profile build() {
			_checkSingleUse();

			return new Profile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Profile}
	 */
	public static final JsonpDeserializer<Profile> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Profile::setupProfileDeserializer);

	protected static void setupProfileDeserializer(ObjectDeserializer<Profile.Builder> op) {

		op.add(Builder::shards, JsonpDeserializer.arrayDeserializer(ShardProfile._DESERIALIZER), "shards");

	}

}

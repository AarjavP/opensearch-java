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

package org.opensearch.client.opensearch.nodes;

import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.JsonpSerializable;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;

// typedef: nodes._types.NodeBufferPool


@JsonpDeserializable
public class NodeBufferPool implements JsonpSerializable {
	private final long count;

	private final String totalCapacity;

	private final long totalCapacityInBytes;

	private final String used;

	private final long usedInBytes;

	// ---------------------------------------------------------------------------------------------

	private NodeBufferPool(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.totalCapacity = ApiTypeHelper.requireNonNull(builder.totalCapacity, this, "totalCapacity");
		this.totalCapacityInBytes = ApiTypeHelper.requireNonNull(builder.totalCapacityInBytes, this,
				"totalCapacityInBytes");
		this.used = ApiTypeHelper.requireNonNull(builder.used, this, "used");
		this.usedInBytes = ApiTypeHelper.requireNonNull(builder.usedInBytes, this, "usedInBytes");

	}

	public static NodeBufferPool of(Function<Builder, ObjectBuilder<NodeBufferPool>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code total_capacity}
	 */
	public final String totalCapacity() {
		return this.totalCapacity;
	}

	/**
	 * Required - API name: {@code total_capacity_in_bytes}
	 */
	public final long totalCapacityInBytes() {
		return this.totalCapacityInBytes;
	}

	/**
	 * Required - API name: {@code used}
	 */
	public final String used() {
		return this.used;
	}

	/**
	 * Required - API name: {@code used_in_bytes}
	 */
	public final long usedInBytes() {
		return this.usedInBytes;
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("total_capacity");
		generator.write(this.totalCapacity);

		generator.writeKey("total_capacity_in_bytes");
		generator.write(this.totalCapacityInBytes);

		generator.writeKey("used");
		generator.write(this.used);

		generator.writeKey("used_in_bytes");
		generator.write(this.usedInBytes);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NodeBufferPool}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<NodeBufferPool> {
		private Long count;

		private String totalCapacity;

		private Long totalCapacityInBytes;

		private String used;

		private Long usedInBytes;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_capacity}
		 */
		public final Builder totalCapacity(String value) {
			this.totalCapacity = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_capacity_in_bytes}
		 */
		public final Builder totalCapacityInBytes(long value) {
			this.totalCapacityInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code used}
		 */
		public final Builder used(String value) {
			this.used = value;
			return this;
		}

		/**
		 * Required - API name: {@code used_in_bytes}
		 */
		public final Builder usedInBytes(long value) {
			this.usedInBytes = value;
			return this;
		}

		/**
		 * Builds a {@link NodeBufferPool}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NodeBufferPool build() {
			_checkSingleUse();

			return new NodeBufferPool(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NodeBufferPool}
	 */
	public static final JsonpDeserializer<NodeBufferPool> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			NodeBufferPool::setupNodeBufferPoolDeserializer);

	protected static void setupNodeBufferPoolDeserializer(ObjectDeserializer<NodeBufferPool.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::totalCapacity, JsonpDeserializer.stringDeserializer(), "total_capacity");
		op.add(Builder::totalCapacityInBytes, JsonpDeserializer.longDeserializer(), "total_capacity_in_bytes");
		op.add(Builder::used, JsonpDeserializer.stringDeserializer(), "used");
		op.add(Builder::usedInBytes, JsonpDeserializer.longDeserializer(), "used_in_bytes");

	}

}

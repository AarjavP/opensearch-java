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

package org.opensearch.clients.opensearch.core;

import org.opensearch.clients.json.JsonData;
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
import java.util.Map;
import java.util.function.Function;

// typedef: _global.render_search_template.Response

@JsonpDeserializable
public class RenderSearchTemplateResponse implements JsonpSerializable {
	private final Map<String, JsonData> templateOutput;

	// ---------------------------------------------------------------------------------------------

	private RenderSearchTemplateResponse(Builder builder) {

		this.templateOutput = ApiTypeHelper.unmodifiableRequired(builder.templateOutput, this, "templateOutput");

	}

	public static RenderSearchTemplateResponse of(Function<Builder, ObjectBuilder<RenderSearchTemplateResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code template_output}
	 */
	public final Map<String, JsonData> templateOutput() {
		return this.templateOutput;
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

		if (ApiTypeHelper.isDefined(this.templateOutput)) {
			generator.writeKey("template_output");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.templateOutput.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RenderSearchTemplateResponse}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RenderSearchTemplateResponse> {
		private Map<String, JsonData> templateOutput;

		/**
		 * Required - API name: {@code template_output}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>templateOutput</code>.
		 */
		public final Builder templateOutput(Map<String, JsonData> map) {
			this.templateOutput = _mapPutAll(this.templateOutput, map);
			return this;
		}

		/**
		 * Required - API name: {@code template_output}
		 * <p>
		 * Adds an entry to <code>templateOutput</code>.
		 */
		public final Builder templateOutput(String key, JsonData value) {
			this.templateOutput = _mapPut(this.templateOutput, key, value);
			return this;
		}

		/**
		 * Builds a {@link RenderSearchTemplateResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RenderSearchTemplateResponse build() {
			_checkSingleUse();

			return new RenderSearchTemplateResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RenderSearchTemplateResponse}
	 */
	public static final JsonpDeserializer<RenderSearchTemplateResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RenderSearchTemplateResponse::setupRenderSearchTemplateResponseDeserializer);

	protected static void setupRenderSearchTemplateResponseDeserializer(
			ObjectDeserializer<RenderSearchTemplateResponse.Builder> op) {

		op.add(Builder::templateOutput, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"template_output");

	}

}

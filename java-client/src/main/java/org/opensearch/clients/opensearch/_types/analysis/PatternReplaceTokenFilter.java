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

package org.opensearch.clients.opensearch._types.analysis;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;

// typedef: _types.analysis.PatternReplaceTokenFilter

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/analysis/token_filters.ts#L282-L287">API
 *      specification</a>
 */
@JsonpDeserializable
public class PatternReplaceTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final String flags;

	private final String pattern;

	private final String replacement;

	// ---------------------------------------------------------------------------------------------

	private PatternReplaceTokenFilter(Builder builder) {
		super(builder);

		this.flags = ApiTypeHelper.requireNonNull(builder.flags, this, "flags");
		this.pattern = ApiTypeHelper.requireNonNull(builder.pattern, this, "pattern");
		this.replacement = ApiTypeHelper.requireNonNull(builder.replacement, this, "replacement");

	}

	public static PatternReplaceTokenFilter of(Function<Builder, ObjectBuilder<PatternReplaceTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * TokenFilterDefinition variant kind.
	 */
	@Override
	public TokenFilterDefinition.Kind _tokenFilterDefinitionKind() {
		return TokenFilterDefinition.Kind.PatternReplace;
	}

	/**
	 * Required - API name: {@code flags}
	 */
	public final String flags() {
		return this.flags;
	}

	/**
	 * Required - API name: {@code pattern}
	 */
	public final String pattern() {
		return this.pattern;
	}

	/**
	 * Required - API name: {@code replacement}
	 */
	public final String replacement() {
		return this.replacement;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "pattern_replace");
		super.serializeInternal(generator, mapper);
		generator.writeKey("flags");
		generator.write(this.flags);

		generator.writeKey("pattern");
		generator.write(this.pattern);

		generator.writeKey("replacement");
		generator.write(this.replacement);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PatternReplaceTokenFilter}.
	 */

	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PatternReplaceTokenFilter> {
		private String flags;

		private String pattern;

		private String replacement;

		/**
		 * Required - API name: {@code flags}
		 */
		public final Builder flags(String value) {
			this.flags = value;
			return this;
		}

		/**
		 * Required - API name: {@code pattern}
		 */
		public final Builder pattern(String value) {
			this.pattern = value;
			return this;
		}

		/**
		 * Required - API name: {@code replacement}
		 */
		public final Builder replacement(String value) {
			this.replacement = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PatternReplaceTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PatternReplaceTokenFilter build() {
			_checkSingleUse();

			return new PatternReplaceTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PatternReplaceTokenFilter}
	 */
	public static final JsonpDeserializer<PatternReplaceTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PatternReplaceTokenFilter::setupPatternReplaceTokenFilterDeserializer);

	protected static void setupPatternReplaceTokenFilterDeserializer(
			ObjectDeserializer<PatternReplaceTokenFilter.Builder> op) {
		setupTokenFilterBaseDeserializer(op);
		op.add(Builder::flags, JsonpDeserializer.stringDeserializer(), "flags");
		op.add(Builder::pattern, JsonpDeserializer.stringDeserializer(), "pattern");
		op.add(Builder::replacement, JsonpDeserializer.stringDeserializer(), "replacement");

		op.ignore("type");
	}

}

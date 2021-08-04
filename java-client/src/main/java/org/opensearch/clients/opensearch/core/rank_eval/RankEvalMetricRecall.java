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

package org.opensearch.clients.opensearch.core.rank_eval;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.function.Function;

// typedef: _global.rank_eval.RankEvalMetricRecall

/**
 * Recall at K (R@k)
 * 
 * @see <a href=
 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-rank-eval.html#k-recall">Documentation
 *      on elastic.co</a>
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_global/rank_eval/types.ts#L54-L58">API
 *      specification</a>
 */
@JsonpDeserializable
public class RankEvalMetricRecall extends RankEvalMetricRatingTreshold {
	// ---------------------------------------------------------------------------------------------

	private RankEvalMetricRecall(Builder builder) {
		super(builder);

	}

	public static RankEvalMetricRecall of(Function<Builder, ObjectBuilder<RankEvalMetricRecall>> fn) {
		return fn.apply(new Builder()).build();
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RankEvalMetricRecall}.
	 */

	public static class Builder extends RankEvalMetricRatingTreshold.AbstractBuilder<Builder>
			implements
				ObjectBuilder<RankEvalMetricRecall> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RankEvalMetricRecall}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RankEvalMetricRecall build() {
			_checkSingleUse();

			return new RankEvalMetricRecall(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RankEvalMetricRecall}
	 */
	public static final JsonpDeserializer<RankEvalMetricRecall> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RankEvalMetricRecall::setupRankEvalMetricRecallDeserializer);

	protected static void setupRankEvalMetricRecallDeserializer(ObjectDeserializer<RankEvalMetricRecall.Builder> op) {
		RankEvalMetricRatingTreshold.setupRankEvalMetricRatingTresholdDeserializer(op);

	}

}

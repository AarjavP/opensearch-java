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

package org.opensearch.clients.opensearch.dangling_indices;

import org.opensearch.clients.ApiClient;
import org.opensearch.clients.opensearch._types.ElasticsearchException;
import org.opensearch.clients.opensearch._types.ErrorResponse;
import org.opensearch.clients.transport.ElasticsearchTransport;
import org.opensearch.clients.transport.JsonEndpoint;
import org.opensearch.clients.transport.TransportOptions;
import org.opensearch.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the dangling_indices namespace.
 */
public class ElasticsearchDanglingIndicesClient
		extends
			ApiClient<ElasticsearchTransport, ElasticsearchDanglingIndicesClient> {

	public ElasticsearchDanglingIndicesClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchDanglingIndicesClient(ElasticsearchTransport transport,
			@Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchDanglingIndicesClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchDanglingIndicesClient(this.transport, transportOptions);
	}

	// ----- Endpoint: dangling_indices.delete_dangling_index

	/**
	 * Deletes the specified dangling index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteDanglingIndexResponse deleteDanglingIndex(DeleteDanglingIndexRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteDanglingIndexRequest, DeleteDanglingIndexResponse, ErrorResponse> endpoint =
				(JsonEndpoint<DeleteDanglingIndexRequest, DeleteDanglingIndexResponse, ErrorResponse>)
						DeleteDanglingIndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Deletes the specified dangling index
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteDanglingIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteDanglingIndexResponse deleteDanglingIndex(
			Function<DeleteDanglingIndexRequest.Builder, ObjectBuilder<DeleteDanglingIndexRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteDanglingIndex(fn.apply(new DeleteDanglingIndexRequest.Builder()).build());
	}

	// ----- Endpoint: dangling_indices.import_dangling_index

	/**
	 * Imports the specified dangling index
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public ImportDanglingIndexResponse importDanglingIndex(ImportDanglingIndexRequest request)
			throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<ImportDanglingIndexRequest, ImportDanglingIndexResponse, ErrorResponse> endpoint =
				(JsonEndpoint<ImportDanglingIndexRequest, ImportDanglingIndexResponse, ErrorResponse>)
						ImportDanglingIndexRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Imports the specified dangling index
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ImportDanglingIndexRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ImportDanglingIndexResponse importDanglingIndex(
			Function<ImportDanglingIndexRequest.Builder, ObjectBuilder<ImportDanglingIndexRequest>> fn)
			throws IOException, ElasticsearchException {
		return importDanglingIndex(fn.apply(new ImportDanglingIndexRequest.Builder()).build());
	}

	// ----- Endpoint: dangling_indices.list_dangling_indices

	/**
	 * Returns all dangling indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-gateway-dangling-indices.html">Documentation
	 *      on elastic.co</a>
	 */
	public ListDanglingIndicesResponse listDanglingIndices() throws IOException, ElasticsearchException {
		return this.transport.performRequest(ListDanglingIndicesRequest._INSTANCE, ListDanglingIndicesRequest._ENDPOINT,
				this.transportOptions);
	}

}

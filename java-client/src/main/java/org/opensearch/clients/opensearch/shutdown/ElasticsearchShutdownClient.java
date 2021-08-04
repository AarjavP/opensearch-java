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

package org.opensearch.clients.opensearch.shutdown;

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
 * Client for the shutdown namespace.
 */
public class ElasticsearchShutdownClient extends ApiClient<ElasticsearchTransport, ElasticsearchShutdownClient> {

	public ElasticsearchShutdownClient(ElasticsearchTransport transport) {
		super(transport, null);
	}

	public ElasticsearchShutdownClient(ElasticsearchTransport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchShutdownClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchShutdownClient(this.transport, transportOptions);
	}

	// ----- Endpoint: shutdown.delete_node

	/**
	 * Removes a node from the shutdown list. Designed for indirect use by ECE/ESS
	 * and ECK. Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public DeleteNodeResponse deleteNode(DeleteNodeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<DeleteNodeRequest, DeleteNodeResponse, ErrorResponse> endpoint =
				(JsonEndpoint<DeleteNodeRequest, DeleteNodeResponse, ErrorResponse>) DeleteNodeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Removes a node from the shutdown list. Designed for indirect use by ECE/ESS
	 * and ECK. Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeleteNodeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public final DeleteNodeResponse deleteNode(Function<DeleteNodeRequest.Builder, ObjectBuilder<DeleteNodeRequest>> fn)
			throws IOException, ElasticsearchException {
		return deleteNode(fn.apply(new DeleteNodeRequest.Builder()).build());
	}

	// ----- Endpoint: shutdown.get_node

	/**
	 * Retrieve status of a node or nodes that are currently marked as shutting
	 * down. Designed for indirect use by ECE/ESS and ECK. Direct use is not
	 * supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public GetNodeResponse getNode(GetNodeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<GetNodeRequest, GetNodeResponse, ErrorResponse> endpoint =
				(JsonEndpoint<GetNodeRequest, GetNodeResponse, ErrorResponse>) GetNodeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Retrieve status of a node or nodes that are currently marked as shutting
	 * down. Designed for indirect use by ECE/ESS and ECK. Direct use is not
	 * supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetNodeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public final GetNodeResponse getNode(Function<GetNodeRequest.Builder, ObjectBuilder<GetNodeRequest>> fn)
			throws IOException, ElasticsearchException {
		return getNode(fn.apply(new GetNodeRequest.Builder()).build());
	}

	/**
	 * Retrieve status of a node or nodes that are currently marked as shutting
	 * down. Designed for indirect use by ECE/ESS and ECK. Direct use is not
	 * supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public GetNodeResponse getNode() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new GetNodeRequest.Builder().build(), GetNodeRequest._ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: shutdown.put_node

	/**
	 * Adds a node to be shut down. Designed for indirect use by ECE/ESS and ECK.
	 * Direct use is not supported.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public PutNodeResponse putNode(PutNodeRequest request) throws IOException, ElasticsearchException {
		@SuppressWarnings("unchecked")
		JsonEndpoint<PutNodeRequest, PutNodeResponse, ErrorResponse> endpoint =
				(JsonEndpoint<PutNodeRequest, PutNodeResponse, ErrorResponse>) PutNodeRequest._ENDPOINT;

		return this.transport.performRequest(request, endpoint, this.transportOptions);
	}

	/**
	 * Adds a node to be shut down. Designed for indirect use by ECE/ESS and ECK.
	 * Direct use is not supported.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutNodeRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current">Documentation
	 *      on elastic.co</a>
	 */

	public final PutNodeResponse putNode(Function<PutNodeRequest.Builder, ObjectBuilder<PutNodeRequest>> fn)
			throws IOException, ElasticsearchException {
		return putNode(fn.apply(new PutNodeRequest.Builder()).build());
	}

}

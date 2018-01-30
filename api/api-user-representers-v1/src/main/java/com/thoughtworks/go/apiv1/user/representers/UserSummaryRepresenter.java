/*
 * Copyright 2018 ThoughtWorks, Inc.
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

package com.thoughtworks.go.apiv1.user.representers;

import com.thoughtworks.go.api.representers.JsonWriter;
import com.thoughtworks.go.spark.RequestContext;
import com.thoughtworks.go.spark.Routes;

import java.util.Map;

public class UserSummaryRepresenter {
    public static Map<String, Object> toJSON(String loginName, RequestContext requestContext) {
        return getJsonWriter(loginName, requestContext).getAsMap();
    }

    public static JsonWriter getJsonWriter(String loginName, RequestContext requestContext) {
        return addLinks(loginName, new JsonWriter(requestContext))
                .add("login_name", loginName);
    }

    private static JsonWriter addLinks(String loginName, JsonWriter jsonWriter) {
        return jsonWriter.addDocLink(Routes.UserSummary.DOC)
                .addLink("self", Routes.UserSummary.self(loginName))
                .addLink("find", Routes.UserSummary.find())
                .addLink("current_user", Routes.UserSummary.CURRENT_USER);
    }

}
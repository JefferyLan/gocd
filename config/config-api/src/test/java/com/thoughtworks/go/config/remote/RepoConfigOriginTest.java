/*
 * Copyright 2017 ThoughtWorks, Inc.
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
package com.thoughtworks.go.config.remote;

import com.thoughtworks.go.config.materials.svn.SvnMaterialConfig;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class RepoConfigOriginTest {

    @Test
    public void shouldShowDisplayName()
    {
        RepoConfigOrigin repoConfigOrigin = new RepoConfigOrigin(new ConfigRepoConfig(new SvnMaterialConfig("http://mysvn", false), "myplugin"), "123");
        assertThat(repoConfigOrigin.displayName(),is("http://mysvn at 123"));
    }

    // because we don't like null pointer exceptions
    // and empty config like this can happen in tests
    @Test
    public void shouldShowDisplayNameWhenEmptyConfig()
    {
        RepoConfigOrigin repoConfigOrigin = new RepoConfigOrigin();
        assertThat(repoConfigOrigin.displayName(),is("NULL material at null"));
    }


}

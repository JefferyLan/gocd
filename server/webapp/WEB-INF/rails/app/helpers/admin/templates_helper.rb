##########################GO-LICENSE-START################################
# Copyright 2017 ThoughtWorks, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
##########################GO-LICENSE-END##################################

module Admin
  module TemplatesHelper
    def default_url_options(options = nil)
      super.reverse_merge(params.only(:allow_pipeline_selection).symbolize_keys)
    end

    TRUE = true.to_s

    def allow_pipeline_selection?
      params[:allow_pipeline_selection] == TRUE
    end
  end
end
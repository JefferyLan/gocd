##########################GO-LICENSE-START################################
# Copyright 2014 ThoughtWorks, Inc.
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

require 'rails_helper'

describe ::ConfigUpdate::RefsAsUpdatedRefs do
  include ::ConfigUpdate::RefsAsUpdatedRefs

  it "should return node as updated node" do
    expect(self.class.included_modules).to include(::ConfigUpdate::NodeAsUpdatedNode, ::ConfigUpdate::SubjectAsUpdatedSubject)
  end
end

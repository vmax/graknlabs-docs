#
# GRAKN.AI - THE KNOWLEDGE GRAPH
# Copyright (C) 2018 Grakn Labs Ltd
#
# This program is free software: you can redistribute it and/or modify
# it under the terms of the GNU Affero General Public License as
# published by the Free Software Foundation, either version 3 of the
# License, or (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU Affero General Public License for more details.
#
# You should have received a copy of the GNU Affero General Public License
# along with this program.  If not, see <https://www.gnu.org/licenses/>.
#

load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")

def graknlabs_grakn_core():
    git_repository(
        name = "graknlabs_grakn_core",
        remote = "https://github.com/graknlabs/grakn",
        commit = '5b2ea242f5d2f9018569475c3ae010fa2323cd94' # sync-marker: do not remove this comment, this is used for sync-dependencies by @graknlabs_grakn_core
    )

def graknlabs_client_java():
     git_repository(
         name = "graknlabs_client_java",
         remote = "https://github.com/graknlabs/client-java",
         commit = '81a01c1c58ebe54ac1e1b7bec8b33f712f1cb3eb' # sync-marker: do not remove this comment, this is used for sync-dependencies by @graknlabs_client_java
     )

def graknlabs_client_python():
     git_repository(
         name = "graknlabs_client_python",
         remote = "https://github.com/graknlabs/client-python",
         commit = '9566752c3bb675140f35fc08c20f4eec50c679a6' # sync-marker: do not remove this comment, this is used for sync-dependencies by @graknlabs_client_python
     )

def graknlabs_build_tools():
     git_repository(
         name = "graknlabs_build_tools",
         remote = "https://github.com/graknlabs/build-tools",
         commit = "c34e8f7339db66a68e14b20757da1cdc25c462eb", # sync-marker: do not remove this comment, this is used for sync-dependencies by @graknlabs_build_tools
     )


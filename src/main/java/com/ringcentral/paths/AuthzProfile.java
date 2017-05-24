package com.ringcentral.paths;

import com.ringcentral.definitions.UserPermission;

public class AuthzProfile {
    static
    public class GetResponse {
        // Canonical URI of an authorization profile resource
        public String uri;
        // List of user permissions granted
        public UserPermission[] permissions;

        public GetResponse uri(String uri) {
            this.uri = uri;
            return this;
        }

        public GetResponse permissions(UserPermission[] permissions) {
            this.permissions = permissions;
            return this;
        }
    }
}
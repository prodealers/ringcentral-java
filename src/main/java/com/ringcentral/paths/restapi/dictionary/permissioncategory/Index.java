package com.ringcentral.paths.restapi.dictionary.permissioncategory;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.ListPermissionCategoriesParameters;
import com.ringcentral.definitions.PermissionCategoryCollectionResource;
import com.ringcentral.definitions.PermissionCategoryResource;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.dictionary.Index parent;
    public String permissionCategoryId;

    public Index(com.ringcentral.paths.restapi.dictionary.Index parent, String permissionCategoryId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.permissionCategoryId = permissionCategoryId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && permissionCategoryId != null) {
            return parent.path() + "/permission-category/" + permissionCategoryId;
        }
        return parent.path() + "/permission-category";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of permission categories.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/permission-category
     * Rate Limit Group: Light
     */
    public PermissionCategoryCollectionResource list(ListPermissionCategoriesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PermissionCategoryCollectionResource.class);
    }

    public PermissionCategoryCollectionResource list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Returns permission category by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/dictionary/permission-category/{permissionCategoryId}
     * Rate Limit Group: Light
     */
    public PermissionCategoryResource get() throws com.ringcentral.RestException, java.io.IOException {
        if (permissionCategoryId == null) {
            throw new IllegalArgumentException("Parameter permissionCategoryId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), PermissionCategoryResource.class);
    }
}

package com.ringcentral.paths.restapi.account.ivrmenus;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.IVRMenuInfo;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String ivrMenuId;

    public Index(com.ringcentral.paths.restapi.account.Index parent, String ivrMenuId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.ivrMenuId = ivrMenuId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && ivrMenuId != null) {
            return parent.path() + "/ivr-menus/" + ivrMenuId;
        }
        return parent.path() + "/ivr-menus";
    }

    public String path() {
        return path(true);
    }

    /**
     * Creates a company IVR menu.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/ivr-menus
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: AutoReceptionist
     */
    public IVRMenuInfo post(IVRMenuInfo iVRMenuInfo) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), iVRMenuInfo, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), IVRMenuInfo.class);
    }

    /**
     * Returns a company IVR menu by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/ivr-menus/{ivrMenuId}
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: AutoReceptionist
     */
    public IVRMenuInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (ivrMenuId == null) {
            throw new IllegalArgumentException("Parameter ivrMenuId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), IVRMenuInfo.class);
    }

    /**
     * Updates a company IVR menu by ID.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/ivr-menus/{ivrMenuId}
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: AutoReceptionist
     */
    public IVRMenuInfo put(IVRMenuInfo iVRMenuInfo) throws com.ringcentral.RestException, java.io.IOException {
        if (ivrMenuId == null) {
            throw new IllegalArgumentException("Parameter ivrMenuId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), iVRMenuInfo, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), IVRMenuInfo.class);
    }
}

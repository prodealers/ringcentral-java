package com.ringcentral.paths.restapi.account.emergencylocations;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.Index parent;
    public String locationId;

    public Index(com.ringcentral.paths.restapi.account.Index parent, String locationId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.locationId = locationId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && locationId != null) {
            return parent.path() + "/emergency-locations/" + locationId;
        }
        return parent.path() + "/emergency-locations";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns emergency response locations of the current account.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-locations
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public EmergencyLocationList list(ListEmergencyLocationsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), EmergencyLocationList.class);
    }

    public EmergencyLocationList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates a new emergency response location for the company.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-locations
     * Rate Limit Group: Medium
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public String post(EmergencyLocationInfoRequest emergencyLocationInfoRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), emergencyLocationInfoRequest, null);
        return rb.string();
    }

    /**
     * Returns emergency response location by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-locations/{locationId}
     * Rate Limit Group: Light
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public EmergencyLocationInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (locationId == null) {
            throw new IllegalArgumentException("Parameter locationId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), EmergencyLocationInfo.class);
    }

    /**
     * Updates the specified emergency response location.
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-locations/{locationId}
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public EmergencyLocationInfo put(EmergencyLocationInfoRequest emergencyLocationInfoRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (locationId == null) {
            throw new IllegalArgumentException("Parameter locationId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), emergencyLocationInfoRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), EmergencyLocationInfo.class);
    }

    /**
     * Deletes the specified emergency response location.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-locations/{locationId}
     * Rate Limit Group: Heavy
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public String delete(DeleteEmergencyLocationParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        if (locationId == null) {
            throw new IllegalArgumentException("Parameter locationId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), queryParams);
        return rb.string();
    }

    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        return this.delete(null);
    }
}

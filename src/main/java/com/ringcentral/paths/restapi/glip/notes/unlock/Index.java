package com.ringcentral.paths.restapi.glip.notes.unlock;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.notes.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.notes.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/unlock";
    }

    /**
     * Unlocks a note letting other users edit this note. Once the note is locked (by another user) it cannot be unlocked during 5 hours since the lock datetime.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/notes/{noteId}/unlock
     * Rate Limit Group: Light
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}

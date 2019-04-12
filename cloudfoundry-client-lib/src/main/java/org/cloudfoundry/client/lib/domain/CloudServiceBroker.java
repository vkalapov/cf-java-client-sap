package org.cloudfoundry.client.lib.domain;

public class CloudServiceBroker extends CloudEntity {

    private String username;
    private String password;
    private String url;
    private String spaceGuid;

    public CloudServiceBroker() {
        super();
    }

    public CloudServiceBroker(Meta meta, String name) {
        super(meta, name);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSpaceGuid() {
        return spaceGuid;
    }

    public void setSpaceGuid(String spaceGuid) {
        this.spaceGuid = spaceGuid;
    }

}
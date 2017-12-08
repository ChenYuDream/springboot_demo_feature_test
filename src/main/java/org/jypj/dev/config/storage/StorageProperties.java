package org.jypj.dev.config.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ChenYu
 */
@ConfigurationProperties(prefix = "storage")
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

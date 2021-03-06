package com.oguzdirenc.notebook.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories(basePackages = {"com.oguzdirenc.notebook.repositories"})
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

    @Override
    public String getConnectionString() {
        return "couchbase://127.0.0.1";
    }

    @Override
    public String getUserName() {
        return "oguzdirenc";
    }

    @Override
    public String getPassword() {
        return "abc123";
    }

    @Override
    public String getBucketName() {
        return "notebook";
    }
}

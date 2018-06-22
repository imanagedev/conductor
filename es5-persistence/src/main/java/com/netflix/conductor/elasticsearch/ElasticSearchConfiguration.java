package com.netflix.conductor.elasticsearch;

import com.netflix.conductor.core.config.Configuration;

public interface ElasticSearchConfiguration extends Configuration {

    String ELASTIC_SEARCH_URL_PROPERTY_NAME = "workflow.elasticsearch.url";
    String ELASTIC_SEARCH_URL_DEFAULT_VALUE = "localhost:9300";

    String ELASTIC_SEARCH_INDEX_NAME_PROPERTY_NAME = "workflow.elasticsearch.index.name";
    String ELASTIC_SEARCH_INDEX_NAME_DEFAULT_VALUE = "conductor";

    String EMBEDDED_DATA_PATH_PROPERTY_NAME = "workflow.elasticsearch.embedded.data.path";
    String EMBEDDED_DATA_PATH_DEFAULT_VALUE = "path.data";

    String EMBEDDED_HOME_PATH_PROPERTY_NAME = "workflow.elasticsearch.embedded.data.home";
    String EMBEDDED_HOME_PATH_DEFAULT_VALUE = "path.home";

    String EMBEDDED_PORT_PROPERTY_NAME = "workflow.elasticsearch.embedded.port";
    int EMBEDDED_PORT_DEFAULT_VALUE = 9200;

    String EMBEDDED_CLUSTER_NAME_PROPERTY_NAME = "workflow.elasticsearch.embedded.cluster.name";
    String EMBEDDED_CLUSTER_NAME_DEFAULT_VALUE = "elasticsearch_test";

    String EMBEDDED_HOST_PROPERTY_NAME = "workflow.elasticsearch.embedded.host";
    String EMBEDDED_HOST_DEFAULT_VALUE = "127.0.0.1";

    String EMBEDDED_SETTINGS_FILE_PROPERTY_NAME = "workflow.elasticsearch.embedded.settings.file";
    String EMBEDDED_SETTINGS_FILE_DEFAULT_VALUE = "embedded-es.yml";

    default String getURL() {
        return getProperty(ELASTIC_SEARCH_URL_PROPERTY_NAME, ELASTIC_SEARCH_URL_DEFAULT_VALUE);
    }

    default String getIndexName() {
        return getProperty(ELASTIC_SEARCH_INDEX_NAME_PROPERTY_NAME, ELASTIC_SEARCH_INDEX_NAME_DEFAULT_VALUE);
    }

    default String getEmbeddedDataPath() {
        return getProperty(EMBEDDED_DATA_PATH_PROPERTY_NAME, EMBEDDED_DATA_PATH_DEFAULT_VALUE);
    }

    default String getEmbeddedHomePath() {
        return getProperty(EMBEDDED_HOME_PATH_PROPERTY_NAME, EMBEDDED_HOME_PATH_DEFAULT_VALUE);
    }

    default int getEmbeddedPort() {
        return getIntProperty(EMBEDDED_PORT_PROPERTY_NAME, EMBEDDED_PORT_DEFAULT_VALUE);
    }

    default String getEmbeddedClusterName() {
        return getProperty(EMBEDDED_CLUSTER_NAME_PROPERTY_NAME, EMBEDDED_CLUSTER_NAME_DEFAULT_VALUE);
    }

    default String getEmbeddedHost() {
        return getProperty(EMBEDDED_HOST_PROPERTY_NAME, EMBEDDED_HOST_DEFAULT_VALUE);
    }

    default String getEmbeddedSettingsFile() {
        return getProperty(EMBEDDED_SETTINGS_FILE_PROPERTY_NAME, EMBEDDED_SETTINGS_FILE_DEFAULT_VALUE);
    }
}

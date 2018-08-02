package io.smartup.localstack.configurator;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementClient;

public class AmazonSSMConfigurator extends AbstractAmazonClientConfigurator<AWSSimpleSystemsManagementClient> {
    @Override
    public Class<AWSSimpleSystemsManagementClient> getAmazonClientClass() {
        return AWSSimpleSystemsManagementClient.class;
    }

    @Override
    public String getEndpoint() {
        return getLocalStackHost(4583);
    }

    @Override
    public Region getRegion() {
        return Region.getRegion(Regions.DEFAULT_REGION);
    }
}

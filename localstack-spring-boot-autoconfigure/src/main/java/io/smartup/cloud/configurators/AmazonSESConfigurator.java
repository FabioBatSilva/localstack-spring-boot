package io.smartup.cloud.configurators;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;

public class AmazonSESConfigurator extends AbstractAmazonClientConfigurator<AmazonSimpleEmailService> {
    @Override
    public Class<AmazonSimpleEmailService> getAmazonClientClass() {
        return AmazonSimpleEmailService.class;
    }

    @Override
    public String getEndpoint() {
        return "http://localhost:4565";
    }

    @Override
    public Region getRegion() {
        return Region.getRegion(Regions.DEFAULT_REGION);
    }
}

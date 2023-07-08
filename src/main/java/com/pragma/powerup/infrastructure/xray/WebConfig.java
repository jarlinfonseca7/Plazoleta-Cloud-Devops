package com.pragma.powerup.infrastructure.xray;

import com.amazonaws.xray.AWSXRay;
import com.amazonaws.xray.AWSXRayRecorderBuilder;
import com.amazonaws.xray.javax.servlet.AWSXRayServletFilter;
import com.amazonaws.xray.metrics.MetricsSegmentListener;
import com.amazonaws.xray.plugins.EC2Plugin;
import com.amazonaws.xray.plugins.ElasticBeanstalkPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.servlet.Filter;

@Configuration
public class WebConfig {
    static {
        AWSXRayRecorderBuilder builder = AWSXRayRecorderBuilder
                .standard()
                .withPlugin(new EC2Plugin())
                .withPlugin(new ElasticBeanstalkPlugin())
                .withSegmentListener(new MetricsSegmentListener());
        AWSXRay.setGlobalRecorder(builder.build());
    }
    @Bean
    public Filter TracingFilter() {
        return new AWSXRayServletFilter("plazoleta-service");
    }
}

package com.pragma.powerup.infrastructure.feignconfiguration;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Component
public class SecurityFeignRequestInterceptor implements RequestInterceptor {

    private static  final  String AUTHORIZATION_HEADER = "Authorization";
    @Override
    public void apply(RequestTemplate template) {
        template.header(AUTHORIZATION_HEADER, getBearerTokenHeader());
    }

    public static String getBearerTokenHeader(){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (requestAttributes != null) {
            HttpServletRequest request = requestAttributes.getRequest();
            if (request != null) {
                System.out.println(request.getHeader("Authorization"));
                return request.getHeader("Authorization");
            }
        }
        return null;
    }
}

package com.pragma.powerup.infrastructure.out.token;

import com.pragma.powerup.domain.spi.bearertoken.IToken;
import com.pragma.powerup.infrastructure.security.TokenUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

public class TokenAdapter implements IToken {
    @Override
    public String getBearerToken() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (requestAttributes != null) {
            HttpServletRequest request = requestAttributes.getRequest();
            if (request != null) {
                return request.getHeader("Authorization");
            }
        }
        return null;
    }

    @Override
    public String getCorreo(String token) {
        return TokenUtils.getCorreo(token.replace("Bearer ",""));
    }

    @Override
    public Long getUsuarioAutenticadoId(String token) {
        return  TokenUtils.getUsuarioAutenticadoId(token.replace("Bearer ",""));
    }
}

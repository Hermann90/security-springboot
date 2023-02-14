package org.sid.securityservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/**
 * This class allows to retrieve the keys in the configuration file application.properties
 * @param publicKey
 * @param privateKey
 */
@ConfigurationProperties(prefix = "rsa")
public record RsakeysConfig(RSAPublicKey publicKey, RSAPrivateKey privateKey) {
}

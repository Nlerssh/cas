package org.apereo.cas.configuration.model.support.pac4j;

import java.io.Serializable;

/**
 * This is {@link Pac4jSamlProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.2.0
 */
public class Pac4jSamlProperties implements Serializable {
    private static final long serialVersionUID = -862819796533384951L;
    /**
     * The password to use when generating the SP/CAS keystore.
     */
    private String keystorePassword;
    /**
     * The password to use when generating the private key for the SP/CAS keystore.
     */
    private String privateKeyPassword;
    /**
     * Location of the keystore to use and generate the SP/CAS keystore.
     */
    private String keystorePath;
    /**
     * The metadata location of the identity provider that is to handle authentications.
     */
    private String identityProviderMetadataPath;
    /**
     * Once you have an authenticated session on the identity provider, usually it won't prompt you again to enter your
     * credentials and it will automatically generate a new assertion for you. By default, the SAML client
     * will accept assertions based on a previous authentication for one hour.
     * You can adjust this behavior by modifying this setting. The unit of time here is seconds.
     */
    private int maximumAuthenticationLifetime = 600;

    /**
     * The entity id of the SP/CAS that is used in the SP metadata generation process.
     */
    private String serviceProviderEntityId;
    /**
     * Location of the SP metadata to use and generate.
     */
    private String serviceProviderMetadataPath;

    /**
     * Name of the SAML client mostly for UI purposes and uniqueness.
     */
    private String clientName;

    /**
     * Whether authentication requests should be tagged as forced auth.
     */
    private boolean forceAuth;
    /**
     * Whether authentication requests should be tagged as passive.
     */
    private boolean passive;

    /**
     * Requested authentication context class in authn requests.
     */
    private String authnContextClassRef;
    /**
     * Specifies the comparison rule that should be used to evaluate the specified authentication methods.
     * For example, if exact is specified, the authentication method used must match one of the authentication
     * methods specified by the AuthnContextClassRef elements.
     * AuthContextClassRef element require comparison rule to be used to evaluate the specified
     * authentication methods. If not explicitly specified "exact" rule will be used by default.
     * Other acceptable values are minimum, maximum, better.
     */
    private String authnContextComparisonType = "exact";

    /**
     * The key alias used in the keystore.
     */
    private String keystoreAlias;
    /**
     * NameID policy to request in the authentication requests.
     */
    private String nameIdPolicyFormat;
    /**
     * Whether metadata should be marked to request sign assertions.
     */
    private boolean wantsAssertionsSigned;

    public boolean isPassive() {
        return passive;
    }

    public void setPassive(final boolean passive) {
        this.passive = passive;
    }

    public boolean isForceAuth() {
        return forceAuth;
    }

    public void setForceAuth(final boolean forceAuth) {
        this.forceAuth = forceAuth;
    }

    public String getAuthnContextClassRef() {
        return authnContextClassRef;
    }

    public void setAuthnContextClassRef(final String authnContextClassRef) {
        this.authnContextClassRef = authnContextClassRef;
    }

    public String getAuthnContextComparisonType() {
        return authnContextComparisonType;
    }

    public void setAuthnContextComparisonType(final String authnContextComparisonType) {
        this.authnContextComparisonType = authnContextComparisonType;
    }

    public String getKeystoreAlias() {
        return keystoreAlias;
    }

    public void setKeystoreAlias(final String keystoreAlias) {
        this.keystoreAlias = keystoreAlias;
    }

    public String getNameIdPolicyFormat() {
        return nameIdPolicyFormat;
    }

    public void setNameIdPolicyFormat(final String nameIdPolicyFormat) {
        this.nameIdPolicyFormat = nameIdPolicyFormat;
    }

    public boolean isWantsAssertionsSigned() {
        return wantsAssertionsSigned;
    }

    public void setWantsAssertionsSigned(final boolean wantsAssertionsSigned) {
        this.wantsAssertionsSigned = wantsAssertionsSigned;
    }

    public String getKeystorePassword() {
        return this.keystorePassword;
    }

    public void setKeystorePassword(final String keystorePassword) {
        this.keystorePassword = keystorePassword;
    }

    public String getPrivateKeyPassword() {
        return this.privateKeyPassword;
    }

    public void setPrivateKeyPassword(final String privateKeyPassword) {
        this.privateKeyPassword = privateKeyPassword;
    }

    public String getKeystorePath() {
        return this.keystorePath;
    }

    public void setKeystorePath(final String keystorePath) {
        this.keystorePath = keystorePath;
    }

    public String getIdentityProviderMetadataPath() {
        return this.identityProviderMetadataPath;
    }

    public void setIdentityProviderMetadataPath(final String identityProviderMetadataPath) {
        this.identityProviderMetadataPath = identityProviderMetadataPath;
    }

    public int getMaximumAuthenticationLifetime() {
        return this.maximumAuthenticationLifetime;
    }

    public void setMaximumAuthenticationLifetime(final int maximumAuthenticationLifetime) {
        this.maximumAuthenticationLifetime = maximumAuthenticationLifetime;
    }

    public String getServiceProviderEntityId() {
        return this.serviceProviderEntityId;
    }

    public void setServiceProviderEntityId(final String serviceProviderEntityId) {
        this.serviceProviderEntityId = serviceProviderEntityId;
    }

    public String getServiceProviderMetadataPath() {
        return serviceProviderMetadataPath;
    }

    public void setServiceProviderMetadataPath(final String serviceProviderMetadataPath) {
        this.serviceProviderMetadataPath = serviceProviderMetadataPath;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(final String clientName) {
        this.clientName = clientName;
    }
}


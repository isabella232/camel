/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.github;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class GitHubEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":type/branchName";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(16);
        set.add("type");
        set.add("branchName");
        set.add("oauthToken");
        set.add("password");
        set.add("repoName");
        set.add("repoOwner");
        set.add("username");
        set.add("bridgeErrorHandler");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("encoding");
        set.add("lazyStartProducer");
        set.add("state");
        set.add("targetUrl");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        return "github".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "type", null, true, copy);
        uri = buildPathParameter(syntax, uri, "branchName", null, false, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

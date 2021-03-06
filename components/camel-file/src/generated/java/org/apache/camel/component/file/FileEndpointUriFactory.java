/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class FileEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":directoryName";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(93);
        set.add("directoryName");
        set.add("charset");
        set.add("doneFileName");
        set.add("fileName");
        set.add("bridgeErrorHandler");
        set.add("delete");
        set.add("moveFailed");
        set.add("noop");
        set.add("preMove");
        set.add("preSort");
        set.add("recursive");
        set.add("sendEmptyMessageWhenIdle");
        set.add("directoryMustExist");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("extendedAttributes");
        set.add("inProgressRepository");
        set.add("localWorkDirectory");
        set.add("onCompletionExceptionHandler");
        set.add("pollStrategy");
        set.add("probeContentType");
        set.add("processStrategy");
        set.add("startingDirectoryMustExist");
        set.add("startingDirectoryMustHaveAccess");
        set.add("appendChars");
        set.add("fileExist");
        set.add("flatten");
        set.add("jailStartingDirectory");
        set.add("lazyStartProducer");
        set.add("moveExisting");
        set.add("tempFileName");
        set.add("tempPrefix");
        set.add("allowNullBody");
        set.add("chmod");
        set.add("chmodDirectory");
        set.add("eagerDeleteTargetFile");
        set.add("forceWrites");
        set.add("keepLastModified");
        set.add("moveExistingFileStrategy");
        set.add("autoCreate");
        set.add("basicPropertyBinding");
        set.add("bufferSize");
        set.add("copyAndDeleteOnRenameFail");
        set.add("renameUsingCopy");
        set.add("synchronous");
        set.add("antExclude");
        set.add("antFilterCaseSensitive");
        set.add("antInclude");
        set.add("eagerMaxMessagesPerPoll");
        set.add("exclude");
        set.add("filter");
        set.add("filterDirectory");
        set.add("filterFile");
        set.add("idempotent");
        set.add("idempotentKey");
        set.add("idempotentRepository");
        set.add("include");
        set.add("maxDepth");
        set.add("maxMessagesPerPoll");
        set.add("minDepth");
        set.add("move");
        set.add("exclusiveReadLockStrategy");
        set.add("readLock");
        set.add("readLockCheckInterval");
        set.add("readLockDeleteOrphanLockFiles");
        set.add("readLockIdempotentReleaseAsync");
        set.add("readLockIdempotentReleaseAsyncPoolSize");
        set.add("readLockIdempotentReleaseDelay");
        set.add("readLockIdempotentReleaseExecutorService");
        set.add("readLockLoggingLevel");
        set.add("readLockMarkerFile");
        set.add("readLockMinAge");
        set.add("readLockMinLength");
        set.add("readLockRemoveOnCommit");
        set.add("readLockRemoveOnRollback");
        set.add("readLockTimeout");
        set.add("backoffErrorThreshold");
        set.add("backoffIdleThreshold");
        set.add("backoffMultiplier");
        set.add("delay");
        set.add("greedy");
        set.add("initialDelay");
        set.add("repeatCount");
        set.add("runLoggingLevel");
        set.add("scheduledExecutorService");
        set.add("scheduler");
        set.add("schedulerProperties");
        set.add("startScheduler");
        set.add("timeUnit");
        set.add("useFixedDelay");
        set.add("shuffle");
        set.add("sortBy");
        set.add("sorter");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        return "file".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "directoryName", null, true, copy);
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


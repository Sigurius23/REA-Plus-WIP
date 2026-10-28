package aws.smithy.kotlin.runtime.retries;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Laws/smithy/kotlin/runtime/retries/RetryFailureException;", "Laws/smithy/kotlin/runtime/retries/RetryException;", "runtime-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RetryFailureException extends RetryException {
    public RetryFailureException(int i13, Object obj) {
        super("The operation resulted in a non-retryable failure", null, i13, obj, null);
    }
}

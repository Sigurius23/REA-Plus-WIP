package aws.smithy.kotlin.runtime.retries;

import aws.smithy.kotlin.runtime.retries.delay.RetryCapacityExceededException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Laws/smithy/kotlin/runtime/retries/TooManyAttemptsException;", "Laws/smithy/kotlin/runtime/retries/RetryException;", "runtime-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TooManyAttemptsException extends RetryException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooManyAttemptsException(String message, RetryCapacityExceededException retryCapacityExceededException, int i13, Object obj, Throwable th3) {
        super(message, retryCapacityExceededException, i13, obj, th3);
        AbstractC22676k.m65750j(message, "message");
    }
}

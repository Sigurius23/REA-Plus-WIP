package aws.smithy.kotlin.runtime.http.interceptors;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Laws/smithy/kotlin/runtime/http/interceptors/SmokeTestsSuccessException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "http-client"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SmokeTestsSuccessException extends Exception {
    public SmokeTestsSuccessException() {
        super("Smoke test succeeded with HTTP status code in the inclusive range: 200-599");
    }
}

package io.sentry;

import java.io.IOException;
import java.util.Locale;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.i7 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20374i7 implements InterfaceC20348h2 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    EnumC20374i7(int i13) {
        this.minHttpStatusCode = i13;
        this.maxHttpStatusCode = i13;
    }

    public static EnumC20374i7 fromApiNameSafely(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static EnumC20374i7 fromHttpStatusCode(int i13) {
        for (EnumC20374i7 enumC20374i7 : values()) {
            if (enumC20374i7.matches(i13)) {
                return enumC20374i7;
            }
        }
        return null;
    }

    private boolean matches(int i13) {
        return i13 >= this.minHttpStatusCode && i13 <= this.maxHttpStatusCode;
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.InterfaceC20348h2
    public void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        ((C37199o) interfaceC20401k3).m119222b0(apiName());
    }

    public static EnumC20374i7 fromHttpStatusCode(Integer num, EnumC20374i7 enumC20374i7) {
        EnumC20374i7 enumC20374i7FromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : enumC20374i7;
        return enumC20374i7FromHttpStatusCode != null ? enumC20374i7FromHttpStatusCode : enumC20374i7;
    }

    EnumC20374i7(int i13, int i14) {
        this.minHttpStatusCode = i13;
        this.maxHttpStatusCode = i14;
    }
}

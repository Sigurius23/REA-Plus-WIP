package androidx.core.telecom;

import ih0.AbstractC18489d0;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Landroidx/core/telecom/CallException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "core-telecom_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class CallException extends RuntimeException {

    /* JADX INFO: renamed from: w */
    public final int f5275w = 1;

    public final boolean equals(Object obj) {
        if (obj instanceof CallException) {
            return this.f5275w == ((CallException) obj).f5275w;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5275w);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AbstractC18489d0.m53371l(new StringBuilder("CallException(code=["), this.f5275w, "])");
    }
}

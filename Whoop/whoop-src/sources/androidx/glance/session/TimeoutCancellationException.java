package androidx.glance.session;

import java.util.concurrent.CancellationException;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Landroidx/glance/session/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "glance"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class TimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: w */
    public final String f6004w;

    /* JADX INFO: renamed from: x */
    public final int f6005x;

    public TimeoutCancellationException(String str, int i13) {
        super(str);
        this.f6004w = str;
        this.f6005x = i13;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f6004w;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb4 = new StringBuilder("TimeoutCancellationException(");
        sb4.append(this.f6004w);
        sb4.append(", ");
        return AbstractC11895b.m31999r(sb4, this.f6005x, ')');
    }
}

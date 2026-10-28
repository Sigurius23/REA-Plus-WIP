package io.sentry;

import java.util.concurrent.Callable;
import p581we.C37199o;

/* JADX INFO: renamed from: io.sentry.z4 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class CallableC20643z4 implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f77199w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37199o f77200x;

    public /* synthetic */ CallableC20643z4(C37199o c37199o, int i13) {
        this.f77199w = i13;
        this.f77200x = c37199o;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f77199w) {
            case 0:
                return Integer.valueOf(this.f77200x.m119205H().length);
            case 1:
                return this.f77200x.m119205H();
            case 2:
                return Integer.valueOf(this.f77200x.m119205H().length);
            default:
                return this.f77200x.m119205H();
        }
    }
}

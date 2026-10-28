package io.sentry.android.core;

import java.util.Arrays;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.r1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20152r1 {

    /* JADX INFO: renamed from: a */
    public final Integer f75699a;

    /* JADX INFO: renamed from: b */
    public final Boolean f75700b;

    public C20152r1(Integer num, Boolean bool) {
        this.f75699a = num;
        this.f75700b = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20152r1)) {
            return false;
        }
        C20152r1 c20152r1 = (C20152r1) obj;
        return AbstractC29125c.m88542s(this.f75699a, c20152r1.f75699a) && AbstractC29125c.m88542s(this.f75700b, c20152r1.f75700b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f75699a, this.f75700b});
    }
}

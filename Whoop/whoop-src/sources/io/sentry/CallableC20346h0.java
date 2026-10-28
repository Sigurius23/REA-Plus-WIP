package io.sentry;

import io.sentry.android.core.internal.util.C20105f;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC20346h0 implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76369w;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f76369w) {
            case 0:
                return InetAddress.getLocalHost();
            case 1:
                return null;
            case 2:
                return new ArrayList();
            default:
                return C20105f.f75530c.m55999a();
        }
    }
}

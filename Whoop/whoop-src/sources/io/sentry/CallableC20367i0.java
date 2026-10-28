package io.sentry;

import android.content.res.AssetFileDescriptor;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import u92.C34661e;

/* JADX INFO: renamed from: io.sentry.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC20367i0 implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76396w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f76397x;

    public /* synthetic */ CallableC20367i0(Object obj, int i13) {
        this.f76396w = i13;
        this.f76397x = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f76396w) {
            case 0:
                C20398k0 c20398k0 = (C20398k0) this.f76397x;
                try {
                    c20398k0.f76464e.getClass();
                    c20398k0.f76461b = InetAddress.getLocalHost().getCanonicalHostName();
                    c20398k0.f76462c = System.currentTimeMillis() + c20398k0.f76460a;
                    return null;
                } finally {
                    c20398k0.f76463d.set(false);
                }
            case 1:
                return ((C34661e) this.f76397x).m109546c();
            default:
                return (AssetFileDescriptor) this.f76397x;
        }
    }
}

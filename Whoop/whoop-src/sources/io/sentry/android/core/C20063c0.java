package io.sentry.android.core;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.sentry.android.core.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20063c0 extends CopyOnWriteArrayList {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C20068d0 f75365w;

    public C20063c0(C20068d0 c20068d0) {
        this.f75365w = c20068d0;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        InterfaceC20060b0 interfaceC20060b0 = (InterfaceC20060b0) obj;
        boolean zAdd = super.add(interfaceC20060b0);
        if (Boolean.FALSE.equals(this.f75365w.f75384x.f75395z)) {
            interfaceC20060b0.mo55909i();
            return zAdd;
        }
        if (Boolean.TRUE.equals(this.f75365w.f75384x.f75395z)) {
            interfaceC20060b0.mo55910k();
        }
        return zAdd;
    }
}

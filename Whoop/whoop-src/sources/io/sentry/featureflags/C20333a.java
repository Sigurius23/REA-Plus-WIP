package io.sentry.featureflags;

import io.sentry.protocol.C20482i;
import io.sentry.util.C20579a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: io.sentry.featureflags.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C20333a implements InterfaceC20334b {

    /* JADX INFO: renamed from: w */
    public volatile CopyOnWriteArrayList f76340w;

    @Override // io.sentry.featureflags.InterfaceC20334b
    /* JADX INFO: renamed from: r */
    public final C20482i mo1873r() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f76340w.iterator();
        if (!it.hasNext()) {
            return new C20482i(arrayList);
        }
        AbstractC30802r.m94771t(it.next());
        throw null;
    }

    @Override // io.sentry.featureflags.InterfaceC20334b
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC20334b m134234clone() {
        C20333a c20333a = new C20333a();
        new C20579a();
        c20333a.f76340w = new CopyOnWriteArrayList(this.f76340w);
        return c20333a;
    }
}

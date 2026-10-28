package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p509u.C34294b;
import p509u.C34298f;

/* JADX INFO: renamed from: androidx.lifecycle.t0 */
/* JADX INFO: loaded from: classes.dex */
public class C1627t0 extends C1630u0 {

    /* JADX INFO: renamed from: a */
    public final C34298f f6313a;

    public C1627t0(Object obj) {
        super(obj);
        this.f6313a = new C34298f();
    }

    /* JADX INFO: renamed from: b */
    public final void m5035b(AbstractC1615p0 abstractC1615p0, InterfaceC1633v0 interfaceC1633v0) {
        if (abstractC1615p0 == null) {
            throw new NullPointerException("source cannot be null");
        }
        C1624s0 c1624s0 = new C1624s0(abstractC1615p0, interfaceC1633v0);
        C1624s0 c1624s1 = (C1624s0) this.f6313a.mo108606c(abstractC1615p0, c1624s0);
        if (c1624s1 != null && c1624s1.f6306x != interfaceC1633v0) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (c1624s1 == null && hasActiveObservers()) {
            abstractC1615p0.observeForever(c1624s0);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5036c(AbstractC1615p0 abstractC1615p0) {
        C1624s0 c1624s0 = (C1624s0) this.f6313a.mo108607d(abstractC1615p0);
        if (c1624s0 != null) {
            c1624s0.f6305w.removeObserver(c1624s0);
        }
    }

    @Override // androidx.lifecycle.AbstractC1615p0
    public void onActive() {
        Iterator it = this.f6313a.iterator();
        while (true) {
            C34294b c34294b = (C34294b) it;
            if (!c34294b.hasNext()) {
                return;
            }
            C1624s0 c1624s0 = (C1624s0) ((Map.Entry) c34294b.next()).getValue();
            c1624s0.f6305w.observeForever(c1624s0);
        }
    }

    @Override // androidx.lifecycle.AbstractC1615p0
    public void onInactive() {
        Iterator it = this.f6313a.iterator();
        while (true) {
            C34294b c34294b = (C34294b) it;
            if (!c34294b.hasNext()) {
                return;
            }
            C1624s0 c1624s0 = (C1624s0) ((Map.Entry) c34294b.next()).getValue();
            c1624s0.f6305w.removeObserver(c1624s0);
        }
    }

    public C1627t0() {
        this.f6313a = new C34298f();
    }
}

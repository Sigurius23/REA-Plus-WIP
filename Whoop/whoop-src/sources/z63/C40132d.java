package z63;

import a73.C0527b;
import ae3.InterfaceC0799g;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import ne3.InterfaceC26629n0;
import ne3.InterfaceC26631o0;
import ne3.InterfaceC26633p0;
import p586wk.C37330h;
import p586wk.InterfaceC37325c;
import p684zk.C40787l;
import p684zk.C40791p;
import pl.C29342e;
import zd3.C40561e;
import zd3.C40562f;
import zd3.C40563g;

/* JADX INFO: renamed from: z63.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C40132d implements InterfaceC26631o0 {

    /* JADX INFO: renamed from: w */
    public Object f173183w;

    /* JADX INFO: renamed from: x */
    public Object f173184x;

    /* JADX INFO: renamed from: y */
    public Object f173185y;

    public C40132d(InterfaceC37325c interfaceC37325c, Object obj, C37330h c37330h) {
        this.f173183w = interfaceC37325c;
        this.f173184x = obj;
        this.f173185y = c37330h;
    }

    /* JADX INFO: renamed from: a */
    public void m128676a(AbstractC40129a abstractC40129a) {
        HashSet hashSet = (HashSet) this.f173185y;
        ArrayList arrayList = (ArrayList) this.f173184x;
        if (arrayList.contains(abstractC40129a)) {
            return;
        }
        if (hashSet.contains(abstractC40129a)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
        }
        hashSet.add(abstractC40129a);
        abstractC40129a.mo31500b(this);
        hashSet.remove(abstractC40129a);
        if (arrayList.contains(abstractC40129a)) {
            return;
        }
        if (C0527b.class.isAssignableFrom(abstractC40129a.getClass())) {
            arrayList.add(0, abstractC40129a);
        } else {
            arrayList.add(abstractC40129a);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m128677b(File file) {
        return ((InterfaceC37325c) this.f173183w).mo2345c(this.f173184x, file, (C37330h) this.f173185y);
    }

    @Override // ne3.InterfaceC26631o0
    public void cancel() {
        ((C40563g) this.f173185y).f174688d.cancel();
    }

    @Override // ne3.InterfaceC26631o0
    /* JADX INFO: renamed from: d */
    public InterfaceC26629n0 mo14152d() {
        return (C40561e) this.f173183w;
    }

    @Override // ne3.InterfaceC26631o0
    public InterfaceC26633p0 getSource() {
        return (C40562f) this.f173184x;
    }

    public C40132d(C40563g c40563g) {
        this.f173185y = c40563g;
        InterfaceC0799g interfaceC0799g = c40563g.f174688d;
        this.f173183w = new C40561e(c40563g, interfaceC0799g.mo1931i().mo14152d(), -1L, true);
        this.f173184x = new C40562f(c40563g, interfaceC0799g.mo1931i().getSource(), -1L, true);
    }

    public C40132d(C40787l c40787l, C29342e c29342e, C40791p c40791p) {
        this.f173185y = c40787l;
        this.f173184x = c29342e;
        this.f173183w = c40791p;
    }
}

package mh3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p098dt.AbstractC12350b;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: mh3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C25566c implements InterfaceC38293t {

    /* JADX INFO: renamed from: w */
    public HashSet f100260w;

    /* JADX INFO: renamed from: x */
    public volatile boolean f100261x;

    /* JADX INFO: renamed from: f */
    public static void m75178f(HashSet hashSet) {
        if (hashSet == null) {
            return;
        }
        Iterator it = hashSet.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                ((InterfaceC38293t) it.next()).mo14750b();
            } catch (Throwable th3) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th3);
            }
        }
        AbstractC12350b.m34572U(arrayList);
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return this.f100261x;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        if (this.f100261x) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f100261x) {
                    return;
                }
                this.f100261x = true;
                HashSet hashSet = this.f100260w;
                this.f100260w = null;
                m75178f(hashSet);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m75179c(InterfaceC38293t interfaceC38293t) {
        if (interfaceC38293t.mo14749a()) {
            return;
        }
        if (!this.f100261x) {
            synchronized (this) {
                try {
                    if (!this.f100261x) {
                        if (this.f100260w == null) {
                            this.f100260w = new HashSet(4);
                        }
                        this.f100260w.add(interfaceC38293t);
                        return;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        interfaceC38293t.mo14750b();
    }

    /* JADX INFO: renamed from: d */
    public final void m75180d() {
        HashSet hashSet;
        if (this.f100261x) {
            return;
        }
        synchronized (this) {
            if (!this.f100261x && (hashSet = this.f100260w) != null) {
                this.f100260w = null;
                m75178f(hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m75181e(InterfaceC38293t interfaceC38293t) {
        HashSet hashSet;
        if (this.f100261x) {
            return;
        }
        synchronized (this) {
            if (!this.f100261x && (hashSet = this.f100260w) != null) {
                boolean zRemove = hashSet.remove(interfaceC38293t);
                if (zRemove) {
                    interfaceC38293t.mo14750b();
                }
            }
        }
    }
}

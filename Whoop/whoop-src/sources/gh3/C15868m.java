package gh3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p098dt.AbstractC12350b;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: gh3.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C15868m implements InterfaceC38293t {

    /* JADX INFO: renamed from: w */
    public LinkedList f59974w;

    /* JADX INFO: renamed from: x */
    public volatile boolean f59975x;

    public C15868m(InterfaceC38293t interfaceC38293t) {
        LinkedList linkedList = new LinkedList();
        this.f59974w = linkedList;
        linkedList.add(interfaceC38293t);
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return this.f59975x;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        if (this.f59975x) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f59975x) {
                    return;
                }
                this.f59975x = true;
                LinkedList linkedList = this.f59974w;
                ArrayList arrayList = null;
                this.f59974w = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
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
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m44779c(InterfaceC38293t interfaceC38293t) {
        if (interfaceC38293t.mo14749a()) {
            return;
        }
        if (!this.f59975x) {
            synchronized (this) {
                try {
                    if (!this.f59975x) {
                        LinkedList linkedList = this.f59974w;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f59974w = linkedList;
                        }
                        linkedList.add(interfaceC38293t);
                        return;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        interfaceC38293t.mo14750b();
    }
}

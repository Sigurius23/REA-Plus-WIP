package ch3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p098dt.AbstractC12350b;
import xg3.AbstractC38283j;
import xg3.AbstractC38292s;

/* JADX INFO: renamed from: ch3.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C4721z extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public final C4700o0 f19307E;

    /* JADX INFO: renamed from: F */
    public final AbstractC38283j f19308F;

    /* JADX INFO: renamed from: G */
    public final LinkedList f19309G = new LinkedList();

    /* JADX INFO: renamed from: H */
    public boolean f19310H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C4670a0 f19311I;

    public C4721z(C4670a0 c4670a0, C4700o0 c4700o0, AbstractC38283j abstractC38283j) {
        this.f19311I = c4670a0;
        this.f19307E = c4700o0;
        this.f19308F = abstractC38283j;
    }

    /* JADX INFO: renamed from: g */
    public final void m14776g() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                if (this.f19310H) {
                    return;
                }
                this.f19309G.add(arrayList);
                AbstractC38283j abstractC38283j = this.f19308F;
                C4719y c4719y = new C4719y(this, arrayList, 0);
                C4670a0 c4670a0 = this.f19311I;
                abstractC38283j.mo37107d(c4719y, c4670a0.f19119w, c4670a0.f19121y);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (this.f19310H) {
                        return;
                    }
                    this.f19310H = true;
                    LinkedList linkedList = new LinkedList(this.f19309G);
                    this.f19309G.clear();
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        this.f19307E.onNext((List) it.next());
                    }
                    this.f19307E.onCompleted();
                    mo14750b();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            AbstractC12350b.m34574W(th4, this.f19307E);
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) throws Throwable {
        synchronized (this) {
            try {
                if (this.f19310H) {
                    return;
                }
                this.f19310H = true;
                this.f19309G.clear();
                this.f19307E.onError(th3);
                mo14750b();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) throws Throwable {
        synchronized (this) {
            try {
                if (this.f19310H) {
                    return;
                }
                Iterator it = this.f19309G.iterator();
                LinkedList linkedList = null;
                while (it.hasNext()) {
                    List list = (List) it.next();
                    list.add(obj);
                    if (list.size() == Integer.MAX_VALUE) {
                        it.remove();
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                        }
                        linkedList.add(list);
                    }
                }
                if (linkedList != null) {
                    Iterator it3 = linkedList.iterator();
                    while (it3.hasNext()) {
                        this.f19307E.onNext((List) it3.next());
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}

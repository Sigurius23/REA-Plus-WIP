package ch3;

import bh3.InterfaceC3254a;
import eh3.C13202f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p098dt.AbstractC12350b;
import xg3.AbstractC38283j;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: ch3.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C4719y implements InterfaceC3254a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19301w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f19302x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC38293t f19303y;

    public /* synthetic */ C4719y(InterfaceC38293t interfaceC38293t, Object obj, int i13) {
        this.f19301w = i13;
        this.f19303y = interfaceC38293t;
        this.f19302x = obj;
    }

    @Override // bh3.InterfaceC3254a
    public final void call() {
        boolean z4;
        switch (this.f19301w) {
            case 0:
                C4721z c4721z = (C4721z) this.f19303y;
                ArrayList arrayList = (ArrayList) this.f19302x;
                synchronized (c4721z) {
                    try {
                        if (c4721z.f19310H) {
                            return;
                        }
                        Iterator it = c4721z.f19309G.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z4 = false;
                            } else if (((List) it.next()) == arrayList) {
                                it.remove();
                                z4 = true;
                            }
                        }
                        if (z4) {
                            try {
                                c4721z.f19307E.onNext(arrayList);
                                return;
                            } catch (Throwable th3) {
                                AbstractC12350b.m34574W(th3, c4721z);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            case 1:
                if (((C13202f) this.f19303y).f45760y.f59975x) {
                    return;
                }
                ((InterfaceC3254a) this.f19302x).call();
                return;
            default:
                AbstractC38283j abstractC38283j = (AbstractC38283j) this.f19303y;
                try {
                    ((InterfaceC3254a) this.f19302x).call();
                    return;
                } finally {
                    abstractC38283j.mo14750b();
                }
        }
    }

    public C4719y(InterfaceC3254a interfaceC3254a, AbstractC38283j abstractC38283j) {
        this.f19301w = 2;
        this.f19302x = interfaceC3254a;
        this.f19303y = abstractC38283j;
    }
}

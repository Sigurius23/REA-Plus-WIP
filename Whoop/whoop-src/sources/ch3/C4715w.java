package ch3;

import bh3.InterfaceC3254a;
import java.util.ArrayList;
import p098dt.AbstractC12350b;
import xg3.AbstractC38292s;

/* JADX INFO: renamed from: ch3.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C4715w implements InterfaceC3254a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19291w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC38292s f19292x;

    public /* synthetic */ C4715w(AbstractC38292s abstractC38292s, int i13) {
        this.f19291w = i13;
        this.f19292x = abstractC38292s;
    }

    @Override // bh3.InterfaceC3254a
    public final void call() {
        switch (this.f19291w) {
            case 0:
                C4717x c4717x = (C4717x) this.f19292x;
                synchronized (c4717x) {
                    try {
                        if (c4717x.f19296F) {
                            return;
                        }
                        ArrayList arrayList = (ArrayList) c4717x.f19299I;
                        c4717x.f19299I = new ArrayList();
                        try {
                            ((C4700o0) c4717x.f19297G).onNext(arrayList);
                            return;
                        } catch (Throwable th3) {
                            AbstractC12350b.m34574W(th3, c4717x);
                            return;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            default:
                ((C4721z) this.f19292x).m14776g();
                return;
        }
    }
}

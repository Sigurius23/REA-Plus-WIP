package p101dx;

import android.content.Context;
import bh3.InterfaceC3254a;
import ch3.C4703q;
import eh3.C13199c;
import eh3.C13202f;
import lh3.C24090m;
import lh3.C24091n;

/* JADX INFO: renamed from: dx.b */
/* JADX INFO: loaded from: classes.dex */
public final class C12421b implements InterfaceC3254a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42242w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f42243x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f42244y;

    public /* synthetic */ C12421b(int i13, Object obj, Object obj2) {
        this.f42242w = i13;
        this.f42244y = obj;
        this.f42243x = obj2;
    }

    @Override // bh3.InterfaceC3254a
    public final void call() {
        switch (this.f42242w) {
            case 0:
                ((Context) ((C4703q) this.f42244y).f19254x).unregisterReceiver((C12420a) this.f42243x);
                break;
            case 1:
                if (!((C13199c) this.f42244y).f45748w.f100261x) {
                    ((InterfaceC3254a) this.f42243x).call();
                    break;
                }
                break;
            case 2:
                if (!((C13202f) this.f42244y).f45760y.f59975x) {
                    ((InterfaceC3254a) this.f42243x).call();
                    break;
                }
                break;
            default:
                ((C24091n) this.f42244y).m71004a((C24090m) this.f42243x);
                break;
        }
    }
}

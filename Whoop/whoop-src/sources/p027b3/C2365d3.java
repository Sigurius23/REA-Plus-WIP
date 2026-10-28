package p027b3;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p184h5.C16907r0;
import rb3.C31208p;
import x83.C38094k;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: b3.d3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2365d3 implements InterfaceC38174i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9336a;

    /* JADX INFO: renamed from: b */
    public final Object f9337b;

    public /* synthetic */ C2365d3(Object obj, int i13) {
        this.f9336a = i13;
        this.f9337b = obj;
    }

    /* JADX INFO: renamed from: c */
    public void m7292c(Object obj, String str) {
        ((ArrayList) this.f9337b).add(new C2360c3(str, obj));
    }

    @Override // xb3.InterfaceC38174i
    public final Iterator iterator() {
        switch (this.f9336a) {
            case 0:
                return ((ArrayList) this.f9337b).iterator();
            case 1:
                return new C16907r0((ViewGroup) this.f9337b);
            case 2:
                return new C38094k(this);
            default:
                return new C31208p(this.f9337b, 1);
        }
    }

    public C2365d3() {
        this.f9336a = 0;
        this.f9337b = new ArrayList();
    }
}

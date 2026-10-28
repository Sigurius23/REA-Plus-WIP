package e10;

import a30.C0332w0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import c20.AbstractC3877e;
import c20.C3873a;
import d10.AbstractC11464a;
import g20.C15272r;
import h20.C16754w0;
import i20.C17988y0;
import java.util.LinkedHashMap;
import n20.C26174i;
import n83.C26461d;
import p212i6.AbstractC18150c;
import p236j.AbstractC21065d;
import p599wz.C37751r0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e10.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12566q0 implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42910w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f42911x;

    public /* synthetic */ C12566q0(Object obj, int i13) {
        this.f42910w = i13;
        this.f42911x = obj;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC1585g0 owner) {
        int i13 = this.f42910w;
        Object obj = this.f42911x;
        AbstractC22676k.m65750j(owner, "owner");
        switch (i13) {
            case 0:
                for (C12550i0 c12550i0 : ((C12568r0) obj).f42913a) {
                    Object obj2 = c12550i0.f42873c;
                    if (obj2 != null) {
                        c12550i0.f42872b.mo35213h(obj2);
                    }
                    c12550i0.f42873c = null;
                }
                super.onDestroy(owner);
                break;
            case 1:
                C3873a c3873a = ((C15272r) obj).f57357y;
                Object it = c3873a.m11854a().iterator();
                while (((AbstractC18150c) it).hasNext()) {
                    ((AbstractC3877e) ((C26461d) it).next()).mo11856a();
                }
                AbstractC21065d abstractC21065d = c3873a.f15853e;
                if (abstractC21065d != null) {
                    abstractC21065d.mo4053b();
                }
                AbstractC21065d abstractC21065d2 = c3873a.f15854f;
                if (abstractC21065d2 != null) {
                    abstractC21065d2.mo4053b();
                }
                c3873a.f15853e = null;
                c3873a.f15854f = null;
                super.onDestroy(owner);
                break;
            case 2:
                LinkedHashMap linkedHashMap = AbstractC11464a.f36802a;
                AbstractC11464a.f36802a.remove((String) ((C0332w0) obj).f1170z);
                super.onDestroy(owner);
                break;
            case 3:
                C37751r0 c37751r0 = ((C16754w0) obj).f64347f0;
                AbstractC21065d abstractC21065d3 = c37751r0.f161719e;
                if (abstractC21065d3 != null) {
                    abstractC21065d3.mo4053b();
                }
                c37751r0.f161719e = null;
                super.onDestroy(owner);
                break;
            case 4:
                C17988y0 c17988y0 = (C17988y0) obj;
                AbstractC21065d abstractC21065d4 = c17988y0.f69830b;
                if (abstractC21065d4 != null) {
                    abstractC21065d4.mo4053b();
                }
                c17988y0.f69830b = null;
                break;
            default:
                C26174i c26174i = (C26174i) obj;
                c26174i.f103790u.mo4053b();
                c26174i.f103791v.mo4053b();
                C37751r0 c37751r1 = c26174i.f103783n;
                AbstractC21065d abstractC21065d5 = c37751r1.f161719e;
                if (abstractC21065d5 != null) {
                    abstractC21065d5.mo4053b();
                }
                c37751r1.f161719e = null;
                C37751r0 c37751r2 = c26174i.f103782m;
                AbstractC21065d abstractC21065d6 = c37751r2.f161719e;
                if (abstractC21065d6 != null) {
                    abstractC21065d6.mo4053b();
                }
                c37751r2.f161719e = null;
                LinkedHashMap linkedHashMap2 = AbstractC11464a.f36802a;
                String key = c26174i.f103789t;
                AbstractC22676k.m65750j(key, "key");
                AbstractC11464a.f36802a.remove(key);
                break;
        }
    }
}

package p390p1;

import d93.InterfaceC11820a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p002a0.C0023g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.f2 */
/* JADX INFO: loaded from: classes.dex */
public final class C28614f2 implements Iterable, InterfaceC11820a {

    /* JADX INFO: renamed from: E */
    public int f115757E;

    /* JADX INFO: renamed from: G */
    public boolean f115759G;

    /* JADX INFO: renamed from: H */
    public int f115760H;

    /* JADX INFO: renamed from: J */
    public HashMap f115762J;

    /* JADX INFO: renamed from: K */
    public C0023g0 f115763K;

    /* JADX INFO: renamed from: x */
    public int f115765x;

    /* JADX INFO: renamed from: z */
    public int f115767z;

    /* JADX INFO: renamed from: w */
    public int[] f115764w = new int[0];

    /* JADX INFO: renamed from: y */
    public Object[] f115766y = new Object[0];

    /* JADX INFO: renamed from: F */
    public final Object f115758F = new Object();

    /* JADX INFO: renamed from: I */
    public ArrayList f115761I = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final int m87014a(C28591a c28591a) {
        if (this.f115759G) {
            AbstractC28659r.m87192c("Use active SlotWriter to determine anchor location instead");
        }
        if (!c28591a.m86976a()) {
            AbstractC28657q1.m87188a("Anchor refers to a group that was removed");
        }
        return c28591a.f115705a;
    }

    /* JADX INFO: renamed from: c */
    public final void m87015c() {
        this.f115762J = new HashMap();
    }

    /* JADX INFO: renamed from: d */
    public final C28610e2 m87016d() {
        if (this.f115759G) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f115757E++;
        return new C28610e2(this);
    }

    /* JADX INFO: renamed from: e */
    public final C28626i2 m87017e() {
        if (this.f115759G) {
            AbstractC28659r.m87192c("Cannot start a writer when another writer is pending");
        }
        if (this.f115757E > 0) {
            AbstractC28659r.m87192c("Cannot start a writer when a reader is pending");
        }
        this.f115759G = true;
        this.f115760H++;
        return new C28626i2(this);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m87018g(C28591a c28591a) {
        int iM87030e;
        return c28591a.m86976a() && (iM87030e = AbstractC28622h2.m87030e(this.f115761I, c28591a.f115705a, this.f115765x)) >= 0 && AbstractC22676k.m65745e(this.f115761I.get(iM87030e), c28591a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C28640m0(this, 0, this.f115765x);
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC28644n0 m87019j(int i13) {
        int i14;
        ArrayList arrayList;
        int iM87030e;
        HashMap map = this.f115762J;
        if (map != null) {
            if (this.f115759G) {
                AbstractC28659r.m87192c("use active SlotWriter to crate an anchor for location instead");
            }
            C28591a c28591a = (i13 < 0 || i13 >= (i14 = this.f115765x) || (iM87030e = AbstractC28622h2.m87030e((arrayList = this.f115761I), i13, i14)) < 0) ? null : (C28591a) arrayList.get(iM87030e);
            if (c28591a != null) {
                return (AbstractC28644n0) map.get(c28591a);
            }
        }
        return null;
    }
}

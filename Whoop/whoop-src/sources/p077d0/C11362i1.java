package p077d0;

import p000.AbstractC11266d;
import p014aj.C0928c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d0.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11362i1 implements InterfaceC11337c0 {

    /* JADX INFO: renamed from: a */
    public final float f36420a;

    /* JADX INFO: renamed from: b */
    public final float f36421b;

    /* JADX INFO: renamed from: c */
    public final Object f36422c;

    public C11362i1(float f13, float f14, Object obj) {
        this.f36420a = f13;
        this.f36421b = f14;
        this.f36422c = obj;
    }

    @Override // p077d0.InterfaceC11372l
    /* JADX INFO: renamed from: a */
    public final InterfaceC11355g2 mo30534a(C11351f2 c11351f2) {
        Object obj = this.f36422c;
        return new C0928c(this.f36420a, this.f36421b, obj == null ? null : (AbstractC11395r) c11351f2.f36396a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11362i1) {
            C11362i1 c11362i1 = (C11362i1) obj;
            if (c11362i1.f36420a == this.f36420a && c11362i1.f36421b == this.f36421b && AbstractC22676k.m65745e(c11362i1.f36422c, this.f36422c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f36422c;
        return Float.hashCode(this.f36421b) + AbstractC11266d.m30447a(this.f36420a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ C11362i1(Object obj, int i13) {
        this(1.0f, (i13 & 2) != 0 ? 1500.0f : 200.0f, (i13 & 4) != 0 ? null : obj);
    }
}

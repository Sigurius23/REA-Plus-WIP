package p355o2;

import d93.InterfaceC11820a;
import gf.C15765f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o2.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C27431e0 extends AbstractC27435g0 implements Iterable, InterfaceC11820a {

    /* JADX INFO: renamed from: E */
    public final float f110548E;

    /* JADX INFO: renamed from: F */
    public final float f110549F;

    /* JADX INFO: renamed from: G */
    public final float f110550G;

    /* JADX INFO: renamed from: H */
    public final float f110551H;

    /* JADX INFO: renamed from: I */
    public final List f110552I;

    /* JADX INFO: renamed from: J */
    public final List f110553J;

    /* JADX INFO: renamed from: w */
    public final String f110554w;

    /* JADX INFO: renamed from: x */
    public final float f110555x;

    /* JADX INFO: renamed from: y */
    public final float f110556y;

    /* JADX INFO: renamed from: z */
    public final float f110557z;

    public C27431e0(String str, float f13, float f14, float f15, float f16, float f17, float f18, float f19, List list, ArrayList arrayList) {
        this.f110554w = str;
        this.f110555x = f13;
        this.f110556y = f14;
        this.f110557z = f15;
        this.f110548E = f16;
        this.f110549F = f17;
        this.f110550G = f18;
        this.f110551H = f19;
        this.f110552I = list;
        this.f110553J = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C27431e0)) {
            C27431e0 c27431e0 = (C27431e0) obj;
            return AbstractC22676k.m65745e(this.f110554w, c27431e0.f110554w) && this.f110555x == c27431e0.f110555x && this.f110556y == c27431e0.f110556y && this.f110557z == c27431e0.f110557z && this.f110548E == c27431e0.f110548E && this.f110549F == c27431e0.f110549F && this.f110550G == c27431e0.f110550G && this.f110551H == c27431e0.f110551H && AbstractC22676k.m65745e(this.f110552I, c27431e0.f110552I) && AbstractC22676k.m65745e(this.f110553J, c27431e0.f110553J);
        }
        return false;
    }

    public final int hashCode() {
        return this.f110553J.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30447a(this.f110551H, AbstractC11266d.m30447a(this.f110550G, AbstractC11266d.m30447a(this.f110549F, AbstractC11266d.m30447a(this.f110548E, AbstractC11266d.m30447a(this.f110557z, AbstractC11266d.m30447a(this.f110556y, AbstractC11266d.m30447a(this.f110555x, this.f110554w.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.f110552I);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C15765f(this);
    }
}

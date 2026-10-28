package p040c0;

import java.util.LinkedHashMap;
import m83.AbstractC25247g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c0.c1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3730c1 {

    /* JADX INFO: renamed from: a */
    public static final C3733d1 f15251a = new C3733d1(new C3784u1((C3742g1) null, (C3778s1) null, (C3753k0) null, (C3757l1) null, (LinkedHashMap) null, 63));

    /* JADX INFO: renamed from: a */
    public final C3733d1 m11562a(AbstractC3730c1 abstractC3730c1) {
        C3784u1 c3784u1 = ((C3733d1) abstractC3730c1).f15271b;
        C3742g1 c3742g1 = c3784u1.f15430a;
        if (c3742g1 == null) {
            c3742g1 = ((C3733d1) this).f15271b.f15430a;
        }
        C3778s1 c3778s1 = c3784u1.f15431b;
        if (c3778s1 == null) {
            c3778s1 = ((C3733d1) this).f15271b.f15431b;
        }
        C3753k0 c3753k0 = c3784u1.f15432c;
        if (c3753k0 == null) {
            c3753k0 = ((C3733d1) this).f15271b.f15432c;
        }
        C3757l1 c3757l1 = c3784u1.f15433d;
        if (c3757l1 == null) {
            c3757l1 = ((C3733d1) this).f15271b.f15433d;
        }
        return new C3733d1(new C3784u1(c3742g1, c3778s1, c3753k0, c3757l1, AbstractC25247g0.m73995d0(((C3733d1) this).f15271b.f15435f, c3784u1.f15435f), 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC3730c1) && AbstractC22676k.m65745e(((C3733d1) ((AbstractC3730c1) obj)).f15271b, ((C3733d1) this).f15271b);
    }

    public final int hashCode() {
        return ((C3733d1) this).f15271b.hashCode();
    }

    public final String toString() {
        if (equals(f15251a)) {
            return "EnterTransition.None";
        }
        StringBuilder sb4 = new StringBuilder("EnterTransition: \nFade - ");
        C3784u1 c3784u1 = ((C3733d1) this).f15271b;
        C3742g1 c3742g1 = c3784u1.f15430a;
        sb4.append(c3742g1 != null ? c3742g1.toString() : null);
        sb4.append(",\nSlide - ");
        C3778s1 c3778s1 = c3784u1.f15431b;
        sb4.append(c3778s1 != null ? c3778s1.toString() : null);
        sb4.append(",\nShrink - ");
        C3753k0 c3753k0 = c3784u1.f15432c;
        sb4.append(c3753k0 != null ? c3753k0.toString() : null);
        sb4.append(",\nScale - ");
        C3757l1 c3757l1 = c3784u1.f15433d;
        sb4.append(c3757l1 != null ? c3757l1.toString() : null);
        return sb4.toString();
    }
}

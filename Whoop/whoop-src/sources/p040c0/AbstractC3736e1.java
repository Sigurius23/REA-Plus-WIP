package p040c0;

import java.util.LinkedHashMap;
import m83.AbstractC25247g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c0.e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3736e1 {

    /* JADX INFO: renamed from: a */
    public static final C3739f1 f15289a = new C3739f1(new C3784u1((C3742g1) null, (C3778s1) null, (C3753k0) null, (C3757l1) null, (LinkedHashMap) null, 63));

    /* JADX INFO: renamed from: b */
    public static final C3739f1 f15290b = new C3739f1(new C3784u1((C3742g1) null, (C3778s1) null, (C3753k0) null, (C3757l1) null, (LinkedHashMap) null, 47));

    /* JADX INFO: renamed from: a */
    public final C3739f1 m11563a(AbstractC3736e1 abstractC3736e1) {
        C3784u1 c3784u1 = ((C3739f1) abstractC3736e1).f15302c;
        C3742g1 c3742g1 = c3784u1.f15430a;
        if (c3742g1 == null) {
            c3742g1 = ((C3739f1) this).f15302c.f15430a;
        }
        C3778s1 c3778s1 = c3784u1.f15431b;
        if (c3778s1 == null) {
            c3778s1 = ((C3739f1) this).f15302c.f15431b;
        }
        C3753k0 c3753k0 = c3784u1.f15432c;
        if (c3753k0 == null) {
            c3753k0 = ((C3739f1) this).f15302c.f15432c;
        }
        C3757l1 c3757l1 = c3784u1.f15433d;
        if (c3757l1 == null) {
            c3757l1 = ((C3739f1) this).f15302c.f15433d;
        }
        return new C3739f1(new C3784u1(c3742g1, c3778s1, c3753k0, c3757l1, c3784u1.f15434e || ((C3739f1) this).f15302c.f15434e, AbstractC25247g0.m73995d0(((C3739f1) this).f15302c.f15435f, c3784u1.f15435f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC3736e1) && AbstractC22676k.m65745e(((C3739f1) ((AbstractC3736e1) obj)).f15302c, ((C3739f1) this).f15302c);
    }

    public final int hashCode() {
        return ((C3739f1) this).f15302c.hashCode();
    }

    public final String toString() {
        if (equals(f15289a)) {
            return "ExitTransition.None";
        }
        if (equals(f15290b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb4 = new StringBuilder("ExitTransition: \nFade - ");
        C3784u1 c3784u1 = ((C3739f1) this).f15302c;
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
        sb4.append(",\nKeepUntilTransitionsFinished - ");
        sb4.append(c3784u1.f15434e);
        return sb4.toString();
    }
}

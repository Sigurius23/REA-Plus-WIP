package p446r1;

import m83.AbstractC25260n;
import p002a0.AbstractC0009b1;
import p002a0.C0047q0;
import p002a0.C0057v0;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C30847a {

    /* JADX INFO: renamed from: a */
    public final C0057v0 f127225a;

    public /* synthetic */ C30847a(C0057v0 c0057v0) {
        this.f127225a = c0057v0;
    }

    /* JADX INFO: renamed from: a */
    public static final void m94881a(C0057v0 c0057v0, Object obj, Object obj2) {
        int iM128f = c0057v0.m128f(obj);
        boolean z4 = iM128f < 0;
        Object obj3 = z4 ? null : c0057v0.f172c[iM128f];
        if (obj3 != null) {
            if (obj3 instanceof C0047q0) {
                C0047q0 c0047q0 = (C0047q0) obj3;
                c0047q0.m98a(obj2);
                obj2 = c0047q0;
            } else {
                Object[] objArr = AbstractC0009b1.f23a;
                C0047q0 c0047q1 = new C0047q0(2);
                c0047q1.m98a(obj3);
                c0047q1.m98a(obj2);
                obj2 = c0047q1;
            }
        }
        if (!z4) {
            c0057v0.f172c[iM128f] = obj2;
            return;
        }
        int i13 = ~iM128f;
        c0057v0.f171b[i13] = obj;
        c0057v0.f172c[i13] = obj2;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m94882b(C0057v0 c0057v0) {
        Object objM129g = c0057v0.m129g(null);
        if (objM129g == null) {
            return null;
        }
        if (!(objM129g instanceof C0047q0)) {
            c0057v0.m133k(null);
            return objM129g;
        }
        C0047q0 c0047q0 = (C0047q0) objM129g;
        Object objM113989G = AbstractC35903f.m113989G(c0047q0);
        AbstractC22676k.m65748h(objM113989G, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (c0047q0.m104g()) {
            c0057v0.m133k(null);
        }
        if (c0047q0.f137b == 1) {
            c0057v0.m135m(null, c0047q0.m101d());
        }
        return objM113989G;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0085 A[LOOP:0: B:9:0x001e->B:28:0x0085, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0088 A[EDGE_INSN: B:31:0x0088->B:29:0x0088 BREAK  A[LOOP:0: B:9:0x001e->B:28:0x0085], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final C0047q0 m94883c(C0057v0 c0057v0) {
        if (c0057v0.m131i()) {
            C0047q0 c0047q0 = AbstractC0009b1.f24b;
            AbstractC22676k.m65748h(c0047q0, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return c0047q0;
        }
        C0047q0 c0047q1 = new C0047q0();
        Object[] objArr = c0057v0.f172c;
        long[] jArr = c0057v0.f170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j7) < 128) {
                            Object obj = objArr[(i13 << 3) + i15];
                            if (obj instanceof C0047q0) {
                                C0047q0 c0047q2 = (C0047q0) obj;
                                if (!c0047q2.m104g()) {
                                    int i16 = c0047q1.f137b + c0047q2.f137b;
                                    Object[] objArr2 = c0047q1.f136a;
                                    if (objArr2.length < i16) {
                                        c0047q1.m109l(i16, objArr2);
                                    }
                                    AbstractC25260n.m74062d0(c0047q1.f137b, 0, c0047q2.f137b, c0047q2.f136a, c0047q1.f136a);
                                    c0047q1.f137b += c0047q2.f137b;
                                }
                            } else {
                                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                c0047q1.m98a(obj);
                            }
                        }
                        j7 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                }
            }
        }
        return c0047q1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C30847a) {
            return AbstractC22676k.m65745e(this.f127225a, ((C30847a) obj).f127225a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f127225a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f127225a + ')';
    }
}

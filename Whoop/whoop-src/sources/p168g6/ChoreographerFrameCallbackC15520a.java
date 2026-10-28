package p168g6;

import a33.C0352d;
import android.os.SystemClock;
import android.view.Choreographer;
import e10.C12554k0;
import java.util.ArrayList;
import p002a0.C0021f1;
import p009a8.RunnableC0533c;
import p032bc.AbstractC2974w;
import p032bc.C2942c0;
import p032bc.C2970s;
import p032bc.C2971t;
import p032bc.InterfaceC2973v;
import p077d0.C11349f0;

/* JADX INFO: renamed from: g6.a */
/* JADX INFO: loaded from: classes5.dex */
public final class ChoreographerFrameCallbackC15520a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C0352d f58189w;

    public ChoreographerFrameCallbackC15520a(C0352d c0352d) {
        this.f58189w = c0352d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x0131  */
    /* JADX WARN: Code duplicated, block: B:38:0x013e  */
    /* JADX WARN: Code duplicated, block: B:41:0x015a  */
    /* JADX WARN: Code duplicated, block: B:45:0x016e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0174  */
    /* JADX WARN: Code duplicated, block: B:49:0x0188  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        long j13;
        long j14;
        int i13;
        float f13;
        C15526g c15526g;
        boolean z4;
        long j15;
        long j16;
        ArrayList arrayList;
        ThreadLocal threadLocal;
        C15521b c15521b;
        ArrayList arrayList2;
        int iIndexOf;
        int i14;
        int size;
        long j17;
        long j18;
        float f14;
        C2971t c2971t;
        C2942c0 c2942c0;
        InterfaceC2973v interfaceC2973v;
        AbstractC2974w abstractC2974w;
        RunnableC0533c runnableC0533c;
        float f15;
        C15521b c15521b2 = (C15521b) ((C12554k0) this.f58189w.f1237x).f42881x;
        long jUptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList3 = c15521b2.f58192b;
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        boolean z13 = false;
        int i15 = 0;
        while (i15 < arrayList3.size()) {
            C15525f c15525f = (C15525f) arrayList3.get(i15);
            if (c15525f == null) {
                j15 = jUptimeMillis;
                j16 = jUptimeMillis2;
                i13 = i15;
            } else {
                C0021f1 c0021f1 = c15521b2.f58191a;
                Long l7 = (Long) c0021f1.get(c15525f);
                if (l7 == null) {
                    j13 = c15525f.f58213i;
                    if (j13 == 0) {
                        c15525f.f58213i = jUptimeMillis;
                        c15525f.m43709b(c15525f.f58206b);
                        j15 = jUptimeMillis;
                        j16 = jUptimeMillis2;
                        i13 = i15;
                    } else {
                        j14 = jUptimeMillis - j13;
                        c15525f.f58213i = jUptimeMillis;
                        if (c15525f.f58219o) {
                            f15 = c15525f.f58218n;
                            if (f15 != Float.MAX_VALUE) {
                                c15525f.f58217m.f58228i = f15;
                                c15525f.f58218n = Float.MAX_VALUE;
                            }
                            c15525f.f58206b = (float) c15525f.f58217m.f58228i;
                            c15525f.f58205a = 0.0f;
                            c15525f.f58219o = z13;
                            i13 = i15;
                        } else {
                            if (c15525f.f58218n != Float.MAX_VALUE) {
                                C15526g c15526g2 = c15525f.f58217m;
                                double d3 = c15526g2.f58228i;
                                i13 = i15;
                                long j19 = j14 / 2;
                                C11349f0 c11349f0M43712b = c15526g2.m43712b(c15525f.f58206b, c15525f.f58205a, j19);
                                C15526g c15526g3 = c15525f.f58217m;
                                c15526g3.f58228i = c15525f.f58218n;
                                c15525f.f58218n = Float.MAX_VALUE;
                                C11349f0 c11349f0M43712b2 = c15526g3.m43712b(c11349f0M43712b.f36376w, c11349f0M43712b.f36377x, j19);
                                c15525f.f58206b = c11349f0M43712b2.f36376w;
                                c15525f.f58205a = c11349f0M43712b2.f36377x;
                            } else {
                                i13 = i15;
                                C11349f0 c11349f0M43712b3 = c15525f.f58217m.m43712b(c15525f.f58206b, c15525f.f58205a, j14);
                                c15525f.f58206b = c11349f0M43712b3.f36376w;
                                c15525f.f58205a = c11349f0M43712b3.f36377x;
                            }
                            float fMax = Math.max(c15525f.f58206b, c15525f.f58212h);
                            c15525f.f58206b = fMax;
                            float fMin = Math.min(fMax, c15525f.f58211g);
                            c15525f.f58206b = fMin;
                            f13 = c15525f.f58205a;
                            c15526g = c15525f.f58217m;
                            c15526g.getClass();
                            if (Math.abs(f13) < c15526g.f58224e) {
                            }
                            z4 = false;
                            float fMin2 = Math.min(c15525f.f58206b, c15525f.f58211g);
                            c15525f.f58206b = fMin2;
                            float fMax2 = Math.max(fMin2, c15525f.f58212h);
                            c15525f.f58206b = fMax2;
                            c15525f.m43709b(fMax2);
                            if (z4) {
                                arrayList = c15525f.f58215k;
                                c15525f.f58210f = false;
                                threadLocal = C15521b.f58190f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new C15521b());
                                }
                                c15521b = (C15521b) threadLocal.get();
                                c15521b.f58191a.remove(c15525f);
                                arrayList2 = c15521b.f58192b;
                                iIndexOf = arrayList2.indexOf(c15525f);
                                if (iIndexOf >= 0) {
                                    arrayList2.set(iIndexOf, null);
                                    c15521b.f58195e = true;
                                }
                                c15525f.f58213i = 0L;
                                c15525f.f58207c = false;
                                i14 = 0;
                                while (i14 < arrayList.size()) {
                                    if (arrayList.get(i14) != null) {
                                        C2970s c2970s = (C2970s) arrayList.get(i14);
                                        f14 = c15525f.f58206b;
                                        c2971t = c2970s.f11894a;
                                        c2942c0 = c2971t.f11901g;
                                        interfaceC2973v = InterfaceC2973v.f11903c;
                                        if (f14 < 1.0f) {
                                            long j24 = c2942c0.f11930X;
                                            AbstractC2974w abstractC2974wM8589Q = c2942c0.m8589Q(0);
                                            abstractC2974w = abstractC2974wM8589Q.f11925S;
                                            j17 = jUptimeMillis;
                                            abstractC2974wM8589Q.f11925S = null;
                                            j18 = jUptimeMillis2;
                                            c2942c0.mo8580G(-1L, c2971t.f11895a);
                                            c2942c0.mo8580G(j24, -1L);
                                            c2971t.f11895a = j24;
                                            runnableC0533c = c2971t.f11900f;
                                            if (runnableC0533c != null) {
                                                runnableC0533c.run();
                                            }
                                            c2942c0.f11927U.clear();
                                            if (abstractC2974w != null) {
                                                abstractC2974w.m8655z(abstractC2974w, interfaceC2973v, true);
                                            }
                                        } else {
                                            j17 = jUptimeMillis;
                                            j18 = jUptimeMillis2;
                                            c2942c0.m8655z(c2942c0, interfaceC2973v, false);
                                        }
                                        i14++;
                                        jUptimeMillis = j17;
                                        jUptimeMillis2 = j18;
                                    } else {
                                        j17 = jUptimeMillis;
                                        j18 = jUptimeMillis2;
                                    }
                                    i14++;
                                    jUptimeMillis = j17;
                                    jUptimeMillis2 = j18;
                                }
                                j15 = jUptimeMillis;
                                j16 = jUptimeMillis2;
                                for (size = arrayList.size() - 1; size >= 0; size--) {
                                    if (arrayList.get(size) == null) {
                                        arrayList.remove(size);
                                    }
                                }
                            } else {
                                j15 = jUptimeMillis;
                                j16 = jUptimeMillis2;
                            }
                        }
                        z4 = true;
                        float fMin3 = Math.min(c15525f.f58206b, c15525f.f58211g);
                        c15525f.f58206b = fMin3;
                        float fMax3 = Math.max(fMin3, c15525f.f58212h);
                        c15525f.f58206b = fMax3;
                        c15525f.m43709b(fMax3);
                        if (z4) {
                            arrayList = c15525f.f58215k;
                            c15525f.f58210f = false;
                            threadLocal = C15521b.f58190f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new C15521b());
                            }
                            c15521b = (C15521b) threadLocal.get();
                            c15521b.f58191a.remove(c15525f);
                            arrayList2 = c15521b.f58192b;
                            iIndexOf = arrayList2.indexOf(c15525f);
                            if (iIndexOf >= 0) {
                                arrayList2.set(iIndexOf, null);
                                c15521b.f58195e = true;
                            }
                            c15525f.f58213i = 0L;
                            c15525f.f58207c = false;
                            i14 = 0;
                            while (i14 < arrayList.size()) {
                                if (arrayList.get(i14) != null) {
                                    C2970s c2970s2 = (C2970s) arrayList.get(i14);
                                    f14 = c15525f.f58206b;
                                    c2971t = c2970s2.f11894a;
                                    c2942c0 = c2971t.f11901g;
                                    interfaceC2973v = InterfaceC2973v.f11903c;
                                    if (f14 < 1.0f) {
                                        long j25 = c2942c0.f11930X;
                                        AbstractC2974w abstractC2974wM8589Q2 = c2942c0.m8589Q(0);
                                        abstractC2974w = abstractC2974wM8589Q2.f11925S;
                                        j17 = jUptimeMillis;
                                        abstractC2974wM8589Q2.f11925S = null;
                                        j18 = jUptimeMillis2;
                                        c2942c0.mo8580G(-1L, c2971t.f11895a);
                                        c2942c0.mo8580G(j25, -1L);
                                        c2971t.f11895a = j25;
                                        runnableC0533c = c2971t.f11900f;
                                        if (runnableC0533c != null) {
                                            runnableC0533c.run();
                                        }
                                        c2942c0.f11927U.clear();
                                        if (abstractC2974w != null) {
                                            abstractC2974w.m8655z(abstractC2974w, interfaceC2973v, true);
                                        }
                                    } else {
                                        j17 = jUptimeMillis;
                                        j18 = jUptimeMillis2;
                                        c2942c0.m8655z(c2942c0, interfaceC2973v, false);
                                    }
                                    i14++;
                                    jUptimeMillis = j17;
                                    jUptimeMillis2 = j18;
                                } else {
                                    j17 = jUptimeMillis;
                                    j18 = jUptimeMillis2;
                                }
                                i14++;
                                jUptimeMillis = j17;
                                jUptimeMillis2 = j18;
                            }
                            j15 = jUptimeMillis;
                            j16 = jUptimeMillis2;
                            while (size >= 0) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                        } else {
                            j15 = jUptimeMillis;
                            j16 = jUptimeMillis2;
                        }
                    }
                } else if (l7.longValue() < jUptimeMillis2) {
                    c0021f1.remove(c15525f);
                    j13 = c15525f.f58213i;
                    if (j13 == 0) {
                        c15525f.f58213i = jUptimeMillis;
                        c15525f.m43709b(c15525f.f58206b);
                        j15 = jUptimeMillis;
                        j16 = jUptimeMillis2;
                        i13 = i15;
                    } else {
                        j14 = jUptimeMillis - j13;
                        c15525f.f58213i = jUptimeMillis;
                        if (c15525f.f58219o) {
                            f15 = c15525f.f58218n;
                            if (f15 != Float.MAX_VALUE) {
                                c15525f.f58217m.f58228i = f15;
                                c15525f.f58218n = Float.MAX_VALUE;
                            }
                            c15525f.f58206b = (float) c15525f.f58217m.f58228i;
                            c15525f.f58205a = 0.0f;
                            c15525f.f58219o = z13;
                            i13 = i15;
                        } else {
                            if (c15525f.f58218n != Float.MAX_VALUE) {
                                C15526g c15526g4 = c15525f.f58217m;
                                double d14 = c15526g4.f58228i;
                                i13 = i15;
                                long j110 = j14 / 2;
                                C11349f0 c11349f0M43712b4 = c15526g4.m43712b(c15525f.f58206b, c15525f.f58205a, j110);
                                C15526g c15526g5 = c15525f.f58217m;
                                c15526g5.f58228i = c15525f.f58218n;
                                c15525f.f58218n = Float.MAX_VALUE;
                                C11349f0 c11349f0M43712b5 = c15526g5.m43712b(c11349f0M43712b4.f36376w, c11349f0M43712b4.f36377x, j110);
                                c15525f.f58206b = c11349f0M43712b5.f36376w;
                                c15525f.f58205a = c11349f0M43712b5.f36377x;
                            } else {
                                i13 = i15;
                                C11349f0 c11349f0M43712b6 = c15525f.f58217m.m43712b(c15525f.f58206b, c15525f.f58205a, j14);
                                c15525f.f58206b = c11349f0M43712b6.f36376w;
                                c15525f.f58205a = c11349f0M43712b6.f36377x;
                            }
                            float fMax4 = Math.max(c15525f.f58206b, c15525f.f58212h);
                            c15525f.f58206b = fMax4;
                            float fMin4 = Math.min(fMax4, c15525f.f58211g);
                            c15525f.f58206b = fMin4;
                            f13 = c15525f.f58205a;
                            c15526g = c15525f.f58217m;
                            c15526g.getClass();
                            if (Math.abs(f13) < c15526g.f58224e || Math.abs(fMin4 - ((float) c15526g.f58228i)) >= c15526g.f58223d) {
                                z4 = false;
                            } else {
                                c15525f.f58206b = (float) c15525f.f58217m.f58228i;
                                c15525f.f58205a = 0.0f;
                            }
                            float fMin5 = Math.min(c15525f.f58206b, c15525f.f58211g);
                            c15525f.f58206b = fMin5;
                            float fMax5 = Math.max(fMin5, c15525f.f58212h);
                            c15525f.f58206b = fMax5;
                            c15525f.m43709b(fMax5);
                            if (z4) {
                                arrayList = c15525f.f58215k;
                                c15525f.f58210f = false;
                                threadLocal = C15521b.f58190f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new C15521b());
                                }
                                c15521b = (C15521b) threadLocal.get();
                                c15521b.f58191a.remove(c15525f);
                                arrayList2 = c15521b.f58192b;
                                iIndexOf = arrayList2.indexOf(c15525f);
                                if (iIndexOf >= 0) {
                                    arrayList2.set(iIndexOf, null);
                                    c15521b.f58195e = true;
                                }
                                c15525f.f58213i = 0L;
                                c15525f.f58207c = false;
                                i14 = 0;
                                while (i14 < arrayList.size()) {
                                    if (arrayList.get(i14) != null) {
                                        C2970s c2970s3 = (C2970s) arrayList.get(i14);
                                        f14 = c15525f.f58206b;
                                        c2971t = c2970s3.f11894a;
                                        c2942c0 = c2971t.f11901g;
                                        interfaceC2973v = InterfaceC2973v.f11903c;
                                        if (f14 < 1.0f) {
                                            long j26 = c2942c0.f11930X;
                                            AbstractC2974w abstractC2974wM8589Q3 = c2942c0.m8589Q(0);
                                            abstractC2974w = abstractC2974wM8589Q3.f11925S;
                                            j17 = jUptimeMillis;
                                            abstractC2974wM8589Q3.f11925S = null;
                                            j18 = jUptimeMillis2;
                                            c2942c0.mo8580G(-1L, c2971t.f11895a);
                                            c2942c0.mo8580G(j26, -1L);
                                            c2971t.f11895a = j26;
                                            runnableC0533c = c2971t.f11900f;
                                            if (runnableC0533c != null) {
                                                runnableC0533c.run();
                                            }
                                            c2942c0.f11927U.clear();
                                            if (abstractC2974w != null) {
                                                abstractC2974w.m8655z(abstractC2974w, interfaceC2973v, true);
                                            }
                                        } else {
                                            j17 = jUptimeMillis;
                                            j18 = jUptimeMillis2;
                                            c2942c0.m8655z(c2942c0, interfaceC2973v, false);
                                        }
                                        i14++;
                                        jUptimeMillis = j17;
                                        jUptimeMillis2 = j18;
                                    } else {
                                        j17 = jUptimeMillis;
                                        j18 = jUptimeMillis2;
                                    }
                                    i14++;
                                    jUptimeMillis = j17;
                                    jUptimeMillis2 = j18;
                                }
                                j15 = jUptimeMillis;
                                j16 = jUptimeMillis2;
                                while (size >= 0) {
                                    if (arrayList.get(size) == null) {
                                        arrayList.remove(size);
                                    }
                                }
                            } else {
                                j15 = jUptimeMillis;
                                j16 = jUptimeMillis2;
                            }
                        }
                        z4 = true;
                        float fMin6 = Math.min(c15525f.f58206b, c15525f.f58211g);
                        c15525f.f58206b = fMin6;
                        float fMax6 = Math.max(fMin6, c15525f.f58212h);
                        c15525f.f58206b = fMax6;
                        c15525f.m43709b(fMax6);
                        if (z4) {
                            arrayList = c15525f.f58215k;
                            c15525f.f58210f = false;
                            threadLocal = C15521b.f58190f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new C15521b());
                            }
                            c15521b = (C15521b) threadLocal.get();
                            c15521b.f58191a.remove(c15525f);
                            arrayList2 = c15521b.f58192b;
                            iIndexOf = arrayList2.indexOf(c15525f);
                            if (iIndexOf >= 0) {
                                arrayList2.set(iIndexOf, null);
                                c15521b.f58195e = true;
                            }
                            c15525f.f58213i = 0L;
                            c15525f.f58207c = false;
                            i14 = 0;
                            while (i14 < arrayList.size()) {
                                if (arrayList.get(i14) != null) {
                                    C2970s c2970s4 = (C2970s) arrayList.get(i14);
                                    f14 = c15525f.f58206b;
                                    c2971t = c2970s4.f11894a;
                                    c2942c0 = c2971t.f11901g;
                                    interfaceC2973v = InterfaceC2973v.f11903c;
                                    if (f14 < 1.0f) {
                                        long j27 = c2942c0.f11930X;
                                        AbstractC2974w abstractC2974wM8589Q4 = c2942c0.m8589Q(0);
                                        abstractC2974w = abstractC2974wM8589Q4.f11925S;
                                        j17 = jUptimeMillis;
                                        abstractC2974wM8589Q4.f11925S = null;
                                        j18 = jUptimeMillis2;
                                        c2942c0.mo8580G(-1L, c2971t.f11895a);
                                        c2942c0.mo8580G(j27, -1L);
                                        c2971t.f11895a = j27;
                                        runnableC0533c = c2971t.f11900f;
                                        if (runnableC0533c != null) {
                                            runnableC0533c.run();
                                        }
                                        c2942c0.f11927U.clear();
                                        if (abstractC2974w != null) {
                                            abstractC2974w.m8655z(abstractC2974w, interfaceC2973v, true);
                                        }
                                    } else {
                                        j17 = jUptimeMillis;
                                        j18 = jUptimeMillis2;
                                        c2942c0.m8655z(c2942c0, interfaceC2973v, false);
                                    }
                                    i14++;
                                    jUptimeMillis = j17;
                                    jUptimeMillis2 = j18;
                                } else {
                                    j17 = jUptimeMillis;
                                    j18 = jUptimeMillis2;
                                }
                                i14++;
                                jUptimeMillis = j17;
                                jUptimeMillis2 = j18;
                            }
                            j15 = jUptimeMillis;
                            j16 = jUptimeMillis2;
                            while (size >= 0) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                        } else {
                            j15 = jUptimeMillis;
                            j16 = jUptimeMillis2;
                        }
                    }
                } else {
                    j15 = jUptimeMillis;
                    j16 = jUptimeMillis2;
                    i13 = i15;
                }
            }
            i15 = i13 + 1;
            jUptimeMillis = j15;
            jUptimeMillis2 = j16;
            z13 = false;
        }
        if (c15521b2.f58195e) {
            for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                if (arrayList3.get(size2) == null) {
                    arrayList3.remove(size2);
                }
            }
            c15521b2.f58195e = false;
        }
        if (arrayList3.size() > 0) {
            if (c15521b2.f58194d == null) {
                c15521b2.f58194d = new C0352d(c15521b2.f58193c);
            }
            C0352d c0352d = c15521b2.f58194d;
            ((Choreographer) c0352d.f1238y).postFrameCallback((ChoreographerFrameCallbackC15520a) c0352d.f1239z);
        }
    }
}

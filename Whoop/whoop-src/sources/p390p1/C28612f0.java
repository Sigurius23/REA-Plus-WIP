package p390p1;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p002a0.C0039m0;
import p446r1.C30849c;
import p474s.C31983m2;
import p602x1.C37818d;
import p652yl.C39615a;
import p668z1.AbstractC39948a0;
import p668z1.AbstractC39950b0;
import p668z1.AbstractC39957f;
import p668z1.AbstractC39963l;
import p668z1.InterfaceC39977z;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C28612f0 extends AbstractC39948a0 implements InterfaceC28670t2 {

    /* JADX INFO: renamed from: x */
    public final InterfaceC4339a f115753x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC28650o2 f115754y;

    /* JADX INFO: renamed from: z */
    public C28608e0 f115755z = new C28608e0(AbstractC39963l.m128171k().mo128147g());

    public C28612f0(InterfaceC4339a interfaceC4339a, InterfaceC28650o2 interfaceC28650o2) {
        this.f115753x = interfaceC4339a;
        this.f115754y = interfaceC28650o2;
    }

    @Override // p668z1.InterfaceC39977z
    /* JADX INFO: renamed from: N */
    public final AbstractC39950b0 mo87010N() {
        return this.f115755z;
    }

    @Override // p390p1.InterfaceC28670t2
    public final Object getValue() {
        Function1 function1Mo128133e = AbstractC39963l.m128171k().mo128133e();
        if (function1Mo128133e != null) {
            function1Mo128133e.invoke(this);
        }
        AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
        return m87012x((C28608e0) AbstractC39963l.m128170j(this.f115755z, abstractC39957fM128171k), abstractC39957fM128171k, true, this.f115753x).f115735f;
    }

    @Override // p668z1.InterfaceC39977z
    /* JADX INFO: renamed from: m0 */
    public final void mo87011m0(AbstractC39950b0 abstractC39950b0) {
        AbstractC22676k.m65748h(abstractC39950b0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f115755z = (C28608e0) abstractC39950b0;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("DerivedState(value=");
        C28608e0 c28608e0 = (C28608e0) AbstractC39963l.m128169i(this.f115755z);
        sb4.append(c28608e0.m86987c(this, AbstractC39963l.m128171k()) ? String.valueOf(c28608e0.f115735f) : "<Not calculated>");
        sb4.append(")@");
        sb4.append(hashCode());
        return sb4.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00a3 A[EDGE_INSN: B:101:0x00a3->B:31:0x00a3 BREAK  A[LOOP:1: B:16:0x0049->B:30:0x009e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x009e, LOOP_END, TryCatch #2 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x005c, B:20:0x0068, B:22:0x0072, B:24:0x008a, B:26:0x0090, B:30:0x009e, B:31:0x00a3), top: B:95:0x0023 }] */
    /* JADX INFO: renamed from: x */
    public final C28608e0 m87012x(C28608e0 c28608e0, AbstractC39957f abstractC39957f, boolean z4, InterfaceC4339a interfaceC4339a) {
        InterfaceC28650o2 interfaceC28650o2;
        int i13;
        C28608e0 c28608e1 = c28608e0;
        if (c28608e1.m86987c(this, abstractC39957f)) {
            if (z4) {
                C30849c c30849cM87263q = AbstractC28683x.m87263q();
                Object[] objArr = c30849cM87263q.f127227w;
                int i14 = c30849cM87263q.f127229y;
                for (int i15 = 0; i15 < i14; i15++) {
                    ((C28651p) objArr[i15]).m87114b();
                }
                try {
                    C0039m0 c0039m0 = c28608e1.f115734e;
                    C31983m2 c31983m2 = AbstractC28654p2.f115883a;
                    C37818d c37818d = (C37818d) c31983m2.m99482f();
                    if (c37818d == null) {
                        c37818d = new C37818d();
                        c31983m2.m99492s(c37818d);
                    }
                    int i16 = c37818d.f161963a;
                    Object[] objArr2 = c0039m0.f115b;
                    int[] iArr = c0039m0.f116c;
                    long[] jArr = c0039m0.f114a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j7 = jArr[i17];
                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i17 != length) {
                                    break;
                                    break;
                                }
                                i17++;
                            } else {
                                int i18 = 8;
                                int i19 = 8 - ((~(i17 - length)) >>> 31);
                                int i24 = 0;
                                while (i24 < i19) {
                                    if ((j7 & 255) < 128) {
                                        int i25 = (i17 << 3) + i24;
                                        i13 = i18;
                                        InterfaceC39977z interfaceC39977z = (InterfaceC39977z) objArr2[i25];
                                        c37818d.f161963a = i16 + iArr[i25];
                                        Function1 function1Mo128133e = abstractC39957f.mo128133e();
                                        if (function1Mo128133e != null) {
                                            function1Mo128133e.invoke(interfaceC39977z);
                                        }
                                    } else {
                                        i13 = i18;
                                    }
                                    j7 >>= i13;
                                    i24++;
                                    i18 = i13;
                                }
                                if (i19 != i18) {
                                    break;
                                }
                                if (i17 != length) {
                                    break;
                                }
                                i17++;
                            }
                        }
                    }
                    c37818d.f161963a = i16;
                } finally {
                    Object[] objArr3 = c30849cM87263q.f127227w;
                    int i26 = c30849cM87263q.f127229y;
                    for (int i27 = 0; i27 < i26; i27++) {
                        ((C28651p) objArr3[i27]).m87113a();
                    }
                }
            }
            return c28608e1;
        }
        final C0039m0 c0039m1 = new C0039m0();
        C31983m2 c31983m3 = AbstractC28654p2.f115883a;
        final C37818d c37818d2 = (C37818d) c31983m3.m99482f();
        if (c37818d2 == null) {
            c37818d2 = new C37818d();
            c31983m3.m99492s(c37818d2);
        }
        final int i28 = c37818d2.f161963a;
        C30849c c30849cM87263q2 = AbstractC28683x.m87263q();
        Object[] objArr4 = c30849cM87263q2.f127227w;
        int i29 = c30849cM87263q2.f127229y;
        for (int i34 = 0; i34 < i29; i34++) {
            ((C28651p) objArr4[i34]).m87114b();
        }
        try {
            c37818d2.f161963a = i28 + 1;
            Object objM126590f = C39615a.m126590f(interfaceC4339a, new Function1() { // from class: p1.d0
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    if (obj == this.f115720w) {
                        throw new IllegalStateException("A derived state calculation cannot read itself");
                    }
                    if (obj instanceof InterfaceC39977z) {
                        int i35 = c37818d2.f161963a - i28;
                        C0039m0 c0039m2 = c0039m1;
                        int iM91d = c0039m2.m91d(obj);
                        c0039m2.m95h(obj, Math.min(i35, iM91d >= 0 ? c0039m2.f116c[iM91d] : Integer.MAX_VALUE));
                    }
                    return C23454a0.f92919a;
                }
            });
            c37818d2.f161963a = i28;
            Object[] objArr5 = c30849cM87263q2.f127227w;
            int i35 = c30849cM87263q2.f127229y;
            for (int i36 = 0; i36 < i35; i36++) {
                ((C28651p) objArr5[i36]).m87113a();
            }
            Object obj = AbstractC39963l.f172462c;
            synchronized (obj) {
                try {
                    AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
                    Object obj2 = c28608e1.f115735f;
                    if (obj2 == C28608e0.f115731h || (interfaceC28650o2 = this.f115754y) == null || !interfaceC28650o2.mo87112a(objM126590f, obj2)) {
                        C28608e0 c28608e2 = this.f115755z;
                        synchronized (obj) {
                            AbstractC39950b0 abstractC39950b0M128173m = AbstractC39963l.m128173m(c28608e2, this);
                            abstractC39950b0M128173m.mo86985a(c28608e2);
                            abstractC39950b0M128173m.f172419a = abstractC39957fM128171k.mo128147g();
                            c28608e1 = (C28608e0) abstractC39950b0M128173m;
                            c28608e1.f115734e = c0039m1;
                            c28608e1.f115736g = c28608e1.m86988d(this, abstractC39957fM128171k);
                            c28608e1.f115735f = objM126590f;
                        }
                        return c28608e1;
                    }
                    c28608e1.f115734e = c0039m1;
                    c28608e1.f115736g = c28608e1.m86988d(this, abstractC39957fM128171k);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            C37818d c37818d3 = (C37818d) AbstractC28654p2.f115883a.m99482f();
            if (c37818d3 == null || c37818d3.f161963a != 0) {
                return c28608e1;
            }
            AbstractC39963l.m128171k().mo128125m();
            synchronized (obj) {
                AbstractC39957f abstractC39957fM128171k2 = AbstractC39963l.m128171k();
                c28608e1.f115732c = abstractC39957fM128171k2.mo128147g();
                c28608e1.f115733d = abstractC39957fM128171k2.mo128135h();
                return c28608e1;
            }
        } catch (Throwable th4) {
            Object[] objArr6 = c30849cM87263q2.f127227w;
            int i37 = c30849cM87263q2.f127229y;
            for (int i38 = 0; i38 < i37; i38++) {
                ((C28651p) objArr6[i38]).m87113a();
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: y */
    public final C28608e0 m87013y() {
        AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
        return m87012x((C28608e0) AbstractC39963l.m128170j(this.f115755z, abstractC39957fM128171k), abstractC39957fM128171k, false, this.f115753x);
    }
}

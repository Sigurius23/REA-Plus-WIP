package p180h0;

import e93.AbstractC12889b;
import java.util.List;
import l83.InterfaceC23459e;
import oq1.C28119c;
import p097ds.AbstractC12313p;
import p163g1.C15126r0;
import p206i0.InterfaceC17834l;
import p206i0.InterfaceC17836n;
import p268k0.AbstractC22086a;
import p390p1.C28633k1;
import p409q0.AbstractC29701y;
import p409q0.C29678d;
import p409q0.C29693q;
import p409q0.C29696t;
import p507tx.AbstractC34235f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h0.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C16368c implements InterfaceC17834l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62923a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f62924b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC23459e f62925c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f62926d;

    public /* synthetic */ C16368c(Object obj, InterfaceC23459e interfaceC23459e, Object obj2, int i13) {
        this.f62923a = i13;
        this.f62924b = obj;
        this.f62925c = interfaceC23459e;
        this.f62926d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01a0  */
    @Override // p206i0.InterfaceC17834l
    /* JADX INFO: renamed from: a */
    public final float mo46566a(float f13) {
        Object objM46647b;
        switch (this.f62923a) {
            case 0:
                C16435p c16435p = (C16435p) this.f62924b;
                float fM46616f = c16435p.m46616f();
                InterfaceC16397h1 interfaceC16397h1M46613c = c16435p.m46613c();
                Function1 function1 = (Function1) this.f62925c;
                C15126r0 c15126r0 = (C15126r0) this.f62926d;
                if (Float.isNaN(fM46616f)) {
                    throw new IllegalArgumentException("The offset provided to computeTarget must not be NaN.");
                }
                boolean z4 = Math.abs(f13) > 0.0f;
                boolean z13 = z4 && f13 > 0.0f;
                if (!z4) {
                    objM46647b = ((C16475x) interfaceC16397h1M46613c).m46646a(fM46616f);
                    AbstractC22676k.m65747g(objM46647b);
                } else if (Math.abs(f13) >= Math.abs(((Number) c15126r0.invoke()).floatValue())) {
                    objM46647b = ((C16475x) interfaceC16397h1M46613c).m46647b(fM46616f, z13);
                    AbstractC22676k.m65747g(objM46647b);
                } else {
                    C16475x c16475x = (C16475x) interfaceC16397h1M46613c;
                    objM46647b = c16475x.m46647b(fM46616f, false);
                    AbstractC22676k.m65747g(objM46647b);
                    float fM46650e = c16475x.m46650e(objM46647b);
                    Object objM46647b2 = c16475x.m46647b(fM46616f, true);
                    AbstractC22676k.m65747g(objM46647b2);
                    float fM46650e2 = c16475x.m46650e(objM46647b2);
                    float fAbs = Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(fM46650e - fM46650e2)))).floatValue());
                    if (!z13) {
                        fM46650e = fM46650e2;
                    }
                    boolean z14 = Math.abs(fM46650e - fM46616f) >= fAbs;
                    if (!z14) {
                        if (z14) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!z13) {
                            objM46647b = objM46647b2;
                        }
                    } else if (z13) {
                        objM46647b = objM46647b2;
                    }
                }
                return ((C16475x) c16435p.m46613c()).m46650e(objM46647b) - fM46616f;
            default:
                AbstractC29701y abstractC29701y = (AbstractC29701y) this.f62924b;
                InterfaceC17836n interfaceC17836n = abstractC29701y.m91163l().f121394n;
                List list = abstractC29701y.m91163l().f121381a;
                int size = list.size();
                float f14 = Float.POSITIVE_INFINITY;
                float f15 = Float.NEGATIVE_INFINITY;
                for (int i13 = 0; i13 < size; i13++) {
                    C29678d c29678d = (C29678d) list.get(i13);
                    int iM34257I = AbstractC12313p.m34257I(abstractC29701y.m91163l());
                    int i14 = -abstractC29701y.m91163l().f121386f;
                    int i15 = abstractC29701y.m91163l().f121384d;
                    int i16 = abstractC29701y.m91163l().f121382b;
                    int i17 = c29678d.f121304k;
                    abstractC29701y.mo91148m();
                    float fMo51269a = i17 - interfaceC17836n.mo51269a(iM34257I, i16, i14, i15);
                    if (fMo51269a <= 0.0f && fMo51269a > f15) {
                        f15 = fMo51269a;
                    }
                    if (fMo51269a >= 0.0f && fMo51269a < f14) {
                        f14 = fMo51269a;
                    }
                }
                if (f15 == Float.NEGATIVE_INFINITY) {
                    f15 = f14;
                }
                if (f14 == Float.POSITIVE_INFINITY) {
                    f14 = f15;
                }
                if (!abstractC29701y.mo39183d()) {
                    if (AbstractC34235f.m108210R(abstractC29701y, f13)) {
                        f15 = 0.0f;
                        f14 = 0.0f;
                    } else {
                        f14 = 0.0f;
                    }
                }
                if (!abstractC29701y.mo39182c()) {
                    f15 = 0.0f;
                    if (!AbstractC34235f.m108210R(abstractC29701y, f13)) {
                        f14 = 0.0f;
                    }
                }
                Float fValueOf = Float.valueOf(f15);
                Float fValueOf2 = Float.valueOf(f14);
                float fFloatValue = fValueOf.floatValue();
                float fFloatValue2 = fValueOf2.floatValue();
                float fFloatValue3 = ((Number) ((C28119c) this.f62925c).invoke(Float.valueOf(f13), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
                if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
                    AbstractC22086a.m63160c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
                }
                if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
                    return 0.0f;
                }
                return fFloatValue3;
        }
    }

    @Override // p206i0.InterfaceC17834l
    /* JADX INFO: renamed from: b */
    public final float mo46567b(float f13, float f14) {
        switch (this.f62923a) {
            case 0:
                return 0.0f;
            default:
                AbstractC29701y abstractC29701y = (AbstractC29701y) this.f62924b;
                int iM91164n = abstractC29701y.m91164n();
                C28633k1 c28633k1 = abstractC29701y.f121445p;
                int i13 = ((C29693q) c28633k1.getValue()).f121383c + iM91164n;
                if (i13 == 0) {
                    return 0.0f;
                }
                int i14 = f13 < 0.0f ? abstractC29701y.f121434e + 1 : abstractC29701y.f121434e;
                int iM36284n = AbstractC12889b.m36284n(((int) (f14 / i13)) + i14, 0, abstractC29701y.mo91148m());
                C29696t c29696t = (C29696t) this.f62926d;
                abstractC29701y.m91164n();
                int i15 = ((C29693q) c28633k1.getValue()).f121383c;
                long j7 = i14;
                long j13 = c29696t.f121401a;
                long j14 = j7 - j13;
                if (j14 < 0) {
                    j14 = 0;
                }
                int i16 = (int) j14;
                long j15 = j7 + j13;
                if (j15 > 2147483647L) {
                    j15 = 2147483647L;
                }
                int iAbs = Math.abs((AbstractC12889b.m36284n(AbstractC12889b.m36284n(iM36284n, i16, (int) j15), 0, abstractC29701y.mo91148m()) - i14) * i13) - i13;
                int i17 = iAbs >= 0 ? iAbs : 0;
                if (i17 == 0) {
                    return i17;
                }
                return Math.signum(f13) * i17;
        }
    }
}

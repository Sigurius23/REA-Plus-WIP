package ch;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2567l4;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import coil.compose.AsyncImagePainter$State$Error;
import coil.compose.AsyncImagePainter$State$Loading;
import coil.compose.AsyncImagePainter$State$Success;
import g40.C15454z1;
import g40.InterfaceC15391m3;
import l83.C23454a0;
import n00.C26075c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p097ds.AbstractC12313p;
import p162g0.AbstractC14929f;
import p162g0.C14926c;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15044i9;
import p163g1.AbstractC15047j1;
import p163g1.AbstractC15067l1;
import p163g1.AbstractC15086n0;
import p163g1.C14970c1;
import p163g1.C15033h9;
import p163g1.C15076m0;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p268k0.AbstractC22086a;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23001u;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p507tx.AbstractC34235f;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ch.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C4599t implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18498w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f18499x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f18500y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f18501z;

    public C4599t(InterfaceC4351m interfaceC4351m, Function3 function3, InterfaceC4339a interfaceC4339a) {
        this.f18498w = 1;
        this.f18499x = interfaceC4351m;
        this.f18500y = function3;
        this.f18501z = interfaceC4339a;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:107:0x02de  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:111:0x0318  */
    /* JADX WARN: Code duplicated, block: B:113:0x031c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0337  */
    /* JADX WARN: Code duplicated, block: B:116:0x033b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0356  */
    /* JADX WARN: Code duplicated, block: B:12:0x0058  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC4585f abstractC4585f;
        double d3;
        switch (this.f18498w) {
            case 0:
                C4597r c4597r = (C4597r) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 14) == 0) {
                    iIntValue |= ((C28655q) composer).m87153g(c4597r) ? 4 : 2;
                }
                if ((iIntValue & 91) == 18) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        abstractC4585f = (AbstractC4585f) c4597r.f18487b.f20223Q.getValue();
                        if (abstractC4585f instanceof AsyncImagePainter$State$Loading) {
                            C28655q c28655q2 = (C28655q) composer;
                            c28655q2.m87152f0(1739512213);
                            ((C37816b) this.f18499x).invoke(c4597r, abstractC4585f, c28655q2, Integer.valueOf((iIntValue & 14) | 64));
                            c28655q2.m87173q(false);
                        } else if (abstractC4585f instanceof AsyncImagePainter$State$Success) {
                            C28655q c28655q3 = (C28655q) composer;
                            c28655q3.m87152f0(1739605461);
                            ((C37816b) this.f18500y).invoke(c4597r, abstractC4585f, c28655q3, Integer.valueOf((iIntValue & 14) | 64));
                            c28655q3.m87173q(false);
                        } else if (abstractC4585f instanceof AsyncImagePainter$State$Error) {
                            C28655q c28655q4 = (C28655q) composer;
                            c28655q4.m87152f0(1739696601);
                            ((C37816b) this.f18501z).invoke(c4597r, abstractC4585f, c28655q4, Integer.valueOf((iIntValue & 14) | 64));
                            c28655q4.m87173q(false);
                        } else {
                            if (abstractC4585f instanceof C4584e) {
                                C28655q c28655q5 = (C28655q) composer;
                                c28655q5.m87152f0(-82435959);
                                c28655q5.m87173q(false);
                                throw new NoWhenBranchMatchedException();
                            }
                            C28655q c28655q6 = (C28655q) composer;
                            c28655q6.m87152f0(1739782316);
                            c28655q6.m87173q(false);
                            AbstractC12313p.m34297o(c4597r, null, null, null, null, null, 0.0f, false, composer, iIntValue & 14);
                        }
                    }
                } else {
                    abstractC4585f = (AbstractC4585f) c4597r.f18487b.f20223Q.getValue();
                    if (abstractC4585f instanceof AsyncImagePainter$State$Loading) {
                        C28655q c28655q7 = (C28655q) composer;
                        c28655q7.m87152f0(1739512213);
                        ((C37816b) this.f18499x).invoke(c4597r, abstractC4585f, c28655q7, Integer.valueOf((iIntValue & 14) | 64));
                        c28655q7.m87173q(false);
                    } else if (abstractC4585f instanceof AsyncImagePainter$State$Success) {
                        C28655q c28655q8 = (C28655q) composer;
                        c28655q8.m87152f0(1739605461);
                        ((C37816b) this.f18500y).invoke(c4597r, abstractC4585f, c28655q8, Integer.valueOf((iIntValue & 14) | 64));
                        c28655q8.m87173q(false);
                    } else if (abstractC4585f instanceof AsyncImagePainter$State$Error) {
                        C28655q c28655q9 = (C28655q) composer;
                        c28655q9.m87152f0(1739696601);
                        ((C37816b) this.f18501z).invoke(c4597r, abstractC4585f, c28655q9, Integer.valueOf((iIntValue & 14) | 64));
                        c28655q9.m87173q(false);
                    } else {
                        if (abstractC4585f instanceof C4584e) {
                            C28655q c28655q10 = (C28655q) composer;
                            c28655q10.m87152f0(-82435959);
                            c28655q10.m87173q(false);
                            throw new NoWhenBranchMatchedException();
                        }
                        C28655q c28655q11 = (C28655q) composer;
                        c28655q11.m87152f0(1739782316);
                        c28655q11.m87173q(false);
                        AbstractC12313p.m34297o(c4597r, null, null, null, null, null, 0.0f, false, composer, iIntValue & 14);
                    }
                }
                return C23454a0.f92919a;
            case 1:
                C14926c c14926c = (C14926c) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((C28655q) composer2).m87153g(c14926c) ? 4 : 2;
                }
                C28655q c28655q12 = (C28655q) composer2;
                if (c28655q12.m87135U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    String str = (String) ((InterfaceC4351m) this.f18499x).invoke(c28655q12, 0);
                    if (AbstractC39414r.m125890i0(str)) {
                        AbstractC22086a.m63160c("Label must not be blank");
                    }
                    AbstractC14929f.m43025c(str, c14926c, C2314t.f9131w, (Function3) this.f18500y, (InterfaceC4339a) this.f18501z, c28655q12, (iIntValue2 << 6) & 896);
                } else {
                    c28655q12.m87138X();
                }
                return C23454a0.f92919a;
            case 2:
                InterfaceC22997s1 interfaceC22997s1 = (InterfaceC22997s1) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                C2306l c2306l = C2299e.f9108K;
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) this.f18500y;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((C28655q) composer3).m87153g(interfaceC22997s1) ? 4 : 2;
                }
                C28655q c28655q13 = (C28655q) composer3;
                if (c28655q13.m87135U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    if (interfaceC4351m == null) {
                        c28655q13.m87150e0(-1394361313);
                        AbstractC22953f.m66715b(c28655q13, AbstractC15086n0.f56486c);
                        c28655q13.m87173q(false);
                        d3 = 0.5d;
                    } else {
                        c28655q13.m87150e0(-1394295686);
                        Modifier modifier = AbstractC15086n0.f56487d;
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q13, 48);
                        int iHashCode = Long.hashCode(c28655q13.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q13.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q13, modifier);
                        InterfaceC0221l.f734a.getClass();
                        C0213j c0213j = C0217k.f724b;
                        c28655q13.m87158i0();
                        d3 = 0.5d;
                        if (c28655q13.f115903S) {
                            c28655q13.m87163l(c0213j);
                        } else {
                            c28655q13.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q13, C0217k.f729g, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q13, C0217k.f728f, interfaceC28653p1M87165m);
                        C0209i c0209i = C0217k.f732j;
                        if (c28655q13.f115903S || !AbstractC22676k.m65745e(c28655q13.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q13, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q13, C0217k.f726d, modifierM118962N);
                        C28596b0 c28596b0 = AbstractC15047j1.f56336a;
                        long j7 = ((C17919x) c28655q13.m87161k(AbstractC15067l1.f56420a)).f69639a;
                        AbstractC28683x.m87247a(c28596b0.mo86977a(Float.valueOf((!((C14970c1) c28655q13.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j7)) < 0.5d : ((double) AbstractC17918w0.m51536x(j7)) > 0.5d) ? 0.87f : 1.0f)), interfaceC4351m, c28655q13, 8);
                        c28655q13.m87173q(true);
                        c28655q13.m87173q(false);
                    }
                    Modifier modifierMo66772c = interfaceC22997s1.mo66772c(AbstractC1102d.m3406c(1.0f, C2314t.f9131w), true, 1.0f);
                    C37816b c37816b = (C37816b) this.f18499x;
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q13, 48);
                    int iHashCode2 = Long.hashCode(c28655q13.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q13.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q13, modifierMo66772c);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j2 = C0217k.f724b;
                    c28655q13.m87158i0();
                    if (c28655q13.f115903S) {
                        c28655q13.m87163l(c0213j2);
                    } else {
                        c28655q13.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q13, C0217k.f729g, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q13, C0217k.f728f, interfaceC28653p1M87165m2);
                    C0209i c0209i2 = C0217k.f732j;
                    if (c28655q13.f115903S || !AbstractC22676k.m65745e(c28655q13.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q13, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q13, C0217k.f726d, modifierM118962N2);
                    AbstractC15011f9.m43113a(((C15033h9) c28655q13.m87161k(AbstractC15044i9.f56319b)).f56279f, AbstractC37817c.m121344e(1206983395, c28655q13, new C2567l4(c37816b, 6)), c28655q13, 48);
                    c28655q13.m87173q(true);
                    C28596b0 c28596b1 = AbstractC15047j1.f56336a;
                    long j13 = ((C17919x) c28655q13.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    AbstractC28683x.m87247a(c28596b1.mo86977a(Float.valueOf((!((C14970c1) c28655q13.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j13)) < d3 : ((double) AbstractC17918w0.m51536x(j13)) > d3) ? 0.6f : 0.74f)), AbstractC37817c.m121344e(-1033635954, c28655q13, new C15076m0(0, (Function3) this.f18501z)), c28655q13, 56);
                } else {
                    c28655q13.m87138X();
                }
                return C23454a0.f92919a;
            case 3:
                InterfaceC23001u MinScreenHeightBox = (InterfaceC23001u) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(MinScreenHeightBox, "$this$MinScreenHeightBox");
                if ((iIntValue4 & 17) == 16) {
                    C28655q c28655q14 = (C28655q) composer4;
                    if (c28655q14.m87121F()) {
                        c28655q14.m87138X();
                    } else {
                        AbstractC34235f.m108226l((Function1) this.f18499x, (Function1) this.f18500y, (Function1) this.f18501z, composer4, 0);
                    }
                } else {
                    AbstractC34235f.m108226l((Function1) this.f18499x, (Function1) this.f18500y, (Function1) this.f18501z, composer4, 0);
                }
                return C23454a0.f92919a;
            default:
                InterfaceC3747i0 AnimatedVisibility = (InterfaceC3747i0) obj;
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
                AbstractC32411b.m101102n((C15454z1) this.f18499x, (InterfaceC15391m3) this.f18500y, (C26075c) this.f18501z, (Composer) obj2, 8);
                return C23454a0.f92919a;
        }
    }

    public C4599t(InterfaceC4351m interfaceC4351m, C37816b c37816b, Function3 function3) {
        this.f18498w = 2;
        this.f18500y = interfaceC4351m;
        this.f18499x = c37816b;
        this.f18501z = function3;
    }

    public /* synthetic */ C4599t(Object obj, Object obj2, Object obj3, int i13) {
        this.f18498w = i13;
        this.f18499x = obj;
        this.f18500y = obj2;
        this.f18501z = obj3;
    }
}

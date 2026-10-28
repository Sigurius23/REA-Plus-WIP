package p163g1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import d40.AbstractC11673r;
import d40.C11669n;
import d40.C11671p;
import g40.C15440w2;
import g40.InterfaceC15450y2;
import ge3.AbstractC15751g;
import java.util.Set;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p477s2.AbstractC32072d;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import v41.C35657b0;
import w01.C36681f;
import w20.C36736z;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.f4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15006f4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f56130E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56131w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f56132x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f56133y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f56134z;

    public C15006f4(C15440w2 c15440w2, Set set, boolean z4, IdentifierSpec identifierSpec) {
        this.f56131w = 1;
        this.f56133y = c15440w2;
        this.f56134z = set;
        this.f56132x = z4;
        this.f56130E = identifierSpec;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    /* JADX WARN: Code duplicated, block: B:12:0x007c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0080  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:30:0x010f  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:62:0x0205  */
    /* JADX WARN: Code duplicated, block: B:71:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:74:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:94:0x0309 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0303 A[SYNTHETIC] */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Set set;
        IdentifierSpec identifierSpec;
        int i13;
        int i14;
        C28655q c28655q;
        C23454a0 c23454a0;
        int iM87266t;
        Function1 function1;
        int iM87266t2;
        C28655q c28655q2;
        C0213j c0213j;
        C0209i c0209i;
        boolean zM87153g;
        Object objM87133R;
        boolean zM87153g2;
        Object objM87133R2;
        boolean zM87153g3;
        Object objM87133R3;
        int i15 = this.f56131w;
        boolean z4 = this.f56132x;
        C2314t c2314t = C2314t.f9131w;
        C23454a0 c23454a1 = C23454a0.f92919a;
        Object obj3 = this.f56130E;
        Object obj4 = this.f56133y;
        Object obj5 = this.f56134z;
        switch (i15) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q3 = (C28655q) composer;
                if (c28655q3.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C15043i8.f56313a.m43131a(this.f56132x, false, (InterfaceC21083i) obj4, (C15197y1) obj5, (InterfaceC17869a1) obj3, 0.0f, 0.0f, c28655q3, 12582912, 96);
                } else {
                    c28655q3.m87138X();
                }
                return c23454a1;
            case 1:
                Composer composer2 = (Composer) obj;
                C15440w2 c15440w2 = (C15440w2) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q4 = (C28655q) composer2;
                    if (c28655q4.m87121F()) {
                        c28655q4.m87138X();
                    } else {
                        set = (Set) obj5;
                        identifierSpec = (IdentifierSpec) obj3;
                        i13 = 0;
                        for (Object obj6 : AbstractC3269g.m9517x(c15440w2.f58025b, (Set) obj5)) {
                            i14 = i13 + 1;
                            if (i13 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            AbstractC32073e.m99745g(this.f56132x, (InterfaceC15450y2) obj6, null, set, identifierSpec, composer2, 0, 4);
                            c28655q = (C28655q) composer2;
                            c28655q.m87150e0(1380646952);
                            if (i13 != AbstractC37056f.m118951C(c15440w2.f58025b)) {
                                AbstractC15751g.m44449b(null, AbstractC11673r.m31082k(c28655q).f37670c, AbstractC11673r.m31083l(c28655q).f37679c, 0.0f, c28655q, 0, 9);
                            }
                            c28655q.m87173q(false);
                            i13 = i14;
                        }
                    }
                } else {
                    set = (Set) obj5;
                    identifierSpec = (IdentifierSpec) obj3;
                    i13 = 0;
                    while (r1.hasNext()) {
                        i14 = i13 + 1;
                        if (i13 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        AbstractC32073e.m99745g(this.f56132x, (InterfaceC15450y2) obj6, null, set, identifierSpec, composer2, 0, 4);
                        c28655q = (C28655q) composer2;
                        c28655q.m87150e0(1380646952);
                        if (i13 != AbstractC37056f.m118951C(c15440w2.f58025b)) {
                            AbstractC15751g.m44449b(null, AbstractC11673r.m31082k(c28655q).f37670c, AbstractC11673r.m31083l(c28655q).f37679c, 0.0f, c28655q, 0, 9);
                        }
                        c28655q.m87173q(false);
                        i13 = i14;
                    }
                }
                return c23454a1;
            case 2:
                Composer composer3 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q5 = (C28655q) composer3;
                    if (c28655q5.m87121F()) {
                        c28655q5.m87138X();
                        return c23454a1;
                    }
                }
                C2306l c2306l = C2299e.f9108K;
                C22971k c22971kM66746i = AbstractC22977m.m66746i(8);
                Modifier modifierM3394p = AbstractC1099a.m3394p(16, c2314t);
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj4;
                String str = (String) obj5;
                String str2 = (String) obj3;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, composer3, 54);
                int iM87266t3 = AbstractC28683x.m87266t(composer3);
                C28655q c28655q6 = (C28655q) composer3;
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q6.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(composer3, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q6.m87158i0();
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(c0213j2);
                } else {
                    c28655q6.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(composer3, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(composer3, c0209i3, interfaceC28653p1M87165m);
                C0209i c0209i4 = C0217k.f732j;
                if (!c28655q6.f115903S) {
                    c23454a0 = c23454a1;
                    if (!AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iM87266t3))) {
                    }
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(composer3, c0209i5, modifierM118962N);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer3, 0);
                    iM87266t = AbstractC28683x.m87266t(composer3);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q6.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer3, layoutWeightElement);
                    c28655q6.m87158i0();
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(c0213j2);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer3, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(composer3, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iM87266t))) {
                        AbstractC11266d.m30471y(iM87266t, c28655q6, iM87266t, c0209i4);
                    }
                    AbstractC28683x.m87239G(composer3, c0209i5, modifierM118962N2);
                    AbstractC15011f9.m43114b(str, null, C15069l3.m43147a(composer3).m43090e(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, composer3, 0, 3120, 120826);
                    AbstractC15011f9.m43114b(str2, null, AbstractC11673r.m31082k(composer3).f37672e, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, composer3, 0, 3120, 120826);
                    c28655q6.m87173q(true);
                    AbstractC15011f9.m43114b(AbstractC30060g.m92103Y(composer3, R.string.stripe_change), AbstractC1092a.m3361f(c2314t, z4, null, interfaceC4339a, 6), C15069l3.m43147a(composer3).m43091f(), 0L, null, C28780r.f116540G, null, 0L, null, null, 0L, 0, false, 0, 0, null, C15069l3.m43149c(composer3).f56280g, composer3, ProfileVerifier.CompilationStatus.f6515xf2722a21, 0, 65496);
                    c28655q6.m87173q(true);
                    return c23454a0;
                }
                c23454a0 = c23454a1;
                AbstractC11266d.m30471y(iM87266t3, c28655q6, iM87266t3, c0209i4);
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(composer3, c0209i6, modifierM118962N);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer3, 0);
                iM87266t = AbstractC28683x.m87266t(composer3);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q6.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(composer3, layoutWeightElement2);
                c28655q6.m87158i0();
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(c0213j2);
                } else {
                    c28655q6.m87178s0();
                }
                AbstractC28683x.m87239G(composer3, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(composer3, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q6.f115903S) {
                    AbstractC11266d.m30471y(iM87266t, c28655q6, iM87266t, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iM87266t, c28655q6, iM87266t, c0209i4);
                }
                AbstractC28683x.m87239G(composer3, c0209i6, modifierM118962N3);
                AbstractC15011f9.m43114b(str, null, C15069l3.m43147a(composer3).m43090e(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, composer3, 0, 3120, 120826);
                AbstractC15011f9.m43114b(str2, null, AbstractC11673r.m31082k(composer3).f37672e, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, composer3, 0, 3120, 120826);
                c28655q6.m87173q(true);
                AbstractC15011f9.m43114b(AbstractC30060g.m92103Y(composer3, R.string.stripe_change), AbstractC1092a.m3361f(c2314t, z4, null, interfaceC4339a, 6), C15069l3.m43147a(composer3).m43091f(), 0L, null, C28780r.f116540G, null, 0L, null, null, 0L, 0, false, 0, 0, null, C15069l3.m43149c(composer3).f56280g, composer3, ProfileVerifier.CompilationStatus.f6515xf2722a21, 0, 65496);
                c28655q6.m87173q(true);
                return c23454a0;
            default:
                Composer composer4 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q7 = (C28655q) composer4;
                    if (c28655q7.m87121F()) {
                        c28655q7.m87138X();
                    } else {
                        Modifier modifierM3358c = AbstractC1092a.m3358c(c2314t, AbstractC11673r.m31082k(composer4).f37676i.m43093h(), AbstractC17918w0.f69621a);
                        C11669n c11669n = C11671p.f37680a;
                        Modifier modifierM3393o = AbstractC1099a.m3393o(AbstractC11673r.m31081j(), modifierM3358c);
                        function1 = (Function1) obj4;
                        String str3 = (String) obj5;
                        C36736z c36736z = (C36736z) obj3;
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer4, 0);
                        iM87266t2 = AbstractC28683x.m87266t(composer4);
                        c28655q2 = (C28655q) composer4;
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(composer4, modifierM3393o);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer4, C0217k.f729g, c23010xM66775a3);
                        AbstractC28683x.m87239G(composer4, C0217k.f728f, interfaceC28653p1M87165m4);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iM87266t2))) {
                            AbstractC11266d.m30471y(iM87266t2, c28655q2, iM87266t2, c0209i);
                        }
                        AbstractC28683x.m87239G(composer4, C0217k.f726d, modifierM118962N4);
                        c28655q2.m87150e0(161248413);
                        zM87153g = c28655q2.m87153g(function1);
                        objM87133R = c28655q2.m87133R();
                        C28676v0 c28676v0 = C28635l.f115821a;
                        if (zM87153g || objM87133R == c28676v0) {
                            objM87133R = new C36681f(function1, 1);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c28655q2.m87173q(false);
                        AbstractC32072d.m99697f(z4, (InterfaceC4339a) objM87133R, composer4, 0);
                        AbstractC32072d.m99696e(composer4, 0);
                        c28655q2.m87150e0(161258209);
                        zM87153g2 = c28655q2.m87153g(function1);
                        objM87133R2 = c28655q2.m87133R();
                        if (zM87153g2 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C35657b0(function1, 16);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        c28655q2.m87173q(false);
                        AbstractC32072d.m99693b(str3, true, c36736z, (Function1) objM87133R2, composer4, 48);
                        boolean z13 = c36736z.f157242c;
                        c28655q2.m87150e0(161263584);
                        zM87153g3 = c28655q2.m87153g(function1);
                        objM87133R3 = c28655q2.m87133R();
                        if (zM87153g3 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C36681f(function1, 2);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        c28655q2.m87173q(false);
                        AbstractC32072d.m99692a(z13, (InterfaceC4339a) objM87133R3, composer4, 0);
                        c28655q2.m87173q(true);
                    }
                } else {
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(c2314t, AbstractC11673r.m31082k(composer4).f37676i.m43093h(), AbstractC17918w0.f69621a);
                    C11669n c11669n2 = C11671p.f37680a;
                    Modifier modifierM3393o2 = AbstractC1099a.m3393o(AbstractC11673r.m31081j(), modifierM3358c2);
                    function1 = (Function1) obj4;
                    String str4 = (String) obj5;
                    C36736z c36736z2 = (C36736z) obj3;
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer4, 0);
                    iM87266t2 = AbstractC28683x.m87266t(composer4);
                    c28655q2 = (C28655q) composer4;
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(composer4, modifierM3393o2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer4, C0217k.f729g, c23010xM66775a4);
                    AbstractC28683x.m87239G(composer4, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iM87266t2, c28655q2, iM87266t2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iM87266t2, c28655q2, iM87266t2, c0209i);
                    }
                    AbstractC28683x.m87239G(composer4, C0217k.f726d, modifierM118962N5);
                    c28655q2.m87150e0(161248413);
                    zM87153g = c28655q2.m87153g(function1);
                    objM87133R = c28655q2.m87133R();
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (zM87153g) {
                        objM87133R = new C36681f(function1, 1);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C36681f(function1, 1);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c28655q2.m87173q(false);
                    AbstractC32072d.m99697f(z4, (InterfaceC4339a) objM87133R, composer4, 0);
                    AbstractC32072d.m99696e(composer4, 0);
                    c28655q2.m87150e0(161258209);
                    zM87153g2 = c28655q2.m87153g(function1);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R2 = new C35657b0(function1, 16);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C35657b0(function1, 16);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    c28655q2.m87173q(false);
                    AbstractC32072d.m99693b(str4, true, c36736z2, (Function1) objM87133R2, composer4, 48);
                    boolean z14 = c36736z2.f157242c;
                    c28655q2.m87150e0(161263584);
                    zM87153g3 = c28655q2.m87153g(function1);
                    objM87133R3 = c28655q2.m87133R();
                    if (zM87153g3) {
                        objM87133R3 = new C36681f(function1, 2);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C36681f(function1, 2);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c28655q2.m87173q(false);
                    AbstractC32072d.m99692a(z14, (InterfaceC4339a) objM87133R3, composer4, 0);
                    c28655q2.m87173q(true);
                }
                return c23454a1;
        }
    }

    public /* synthetic */ C15006f4(boolean z4, Object obj, Object obj2, Object obj3, int i13) {
        this.f56131w = i13;
        this.f56132x = z4;
        this.f56133y = obj;
        this.f56134z = obj2;
        this.f56130E = obj3;
    }
}

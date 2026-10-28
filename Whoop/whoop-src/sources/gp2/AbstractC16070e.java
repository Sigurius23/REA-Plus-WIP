package gp2;

import a80.C0545i;
import a80.C0546j;
import a80.C0547k;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import cy1.C11186b;
import d30.C11558r;
import ep2.C13431c;
import ep2.InterfaceC13429a;
import fd3.C14408a;
import go1.C16016a;
import gz0.EnumC16313m0;
import hp2.AbstractC17557d;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import java.util.Iterator;
import java.util.WeakHashMap;
import l83.C23454a0;
import mn2.EnumC25719b;
import ny0.AbstractC27249e;
import ny0.C27256h;
import p000.AbstractC11266d;
import p000.C22931l;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22976l1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p555vl.AbstractC36095b;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.C33168c;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: gp2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"", "source", "Lep2/c$d;", "viewState", "Lkotlin/Function1;", "Lep2/a;", "Ll83/a0;", "onEvent", "j", "(Ljava/lang/String;Lep2/c$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lm91/u;", "item", "", "r", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16070e {
    /* JADX WARN: Code duplicated, block: B:100:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:103:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:105:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:106:0x0384  */
    /* JADX WARN: Code duplicated, block: B:108:0x0392  */
    /* JADX WARN: Code duplicated, block: B:109:0x0394  */
    /* JADX WARN: Code duplicated, block: B:115:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:119:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x0239  */
    /* JADX WARN: Code duplicated, block: B:78:0x023d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0258  */
    /* JADX WARN: Code duplicated, block: B:89:0x027b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0285  */
    /* JADX WARN: Code duplicated, block: B:93:0x0296  */
    /* JADX WARN: Code duplicated, block: B:94:0x0298  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j */
    public static final void m45390j(String source, C13431c.d viewState, Function1 onEvent, Composer composer, int i13) {
        C28676v0 c28676v0;
        C28676v0 c28676v1;
        int i14;
        boolean z4;
        int iHashCode;
        C28676v0 c28676v2;
        int i15;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        C28676v0 c28676v3;
        C27256h c27256h;
        boolean z14;
        boolean zM87157i2;
        Object objM87133R2;
        Function1 function1;
        int i16;
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1104408908);
        int i17 = 2;
        int i18 = (i13 & 6) == 0 ? (c28655q.m87153g(source) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i18 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i18 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i18 & 1, (i18 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM114675c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC6721d.a aVar = new AbstractC6721d.a(viewState.getTitle(), null, (EnumC25719b.INSTANCE.m75836a(source).isInAppJoinFlow() || viewState.getCloseInteraction() != null) ? new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), null, i17, 0 == true ? 1 : 0) : null, null, null, null, false, null, null, null, null, null, null, null, null, 32762, null);
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
            int i19 = i18 & 896;
            boolean zM87157i3 = ((i18 & 14) == 4) | c28655q.m87157i(viewState) | (i19 == 256);
            Object objM87133R3 = c28655q.m87133R();
            C28676v0 c28676v4 = C28635l.f115821a;
            if (zM87157i3 || objM87133R3 == c28676v4) {
                objM87133R3 = new C11558r(viewState, onEvent, source, 18);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3396r, true, 1.0f);
            C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, f14, 7);
            C2305k c2305k = C2299e.f9111N;
            boolean zM87157i4 = c28655q.m87157i(viewState) | (i19 == 256);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4) {
                c28676v0 = c28676v4;
            } else {
                c28676v0 = c28676v4;
                if (objM87133R4 == c28676v0) {
                }
                c28655q = c28655q;
                c28676v1 = c28676v0;
                i14 = 256;
                AbstractC22674j.m65717c(modifierM31988g, null, c22976l1M3381c, null, c2305k, null, false, null, (Function1) objM87133R4, c28655q, 196992, 474);
                if (viewState.m38166c().isEmpty()) {
                    z4 = true;
                    c28655q.m87150e0(1101898904);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1099803614);
                    WeakHashMap weakHashMap = C22944c2.f90553v;
                    float f15 = ((float) 2.5d) * f13;
                    Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), f15, 4 * f13, f15, AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a() + f14);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    c28655q.m87150e0(457540426);
                    for (InterfaceC25312u interfaceC25312u : viewState.m38166c()) {
                        if (interfaceC25312u instanceof C27256h) {
                            c28655q.m87150e0(385573270);
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                            c27256h = (C27256h) interfaceC25312u;
                            if (i19 == i14) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            zM87157i2 = c28655q.m87157i(interfaceC25312u) | z14;
                            objM87133R2 = c28655q.m87133R();
                            c28676v3 = c28676v1;
                            if (!zM87157i2 || objM87133R2 == c28676v3) {
                                function1 = onEvent;
                                i16 = 3;
                                objM87133R2 = new C0545i(function1, c27256h, i16);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                function1 = onEvent;
                                i16 = 3;
                            }
                            AbstractC27249e.m82121d(modifierM3409f, c27256h, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 4);
                            c28655q.m87173q(false);
                            i15 = i14;
                        } else {
                            c28676v2 = c28676v1;
                            if (interfaceC25312u instanceof C33168c) {
                                c28655q.m87150e0(385966443);
                                String strM21275i = AbstractC8693b.m21275i(((C33168c) interfaceC25312u).getText(), c28655q, 0);
                                C21053l c21053l = C21053l.f79834a;
                                C38072d c38072d = C38072d.f163053a;
                                int i24 = C38072d.f163054b;
                                C28655q c28655q2 = c28655q;
                                C21054m c21054mM58880a = c21053l.m58880a(C23285v0.m67364b(AbstractC33745d.m106661t(c38072d, c28655q, i24), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d.m121949b(c28655q, i24).getWhite70(), c38072d.m121949b(c28655q, i24).getBrandWhite(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, 0, C21053l.f79835b << 15, 32760);
                                c28655q = c28655q2;
                                AbstractC21048g.m58807M(strM21275i, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 1.5d) * f13, 7), true, c21054mM58880a, null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 432, 496);
                                c28655q.m87173q(false);
                                c28676v3 = c28676v2;
                                i15 = 256;
                            } else {
                                c28655q.m87150e0(386704150);
                                i15 = 256;
                                if (i19 == 256) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                zM87157i = c28655q.m87157i(interfaceC25312u) | z13;
                                objM87133R = c28655q.m87133R();
                                c28676v3 = c28676v2;
                                if (zM87157i || objM87133R == c28676v3) {
                                    objM87133R = new C0546j(onEvent, interfaceC25312u, 7);
                                    c28655q.m87172p0(objM87133R);
                                }
                                m45398r(interfaceC25312u, (Function1) objM87133R, c28655q, 0, 0);
                                c28655q.m87173q(false);
                            }
                            i14 = i15;
                            c28676v1 = c28676v3;
                        }
                        i14 = i15;
                        c28676v1 = c28676v3;
                    }
                    z4 = true;
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                }
                c28655q.m87173q(z4);
            }
            objM87133R4 = new C14408a(23, viewState, onEvent);
            c28655q.m87172p0(objM87133R4);
            c28655q = c28655q;
            c28676v1 = c28676v0;
            i14 = 256;
            AbstractC22674j.m65717c(modifierM31988g, null, c22976l1M3381c, null, c2305k, null, false, null, (Function1) objM87133R4, c28655q, 196992, 474);
            if (viewState.m38166c().isEmpty()) {
                c28655q.m87150e0(1099803614);
                WeakHashMap weakHashMap2 = C22944c2.f90553v;
                float f16 = ((float) 2.5d) * f13;
                Modifier modifierM3397s2 = AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, c2314t), f16, 4 * f13, f16, AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a() + f14);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3397s2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                c28655q.m87150e0(457540426);
                while (r0.hasNext()) {
                    if (interfaceC25312u instanceof C27256h) {
                        c28655q.m87150e0(385573270);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        c27256h = (C27256h) interfaceC25312u;
                        if (i19 == i14) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zM87157i2 = c28655q.m87157i(interfaceC25312u) | z14;
                        objM87133R2 = c28655q.m87133R();
                        c28676v3 = c28676v1;
                        if (zM87157i2) {
                            function1 = onEvent;
                            i16 = 3;
                            objM87133R2 = new C0545i(function1, c27256h, i16);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            function1 = onEvent;
                            i16 = 3;
                            objM87133R2 = new C0545i(function1, c27256h, i16);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27249e.m82121d(modifierM3409f2, c27256h, null, (InterfaceC4339a) objM87133R2, c28655q, 6, 4);
                        c28655q.m87173q(false);
                        i15 = i14;
                    } else {
                        c28676v2 = c28676v1;
                        if (interfaceC25312u instanceof C33168c) {
                            c28655q.m87150e0(385966443);
                            String strM21275i2 = AbstractC8693b.m21275i(((C33168c) interfaceC25312u).getText(), c28655q, 0);
                            C21053l c21053l2 = C21053l.f79834a;
                            C38072d c38072d2 = C38072d.f163053a;
                            int i25 = C38072d.f163054b;
                            C28655q c28655q3 = c28655q;
                            C21054m c21054mM58880a2 = c21053l2.m58880a(C23285v0.m67364b(AbstractC33745d.m106661t(c38072d2, c28655q, i25), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d2.m121949b(c28655q, i25).getWhite70(), c38072d2.m121949b(c28655q, i25).getBrandWhite(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q3, 0, C21053l.f79835b << 15, 32760);
                            c28655q = c28655q3;
                            AbstractC21048g.m58807M(strM21275i2, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 1.5d) * f13, 7), true, c21054mM58880a2, null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 432, 496);
                            c28655q.m87173q(false);
                            c28676v3 = c28676v2;
                            i15 = 256;
                        } else {
                            c28655q.m87150e0(386704150);
                            i15 = 256;
                            if (i19 == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            zM87157i = c28655q.m87157i(interfaceC25312u) | z13;
                            objM87133R = c28655q.m87133R();
                            c28676v3 = c28676v2;
                            if (zM87157i) {
                                objM87133R = new C0546j(onEvent, interfaceC25312u, 7);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C0546j(onEvent, interfaceC25312u, 7);
                                c28655q.m87172p0(objM87133R);
                            }
                            m45398r(interfaceC25312u, (Function1) objM87133R, c28655q, 0, 0);
                            c28655q.m87173q(false);
                        }
                        i14 = i15;
                        c28676v1 = c28676v3;
                    }
                    i14 = i15;
                    c28676v1 = c28676v3;
                }
                z4 = true;
                AbstractC25012a.m73392y(c28655q, false, true, false);
            } else {
                z4 = true;
                c28655q.m87150e0(1101898904);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
        } else {
            onEvent = onEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(i13, 26, source, viewState, onEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m45391k(C13431c.d dVar, Function1 function1, String str) {
        if (dVar.getCloseInteraction() != null) {
            function1.invoke(new InterfaceC13429a.i(dVar.getCloseInteraction()));
        } else if (EnumC25719b.INSTANCE.m75836a(str).isInAppJoinFlow()) {
            function1.invoke(new InterfaceC13429a.h(dVar.m38166c()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m45392l(C13431c.d dVar, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        Iterator<T> it = dVar.m38165b().iterator();
        while (it.hasNext()) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C22931l(25, (C13431c.a) it.next(), function1), true, 1507968472), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m45393m(C13431c.a aVar, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        C2314t c2314t;
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f13 = 4;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(1073010745);
            for (InterfaceC25312u interfaceC25312u : aVar.m38159b()) {
                if (interfaceC25312u instanceof C33168c) {
                    c28655q.m87150e0(1390846397);
                    String strM21275i = AbstractC8693b.m21275i(((C33168c) interfaceC25312u).getText(), c28655q, 0);
                    C21053l c21053l = C21053l.f79834a;
                    C38072d c38072d = C38072d.f163053a;
                    int i14 = C38072d.f163054b;
                    C28655q c28655q2 = c28655q;
                    c2314t = c2314t2;
                    c28655q = c28655q2;
                    AbstractC21048g.m58807M(strM21275i, null, true, c21053l.m58880a(C23285v0.m67364b(AbstractC33745d.m106661t(c38072d, c28655q, i14), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d.m121949b(c28655q, i14).getWhite70(), c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, 0, C21053l.f79835b << 15, 32760), null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 384, 498);
                    c28655q.m87173q(false);
                } else {
                    c2314t = c2314t2;
                    c28655q.m87150e0(1391596411);
                    boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(interfaceC25312u);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == C28635l.f115821a) {
                        objM87133R = new C0546j(function1, interfaceC25312u, 8);
                        c28655q.m87172p0(objM87133R);
                    }
                    m45398r(interfaceC25312u, (Function1) objM87133R, c28655q, 0, 0);
                    c28655q.m87173q(false);
                }
                c2314t2 = c2314t;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(aVar.getInsetBottom().getSpacing(), c2314t2));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m45394n(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC13429a.k(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m45395o(Function1 function1, InterfaceC25312u interfaceC25312u) {
        function1.invoke(new InterfaceC13429a.k(interfaceC25312u, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m45396p(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC13429a.k(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m45397q(String str, C13431c.d dVar, Function1 function1, int i13, Composer composer, int i14) {
        m45390j(str, dVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m45398r(InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-560102985);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(item) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C16016a(1);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            int i17 = i15;
            AbstractC25303l.m74291r(item, AbstractC17557d.m49961b(), null, function3, c28655q, (i17 & 14) | (C25307p.f99300b << 3) | ((i17 << 6) & 7168), 4);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0547k(item, function2, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m45399s(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m45400t(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m45398r(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

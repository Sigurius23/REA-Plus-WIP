package js1;

import a11.C0132j;
import a11.C0134l;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bp0.C3526n;
import bz0.C3711a;
import c41.C4048j0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gy0.AbstractC16276e;
import h01.C16544k;
import hs1.AbstractC17604a;
import hs1.AbstractC17606c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21174w;
import ji0.C21714b;
import jp2.C21875f;
import ks1.AbstractC22821a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27246d;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: js1.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lhs1/c;", "viewState", "", "path", "", "isPreview", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "y", "(Landroidx/compose/ui/Modifier;Lhs1/c;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ljs1/h;", "state", "G", "(Ljs1/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "C", "(ZLandroidx/compose/runtime/Composer;II)V", "p", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "title", "", "rightIcon", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V", "Lny0/h;", "cardButton", "t", "(Lny0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "journal-home-tile-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21921l {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m62371A(AbstractC17606c abstractC17606c, Function1 function1, boolean z4, String str, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87138X();
        } else if (abstractC17606c instanceof AbstractC17606c.c) {
            c28655q.m87150e0(-615276326);
            AbstractC17606c.c cVar = (AbstractC17606c.c) abstractC17606c;
            if (cVar.getState() instanceof C21917h) {
                c28655q.m87150e0(-615212373);
                m62377G((C21917h) cVar.getState(), function1, c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-615049964);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
        } else if (abstractC17606c instanceof AbstractC17606c.b) {
            c28655q.m87150e0(-614981578);
            m62373C(z4, c28655q, 0, 0);
            c28655q.m87173q(false);
        } else {
            if (!(abstractC17606c instanceof AbstractC17606c.a)) {
                throw AbstractC11895b.m32003v(-574038890, c28655q, false);
            }
            c28655q.m87150e0(-614869668);
            m62396p(str, function1, c28655q, 0, 0);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m62372B(Modifier modifier, AbstractC17606c abstractC17606c, String str, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m62405y(modifier, abstractC17606c, str, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final void m62373C(boolean z4, Composer composer, final int i13, final int i14) {
        final boolean z13;
        int i15;
        boolean z14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1508024591);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            z13 = z4;
        } else if ((i13 & 6) == 0) {
            z13 = z4;
            i15 = i13 | (c28655q.m87155h(z13) ? 4 : 2);
        } else {
            z13 = z4;
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            boolean z15 = i16 != 0 ? false : z13;
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(43 * f13, c2314t)));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            m62403w(new TextResource.C8691e(AbstractC30060g.m92103Y(c28655q, AbstractC22821a.f89928d)), null, c28655q, TextResource.C8691e.f25898b | 48);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3409f, true, 1.0f);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM31988g);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (z15) {
                c28655q.m87150e0(1618343734);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC22821a.f89926b);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                z14 = true;
                AbstractC30795n.m94707h(strM92103Y, null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                z14 = true;
                c28655q.m87150e0(1618605994);
                Modifier modifierM3419p = AbstractC1102d.m3419p(12 * f13, c2314t);
                InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C21174w(8);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C21714b(11);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC35684p.m113047h(modifierM3419p, dVarM113128a, false, 0.0f, 0, interfaceC4339a, (Function1) objM87133R2, null, null, c28655q, 1769478, 412);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z14);
            c28655q.m87173q(z14);
            z13 = z15;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: js1.k
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC21921l.m62376F(z13, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m62374D() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m62375E(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m62376F(boolean z4, int i13, int i14, Composer composer, int i15) {
        m62373C(z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:51:0x0123  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: G */
    private static final void m62377G(C21917h c21917h, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87157i;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1804659459);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(c21917h) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C21714b(12);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                C2314t c2314t = C2314t.f9131w;
                float f13 = 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
                int i17 = i15 & 112;
                zM87157i = c28655q.m87157i(c21917h) | (i17 == 32);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C0134l(c21917h, function4, 27);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3394p, false, null, null, (InterfaceC4339a) objM87133R, 15);
                C23010x c23010xM73381n = AbstractC25012a.m73381n(3, f13, C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                m62403w(c21917h.getTitle(), c21917h.getRightIcon(), c28655q, TextResource.$stable);
                Function1 function5 = function4;
                AbstractC21916g.m62361d(c21917h.m62367b(), AbstractC1102d.m3409f(1.0f, c2314t), function5, c28655q, ((i15 << 3) & 896) | 48, 0);
                m62400t(c21917h.getCardButton(), function5, c28655q, C27256h.f109055z | i17);
                c28655q.m87173q(true);
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3711a(c21917h, i13, function3, i14, 3);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C21714b(12);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            float f14 = 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * f14, AbstractC1102d.m3409f(1.0f, c2314t2));
            int i18 = i15 & 112;
            zM87157i = c28655q.m87157i(c21917h) | (i18 == 32);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C0134l(c21917h, function4, 27);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C0134l(c21917h, function4, 27);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3394p2, false, null, null, (InterfaceC4339a) objM87133R, 15);
            C23010x c23010xM73381n2 = AbstractC25012a.m73381n(3, f14, C2299e.f9111N, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3362g2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            m62403w(c21917h.getTitle(), c21917h.getRightIcon(), c28655q, TextResource.$stable);
            Function1 function6 = function4;
            AbstractC21916g.m62361d(c21917h.m62367b(), AbstractC1102d.m3409f(1.0f, c2314t2), function6, c28655q, ((i15 << 3) & 896) | 48, 0);
            m62400t(c21917h.getCardButton(), function6, c28655q, C27256h.f109055z | i18);
            c28655q.m87173q(true);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3711a(c21917h, i13, function3, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m62378H(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m62379I(C21917h c21917h, Function1 function1) {
        C9598e c9598eM62368c = c21917h.getDestination();
        if (c9598eM62368c != null) {
            function1.invoke(c9598eM62368c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m62380J(C21917h c21917h, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m62377G(c21917h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:56:0x013a  */
    /* JADX WARN: Code duplicated, block: B:57:0x013e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x025d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0263  */
    /* JADX WARN: Code duplicated, block: B:72:0x0281  */
    /* JADX WARN: Code duplicated, block: B:76:0x0308  */
    /* JADX WARN: Code duplicated, block: B:79:0x0312  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    private static final void m62396p(String str, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        int iHashCode3;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-820988401);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(str) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C21875f(3);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i15 & 14) == 4);
                objM87133R = c28655q.m87133R();
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = new C4048j0(function4, str, 3);
                    c28655q.m87172p0(objM87133R);
                }
                C2314t c2314t = C2314t.f9131w;
                float f13 = 4;
                float f14 = 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f14, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(43 * f13, AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15))));
                C2305k c2305k = C2299e.f9111N;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                m62403w(new TextResource.C8691e(AbstractC30060g.m92103Y(c28655q, AbstractC22821a.f89928d)), null, c28655q, TextResource.C8691e.f25898b | 48);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                Function1 function5 = function4;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                float f15 = 6;
                float f16 = 1;
                float f17 = f16 * f13;
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(f15 * f13, c2314t), AbstractC33253j.m105489e(f17));
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getTinyIcons().getTinyInformation(), c28655q, 6), null, AbstractC1099a.m3394p(f15, AbstractC1092a.m3358c(modifierM118994r, C17919x.m51541c(0.2f, c38072d.m121949b(c28655q, i17).getAccentNegativeTrend()), AbstractC17918w0.f69621a)), c38072d.m121949b(c28655q, i17).getAccentNegativeTrend(), c28655q, 48, 0);
                AbstractC11266d.m30469w(f16, f14, c2314t, c28655q);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC22821a.f89925a);
                C2886a c2886aM8420a = c38072d.m121952e(c28655q, i17).getB1();
                long jM125385c1 = c38072d.m121949b(c28655q, i17).getWhite70();
                int i18 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM92103Y, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, i18, 196602);
                float f18 = 3 * f13;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f17), C2299e.f9108K, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC22821a.f89927c), null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getBtS(), null, c28655q, 0, i18, 196602);
                c28655q = c28655q;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getTinyIcons().getRefresh(), c28655q, 6), null, AbstractC1102d.m3419p(f18, c2314t), c38072d.m121949b(c28655q, i17).getBrandWhite(), c28655q, 432, 0);
                AbstractC25012a.m73392y(c28655q, true, true, true);
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21919j(str, function3, i13, i14, 0);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C21875f(3);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z13 | ((i15 & 14) == 4);
            objM87133R = c28655q.m87133R();
            if (z14) {
                objM87133R = new C4048j0(function4, str, 3);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C4048j0(function4, str, 3);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t2 = C2314t.f9131w;
            float f19 = 4;
            float f110 = 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * f110, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(43 * f19, AbstractC1092a.m3362g(c2314t2, false, null, null, (InterfaceC4339a) objM87133R, 15))));
            C2305k c2305k2 = C2299e.f9111N;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k2, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            m62403w(new TextResource.C8691e(AbstractC30060g.m92103Y(c28655q, AbstractC22821a.f89928d)), null, c28655q, TextResource.C8691e.f25898b | 48);
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t2);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k2, c28655q, 54);
            Function1 function6 = function4;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            float f111 = 6;
            float f112 = 1;
            float f113 = f112 * f19;
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(f111 * f19, c2314t2), AbstractC33253j.m105489e(f113));
            C38072d c38072d2 = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d2.m121951d().getTinyIcons().getTinyInformation(), c28655q, 6), null, AbstractC1099a.m3394p(f111, AbstractC1092a.m3358c(modifierM118994r2, C17919x.m51541c(0.2f, c38072d2.m121949b(c28655q, i19).getAccentNegativeTrend()), AbstractC17918w0.f69621a)), c38072d2.m121949b(c28655q, i19).getAccentNegativeTrend(), c28655q, 48, 0);
            AbstractC11266d.m30469w(f112, f110, c2314t2, c28655q);
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC22821a.f89925a);
            C2886a c2886aM8420a2 = c38072d2.m121952e(c28655q, i19).getB1();
            long jM125385c2 = c38072d2.m121949b(c28655q, i19).getWhite70();
            int i110 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM92103Y2, null, jM125385c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q, 0, i110, 196602);
            float f114 = 3 * f19;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f114, c2314t2));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f113), C2299e.f9108K, c28655q, 54);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q, AbstractC22821a.f89927c), null, c38072d2.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i19).getBtS(), null, c28655q, 0, i110, 196602);
            c28655q = c28655q;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d2.m121951d().getTinyIcons().getRefresh(), c28655q, 6), null, AbstractC1102d.m3419p(f114, c2314t2), c38072d2.m121949b(c28655q, i19).getBrandWhite(), c28655q, 432, 0);
            AbstractC25012a.m73392y(c28655q, true, true, true);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21919j(str, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m62397q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m62398r(Function1 function1, String str) {
        function1.invoke(new AbstractC17604a.a(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m62399s(String str, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m62396p(str, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m62400t(C27256h c27256h, Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2;
        C27256h c27256h2;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(2090170784);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(c27256h) : c28655q2.m87157i(c27256h) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (!c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            function2 = function1;
            c27256h2 = c27256h;
            c28655q = c28655q2;
            c28655q.m87138X();
        } else if (c27256h == null) {
            c28655q2.m87150e0(-157926979);
            c28655q2.m87173q(false);
            function2 = function1;
            c27256h2 = c27256h;
            c28655q = c28655q2;
        } else {
            c28655q2.m87150e0(-157926978);
            C27246d c27246d = new C27246d();
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C27256h c27256hM82144b = C27256h.m82144b(c27256h, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33546239, null);
            c27256h2 = c27256h;
            c28655q = c28655q2;
            boolean zM87157i = c28655q.m87157i(c27256h2) | ((i15 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                function2 = function1;
                objM87133R = new C3526n(function2, c27256h2, 15);
                c28655q.m87172p0(objM87133R);
            } else {
                function2 = function1;
            }
            c27246d.Compose(modifierM3409f, c27256hM82144b, (Function1) objM87133R, c28655q, (C27256h.f109055z << 3) | 6 | (C27246d.f109048a << 9));
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0132j(c27256h2, function2, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m62401u(Function1 function1, C27256h c27256h, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c27256h.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m62402v(C27256h c27256h, Function1 function1, int i13, Composer composer, int i14) {
        m62400t(c27256h, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final void m62403w(TextResource textResource, Integer num, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-527261394);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(num) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, (i14 & 14) | TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, layoutWeightElement, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            if (num == null) {
                c28655q.m87150e0(566615057);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(566615058);
                float f13 = 4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(num.intValue(), c28655q, 6), AbstractC8693b.m21275i("Navigation right", c28655q, 6), AbstractC1102d.m3419p(f13 * f13, c2314t), c38072d.m121949b(c28655q, i15).getWhite50(), c28655q, 384, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0132j(textResource, num, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m62404x(TextResource textResource, Integer num, int i13, Composer composer, int i14) {
        m62403w(textResource, num, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:78:0x010e  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: y */
    public static final void m62405y(Modifier modifier, AbstractC17606c viewState, String str, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        int i16;
        boolean z13;
        int i17;
        int i18;
        Function1 function2;
        int i19;
        boolean z14;
        C28655q c28655q;
        Modifier modifier3;
        boolean z15;
        Function1 function3;
        String str2;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        String str3;
        boolean z16;
        Function1 function4;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1479667262);
        int i24 = i14 & 1;
        if (i24 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(viewState) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                i15 |= c28655q2.m87153g(str) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    z13 = z4;
                    if (c28655q2.m87155h(z13)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        function2 = function1;
                        if (c28655q2.m87157i(function2)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 9363) != 9362) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z14)) {
                        if (i24 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i25 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i16 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == C28635l.f115821a) {
                                objM87133R = new C21714b(10);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function4 = (Function1) objM87133R;
                        } else {
                            function4 = function2;
                        }
                        c28655q = c28655q2;
                        AbstractC31926e.m99375j(modifier4, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-219591506, c28655q2, new C21918i(viewState, function4, z16, str3)), c28655q, (i15 & 14) | 12582912, 122);
                        function3 = function4;
                        z15 = z16;
                        str2 = str3;
                        modifier3 = modifier4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        z15 = z13;
                        function3 = function2;
                        str2 = str;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C16544k(modifier3, viewState, str2, function3, z15, i13, i14, 4);
                    }
                }
                i15 |= 24576;
                function2 = function1;
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i25 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C21714b(10);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(modifier4, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-219591506, c28655q2, new C21918i(viewState, function4, z16, str3)), c28655q, (i15 & 14) | 12582912, 122);
                    function3 = function4;
                    z15 = z16;
                    str2 = str3;
                    modifier3 = modifier4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                    function3 = function2;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C16544k(modifier3, viewState, str2, function3, z15, i13, i14, 4);
                }
            }
            i15 |= 3072;
            z13 = z4;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i25 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C21714b(10);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(modifier4, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-219591506, c28655q2, new C21918i(viewState, function4, z16, str3)), c28655q, (i15 & 14) | 12582912, 122);
                    function3 = function4;
                    z15 = z16;
                    str2 = str3;
                    modifier3 = modifier4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                    function3 = function2;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C16544k(modifier3, viewState, str2, function3, z15, i13, i14, 4);
                }
            }
            i15 |= 24576;
            function2 = function1;
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i25 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C21714b(10);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                c28655q = c28655q2;
                AbstractC31926e.m99375j(modifier4, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-219591506, c28655q2, new C21918i(viewState, function4, z16, str3)), c28655q, (i15 & 14) | 12582912, 122);
                function3 = function4;
                z15 = z16;
                str2 = str3;
                modifier3 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                function3 = function2;
                str2 = str;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16544k(modifier3, viewState, str2, function3, z15, i13, i14, 4);
            }
        }
        i15 |= 384;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                if (c28655q2.m87155h(z13)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i25 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C21714b(10);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(modifier4, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-219591506, c28655q2, new C21918i(viewState, function4, z16, str3)), c28655q, (i15 & 14) | 12582912, 122);
                    function3 = function4;
                    z15 = z16;
                    str2 = str3;
                    modifier3 = modifier4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                    function3 = function2;
                    str2 = str;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C16544k(modifier3, viewState, str2, function3, z15, i13, i14, 4);
                }
            }
            i15 |= 24576;
            function2 = function1;
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i25 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C21714b(10);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                c28655q = c28655q2;
                AbstractC31926e.m99375j(modifier4, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-219591506, c28655q2, new C21918i(viewState, function4, z16, str3)), c28655q, (i15 & 14) | 12582912, 122);
                function3 = function4;
                z15 = z16;
                str2 = str3;
                modifier3 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                function3 = function2;
                str2 = str;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16544k(modifier3, viewState, str2, function3, z15, i13, i14, 4);
            }
        }
        i15 |= 3072;
        z13 = z4;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i25 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C21714b(10);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                c28655q = c28655q2;
                AbstractC31926e.m99375j(modifier4, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-219591506, c28655q2, new C21918i(viewState, function4, z16, str3)), c28655q, (i15 & 14) | 12582912, 122);
                function3 = function4;
                z15 = z16;
                str2 = str3;
                modifier3 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                function3 = function2;
                str2 = str;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16544k(modifier3, viewState, str2, function3, z15, i13, i14, 4);
            }
        }
        i15 |= 24576;
        function2 = function1;
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            if (i24 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i25 != 0) {
                str3 = "";
            } else {
                str3 = str;
            }
            if (i16 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if (i18 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C21714b(10);
                    c28655q2.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            c28655q = c28655q2;
            AbstractC31926e.m99375j(modifier4, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-219591506, c28655q2, new C21918i(viewState, function4, z16, str3)), c28655q, (i15 & 14) | 12582912, 122);
            function3 = function4;
            z15 = z16;
            str2 = str3;
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
            function3 = function2;
            str2 = str;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16544k(modifier3, viewState, str2, function3, z15, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m62406z(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}

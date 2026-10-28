package ej1;

import a71.C0520a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ar2.C1930a;
import b61.AbstractC2756k;
import b91.C2886a;
import c93.InterfaceC4339a;
import cj1.C4745a;
import cj1.C4748d;
import cj1.EnumC4747c;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d11.AbstractC11471f;
import d11.C11474i;
import d11.InterfaceC11466a;
import e11.C12582b;
import e81.C12824e;
import e93.AbstractC12889b;
import g61.C15529b;
import g61.EnumC15530c;
import g61.EnumC15531d;
import hy0.AbstractC17799w1;
import hy0.AbstractC17808z1;
import hy0.C17731c2;
import i71.C18200d;
import i71.InterfaceC18203g;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j61.C21372f;
import j71.AbstractC21394b;
import j71.C21395c;
import java.util.List;
import k61.C22228a;
import k61.C22230c;
import kd1.C22411w;
import kd1.EnumC22400l;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C0003a0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p208i2.C17903p;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p701ce2.C4494b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import u61.C34552a;
import u61.C34554c;
import u61.C34555d;
import u61.C34556e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ej1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001aH\u0000¢\u0006\u0004\b\u001f\u0010\u001d¨\u0006 "}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcj1/a;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lcj1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "heading", "title", "Lhy0/c2;", "trend", "", "hasGraph", "f", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;ZLandroidx/compose/runtime/Composer;I)V", "Lcj1/d;", "tileState", "k", "(Landroidx/compose/ui/Modifier;Lcj1/d;Landroidx/compose/runtime/Composer;I)V", "Lg61/b;", "n", "()Lg61/b;", "", "Lj61/f;", "p", "()Ljava/util/List;", "Lj71/b$g;", "o", "health_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13234d {

    /* JADX INFO: renamed from: ej1.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f45849w = new a();

        /* JADX INFO: renamed from: a */
        public final long m37175a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getBlack20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m37175a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ej1.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f45850w = new b();

        /* JADX INFO: renamed from: a */
        public final long m37176a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getSleepRemSleep();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m37176a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f */
    private static final void m37164f(TextResource textResource, TextResource textResource2, C17731c2 c17731c2, boolean z4, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        int i15;
        C28655q c28655q2;
        boolean z13;
        boolean z14;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-782506178);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q3.m87153g(textResource) : c28655q3.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q3.m87153g(textResource2) : c28655q3.m87157i(textResource2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q3.m87153g(c17731c2) : c28655q3.m87157i(c17731c2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q3.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q3.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Modifier modifierM3396r = C2314t.f9131w;
            if (z4) {
                modifierM3396r = AbstractC1099a.m3396r(modifierM3396r, 0.0f, 1 * 8, 1);
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            if (z4) {
                c28655q3.m87150e0(-1885551782);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q3, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            } else {
                c28655q3.m87150e0(1677473422);
            }
            c28655q3.m87173q(false);
            if (AbstractC8693b.m21270d(textResource)) {
                c28655q3.m87150e0(1677514497);
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q3, TextResource.$stable | (i14 & 14));
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                i15 = i14;
                z13 = false;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q3, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i16).getH5(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                c28655q2 = c28655q3;
                c28655q2.m87173q(false);
            } else {
                i15 = i14;
                c28655q2 = c28655q3;
                z13 = false;
                c28655q2.m87150e0(1677711502);
                c28655q2.m87173q(false);
            }
            String strM21274h2 = AbstractC8693b.m21274h(textResource2, c28655q2, TextResource.$stable | ((i15 >> 3) & 14));
            C38072d c38072d2 = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C28655q c28655q4 = c28655q2;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i17).getT3(), null, c28655q4, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q4;
            if (c17731c2 == null) {
                c28655q.m87150e0(1677902492);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(1677902493);
                AbstractC17808z1.m51175c(c17731c2, c28655q, C17731c2.f68917p);
                c28655q.m87173q(z13);
            }
            if (z4) {
                c28655q.m87150e0(-1885534470);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                z14 = true;
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            } else {
                z14 = true;
                c28655q.m87150e0(1678010094);
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(z14);
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(textResource, textResource2, c17731c2, z4, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m37165g(TextResource textResource, TextResource textResource2, C17731c2 c17731c2, boolean z4, int i13, Composer composer, int i14) {
        m37164f(textResource, textResource2, c17731c2, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /* JADX INFO: renamed from: h */
    public static final void m37166h(Modifier modifier, C4745a itemState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        Modifier modifier3;
        C28655q c28655q;
        Function1 function3;
        boolean z4;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        ?? r10;
        int i16;
        C28655q c28655q2;
        Modifier modifier4;
        boolean z13;
        C28655q c28655q3;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-1033300083);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q4.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q4.m87153g(itemState) : c28655q4.m87157i(itemState) ? 32 : 16;
        }
        if (c28655q4.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            if ((i14 & 4) != 0) {
                Object objM87133R = c28655q4.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C12824e(28);
                    c28655q4.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
            int iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, c2314t);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a2);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N);
            if (AbstractC8693b.m21270d(itemState.getTitle())) {
                c28655q4.m87150e0(197620091);
                Modifier modifierMo3471e = AbstractC1099a.m3388j(c2314t, EnumC22935a1.f90538x).mo3471e(modifier2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
                int iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a2);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N2);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q4, 0);
                int iHashCode3 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM3409f);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a2);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N3);
                TextResource textResourceM14922b = itemState.getHeading();
                TextResource textResourceM14925f = itemState.getTitle();
                C17731c2 c17731c2M14926g = itemState.getTrend();
                boolean z14 = itemState.getGraph() != null;
                int i18 = TextResource.$stable;
                m37164f(textResourceM14922b, textResourceM14925f, c17731c2M14926g, z14, c28655q4, i18 | (i18 << 3) | (C17731c2.f68917p << 6));
                C21395c c21395cM14921a = itemState.getGraph();
                if (c21395cM14921a == null) {
                    c28655q4.m87150e0(45864673);
                    c28655q4.m87173q(false);
                    z4 = false;
                    interfaceC4339a = interfaceC4339a2;
                    c0209i = c0209i2;
                    z13 = true;
                    c28655q3 = c28655q4;
                } else {
                    c28655q4.m87150e0(45864674);
                    Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3409f(1.0f, c2314t));
                    if (!(((double) 1.0f) > 0.0d)) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    c0209i = c0209i2;
                    interfaceC4339a = interfaceC4339a2;
                    z4 = false;
                    z13 = true;
                    AbstractC2756k.m7799p(AbstractC11895b.m31988g(modifierM3406c, true, 1.0f), c21395cM14921a, null, null, false, null, null, c28655q4, C21395c.f81985e << 3, 124);
                    C28655q c28655q5 = c28655q4;
                    c28655q5.m87173q(false);
                    c28655q3 = c28655q5;
                }
                c28655q3.m87173q(z13);
                c28655q3.m87173q(z13);
                if (itemState.getPrefixCta() == null && itemState.getSuffixCta() == null) {
                    c28655q3.m87150e0(198425099);
                    c28655q3.m87173q(z4);
                    i16 = 8;
                } else {
                    c28655q3.m87150e0(1530420006);
                    i16 = 8;
                    AbstractC25012a.m73388u(2, 8, c2314t, c28655q3, z4);
                }
                c28655q3.m87173q(z4);
                r10 = z13;
                c28655q2 = c28655q3;
            } else {
                function3 = function3;
                c0209i5 = c0209i5;
                modifier2 = modifier2;
                z4 = false;
                interfaceC4339a = interfaceC4339a2;
                c0209i = c0209i2;
                r10 = 1;
                i16 = 8;
                c28655q4.m87150e0(198435019);
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            }
            Modifier modifierM3388j = AbstractC1099a.m3388j(c2314t, EnumC22935a1.f90538x);
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) r10, i16, C2299e.f9108K, c28655q2, 54);
            int iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3388j);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
            C4748d c4748dM14923c = itemState.getPrefixCta();
            if (c4748dM14923c == null) {
                c28655q2.m87150e0(-906397256);
                c28655q2.m87173q(z4);
                modifier4 = modifier2;
            } else {
                c28655q2.m87150e0(-906397255);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                modifier4 = modifier2;
                m37169k(modifier4.mo3471e(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, r10)), c4748dM14923c, c28655q2, C11474i.f36854E << 3);
                c28655q2.m87173q(z4);
            }
            C4748d c4748dM14924e = itemState.getSuffixCta();
            if (c4748dM14924e == null) {
                c28655q2.m87150e0(-906278216);
                c28655q2.m87173q(z4);
            } else {
                c28655q2.m87150e0(-906278215);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                m37169k(modifier4.mo3471e(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, r10)), c4748dM14924e, c28655q2, C11474i.f36854E << 3);
                c28655q2.m87173q(z4);
            }
            c28655q2.m87173q(r10);
            c28655q2.m87173q(r10);
            function2 = function3;
            modifier3 = modifier4;
            c28655q = c28655q2;
        } else {
            c28655q4.m87138X();
            function2 = function1;
            modifier3 = modifier2;
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 6, (Object) modifier3, (Object) itemState, (InterfaceC23459e) function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m37167i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m37168j(Modifier modifier, C4745a c4745a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m37166h(modifier, c4745a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m37169k(Modifier modifier, C4748d c4748d, Composer composer, int i13) {
        int i14;
        Modifier modifier2;
        C13825t c13825t;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(619438773);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c4748d) : c28655q.m87157i(c4748d) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C11474i c11474iM14936a = c4748d.getCta();
            InterfaceC11466a borderInfo = c11474iM14936a != null ? c11474iM14936a.getBorderInfo() : null;
            if (borderInfo == null) {
                c28655q.m87150e0(-1773829778);
                c28655q.m87173q(false);
                c13825t = null;
            } else {
                c28655q.m87150e0(-1719788301);
                C13825t c13825tM30800y = AbstractC11471f.m30800y(borderInfo, (float) 1.5d, c28655q, 48);
                c28655q.m87173q(false);
                c13825t = c13825tM30800y;
            }
            EnumC4747c enumC4747cM14937b = c4748d.getIconState();
            AbstractC18247a backgroundColor = enumC4747cM14937b != null ? enumC4747cM14937b.getBackgroundColor() : null;
            if (backgroundColor == null) {
                c28655q.m87150e0(-1719785200);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = a.f45849w;
                    c28655q.m87172p0(objM87133R);
                }
                backgroundColor = AbstractC18249c.m52574l((Function1) objM87133R);
            } else {
                c28655q.m87150e0(-1719786440);
            }
            c28655q.m87173q(false);
            modifier2 = modifier;
            AbstractC12889b.m36263b(modifier2, C22411w.f87680a.m64536b().m64090c(), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getTransparent(), c13825t, 0, AbstractC37817c.m121344e(573751346, c28655q, new C0003a0(26, backgroundColor, c4748d)), c28655q, (i14 & 14) | 1769472, 8);
        } else {
            modifier2 = modifier;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(modifier2, c4748d, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m37170l(AbstractC18247a abstractC18247a, C4748d c4748d, Composer composer, int i13) {
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * f13, AbstractC18249c.m52565c(c2314t, abstractC18247a));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
            Modifier modifierMo3400a = C1100b.f4583a.mo3400a(c2314t, C2299e.f9117z);
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(2, f13, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3400a);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N2);
            EnumC4747c enumC4747cM14937b = c4748d.getIconState();
            if (enumC4747cM14937b == null) {
                c28655q.m87150e0(1747917887);
                c28655q.m87173q(false);
                c0209i5 = c0209i5;
                c0209i = c0209i7;
                c0209i2 = c0209i6;
                c0209i3 = c0209i4;
            } else {
                c28655q.m87150e0(1747917888);
                if (enumC4747cM14937b.getIconImage() != null) {
                    c28655q.m87150e0(341725367);
                    if (enumC4747cM14937b.getType() == EnumC22400l.ECG_NEW_RECORDING) {
                        c28655q.m87150e0(341810927);
                        Modifier modifierM3419p = AbstractC1102d.m3419p(5 * 4, c2314t);
                        c0209i3 = c0209i4;
                        AbstractC29125c.m88522c(AbstractC29125c.m88500I(C38072d.f163053a.m121951d().getAction().getAdd(), c28655q, 0), null, modifierM3419p, null, null, 0.0f, new C17903p(enumC4747cM14937b.getIconColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 5), c28655q, 432, 56);
                        c28655q.m87173q(false);
                        c0209i = c0209i7;
                        c0209i2 = c0209i6;
                    } else {
                        c0209i = c0209i7;
                        c0209i2 = c0209i6;
                        c0209i3 = c0209i4;
                        c28655q.m87150e0(342187887);
                        AbstractC17799w1.m51149e(enumC4747cM14937b.getIconImage().toWhoopIcon(), enumC4747cM14937b.getIconColor().mo134584toComposableColorWaAFU9c(c28655q, 0), enumC4747cM14937b.getIconBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                } else {
                    c0209i5 = c0209i5;
                    c0209i = c0209i7;
                    c0209i2 = c0209i6;
                    c0209i3 = c0209i4;
                    c28655q.m87150e0(342544139);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N3);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            C11474i c11474iM14936a = c4748d.getCta();
            if (c11474iM14936a == null) {
                c28655q.m87150e0(-646755342);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-646755341);
                String strM21274h = AbstractC8693b.m21274h(c11474iM14936a.getTitle(), c28655q, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i14 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m37171m(Modifier modifier, C4748d c4748d, int i13, Composer composer, int i14) {
        m37169k(modifier, c4748d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final C15529b m37172n() {
        EnumC15531d enumC15531d = EnumC15531d.TIME_MARKER;
        EnumC15530c enumC15530c = EnumC15530c.SOLID;
        return new C15529b(0.0f, C25271y.f99162w, 0.0f, enumC15531d, AbstractC8693b.m21278l("12:01 PM"), false, enumC15530c, null, 161, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static final List<AbstractC21394b.g> m37173o() {
        C22230c c22230c = new C22230c(0.0f, 0, 0, AbstractC18249c.m52574l(b.f45850w), 0L, false, 55, null);
        float f13 = 0.0f;
        float f14 = 0.19866838f;
        TextResource textResource = null;
        C34554c c34554c = null;
        C34555d c34555d = null;
        C0520a c0520a = null;
        C34556e c34556e = new C34556e(f13, f14, textResource, c34554c, c34555d, c0520a, 60, null);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        C34556e c34556e2 = new C34556e(0.25f, 0.19866838f, objArr, objArr2, objArr3, null, 60, null);
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        C34556e c34556e3 = new C34556e(0.5f, 0.19866838f, objArr4, objArr5, objArr6, null, 60, null);
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        C34556e c34556e4 = new C34556e(0.75f, 0.19866838f, objArr7, objArr8, objArr9, null, 60, null);
        float f15 = 1.0f;
        float f16 = 0.19866838f;
        C0520a c0520a2 = null;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        C22228a c22228a = null;
        C18200d c18200d = null;
        String str = "id";
        boolean z4 = false;
        InterfaceC18203g interfaceC18203g = null;
        boolean z13 = false;
        Object[] objArr13 = 0 == true ? 1 : 0;
        return AbstractC37056f.m118958J(new AbstractC21394b.g(AbstractC37056f.m118958J(new C34552a(AbstractC37056f.m118959K(c34556e, c34556e2, c34556e3, c34556e4, new C34556e(f15, f16, objArr10, objArr11, objArr12, c0520a2, 60, null)), c22228a, c22230c, c18200d, 10, null)), str, z4, interfaceC18203g, 0 == true ? 1 : 0, z13, 60, objArr13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final List<C21372f> m37174p() {
        C21372f c21372f = new C21372f(0.0f, null, null, null, null, null, null, 126, null);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        C21372f c21372f2 = new C21372f(0.25f, objArr, objArr2, objArr3, objArr4, objArr5, null, 126, null);
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        C21372f c21372f3 = new C21372f(0.5f, objArr6, objArr7, objArr8, objArr9, objArr10, null, 126, null);
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        InterfaceC39332e interfaceC39332e = null;
        return AbstractC37056f.m118959K(c21372f, c21372f2, c21372f3, new C21372f(0.75f, objArr11, objArr12, objArr13, objArr14, objArr15, null, 126, null), new C21372f(1.0f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, interfaceC39332e, 126, null));
    }
}

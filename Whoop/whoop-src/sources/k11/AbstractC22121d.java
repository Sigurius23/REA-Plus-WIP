package k11;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import c11.C3837d;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import dp0.C12253i;
import f01.EnumC13892q1;
import fy1.C14873i;
import gy0.AbstractC16272a;
import hy0.AbstractC17746g1;
import hy0.C17737e0;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j21.C21245d;
import java.util.ArrayList;
import jp2.C21875f;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.C25235a0;
import ny0.C27246d;
import ny0.C27256h;
import ny0.EnumC27243c;
import ny0.EnumC27272p;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p736sz0.AbstractC33220t0;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: k11.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lk11/f;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lk11/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "l", "(Lk11/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lny0/h;", "buttonState", NotificationCompat.CATEGORY_EVENT, "s", "(Lny0/h;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "o", "(Landroidx/compose/runtime/Composer;I)V", "q", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22121d {

    /* JADX INFO: renamed from: k11.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22123f f85820w;

        public a(C22123f c22123f) {
            this.f85820w = c22123f;
        }

        /* JADX INFO: renamed from: a */
        public final void m63343a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(331453566);
            AbstractC22121d.m63331h(null, this.f85820w, null, c28655q, 0, 5);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m63343a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k11.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22123f f85821w;

        public b(C22123f c22123f) {
            this.f85821w = c22123f;
        }

        /* JADX INFO: renamed from: a */
        public final void m63344a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-2104005328);
            AbstractC22121d.m63331h(null, this.f85821w, null, c28655q, 0, 5);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m63344a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:68:0x012b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0150  */
    /* JADX WARN: Code duplicated, block: B:73:0x015a  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m63331h(Modifier modifier, C22123f state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifierM3406c;
        Function1 function4;
        Modifier modifierM3406c2;
        Modifier modifierM3395q;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1808695899);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                modifierM3406c = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = modifierM3406c;
                }
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C21875f(17);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                AbstractC33220t0.m105391c(state.getViewedAnalyticEvent(), function4, c28655q, (i15 >> 3) & 112);
                if (state.getFillHeight()) {
                    modifierM3406c2 = AbstractC1102d.m3406c(1.0f, modifierM3406c);
                } else {
                    modifierM3406c2 = modifierM3406c;
                }
                Modifier modifierMo3471e = modifier2.mo3471e(modifierM3406c2);
                if (state.getFillHeight() && state.getAutoPad()) {
                    modifierM3395q = AbstractC1099a.m3395q(modifierM3406c, state.getHorizontalPadding(), 1 * 8);
                } else {
                    modifierM3395q = modifierM3406c;
                }
                Modifier modifierMo3471e2 = modifierMo3471e.mo3471e(modifierM3395q);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                long jM125368V0 = C38072d.f163053a.m121949b(c28655q, 6).getTransparent();
                if (state.getFillHeight()) {
                    modifierM3406c = AbstractC1102d.m3406c(1.0f, modifierM3406c);
                }
                AbstractC31926e.m99375j(modifierM3406c, null, jM125368V0, null, null, null, 0.0f, AbstractC37817c.m121344e(1321305953, c28655q, new C21245d(3, state, function4)), c28655q, 12582912, 122);
                c28655q.m87173q(true);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22120c(modifier2, state, function3, i13, i14);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            modifierM3406c = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = modifierM3406c;
            }
            if (i17 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C21875f(17);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            AbstractC33220t0.m105391c(state.getViewedAnalyticEvent(), function4, c28655q, (i15 >> 3) & 112);
            if (state.getFillHeight()) {
                modifierM3406c2 = AbstractC1102d.m3406c(1.0f, modifierM3406c);
            } else {
                modifierM3406c2 = modifierM3406c;
            }
            Modifier modifierMo3471e3 = modifier2.mo3471e(modifierM3406c2);
            if (state.getFillHeight()) {
                modifierM3395q = modifierM3406c;
            } else {
                modifierM3395q = modifierM3406c;
            }
            Modifier modifierMo3471e4 = modifierMo3471e3.mo3471e(modifierM3395q);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            long jM125368V1 = C38072d.f163053a.m121949b(c28655q, 6).getTransparent();
            if (state.getFillHeight()) {
                modifierM3406c = AbstractC1102d.m3406c(1.0f, modifierM3406c);
            }
            AbstractC31926e.m99375j(modifierM3406c, null, jM125368V1, null, null, null, 0.0f, AbstractC37817c.m121344e(1321305953, c28655q, new C21245d(3, state, function4)), c28655q, 12582912, 122);
            c28655q.m87173q(true);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22120c(modifier2, state, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m63332i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m63333j(C22123f c22123f, Function1 function1, Composer composer, int i13) {
        C0209i c0209i;
        C0209i c0209i2;
        C0213j c0213j;
        C0209i c0209i3;
        int i14;
        C2314t c2314t;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c22123f.getStyle().getStyleModifier());
            boolean fillHeight = c22123f.getFillHeight();
            C2314t c2314t2 = C2314t.f9131w;
            float f13 = 8;
            float f14 = 4;
            Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3409f.mo3471e(fillHeight ? AbstractC1102d.m3406c(1.0f, c2314t2) : c2314t2), 3 * f13, f14 * f13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
            AbstractC22403o image = c22123f.getImage();
            if (image == null) {
                c28655q.m87150e0(834943122);
                c28655q.m87173q(false);
                c0209i = c0209i6;
                c0209i3 = c0209i7;
                c0213j = c0213j2;
                c0209i2 = c0209i4;
                i14 = 3;
            } else {
                c28655q.m87150e0(834943123);
                c0209i = c0209i6;
                c0209i2 = c0209i4;
                c0213j = c0213j2;
                c0209i3 = c0209i7;
                i14 = 3;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q, 0, 3), null, AbstractC1099a.m3398t(AbstractC1102d.m3419p(20 * f14, c2314t2), 0.0f, 0.0f, 0.0f, 2 * f13, 7), null, null, 0.0f, null, c28655q, 432, 120);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            C17750h1 tag = c22123f.getTag();
            if (tag == null) {
                c28655q.m87150e0(835307899);
                c28655q.m87173q(false);
                c2314t = c2314t2;
            } else {
                c28655q.m87150e0(835307900);
                AbstractC17746g1.m50872h(tag, null, null, c28655q, 384, 2);
                c2314t = c2314t2;
                AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, ((float) 0.25d) * f13, 7));
                c28655q.m87173q(false);
            }
            String title = c22123f.getTitle();
            C38072d c38072d = C38072d.f163053a;
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(title, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(i14), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getT4(), null, c28655q2, 0, 0, 196090);
            float f15 = 1 * f13;
            C2314t c2314t3 = c2314t;
            AbstractC30795n.m94707h(c22123f.getBody(), AbstractC1099a.m3398t(c2314t, 0.0f, f15, 0.0f, f15, 5), c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB1(), null, c28655q2, 48, 0, 196088);
            if (c22123f.getButtonConfiguration() == EnumC22118a.HORIZONTAL) {
                c28655q2.m87150e0(836146822);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t3);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), C2299e.f9107J, c28655q2, 6);
                int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i3, modifierM118962N2);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                m63335l(c22123f, function1, new LayoutWeightElement(1.0f, true), c28655q2, 0, 0);
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(836592633);
                m63335l(c22123f, function1, null, c28655q2, 0, 4);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m63334k(Modifier modifier, C22123f c22123f, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m63331h(modifier, c22123f, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    private static final void m63335l(C22123f c22123f, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        C22123f c22123f2;
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(339387412);
        if ((i13 & 6) == 0) {
            c22123f2 = c22123f;
            i15 = (c28655q.m87157i(c22123f2) ? 4 : 2) | i13;
        } else {
            c22123f2 = c22123f;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                for (C27256h c27256h : AbstractC25260n.m74077r0(new C27256h[]{c22123f2.getPrimaryButtonState(), c22123f2.getSecondaryButtonState()})) {
                    C27246d c27246d = new C27246d();
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3405b(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 14 * 4, 1), 0.0f, 1 * 8, 0.0f, 0.0f, 13);
                    boolean zM87157i = c28655q.m87157i(c27256h);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i | z13;
                    objM87133R = c28655q.m87133R();
                    if (z14 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C3837d(function1, c27256h);
                        c28655q.m87172p0(objM87133R);
                    }
                    c27246d.Compose(modifierM3398t, c27256h, (Function1) objM87133R, c28655q, 0);
                }
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22120c(c22123f, function1, modifier3, i13, i14);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            while (r15.hasNext()) {
                C27246d c27246d2 = new C27246d();
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3405b(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 14 * 4, 1), 0.0f, 1 * 8, 0.0f, 0.0f, 13);
                boolean zM87157i2 = c28655q.m87157i(c27256h);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i2 | z13;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    objM87133R = new C3837d(function1, c27256h);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3837d(function1, c27256h);
                    c28655q.m87172p0(objM87133R);
                }
                c27246d2.Compose(modifierM3398t2, c27256h, (Function1) objM87133R, c28655q, 0);
            }
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22120c(c22123f, function1, modifier3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m63336m(C27256h c27256h, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        m63342s(c27256h, function1, event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m63337n(C22123f c22123f, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m63335l(c22123f, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static final void m63338o(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1138943888);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC22403o.a aVar = new AbstractC22403o.a(AbstractC16272a.f62152s);
            EnumC27243c enumC27243c = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            C27256h c27256h = new C27256h(AbstractC8693b.m21278l("Purchase Test"), null, objArr, objArr2, objArr3, null, EnumC27272p.HIGHLIGHT, new C9598e(null, null, null, 7, null), null, null, null, null, null, false, true, null, false, false, null, null, null, enumC27243c, null, null, null, 33529662, null);
            C17750h1 c17750h1 = new C17750h1(AbstractC8693b.m21278l("BETA"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Upload a lab test report");
            C9598e c9598e = new C9598e(0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 7, 0 == true ? 1 : 0);
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            Object[] objArr8 = 0 == true ? 1 : 0;
            Object[] objArr9 = 0 == true ? 1 : 0;
            Object[] objArr10 = 0 == true ? 1 : 0;
            Object[] objArr11 = 0 == true ? 1 : 0;
            EnumC13892q1 enumC13892q1 = null;
            boolean z4 = false;
            boolean z13 = false;
            float f13 = 0.0f;
            String str = "get_first_test_empty_tile";
            String str2 = "Get your first test";
            String str3 = "Advanced Labs offer 60+ biomarkers to help you understand what's happening inside your body and optimize your health.";
            Object[] objArr12 = 0 == true ? 1 : 0;
            Object[] objArr13 = 0 == true ? 1 : 0;
            C22123f c22123f = new C22123f(str, str2, str3, aVar, c17750h1, c27256h, new C27256h(textResourceM21278l, null, objArr4, objArr6, objArr11, null, EnumC27272p.TRANSPARENT_BACKGROUND, c9598e, objArr7, null, null, null, null, false, true, null, false, false, objArr8, enumC27243c, objArr9, null, objArr10, null, objArr5, 33529662, null), enumC13892q1, objArr13, z4, z13, objArr12, f13, 8064, null);
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a(c22123f)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17737e0(i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m63339p(int i13, Composer composer, int i14) {
        m63338o(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m63340q(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1208794406);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22123f c22123f = new C22123f("report_coming_soon", "Report Coming Soon", "Complete your test to get access to clinician reviewed insights.", new AbstractC22403o.a(AbstractC16272a.f62152s), null, null, null, null, null, false, false, null, 0.0f, 8064, null);
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new b(c22123f)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17737e0(i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m63341r(int i13, Composer composer, int i14) {
        m63340q(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m63342s(C27256h c27256h, Function1 function1, Object obj) {
        if (obj instanceof DesignItemInteraction) {
            function1.invoke(obj);
            return;
        }
        if (c27256h.getAction() != null) {
            function1.invoke(new AbstractC22122e.a(c27256h.getAction(), c27256h.getId()));
        } else if (c27256h.getActionArgument() != null) {
            function1.invoke(c27256h.getActionArgument());
        } else {
            function1.invoke(new AbstractC22122e.b(c27256h.getDestination(), c27256h.getId()));
        }
    }
}

package oq1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dp0.AbstractC12248d;
import dp0.AbstractC12250f;
import ep0.C13404j;
import hq1.C17567f;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.EnumC22414z;
import kq1.AbstractC22773a;
import l83.C23454a0;
import lq1.C24661a;
import lq1.C24662b;
import lq1.C24663c;
import lq1.C24664d;
import lq1.C24665e;
import m31.C25002h;
import mi2.C25592o;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26970r0;
import no0.C26984y0;
import nq0.C27050m;
import nq2.C27060c;
import o72.C27640a;
import o72.C27644e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p134f2.C14015d;
import p134f2.C14018g;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
import p291l0.InterfaceC22996s0;
import p329n0.InterfaceC26064q;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p718lz1.C24823a;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: oq1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llq1/c;", "state", "Lkotlin/Function1;", "Lkq1/a;", "Ll83/a0;", "onNavigationEvent", "o", "(Landroidx/compose/ui/Modifier;Llq1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Llq1/b;", "Lhq1/f;", "metadata", "A", "(Landroidx/compose/ui/Modifier;Llq1/b;Lhq1/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Llq1/e;", "D", "(Landroidx/compose/ui/Modifier;Llq1/e;Landroidx/compose/runtime/Composer;II)V", "Llq1/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Landroidx/compose/ui/Modifier;Llq1/a;Landroidx/compose/runtime/Composer;II)V", "behavior-impact_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28120d {
    /* JADX INFO: renamed from: A */
    private static final void m85025A(Modifier modifier, C24662b c24662b, C17567f c17567f, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1416648683);
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
            i15 |= c28655q.m87157i(c24662b) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(c17567f) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            Modifier modifierM66724m = AbstractC22953f.m66724m(c2314t);
            AbstractC6721d.a aVarM72041d = c24662b.getToolbarState();
            boolean z13 = ((i15 & 896) == 256) | ((i15 & 7168) == 2048);
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C25592o(28, function1, c17567f);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM66724m, aVarM72041d, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
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
            float f13 = 8;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(4 * f13, c2314t));
            String strM21274h = AbstractC8693b.m21274h(c24662b.getImpactName(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, c2314t, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getT2(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            C24665e c24665eM72040c = c24662b.getSubHeaderState();
            if (c24665eM72040c == null) {
                c28655q.m87150e0(-1312873458);
                c28655q.m87173q(false);
                z4 = true;
            } else {
                c28655q.m87150e0(-1312873457);
                z4 = true;
                AbstractC18489d0.m53380u(1, f13, c2314t, c28655q);
                m85028D(null, c24665eM72040c, c28655q, 0, 1);
                c28655q.m87173q(false);
            }
            AbstractC31061c.m95650z(2, f13, c2314t, c28655q, z4);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a(modifier3, c24662b, c17567f, function1, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m85026B(Function1 function1, C17567f c17567f) {
        function1.invoke(new AbstractC22773a.a(c17567f));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m85027C(Modifier modifier, C24662b c24662b, C17567f c17567f, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m85025A(modifier, c24662b, c17567f, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final void m85028D(Modifier modifier, C24665e c24665e, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1639857567);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(c24665e) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            float f13 = 1 * 8;
            int i17 = (i15 & 14) | 1576368;
            Modifier modifier3 = modifier;
            AbstractC22960g2.m66729a(modifier3, AbstractC22977m.m66746i(f13), AbstractC22977m.m66746i(f13), C2299e.f9108K, 0, 0, AbstractC37817c.m121344e(-235375142, c28655q, new C24823a(c24665e, 9)), c28655q, i17, 48);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(modifier2, c24665e, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m85029E(C24665e c24665e, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            c28655q.m87150e0(1437755956);
            Iterator<T> it = c24665e.m72049b().iterator();
            while (it.hasNext()) {
                AbstractC17746g1.m50872h((C17750h1) it.next(), null, null, c28655q, C17750h1.f69012w, 6);
            }
            c28655q.m87173q(false);
            TextResource textResourceM72048a = c24665e.getCreatedText();
            if (textResourceM72048a == null) {
                c28655q.m87150e0(1620867387);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1620867388);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * 8), C2299e.f9108K, c28655q, 54);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
                if (c24665e.m72049b().isEmpty()) {
                    c28655q.m87150e0(1404413744);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1404175416);
                    String symbol = EnumC22414z.BULLET.getSymbol();
                    C38072d c38072d = C38072d.f163053a;
                    int i14 = C38072d.f163054b;
                    AbstractC30795n.m94707h(symbol, null, c38072d.m121949b(c28655q, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                String strM21274h = AbstractC8693b.m21274h(textResourceM72048a, c28655q, TextResource.$stable);
                C38072d c38072d2 = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM21274h, null, c38072d2.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i15).getB2(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m85030F(Modifier modifier, C24665e c24665e, int i13, int i14, Composer composer, int i15) {
        m85028D(modifier, c24665e, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m85045o(Modifier modifier, C24663c state, Function1 onNavigationEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2138054867);
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
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1092a.m3358c(modifier3, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
            C13404j c13404jM72045d = state.getScreenContextMetadata();
            int i18 = C13404j.f46947x;
            Modifier modifierM34129b = AbstractC12250f.m34129b(modifierM66722k, c13404jM72045d, false, c28655q, i18 << 3, 2);
            InterfaceC22973k1 interfaceC22973k1M34113f = AbstractC12248d.m34113f(state.getScreenContextMetadata(), null, false, c28655q, i18, 6);
            boolean zM87157i = c28655q.m87157i(state) | ((i17 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C27050m(state, onNavigationEvent, 9);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22674j.m65717c(modifierM34129b, null, interfaceC22973k1M34113f, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 506);
            c28655q = c28655q;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(modifier2, state, onNavigationEvent, i13, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m85046p(C24663c c24663c, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C28119c(0, c24663c, function1), true, -8215230), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m85047q(C24663c c24663c, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(c24663c.getHeaderState().getImageSource(), null, null, c28655q, AbstractC22403o.f87638a, 3);
            float f13 = 4;
            Modifier modifierM107879c = AbstractC34132o.m107879c(0.7f, AbstractC1102d.m3413j(AbstractC1102d.m3407d(1.0f, c2314t), 76 * f13, 0.0f, 2));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C27644e(22);
                c28655q.m87172p0(objM87133R);
            }
            C28676v0 c28676v1 = c28676v0;
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC1125a.m3479b(modifierM107879c, (Function1) objM87133R), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            float f14 = 8;
            float f15 = 2 * f14;
            m85025A(AbstractC1099a.m3396r(c2314t, f15, 0.0f, 2), c24663c.getHeaderState(), c24663c.getMetadata(), function1, c28655q, 6, 0);
            C28655q c28655q2 = c28655q;
            c28655q2.m87150e0(1748908974);
            for (C24664d c24664d : c24663c.m72046e()) {
                c28655q2.m87150e0(1748910781);
                for (InterfaceC25312u interfaceC25312u : c24664d.m72047a()) {
                    C25307p c25307pM85024c = AbstractC28118b.m85024c();
                    C26970r0 c26970r0 = new C26970r0(9);
                    Object objM87133R2 = c28655q2.m87133R();
                    C28676v0 c28676v2 = c28676v1;
                    if (objM87133R2 == c28676v2) {
                        objM87133R2 = new C27644e(23);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    C28655q c28655q3 = c28655q2;
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM85024c, c26970r0, (Function1) objM87133R2, c28655q3, (C25307p.f99300b << 3) | 3072, 0);
                    c28655q2 = c28655q3;
                    AbstractC18489d0.m53380u(f13, f14, c2314t, c28655q2);
                    c28676v1 = c28676v2;
                }
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(false);
            C24661a c24661aM72042a = c24663c.getFooterState();
            if (c24661aM72042a == null) {
                c28655q2.m87150e0(-1617842063);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1617842062);
                m85053w(AbstractC1099a.m3396r(c2314t, f15, 0.0f, 2), c24661aM72042a, c28655q2, 6, 0);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C14018g m85048r(C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        return drawWithCache.m39910a(new C27060c(C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(16777215)), new C17919x(AbstractC17918w0.m51517e(4279244056L))), 0.0f, 0.0f, 14), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m85049s(AbstractC17911t abstractC17911t, InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        ((C0238p0) onDrawWithContent).m728a();
        InterfaceC22131e.m63385u(onDrawWithContent, abstractC17911t, 0L, 0L, 0.0f, null, 0, 126);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Modifier m85050t(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(670607792);
        Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m85051u(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m85052v(Modifier modifier, C24663c c24663c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m85045o(modifier, c24663c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final void m85053w(Modifier modifier, C24661a c24661a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C24661a c24661a2;
        Modifier modifier3;
        Modifier modifier4;
        int i16;
        C2314t c2314t;
        boolean z4;
        int i17;
        C2314t c2314t2;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(195215248);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            c24661a2 = c24661a;
            i15 |= c28655q.m87157i(c24661a2) ? 32 : 16;
        } else {
            c24661a2 = c24661a;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifier5 = i18 != 0 ? c2314t3 : modifier2;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier5);
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
            Modifier modifier6 = modifier5;
            String strM72037c = c24661a2.getTitle();
            if (strM72037c == null) {
                c28655q.m87150e0(1481477387);
                c28655q.m87173q(false);
                modifier4 = modifier6;
                c2314t = c2314t3;
                i16 = 8;
                z4 = false;
            } else {
                c28655q.m87150e0(1481477388);
                C38072d c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                modifier4 = modifier6;
                AbstractC30795n.m94707h(strM72037c, null, c38072d.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getT3(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                i16 = 8;
                c2314t = c2314t3;
                z4 = false;
                AbstractC31061c.m95650z(1, 8, c2314t, c28655q, false);
            }
            String strM72035a = c24661a.getDescription();
            if (strM72035a == null) {
                c28655q.m87150e0(1481755426);
                c28655q.m87173q(z4);
                i17 = i16;
                c2314t2 = c2314t;
                z13 = z4;
            } else {
                c28655q.m87150e0(1481755427);
                C38072d c38072d2 = C38072d.f163053a;
                int i24 = C38072d.f163054b;
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM72035a, null, c38072d2.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i24).getB2(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q2;
                i17 = 8;
                c2314t2 = c2314t;
                z13 = false;
                AbstractC31061c.m95650z(3, 8, c2314t2, c28655q, false);
            }
            c28655q.m87150e0(1017638883);
            for (InterfaceC25312u interfaceC25312u : c24661a.m72036b()) {
                C26970r0 c26970r0 = new C26970r0(10);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C27644e(21);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(interfaceC25312u, null, c26970r0, (Function1) objM87133R, c28655q, 3072, 2);
                AbstractC18489d0.m53380u(2, i17, c2314t2, c28655q);
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(modifier3, c24661a, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Modifier m85054x(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1974936072);
        c28655q.m87173q(false);
        return C2314t.f9131w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m85055y(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m85056z(Modifier modifier, C24661a c24661a, int i13, int i14, Composer composer, int i15) {
        m85053w(modifier, c24661a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

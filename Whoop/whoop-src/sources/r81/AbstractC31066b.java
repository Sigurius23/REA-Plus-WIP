package r81;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bm2.C3428b1;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d81.C11774b;
import hy0.AbstractC17755i2;
import hy0.EnumC17744g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import java.util.Iterator;
import l83.C23454a0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p730qt2.C30599e;
import pf.AbstractC29125c;
import qk2.C30453i;
import qz0.AbstractC30795n;
import r61.C30985h;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: r81.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lr81/c;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onClick", "l", "(Lr81/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "title", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "Lr81/e;", "perks", "j", "(Lr81/e;Landroidx/compose/runtime/Composer;I)V", "Lr81/d;", "whoopProCta", "o", "(Lr81/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31066b {
    /* JADX INFO: renamed from: h */
    public static final void m95690h(TextResource title, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(title, "title");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1306634401);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(title) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C22949e c22949e = AbstractC22977m.f90650a;
            float f13 = 4;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66748k(6 * f13, C2299e.f9107J), C2299e.f9111N, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * 8), C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
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
            float f14 = f13 * f13;
            Modifier modifierM3424u = AbstractC1102d.m3424u(39 * f13, AbstractC1099a.m3396r(c2314t, 0.0f, f14, 1));
            C38072d c38072d = C38072d.f163053a;
            AbstractC29125c.m88524d(AbstractC34132o.m107874S(c38072d.m121951d().getLogo().getWhoopText(), c28655q, 6), null, modifierM3424u, null, c28655q, 432, 120);
            AbstractC29125c.m88524d(AbstractC34132o.m107874S(c38072d.m121951d().getLogo().getPro(), c28655q, 6), null, AbstractC1102d.m3424u(13 * f13, AbstractC1099a.m3396r(c2314t, 0.0f, f14, 1)), null, c28655q, 432, 120);
            c28655q.m87173q(true);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(title, c28655q, i14 & 14), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q, 6).getH3(), C23285v0.m67364b(c38072d.m121952e(c28655q, 6).getH3().getStyle(), c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null), null, c28655q, 0, 0, 196606);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3428b1(title, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m95691i(TextResource textResource, int i13, Composer composer, int i14) {
        m95690h(textResource, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final void m95692j(C31069e c31069e, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1603427636);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c31069e) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 4;
            Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 1 * f13, 1);
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(3 * f13, C2299e.f9111N), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c31069e.getIcon(), c28655q, 6);
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43108b(c27430eM107874S, null, null, c38072d.m121949b(c28655q, 6).getBrandWhoopPro(), c28655q, 48, 4);
            i15 = 1;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c31069e.getDescription(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            i15 = 1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11774b(c31069e, i13, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m95693k(C31069e c31069e, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m95692j(c31069e, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:48:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x016d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0171  */
    /* JADX WARN: Code duplicated, block: B:56:0x018e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b1 A[LOOP:0: B:60:0x01ab->B:62:0x01b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x020d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0217  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX INFO: renamed from: l */
    public static final void m95694l(C31067c state, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Function1 function4;
        C2314t c2314t;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        InterfaceC25312u interfaceC25312uM95701a;
        C0209i c0209i5;
        C0209i c0209i6;
        C0209i c0209i7;
        C28655q c28655q2;
        ?? r15;
        C28655q c28655q3;
        C31068d c31068dM95704e;
        Function1 function5;
        C28655q c28655q4;
        C0209i c0209i8;
        int iHashCode2;
        Iterator<T> it;
        Object objM87133R;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(-545611013);
        int i16 = 2;
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q5.m87157i(state) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q5.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q5.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C30985h(i16);
                        c28655q5.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                float f13 = 4;
                c2314t = C2314t.f9131w;
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 8 * f13, 0.0f, 2);
                C22949e c22949e = AbstractC22977m.f90650a;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66748k(6 * f13, C2299e.f9107J), C2299e.f9111N, c28655q5, 54);
                iHashCode = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(interfaceC4339a);
                } else {
                    c28655q5.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N);
                m95690h(state.getTitle(), c28655q5, 0);
                interfaceC25312uM95701a = state.getCtaTile();
                if (interfaceC25312uM95701a == null) {
                    c28655q5.m87150e0(2138603154);
                    c28655q5.m87173q(false);
                    c0209i6 = c0209i4;
                    c0209i7 = c0209i3;
                    c28655q2 = c28655q5;
                    c0209i5 = c0209i2;
                } else {
                    c28655q5.m87150e0(2138603155);
                    c0209i5 = c0209i2;
                    C28655q c28655q6 = c28655q5;
                    c0209i6 = c0209i4;
                    c0209i7 = c0209i3;
                    AbstractC25303l.m74291r(interfaceC25312uM95701a, null, null, null, c28655q6, 0, 14);
                    c28655q6.m87173q(false);
                    c28655q2 = c28655q6;
                }
                if (state.m95702b().isEmpty()) {
                    C28655q c28655q7 = c28655q2;
                    r15 = 0;
                    c28655q7.m87150e0(2138908381);
                    c28655q7.m87173q(false);
                    c28655q3 = c28655q7;
                } else {
                    c28655q2.m87150e0(2138689273);
                    C0209i c0209i9 = c0209i5;
                    c28655q4 = c28655q2;
                    c0209i8 = c0209i7;
                    r15 = 0;
                    AbstractC17755i2.m50938j(null, EnumC17744g.DOTTED, null, null, null, 0L, 0L, null, c28655q4, 48, 253);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                    iHashCode2 = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, c2314t);
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q4, c0209i9, interfaceC28653p1M87165m2);
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i8);
                    }
                    AbstractC28683x.m87239G(c28655q4, c0209i6, modifierM118962N2);
                    c28655q4.m87150e0(-1821001644);
                    it = state.m95702b().iterator();
                    while (it.hasNext()) {
                        m95692j((C31069e) it.next(), c28655q4, 0);
                    }
                    AbstractC25012a.m73392y(c28655q4, false, true, false);
                    c28655q3 = c28655q4;
                }
                c31068dM95704e = state.getWhoopProCta();
                if (c31068dM95704e == null) {
                    c28655q3.m87150e0(2138940744);
                    c28655q3.m87173q(r15);
                    function5 = function4;
                } else {
                    c28655q3.m87150e0(2138940745);
                    AbstractC17755i2.m50938j(null, EnumC17744g.DOTTED, null, null, null, 0L, 0L, null, c28655q3, 48, 253);
                    function5 = function4;
                    m95697o(c31068dM95704e, function5, c28655q3, C9598e.f28134d | (i15 & 112), r15);
                    c28655q3.m87173q(r15);
                }
                c28655q3.m87173q(true);
                function3 = function5;
                c28655q = c28655q3;
            } else {
                c28655q5.m87138X();
                function3 = function2;
                c28655q = c28655q5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30453i(state, i13, function3, i14, 3);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q5.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                objM87133R = c28655q5.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C30985h(i16);
                    c28655q5.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            float f14 = 4;
            c2314t = C2314t.f9131w;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, 8 * f14, 0.0f, 2);
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66748k(6 * f14, C2299e.f9107J), C2299e.f9111N, c28655q5, 54);
            iHashCode = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q5.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q5, modifierM3396r2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a);
            } else {
                c28655q5.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a3);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m3);
            c0209i3 = C0217k.f732j;
            if (c28655q5.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N3);
            m95690h(state.getTitle(), c28655q5, 0);
            interfaceC25312uM95701a = state.getCtaTile();
            if (interfaceC25312uM95701a == null) {
                c28655q5.m87150e0(2138603154);
                c28655q5.m87173q(false);
                c0209i6 = c0209i4;
                c0209i7 = c0209i3;
                c28655q2 = c28655q5;
                c0209i5 = c0209i2;
            } else {
                c28655q5.m87150e0(2138603155);
                c0209i5 = c0209i2;
                C28655q c28655q8 = c28655q5;
                c0209i6 = c0209i4;
                c0209i7 = c0209i3;
                AbstractC25303l.m74291r(interfaceC25312uM95701a, null, null, null, c28655q8, 0, 14);
                c28655q8.m87173q(false);
                c28655q2 = c28655q8;
            }
            if (state.m95702b().isEmpty()) {
                c28655q2.m87150e0(2138689273);
                C0209i c0209i10 = c0209i5;
                c28655q4 = c28655q2;
                c0209i8 = c0209i7;
                r15 = 0;
                AbstractC17755i2.m50938j(null, EnumC17744g.DOTTED, null, null, null, 0L, 0L, null, c28655q4, 48, 253);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q4, 0);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, c2314t);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q4, c0209i10, interfaceC28653p1M87165m4);
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i8);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i8);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i6, modifierM118962N4);
                c28655q4.m87150e0(-1821001644);
                it = state.m95702b().iterator();
                while (it.hasNext()) {
                    m95692j((C31069e) it.next(), c28655q4, 0);
                }
                AbstractC25012a.m73392y(c28655q4, false, true, false);
                c28655q3 = c28655q4;
            } else {
                C28655q c28655q9 = c28655q2;
                r15 = 0;
                c28655q9.m87150e0(2138908381);
                c28655q9.m87173q(false);
                c28655q3 = c28655q9;
            }
            c31068dM95704e = state.getWhoopProCta();
            if (c31068dM95704e == null) {
                c28655q3.m87150e0(2138940744);
                c28655q3.m87173q(r15);
                function5 = function4;
            } else {
                c28655q3.m87150e0(2138940745);
                AbstractC17755i2.m50938j(null, EnumC17744g.DOTTED, null, null, null, 0L, 0L, null, c28655q3, 48, 253);
                function5 = function4;
                m95697o(c31068dM95704e, function5, c28655q3, C9598e.f28134d | (i15 & 112), r15);
                c28655q3.m87173q(r15);
            }
            c28655q3.m87173q(true);
            function3 = function5;
            c28655q = c28655q3;
        } else {
            c28655q5.m87138X();
            function3 = function2;
            c28655q = c28655q5;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(state, i13, function3, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m95695m(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m95696n(C31067c c31067c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m95694l(c31067c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0248  */
    /* JADX WARN: Code duplicated, block: B:58:0x024a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0250  */
    /* JADX WARN: Code duplicated, block: B:63:0x0254  */
    /* JADX WARN: Code duplicated, block: B:66:0x025d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0260  */
    /* JADX WARN: Code duplicated, block: B:71:0x026b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0273  */
    /* JADX WARN: Code duplicated, block: B:77:0x0291  */
    /* JADX WARN: Code duplicated, block: B:80:0x029b  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    private static final void m95697o(C31068d c31068d, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        Function1 function5;
        int i16;
        boolean z13;
        boolean z14;
        Object objM87133R;
        Function1 function6;
        Object objM87133R2;
        C31068d c31068d2 = c31068d;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1482648241);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c31068d2) : c28655q.m87157i(c31068d2) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
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
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C30985h(3);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C2305k c2305k = C2299e.f9111N;
                C22949e c22949e = AbstractC22977m.f90650a;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66748k(24, C2299e.f9107J), c2305k, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                String strM21274h = AbstractC8693b.m21274h(c31068d2.getCost(), c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                function5 = function4;
                i16 = i15;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN4(), null, c28655q, 0, 0, 196602);
                float f13 = 4;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c31068d.getCostUnits(), c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f13, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q, 6).getB2(), C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q, 6), c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null), null, c28655q, 48, 0, 196604);
                c28655q = c28655q;
                c28655q.m87173q(true);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(c2314t, 5 * f13, 0.0f, 2));
                EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                boolean z15 = false;
                String strM21274h2 = AbstractC8693b.m21274h(c31068d.getTitle(), c28655q, 0);
                long jM125432z = c38072d.m121949b(c28655q, 6).getBrandWhoopPro();
                if ((i16 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i16 & 14) != 4) {
                    if ((i16 & 8) != 0) {
                        c31068d2 = c31068d;
                        if (c28655q.m87157i(c31068d2)) {
                        }
                    } else {
                        c31068d2 = c31068d;
                    }
                    z14 = z13 | z15;
                    objM87133R = c28655q.m87133R();
                    if (!z14 || objM87133R == c28676v0) {
                        function6 = function5;
                        objM87133R = new C30599e(10, function6, c31068d2);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function6 = function5;
                    }
                    AbstractC27282u.m82292h(modifierM3409f2, enumC27284v, strM21274h2, false, jM125432z, null, false, (InterfaceC4339a) objM87133R, c28655q, 54, 104);
                    c28655q.m87173q(true);
                    function3 = function6;
                } else {
                    c31068d2 = c31068d;
                }
                z15 = true;
                z14 = z13 | z15;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    function6 = function5;
                    objM87133R = new C30599e(10, function6, c31068d2);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                    objM87133R = new C30599e(10, function6, c31068d2);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27282u.m82292h(modifierM3409f2, enumC27284v, strM21274h2, false, jM125432z, null, false, (InterfaceC4339a) objM87133R, c28655q, 54, 104);
                c28655q.m87173q(true);
                function3 = function6;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30453i(c31068d2, i13, function3, i14, 4);
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
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C30985h(3);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C2305k c2305k2 = C2299e.f9111N;
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66748k(24, C2299e.f9107J), c2305k2, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            String strM21274h3 = AbstractC8693b.m21274h(c31068d2.getCost(), c28655q, 0);
            C38072d c38072d2 = C38072d.f163053a;
            function5 = function4;
            i16 = i15;
            AbstractC30795n.m94707h(strM21274h3, null, c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getN4(), null, c28655q, 0, 0, 196602);
            float f14 = 4;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c31068d.getCostUnits(), c28655q, 0), AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, 1 * f14, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d2.m121952e(c28655q, 6).getB2(), C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d2, c28655q, 6), c38072d2.m121949b(c28655q, 6).getWhite70(), 0L, null, null, 0L, 0, 0L, null, null, 16777214), null, 2, null), null, c28655q, 48, 0, 196604);
            c28655q = c28655q;
            c28655q.m87173q(true);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(c2314t2, 5 * f14, 0.0f, 2));
            EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
            boolean z16 = false;
            String strM21274h4 = AbstractC8693b.m21274h(c31068d.getTitle(), c28655q, 0);
            long jM125432z2 = c38072d2.m121949b(c28655q, 6).getBrandWhoopPro();
            if ((i16 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i16 & 14) != 4) {
                if ((i16 & 8) != 0) {
                    c31068d2 = c31068d;
                    if (c28655q.m87157i(c31068d2)) {
                    }
                } else {
                    c31068d2 = c31068d;
                }
                z14 = z13 | z16;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    function6 = function5;
                    objM87133R = new C30599e(10, function6, c31068d2);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                    objM87133R = new C30599e(10, function6, c31068d2);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27282u.m82292h(modifierM3409f4, enumC27284v2, strM21274h4, false, jM125432z2, null, false, (InterfaceC4339a) objM87133R, c28655q, 54, 104);
                c28655q.m87173q(true);
                function3 = function6;
            } else {
                c31068d2 = c31068d;
            }
            z16 = true;
            z14 = z13 | z16;
            objM87133R = c28655q.m87133R();
            if (z14) {
                function6 = function5;
                objM87133R = new C30599e(10, function6, c31068d2);
                c28655q.m87172p0(objM87133R);
            } else {
                function6 = function5;
                objM87133R = new C30599e(10, function6, c31068d2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(modifierM3409f4, enumC27284v2, strM21274h4, false, jM125432z2, null, false, (InterfaceC4339a) objM87133R, c28655q, 54, 104);
            c28655q.m87173q(true);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(c31068d2, i13, function3, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m95698p(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m95699q(Function1 function1, C31068d c31068d) {
        function1.invoke(c31068d.getActionScreen());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m95700r(C31068d c31068d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m95697o(c31068d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

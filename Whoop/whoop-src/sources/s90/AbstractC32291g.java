package s90;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15676d;
import h80.InterfaceC17002b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l80.AbstractC23438o;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import os0.C28308d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.C17893k;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p238j0.C21084j;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p714k80.AbstractC22288q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q81.C30047e;
import q83.AbstractC30060g;
import qx0.C30745a;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import re1.C31324k;
import s01.C32049e;
import s32.C32112d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: s90.g */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\bH\u0003¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000e\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0018²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Ls90/h;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "q", "(Ls90/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ls90/b;", "o", "(Ls90/b;Landroidx/compose/runtime/Composer;I)V", "Ll0/s1;", "Ls90/c;", "onItemClicked", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ll0/s1;Ls90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "K", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "H", "", "numberOfCodesShared", "", "wasShared", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32291g {

    /* JADX INFO: renamed from: s90.g$a */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"s90/g$a", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f133639a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C32292h f133640b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC28593a1 f133641c;

        public a(Function1 function1, C32292h c32292h, InterfaceC28593a1 interfaceC28593a1) {
            this.f133639a = function1;
            this.f133640b = c32292h;
            this.f133641c = interfaceC28593a1;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f133639a.invoke(new InterfaceC17002b.h(this.f133640b.getAnalyticsName(), "codes", String.valueOf(AbstractC32291g.m100506r(this.f133641c)), "refer_a_friend"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Modifier m100477A(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return m100484H(applyIf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Modifier m100478B(Function1 function1, C32287c c32287c, InterfaceC28601c1 interfaceC28601c1, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1092a.m3360e(applyIf, new C21084j(), null, false, null, new C31324k(function1, c32287c, interfaceC28601c1, 2), 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m100479C(Function1 function1, C32287c c32287c, InterfaceC28601c1 interfaceC28601c1) {
        if (!m100512x(interfaceC28601c1)) {
            function1.invoke(c32287c);
        }
        m100513y(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final Modifier m100480D(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC37056f.m118997u(applyIf, new C30745a(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final Modifier m100481E(Modifier composed, Composer composer, int i13) {
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-457298299);
        Modifier modifierM95629e = AbstractC31061c.m95629e(composed, 2, 4, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10());
        c28655q.m87173q(false);
        return modifierM95629e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m100482F(InterfaceC22997s1 interfaceC22997s1, C32287c c32287c, Function1 function1, int i13, Composer composer, int i14) {
        m100511w(interfaceC22997s1, c32287c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final Modifier m100484H(Modifier modifier) {
        return AbstractC1127a.m3486a(AbstractC1125a.m3478a(modifier, new C32112d(16)), new C32112d(17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m100485I(InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        long jM51541c = C17919x.m51541c(0.1f, C17919x.f69629f);
        C22135i c22135i = new C22135i(2.0f, 0.0f, 0, 0, new C17893k(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f)), 14);
        float fMo743q0 = drawBehind.mo743q0(3 * 4);
        InterfaceC22131e.m63374D(drawBehind, jM51541c, 0L, 0L, (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fMo743q0))), c22135i, 0.0f, 230);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m100486J(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51551a(0.3f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final Modifier m100487K(Modifier modifier) {
        return AbstractC37056f.m118997u(modifier, new C30745a(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final Modifier m100488L(Modifier composed, Composer composer, int i13) {
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(761770303);
        Modifier modifierM95629e = AbstractC31061c.m95629e(composed, 3, 4, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10());
        c28655q.m87173q(false);
        return modifierM95629e;
    }

    /* JADX INFO: renamed from: o */
    private static final void m100503o(C32286b c32286b, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1309252029);
        int i14 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(c32286b) ? 4 : 2) : i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            float f13 = 4;
            float f14 = 8;
            float f15 = 2 * f14;
            Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC31061c.m95629e(modifierM3409f, 3, f13, c38072d.m121949b(c28655q, i15).getNeutral15()), f15, f15, f15, ((float) 2.5d) * f14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3397s);
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
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c32286b.getTitle(), c28655q, TextResource.$stable), null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87150e0(-1886152804);
            for (C32285a c32285a : c32286b.m100464a()) {
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), C2299e.f9108K, c28655q, 54);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                Modifier modifierM3419p = AbstractC1102d.m3419p(5 * f13, c2314t);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(c32285a.getIcon().toWhoopIcon(), c28655q, 6);
                C38072d c38072d2 = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                AbstractC15005f3.m43108b(c27430eM107874S, "", modifierM3419p, c38072d2.m121949b(c28655q, i16).getRecovery(), c28655q, 432, 0);
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c32285a.getText(), c28655q, TextResource.$stable), null, c38072d2.m121949b(c28655q, i16).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i16).getB2(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(true);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(c32286b, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m100504p(C32286b c32286b, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m100503o(c32286b, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m100505q(final C32292h viewState, final Function1 onViewEvent, Composer composer, int i13) throws XmlPullParserException, IOException {
        Function1 function1;
        final InterfaceC28593a1 interfaceC28593a1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(198982580);
        int i14 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(viewState) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95646v(0, c28655q);
            }
            final InterfaceC28593a1 interfaceC28593a2 = (InterfaceC28593a1) objM87133R;
            int i15 = i14 & 112;
            boolean zM87157i = (i15 == 32) | c28655q.m87157i(viewState);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                final int i16 = 0;
                objM87133R2 = new Function1() { // from class: s90.e
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                return AbstractC32291g.m100508t(onViewEvent, viewState, interfaceC28593a2, (C28624i0) obj);
                            default:
                                return AbstractC32291g.m100509u(onViewEvent, viewState, interfaceC28593a2, (C32287c) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R2, c28655q);
            float f13 = 8;
            float f14 = 2 * f13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(c2314t, f14, 7 * f13, f14, 0.0f, 8), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
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
            InterfaceC28593a1 interfaceC28593a3 = interfaceC28593a2;
            AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubtitle(), c28655q, AbstractC22403o.f87638a | (TextResource.$stable << 3), 0);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            c28655q.m87150e0(1210358890);
            for (C32287c c32287c : viewState.m100523j()) {
                boolean zM87157i2 = (i15 == 32) | c28655q.m87157i(viewState);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    final int i17 = 1;
                    interfaceC28593a1 = interfaceC28593a3;
                    objM87133R3 = new Function1() { // from class: s90.e
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i17) {
                                case 0:
                                    return AbstractC32291g.m100508t(onViewEvent, viewState, interfaceC28593a1, (C28624i0) obj);
                                default:
                                    return AbstractC32291g.m100509u(onViewEvent, viewState, interfaceC28593a1, (C32287c) obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    interfaceC28593a1 = interfaceC28593a3;
                }
                int i18 = TextResource.$stable;
                m100511w(C23000t1.f90727a, c32287c, (Function1) objM87133R3, c28655q, 6 | ((i18 | ((AbstractC22403o.f87638a | i18) | i18)) << 3));
                interfaceC28593a3 = interfaceC28593a1;
            }
            function1 = onViewEvent;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            m100503o(viewState.getHowItWorksSection(), c28655q, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3411h(15 * f13, c2314t)));
            c28655q.m87173q(true);
        } else {
            function1 = onViewEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30047e(viewState, function1, i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final int m100506r(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: s */
    private static final void m100507s(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final InterfaceC28620h0 m100508t(Function1 function1, C32292h c32292h, InterfaceC28593a1 interfaceC28593a1, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        return new a(function1, c32292h, interfaceC28593a1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m100509u(Function1 function1, C32292h c32292h, InterfaceC28593a1 interfaceC28593a1, C32287c it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC23438o.e(it.getSharedText(), c32292h.getReferralType()));
        m100507s(interfaceC28593a1, m100506r(interfaceC28593a1) + 1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m100510v(C32292h c32292h, Function1 function1, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m100505q(c32292h, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x0210  */
    /* JADX WARN: Code duplicated, block: B:78:0x023c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0244  */
    /* JADX WARN: Code duplicated, block: B:83:0x0254  */
    /* JADX WARN: Code duplicated, block: B:85:0x0262  */
    /* JADX WARN: Code duplicated, block: B:90:0x0286  */
    /* JADX WARN: Code duplicated, block: B:92:0x028d  */
    /* JADX WARN: Code duplicated, block: B:95:0x029c  */
    /* JADX WARN: Code duplicated, block: B:97:0x02b3  */
    /* JADX INFO: renamed from: w */
    private static final void m100511w(InterfaceC22997s1 interfaceC22997s1, C32287c c32287c, Function1 function1, Composer composer, int i13) {
        int i14;
        InterfaceC28601c1 interfaceC28601c1;
        C38072d c38072d;
        int i15;
        InterfaceC28601c1 interfaceC28601c2;
        boolean z4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        C28676v0 c28676v0;
        Object objM87133R2;
        int iHashCode;
        TextResource textResourceM100469d;
        C38072d c38072d2;
        int i16;
        boolean z15;
        long jM73366B;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-389739413);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC22997s1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c32287c) : c28655q.m87157i(c32287c) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R3 = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R3 == c28676v1) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierMo66772c = interfaceC22997s1.mo66772c(c2314t, true, 1.0f);
            boolean zM100470e = c32287c.getEnabled();
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v1) {
                objM87133R4 = new C32112d(13);
                c28655q.m87172p0(objM87133R4);
            }
            Modifier modifierM44099b = AbstractC15676d.m44099b(modifierMo66772c, zM100470e, (Function1) objM87133R4);
            boolean z16 = !c32287c.getEnabled();
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v1) {
                objM87133R5 = new C32112d(14);
                c28655q.m87172p0(objM87133R5);
            }
            Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifierM44099b, z16, (Function1) objM87133R5);
            float f13 = 8;
            float f14 = ((float) 1.5d) * f13;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, modifierM44099b2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9111N, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
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
            if (c28655q.f115903S) {
                interfaceC28601c1 = interfaceC28601c3;
            } else {
                interfaceC28601c1 = interfaceC28601c3;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                TextResource textResourceM100468c = c32287c.getCode();
                int i17 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM100468c, c28655q, i17);
                c38072d = C38072d.f163053a;
                i15 = C38072d.f163054b;
                long jM125385c1 = c38072d.m121949b(c28655q, i15).getWhite70();
                C2886a c2886aM8429j = c38072d.m121952e(c28655q, i15).getBtM();
                int i18 = C2886a.f11498d << 18;
                interfaceC28601c2 = interfaceC28601c1;
                AbstractC30795n.m94707h(strM21274h, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8429j, null, c28655q, 0, i18, 196602);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(c32287c.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), "", AbstractC1102d.m3419p(10 * f13, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
                boolean zM100470e2 = c32287c.getEnabled();
                if ((i14 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i14 & 112) != 32 || ((i14 & 64) != 0 && c28655q.m87157i(c32287c))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | z4;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    c28676v0 = c28676v1;
                } else {
                    c28676v0 = c28676v1;
                    if (objM87133R == c28676v0) {
                    }
                    Modifier modifierM44099b3 = AbstractC15676d.m44099b(c2314t, zM100470e2, (Function1) objM87133R);
                    boolean z17 = !m100512x(interfaceC28601c2);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32112d(15);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM44099b4 = AbstractC15676d.m44099b(modifierM44099b3, z17, (Function1) objM87133R2);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44099b4);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f13, f14);
                    if (m100512x(interfaceC28601c2)) {
                        textResourceM100469d = c32287c.getSharedCtaText();
                    } else {
                        textResourceM100469d = c32287c.getCtaText();
                    }
                    String strM21274h2 = AbstractC8693b.m21274h(textResourceM100469d, c28655q, i17);
                    if (m100512x(interfaceC28601c2)) {
                        c28655q.m87150e0(1107645498);
                        c38072d2 = c38072d;
                        i16 = i15;
                        jM73366B = c38072d2.m121949b(c28655q, i16).getAccentPositiveTrend();
                        z15 = false;
                    } else {
                        c38072d2 = c38072d;
                        i16 = i15;
                        z15 = false;
                        jM73366B = AbstractC25012a.m73366B(c28655q, 1107646865, c38072d2, c28655q, i16);
                    }
                    c28655q.m87173q(z15);
                    AbstractC30795n.m94707h(strM21274h2, modifierM3395q, jM73366B, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i16).getH5(), null, c28655q, 0, i18, 196088);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                }
                objM87133R = new C32290f(function1, c32287c, interfaceC28601c2, 0);
                c28655q.m87172p0(objM87133R);
                Modifier modifierM44099b5 = AbstractC15676d.m44099b(c2314t, zM100470e2, (Function1) objM87133R);
                boolean z18 = !m100512x(interfaceC28601c2);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32112d(15);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM44099b6 = AbstractC15676d.m44099b(modifierM44099b5, z18, (Function1) objM87133R2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM44099b6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f13, f14);
                if (m100512x(interfaceC28601c2)) {
                    textResourceM100469d = c32287c.getSharedCtaText();
                } else {
                    textResourceM100469d = c32287c.getCtaText();
                }
                String strM21274h3 = AbstractC8693b.m21274h(textResourceM100469d, c28655q, i17);
                if (m100512x(interfaceC28601c2)) {
                    c28655q.m87150e0(1107645498);
                    c38072d2 = c38072d;
                    i16 = i15;
                    jM73366B = c38072d2.m121949b(c28655q, i16).getAccentPositiveTrend();
                    z15 = false;
                } else {
                    c38072d2 = c38072d;
                    i16 = i15;
                    z15 = false;
                    jM73366B = AbstractC25012a.m73366B(c28655q, 1107646865, c38072d2, c28655q, i16);
                }
                c28655q.m87173q(z15);
                AbstractC30795n.m94707h(strM21274h3, modifierM3395q2, jM73366B, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i16).getH5(), null, c28655q, 0, i18, 196088);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            TextResource textResourceM100468c2 = c32287c.getCode();
            int i19 = TextResource.$stable;
            String strM21274h4 = AbstractC8693b.m21274h(textResourceM100468c2, c28655q, i19);
            c38072d = C38072d.f163053a;
            i15 = C38072d.f163054b;
            long jM125385c2 = c38072d.m121949b(c28655q, i15).getWhite70();
            C2886a c2886aM8429j2 = c38072d.m121952e(c28655q, i15).getBtM();
            int i110 = C2886a.f11498d << 18;
            interfaceC28601c2 = interfaceC28601c1;
            AbstractC30795n.m94707h(strM21274h4, null, jM125385c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8429j2, null, c28655q, 0, i110, 196602);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(c32287c.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), "", AbstractC1102d.m3419p(10 * f13, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
            boolean zM100470e3 = c32287c.getEnabled();
            if ((i14 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i14 & 112) != 32) {
                z13 = true;
            } else {
                z13 = true;
            }
            z14 = z13 | z4;
            objM87133R = c28655q.m87133R();
            if (z14) {
                c28676v0 = c28676v1;
                if (objM87133R == c28676v0) {
                }
                Modifier modifierM44099b7 = AbstractC15676d.m44099b(c2314t, zM100470e3, (Function1) objM87133R);
                boolean z19 = !m100512x(interfaceC28601c2);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32112d(15);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM44099b8 = AbstractC15676d.m44099b(modifierM44099b7, z19, (Function1) objM87133R2);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM44099b8);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
                Modifier modifierM3395q3 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f13, f14);
                if (m100512x(interfaceC28601c2)) {
                    textResourceM100469d = c32287c.getSharedCtaText();
                } else {
                    textResourceM100469d = c32287c.getCtaText();
                }
                String strM21274h5 = AbstractC8693b.m21274h(textResourceM100469d, c28655q, i19);
                if (m100512x(interfaceC28601c2)) {
                    c28655q.m87150e0(1107645498);
                    c38072d2 = c38072d;
                    i16 = i15;
                    jM73366B = c38072d2.m121949b(c28655q, i16).getAccentPositiveTrend();
                    z15 = false;
                } else {
                    c38072d2 = c38072d;
                    i16 = i15;
                    z15 = false;
                    jM73366B = AbstractC25012a.m73366B(c28655q, 1107646865, c38072d2, c28655q, i16);
                }
                c28655q.m87173q(z15);
                AbstractC30795n.m94707h(strM21274h5, modifierM3395q3, jM73366B, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i16).getH5(), null, c28655q, 0, i110, 196088);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                c28676v0 = c28676v1;
            }
            objM87133R = new C32290f(function1, c32287c, interfaceC28601c2, 0);
            c28655q.m87172p0(objM87133R);
            Modifier modifierM44099b9 = AbstractC15676d.m44099b(c2314t, zM100470e3, (Function1) objM87133R);
            boolean z110 = !m100512x(interfaceC28601c2);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C32112d(15);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM44099b10 = AbstractC15676d.m44099b(modifierM44099b9, z110, (Function1) objM87133R2);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM44099b10);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
            Modifier modifierM3395q4 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f13, f14);
            if (m100512x(interfaceC28601c2)) {
                textResourceM100469d = c32287c.getSharedCtaText();
            } else {
                textResourceM100469d = c32287c.getCtaText();
            }
            String strM21274h6 = AbstractC8693b.m21274h(textResourceM100469d, c28655q, i19);
            if (m100512x(interfaceC28601c2)) {
                c28655q.m87150e0(1107645498);
                c38072d2 = c38072d;
                i16 = i15;
                jM73366B = c38072d2.m121949b(c28655q, i16).getAccentPositiveTrend();
                z15 = false;
            } else {
                c38072d2 = c38072d;
                i16 = i15;
                z15 = false;
                jM73366B = AbstractC25012a.m73366B(c28655q, 1107646865, c38072d2, c28655q, i16);
            }
            c28655q.m87173q(z15);
            AbstractC30795n.m94707h(strM21274h6, modifierM3395q4, jM73366B, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i16).getH5(), null, c28655q, 0, i110, 196088);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e(interfaceC22997s1, c32287c, function1, i13, 1);
        }
    }

    /* JADX INFO: renamed from: x */
    private static final boolean m100512x(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: y */
    private static final void m100513y(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final Modifier m100514z(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return m100487K(applyIf);
    }
}

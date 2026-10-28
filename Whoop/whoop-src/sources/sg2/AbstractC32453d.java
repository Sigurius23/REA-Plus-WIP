package sg2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import e41.C12701f;
import hg2.AbstractC17260a;
import id2.C18416a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j81.C21421e;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC39330c;
import p745y81.C39336i;
import pz0.AbstractC29641d;
import pz0.EnumC29642e;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sg2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aW\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lsg2/h;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onRecentActivityClick", "Lkotlin/Function0;", "onSearchClick", "", "onGpsToggleChanged", "Landroidx/compose/ui/Modifier;", "modifier", "d", "(Lsg2/h;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "isGpsTrackingEnabled", "f", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32453d {

    /* JADX INFO: renamed from: sg2.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f134433w = new a();

        /* JADX INFO: renamed from: a */
        public final long m101349a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m101349a((C39336i) obj));
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x021a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0284  */
    /* JADX WARN: Code duplicated, block: B:85:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:87:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x0328  */
    /* JADX WARN: Code duplicated, block: B:92:0x0332  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m101344d(C32457h viewState, Function1 onRecentActivityClick, InterfaceC4339a onSearchClick, Function1 onGpsToggleChanged, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C2306l c2306l;
        int i16;
        int iHashCode2;
        C23000t1 c23000t1;
        int iHashCode3;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onRecentActivityClick, "onRecentActivityClick");
        AbstractC22676k.m65750j(onSearchClick, "onSearchClick");
        AbstractC22676k.m65750j(onGpsToggleChanged, "onGpsToggleChanged");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-564859146);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onRecentActivityClick) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onSearchClick) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onGpsToggleChanged) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i17 = i14 & 16;
        if (i17 == 0) {
            if ((i13 & 24576) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                float f13 = 8;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier4), ((float) 0.5d) * f13, 0.0f, 2);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
                String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC17260a.f66339n);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C2886a c2886aM8437r = c38072d.m121952e(c28655q, i18).getH4();
                long jM125385c1 = c38072d.m121949b(c28655q, i18).getWhite70();
                int i19 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM92103Y, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i19, 196602);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                c2306l = C2299e.f9107J;
                C22949e c22949e = AbstractC22977m.f90650a;
                i16 = i15;
                Modifier modifier5 = modifier4;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
                c23000t1 = C23000t1.f90727a;
                Modifier modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, C2299e.f9108K, c28655q, 48);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo66772c);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                AbstractC30795n.m94707h(viewState.getSelectedActivityLabel(), c23000t1.mo66772c(c2314t, false, 1.0f), c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, i18).getT2(), null, c28655q, 0, i19 | 3120, 186360);
                AbstractC27274q.c cVar = AbstractC27274q.c.f109140f;
                int iM46492g = c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretDown();
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = a.f134433w;
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27242b1.m82092d(new C27270o(cVar, iM46492g, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC30060g.m92103Y(c28655q, AbstractC17260a.f66338m), null, AbstractC1136a.m3599a(c2314t, "pre_session_select_activity_caret"), onSearchClick, c28655q, C27270o.f109105k | 3072 | ((i16 << 6) & 57344), 4);
                c28655q = c28655q;
                c28655q.m87173q(true);
                if (viewState.getShowGpsToggle()) {
                    c28655q.m87150e0(-799202164);
                    m101346f(viewState.getIsGpsTrackingEnabled(), onGpsToggleChanged, c23000t1.mo66771a(c2314t, c2306l), c28655q, (i16 >> 6) & 112, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-798931162);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * f13, c2314t));
                AbstractC32461l.m101366f(viewState.getRecentActivitiesRow().m96691a(), onRecentActivityClick, onSearchClick, null, c28655q, i16 & MessageListItemViewType.GIPHY, 8);
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(viewState, onRecentActivityClick, onSearchClick, onGpsToggleChanged, modifier3, i13, i14);
            }
        }
        i15 |= 24576;
        modifier2 = modifier;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            float f14 = 8;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier4), ((float) 0.5d) * f14, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
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
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC17260a.f66339n);
            C38072d c38072d2 = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            C2886a c2886aM8437r2 = c38072d2.m121952e(c28655q, i110).getH4();
            long jM125385c2 = c38072d2.m121949b(c28655q, i110).getWhite70();
            int i111 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM92103Y2, null, jM125385c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r2, null, c28655q, 0, i111, 196602);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            c2306l = C2299e.f9107J;
            C22949e c22949e2 = AbstractC22977m.f90650a;
            i16 = i15;
            Modifier modifier6 = modifier4;
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e2, c2306l, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            c23000t1 = C23000t1.f90727a;
            Modifier modifierMo66772c2 = c23000t1.mo66772c(c2314t, true, 1.0f);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9108K, c28655q, 48);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierMo66772c2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            AbstractC30795n.m94707h(viewState.getSelectedActivityLabel(), c23000t1.mo66772c(c2314t, false, 1.0f), c38072d2.m121949b(c28655q, i110).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d2.m121952e(c28655q, i110).getT2(), null, c28655q, 0, i111 | 3120, 186360);
            AbstractC27274q.c cVar2 = AbstractC27274q.c.f109140f;
            int iM46492g2 = c38072d2.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretDown();
            objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = a.f134433w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27242b1.m82092d(new C27270o(cVar2, iM46492g2, p745y81.Function1.m125323a((Function1) objM87133R), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC30060g.m92103Y(c28655q, AbstractC17260a.f66338m), null, AbstractC1136a.m3599a(c2314t, "pre_session_select_activity_caret"), onSearchClick, c28655q, C27270o.f109105k | 3072 | ((i16 << 6) & 57344), 4);
            c28655q = c28655q;
            c28655q.m87173q(true);
            if (viewState.getShowGpsToggle()) {
                c28655q.m87150e0(-799202164);
                m101346f(viewState.getIsGpsTrackingEnabled(), onGpsToggleChanged, c23000t1.mo66771a(c2314t, c2306l), c28655q, (i16 >> 6) & 112, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-798931162);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * f14, c2314t));
            AbstractC32461l.m101366f(viewState.getRecentActivitiesRow().m96691a(), onRecentActivityClick, onSearchClick, null, c28655q, i16 & MessageListItemViewType.GIPHY, 8);
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e(viewState, onRecentActivityClick, onSearchClick, onGpsToggleChanged, modifier3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m101345e(C32457h c32457h, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m101344d(c32457h, function1, interfaceC4339a, function2, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x014c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0156  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m101346f(boolean z4, Function1 onGpsToggleChanged, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z13;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC22676k.m65750j(onGpsToggleChanged, "onGpsToggleChanged");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1692817845);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onGpsToggleChanged) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, 8, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC17260a.f66337l);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM92103Y, null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getN7(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                AbstractC39330c.m125320b(0L, c38072d.m121949b(c28655q, i17).getAccentPositiveTrend(), 0L, 0L, AbstractC37817c.m121344e(1032278688, c28655q, new C12701f(z4, onGpsToggleChanged, 3)), c28655q, 24576, 13);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18416a(z4, onGpsToggleChanged, modifier3, i13, i14, 1);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q(1, 8, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC17260a.f66337l);
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM92103Y2, null, c38072d2.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i18).getN7(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            AbstractC39330c.m125320b(0L, c38072d2.m121949b(c28655q, i18).getAccentPositiveTrend(), 0L, 0L, AbstractC37817c.m121344e(1032278688, c28655q, new C12701f(z4, onGpsToggleChanged, 3)), c28655q, 24576, 13);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18416a(z4, onGpsToggleChanged, modifier3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m101347g(boolean z4, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC29641d.m91043e(null, z4, false, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), EnumC29642e.Large, null, function1, c28655q, 24576, 37);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m101348h(boolean z4, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m101346f(z4, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

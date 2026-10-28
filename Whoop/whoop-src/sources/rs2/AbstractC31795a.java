package rs2;

import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import bb2.C2928d;
import bb2.C2929e;
import bm0.C3403f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.wipeable.C6517d;
import fc0.C14362f;
import h02.C16602z;
import id2.C18432q;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.List;
import k11.C22123f;
import kw1.C22850a;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import nx1.C27225g;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3760m1;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p095dp.AbstractC12240d;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p31.C28801l;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p409q0.AbstractC29677c0;
import p409q0.AbstractC29701y;
import p409q0.C29674b;
import p409q0.InterfaceC29694r;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.InterfaceC39171c;
import p668z1.C39970s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import rm2.C31604d;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.C38072d;
import y41.C39215f;

/* JADX INFO: renamed from: rs2.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001b²\u0006\u000e\u0010\u0018\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, m65681d2 = {"Lp31/l;", "headerSection", "", "Lm91/u;", "carouselItems", "Lkotlin/Function2;", "", "", "Ll83/a0;", "onViewEvent", "l", "(Lp31/l;Ljava/util/List;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "Lq0/y;", "pagerState", "q", "(Lq0/y;Ljava/util/List;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "pageCount", "activePage", "o", "(IILandroidx/compose/runtime/Composer;I)V", "", "isActive", "z", "(ZLandroidx/compose/runtime/Composer;I)V", "maxHeightPx", "Li2/x;", "dotColor", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31795a {
    /* JADX INFO: renamed from: A */
    private static final long m98727A(InterfaceC28670t2 interfaceC28670t2) {
        return ((C17919x) interfaceC28670t2.getValue()).f69639a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m98728B(float f13, InterfaceC28670t2 interfaceC28670t2, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        long jM98727A = m98727A(interfaceC28670t2);
        float fMo743q0 = Canvas.mo743q0(f13);
        InterfaceC22131e.m63374D(Canvas, jM98727A, 0L, (((long) Float.floatToRawIntBits(Canvas.mo743q0(f13))) & 4294967295L) | (Float.floatToRawIntBits(fMo743q0) << 32), (((long) Float.floatToRawIntBits(Canvas.mo743q0(f13))) << 32) | (((long) Float.floatToRawIntBits(Canvas.mo743q0(f13))) & 4294967295L), null, 0.0f, 242);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m98729C(boolean z4, int i13, Composer composer, int i14) {
        m98755z(z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m98741l(C28801l headerSection, List<? extends InterfaceC25312u> carouselItems, InterfaceC4351m onViewEvent, Composer composer, int i13) {
        int i14;
        List<? extends InterfaceC25312u> list;
        InterfaceC4351m interfaceC4351m;
        AbstractC22676k.m65750j(headerSection, "headerSection");
        AbstractC22676k.m65750j(carouselItems, "carouselItems");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(756344310);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(headerSection) : c28655q.m87157i(headerSection) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(carouselItems) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            boolean zM87157i = c28655q.m87157i(carouselItems);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C16602z(carouselItems, 3);
                c28655q.m87172p0(objM87133R);
            }
            C29674b c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R, 0, 0, c28655q, 3);
            C22957g c22957g = AbstractC22977m.f90652c;
            C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(300, 0, null, 6);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3355a = AbstractC1091c.m3355a(c2314t, c11347e2M30574v, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3355a);
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
            float f13 = 8 * 2;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC25303l.m74291r(headerSection, null, null, null, c28655q, C28801l.f116582c | (i15 & 14), 14);
            c28655q.m87173q(true);
            list = carouselItems;
            interfaceC4351m = onViewEvent;
            m98746q(c29674bM91150b, list, interfaceC4351m, c28655q, i15 & MessageListItemViewType.GIPHY);
            if (list.size() > 1) {
                AbstractC33745d.m106667z(c28655q, 1099068602, c2314t, f13, c28655q);
                m98744o(list.size(), c29674bM91150b.m91162k(), c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1099280022);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            list = carouselItems;
            interfaceC4351m = onViewEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g(headerSection, list, interfaceC4351m, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final int m98742m(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m98743n(C28801l c28801l, List list, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m98741l(c28801l, list, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m98744o(int i13, int i14, Composer composer, int i15) {
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1705589735);
        if ((i15 & 6) == 0) {
            i16 = (c28655q.m87149e(i13) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= c28655q.m87149e(i14) ? 32 : 16;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            C2306l c2306l = C2299e.f9108K;
            C22949e c22949e = AbstractC22977m.f90650a;
            C22971k c22971kM66747j = AbstractC22977m.m66747j(1 * 8, C2299e.f9111N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66747j, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            c28655q.m87150e0(-1219223262);
            int i17 = 0;
            while (i17 < i13) {
                m98755z(i17 == i14, c28655q, 0);
                i17++;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18432q(i13, i14, i15, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m98745p(int i13, int i14, int i15, Composer composer, int i16) {
        m98744o(i13, i14, composer, AbstractC28683x.m87244L(i15 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0189  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x0207  */
    /* JADX WARN: Code duplicated, block: B:86:0x020f  */
    /* JADX WARN: Code duplicated, block: B:89:0x022e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0260  */
    /* JADX WARN: Code duplicated, block: B:93:0x0264  */
    /* JADX WARN: Code duplicated, block: B:98:0x0285  */
    /* JADX INFO: renamed from: q */
    private static final void m98746q(AbstractC29701y abstractC29701y, List<? extends InterfaceC25312u> list, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        Modifier modifier;
        C0209i c0209i;
        C2314t c2314t;
        InterfaceC28593a1 interfaceC28593a1;
        boolean z4;
        C28676v0 c28676v0;
        Object objM87133R;
        Object objM87133R2;
        int iHashCode;
        int i14;
        int i15;
        boolean zM87149e;
        Object objM87133R3;
        int iHashCode2;
        C0213j c0213j;
        C0209i c0209i2;
        C2307m c2307m = C2299e.f9114w;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(495564113);
        int i16 = (i13 & 6) == 0 ? (c28655q.m87153g(abstractC29701y) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i16 |= c28655q.m87157i(list) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q.m87157i(interfaceC4351m) ? 256 : 128;
        }
        int i17 = i16;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            Object objM87133R4 = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R4 == c28676v1) {
                objM87133R4 = new C39970s();
                c28655q.m87172p0(objM87133R4);
            }
            C39970s c39970s = (C39970s) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v1) {
                objM87133R5 = AbstractC31061c.m95646v(0, c28655q);
            }
            InterfaceC28593a1 interfaceC28593a2 = (InterfaceC28593a1) objM87133R5;
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            boolean zM87153g = c28655q.m87153g(list);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87153g || objM87133R6 == c28676v1) {
                List<? extends InterfaceC25312u> list2 = list;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                for (Object objM63348b : list2) {
                    if (objM63348b instanceof C39215f) {
                        objM63348b = C39215f.m124915b((C39215f) objM63348b, null, null, null, null, null, null, null, null, false, 255, null);
                    } else if (objM63348b instanceof C22123f) {
                        objM63348b = C22123f.m63348b((C22123f) objM63348b, null, null, null, null, null, null, null, null, null, false, false, null, 0.0f, 7679, null);
                    }
                    arrayList.add(objM63348b);
                }
                c28655q.m87172p0(arrayList);
                objM87133R6 = arrayList;
            }
            List list3 = (List) objM87133R6;
            int iM98747r = m98747r(interfaceC28593a2);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3411h = iM98747r > 0 ? AbstractC1102d.m3411h((3 * 4) + interfaceC39171c.mo733e0(m98747r(interfaceC28593a2)), c2314t2) : AbstractC1102d.m3427x(c2314t2, null, 3);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i3 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d);
            C0209i c0209i4 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q.f115903S) {
                modifier = modifierM3411h;
            } else {
                modifier = modifierM3411h;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
                if (m98747r(interfaceC28593a2) > 0) {
                    c28655q.m87150e0(566185076);
                    Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t2), null, 3);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v1) {
                        objM87133R2 = new C31604d(15);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3427x, (Function1) objM87133R2);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3486a);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N2);
                    c28655q.m87150e0(96278446);
                    i14 = 0;
                    for (Object obj : list3) {
                        i15 = i14 + 1;
                        if (i14 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        InterfaceC25312u interfaceC25312u = (InterfaceC25312u) obj;
                        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 2 * 8, 0.0f, 2);
                        zM87149e = c28655q.m87149e(i14);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87149e || objM87133R3 == c28676v1) {
                            objM87133R3 = new C6517d(c39970s, i14, interfaceC28593a2, 14);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM3396r, (Function1) objM87133R3);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                        C28676v0 c28676v2 = c28676v1;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3500d);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                        AbstractC25303l.m74291r(interfaceC25312u, null, null, null, c28655q, 0, 14);
                        c28655q.m87173q(true);
                        interfaceC28593a2 = interfaceC28593a2;
                        c2314t2 = c2314t2;
                        c28676v1 = c28676v2;
                        i14 = i15;
                    }
                    c28676v0 = c28676v1;
                    c2314t = c2314t2;
                    interfaceC28593a1 = interfaceC28593a2;
                    z4 = true;
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                } else {
                    c2314t = c2314t2;
                    interfaceC28593a1 = interfaceC28593a2;
                    z4 = true;
                    c28676v0 = c28676v1;
                    c28655q.m87150e0(567295031);
                    c28655q.m87173q(false);
                }
                Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C14362f(interfaceC28593a1, 10);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3500d2 = AbstractC1131a.m3500d(modifierMo3471e, (Function1) objM87133R);
                float f13 = 3 * 4;
                float f14 = 8;
                AbstractC12240d.m34066d(abstractC29701y, modifierM3500d2, AbstractC1099a.m3381c(2 * f14, f13, f14 * f14, 0.0f, 8), null, 0, f13, C2299e.f9107J, null, false, null, null, null, AbstractC37817c.m121344e(-95815638, c28655q, new C3403f(list, list3, interfaceC4351m, interfaceC28593a1, 8)), c28655q, (i17 & 14) | 1769472, 24576, 16280);
                c28655q = c28655q;
                c28655q.m87173q(z4);
            }
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
            if (m98747r(interfaceC28593a2) > 0) {
                c28655q.m87150e0(566185076);
                Modifier modifierM3427x2 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t2), null, 3);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v1) {
                    objM87133R2 = new C31604d(15);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3486a2 = AbstractC1127a.m3486a(modifierM3427x2, (Function1) objM87133R2);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3486a2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N4);
                c28655q.m87150e0(96278446);
                i14 = 0;
                while (r1.hasNext()) {
                    i15 = i14 + 1;
                    if (i14 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    InterfaceC25312u interfaceC25312u2 = (InterfaceC25312u) obj;
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 2 * 8, 0.0f, 2);
                    zM87149e = c28655q.m87149e(i14);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87149e) {
                        objM87133R3 = new C6517d(c39970s, i14, interfaceC28593a2, 14);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C6517d(c39970s, i14, interfaceC28593a2, 14);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3500d3 = AbstractC1131a.m3500d(modifierM3396r2, (Function1) objM87133R3);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                    C28676v0 c28676v3 = c28676v1;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3500d3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    AbstractC25303l.m74291r(interfaceC25312u2, null, null, null, c28655q, 0, 14);
                    c28655q.m87173q(true);
                    interfaceC28593a2 = interfaceC28593a2;
                    c2314t2 = c2314t2;
                    c28676v1 = c28676v3;
                    i14 = i15;
                }
                c28676v0 = c28676v1;
                c2314t = c2314t2;
                interfaceC28593a1 = interfaceC28593a2;
                z4 = true;
                AbstractC25012a.m73392y(c28655q, false, true, false);
            } else {
                c2314t = c2314t2;
                interfaceC28593a1 = interfaceC28593a2;
                z4 = true;
                c28676v0 = c28676v1;
                c28655q.m87150e0(567295031);
                c28655q.m87173q(false);
            }
            Modifier modifierMo3471e2 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C14362f(interfaceC28593a1, 10);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3500d4 = AbstractC1131a.m3500d(modifierMo3471e2, (Function1) objM87133R);
            float f15 = 3 * 4;
            float f16 = 8;
            AbstractC12240d.m34066d(abstractC29701y, modifierM3500d4, AbstractC1099a.m3381c(2 * f16, f15, f16 * f16, 0.0f, 8), null, 0, f15, C2299e.f9107J, null, false, null, null, null, AbstractC37817c.m121344e(-95815638, c28655q, new C3403f(list, list3, interfaceC4351m, interfaceC28593a1, 8)), c28655q, (i17 & 14) | 1769472, 24576, 16280);
            c28655q = c28655q;
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g(abstractC29701y, list, interfaceC4351m, i13, 28);
        }
    }

    /* JADX INFO: renamed from: r */
    private static final int m98747r(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: s */
    private static final void m98748s(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m98749t(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51551a(0.0f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m98750u(C39970s c39970s, int i13, InterfaceC28593a1 interfaceC28593a1, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        int iMo3541n = (int) (coordinates.mo3541n() & 4294967295L);
        Integer num = (Integer) c39970s.get(Integer.valueOf(i13));
        if (num == null || num.intValue() != iMo3541n) {
            c39970s.put(Integer.valueOf(i13), Integer.valueOf(iMo3541n));
            Integer num2 = (Integer) AbstractC25265s.m74115S0(c39970s.f172480z);
            int iIntValue = num2 != null ? num2.intValue() : 0;
            if (iIntValue != m98747r(interfaceC28593a1)) {
                m98748s(interfaceC28593a1, iIntValue);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m98751v(InterfaceC28593a1 interfaceC28593a1, InterfaceC39147y coordinates) {
        int iMo3541n;
        AbstractC22676k.m65750j(coordinates, "coordinates");
        if (m98747r(interfaceC28593a1) == 0 && (iMo3541n = (int) (coordinates.mo3541n() & 4294967295L)) > 0) {
            m98748s(interfaceC28593a1, iMo3541n);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m98752w(List list, List list2, InterfaceC4351m interfaceC4351m, InterfaceC28593a1 interfaceC28593a1, InterfaceC29694r HorizontalPager, int i13, Composer composer, int i14) {
        AbstractC22676k.m65750j(HorizontalPager, "$this$HorizontalPager");
        InterfaceC25312u interfaceC25312u = (InterfaceC25312u) (m98747r(interfaceC28593a1) > 0 ? list.get(i13) : list2.get(i13));
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(interfaceC4351m) | ((((i14 & 112) ^ 48) > 32 && c28655q.m87149e(i13)) || (i14 & 48) == 32);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C22850a(interfaceC4351m, i13, 1);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q, 0, 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m98753x(InterfaceC4351m interfaceC4351m, int i13, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4351m.invoke(it, Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m98754y(AbstractC29701y abstractC29701y, List list, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m98746q(abstractC29701y, list, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m98755z(boolean z4, Composer composer, int i13) {
        int i14;
        long jM53363d;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-682393548);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            if (z4) {
                c28655q.m87150e0(1349801278);
                jM53363d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(1349802363);
                jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            InterfaceC28670t2 interfaceC28670t2M11569a = AbstractC3760m1.m11569a(jM53363d, AbstractC11348f.m30574v(300, 0, null, 6), "dot_color", c28655q, 432, 8);
            float f13 = 2 * 4;
            Modifier modifierM3421r = AbstractC1102d.m3421r(C2314t.f9131w, f13, f13);
            boolean zM87153g = c28655q.m87153g(interfaceC28670t2M11569a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2928d(f13, interfaceC28670t2M11569a, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3421r, (Function1) objM87133R, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2929e(z4, i13, 3);
        }
    }
}

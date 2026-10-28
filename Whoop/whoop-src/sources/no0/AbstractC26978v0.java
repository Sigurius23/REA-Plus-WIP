package no0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c41.C4119t1;
import c93.InterfaceC4339a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.TextResource;
import fc0.C14362f;
import gb1.AbstractC15674c;
import gb1.AbstractC15676d;
import java.util.Iterator;
import l83.C23454a0;
import lo0.C24577e0;
import m31.C25002h;
import mo0.AbstractC25739b;
import ny0.AbstractC27271o0;
import ny0.C27273p0;
import p000.AbstractC11266d;
import p000.C2175b;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p329n0.C26057j;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: no0.v0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u0010²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, m65681d2 = {"Llo0/e0;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", "f", "(Llo0/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "isExpanded", "", "expandableContentHeightPx", "Ly3/f;", "animatedHeight", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26978v0 {
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x0126  */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m80822f(C24577e0 viewState, Function1 onViewEvent, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87153g2;
        Object objM87133R2;
        InterfaceC28593a1 interfaceC28593a1;
        float fMo733e0;
        boolean z13;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1555141229);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
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
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                zM87153g = c28655q.m87153g(viewState.getId());
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsExpanded()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zM87153g2 = c28655q.m87153g(viewState.getId());
                objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95646v(0, c28655q);
                }
                interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
                fMo733e0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo733e0(m80825i(interfaceC28593a1));
                if (Float.compare(fMo733e0, viewState.getCollapsedHeight()) > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (m80825i(interfaceC28593a1) == 0) {
                    fMo733e0 = viewState.getCollapsedHeight();
                } else if (!m80823g(interfaceC28601c1)) {
                    fMo733e0 = Math.min(fMo733e0, viewState.getCollapsedHeight());
                }
                AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, modifier3), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), null, null, null, 0.0f, AbstractC37817c.m121344e(1497080835, c28655q, new C4119t1(viewState, z13, AbstractC11352g.m30587a(fMo733e0, AbstractC11348f.m30574v(300, 0, AbstractC11333b0.f36310a, 2), null, c28655q, 0, 12), interfaceC28601c1, onViewEvent, interfaceC28593a1)), c28655q, 12582912, 122);
                c28655q = c28655q;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(i13, i14, 17, modifier2, viewState, onViewEvent);
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
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            zM87153g = c28655q.m87153g(viewState.getId());
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87153g) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsExpanded()));
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getIsExpanded()));
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            zM87153g2 = c28655q.m87153g(viewState.getId());
            objM87133R2 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R2 = AbstractC31061c.m95646v(0, c28655q);
            } else {
                objM87133R2 = AbstractC31061c.m95646v(0, c28655q);
            }
            interfaceC28593a1 = (InterfaceC28593a1) objM87133R2;
            fMo733e0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo733e0(m80825i(interfaceC28593a1));
            if (Float.compare(fMo733e0, viewState.getCollapsedHeight()) > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (m80825i(interfaceC28593a1) == 0) {
                fMo733e0 = viewState.getCollapsedHeight();
            } else if (!m80823g(interfaceC28601c1)) {
                fMo733e0 = Math.min(fMo733e0, viewState.getCollapsedHeight());
            }
            AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, modifier3), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), null, null, null, 0.0f, AbstractC37817c.m121344e(1497080835, c28655q, new C4119t1(viewState, z13, AbstractC11352g.m30587a(fMo733e0, AbstractC11348f.m30574v(300, 0, AbstractC11333b0.f36310a, 2), null, c28655q, 0, 12), interfaceC28601c1, onViewEvent, interfaceC28593a1)), c28655q, 12582912, 122);
            c28655q = c28655q;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(i13, i14, 17, modifier2, viewState, onViewEvent);
        }
    }

    /* JADX INFO: renamed from: g */
    private static final boolean m80823g(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    private static final void m80824h(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: i */
    private static final int m80825i(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: j */
    private static final void m80826j(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: k */
    private static final float m80827k(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:33:0x010a A[LOOP:0: B:31:0x0104->B:33:0x010a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x012c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0147  */
    /* JADX WARN: Code duplicated, block: B:42:0x0169  */
    /* JADX WARN: Code duplicated, block: B:46:0x0178  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x01af  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:62:0x021e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0222  */
    /* JADX WARN: Code duplicated, block: B:68:0x023d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0259 A[LOOP:1: B:70:0x0253->B:72:0x0259, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0278  */
    /* JADX WARN: Code duplicated, block: B:77:0x0289  */
    /* JADX WARN: Code duplicated, block: B:78:0x028e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0298  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:85:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:89:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:91:0x0328  */
    /* JADX WARN: Code duplicated, block: B:94:0x0337  */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m80828l(C24577e0 c24577e0, boolean z4, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC28593a1 interfaceC28593a1, Composer composer, int i13) {
        C2314t c2314t;
        C0209i c0209i;
        C2314t c2314t2;
        boolean z13;
        boolean zM87153g;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i2;
        boolean zM87153g2;
        Object objM87133R2;
        int iHashCode2;
        Iterator<T> it;
        boolean z14;
        C27273p0 c27273p0M71780c;
        int iM46492g;
        C39274g c39274gM82265k;
        boolean zM87153g3;
        Object objM87133R3;
        int iHashCode3;
        Iterator<T> it3;
        C2305k c2305k = C2299e.f9110M;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 2;
            float f14 = 8;
            float f15 = f13 * f14;
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f15, c2314t3);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i3 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
            C0209i c0209i4 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q.f115903S) {
                c2314t = c2314t3;
            } else {
                c2314t = c2314t3;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                }
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
                if (c24577e0.m71782f().isEmpty()) {
                    c2314t2 = c2314t;
                    c28655q.m87150e0(1650873781);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1650357724);
                    float f16 = ((float) 2.5d) * f14;
                    C2314t c2314t4 = c2314t;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, f16, 7);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16), c2305k, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N2);
                    c28655q.m87150e0(-1571830106);
                    it3 = c24577e0.m71782f().iterator();
                    while (it3.hasNext()) {
                        AbstractC25303l.m74291r((InterfaceC25312u) it3.next(), AbstractC25739b.m75911y(), null, function1, c28655q, C25307p.f99300b << 3, 4);
                    }
                    c2314t2 = c2314t4;
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                }
                if (c24577e0.m71781e().isEmpty()) {
                    c28655q.m87150e0(1653585909);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1651014273);
                    Modifier modifierM118995s = AbstractC37056f.m118995s(AbstractC1102d.m3411h(m80827k(interfaceC28670t2), AbstractC1102d.m3409f(1.0f, c2314t2)));
                    if (m80823g(interfaceC28601c1) && z4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87153g = c28655q.m87153g(interfaceC28670t2);
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = new C2175b(interfaceC28670t2, 8);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM118995s, z13, (Function1) objM87133R);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM44099b);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i6 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d);
                    C0209i c0209i7 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m3);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N3);
                    Modifier modifierM3426w = AbstractC1102d.m3426w(AbstractC1102d.m3409f(1.0f, c2314t2), C2299e.f9107J, true);
                    zM87153g2 = c28655q.m87153g(interfaceC28593a1);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C14362f(interfaceC28593a1, 6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM3426w, (Function1) objM87133R2);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3500d);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                    c28655q.m87150e0(-885612757);
                    it = c24577e0.m71781e().iterator();
                    while (it.hasNext()) {
                        AbstractC25303l.m74291r((InterfaceC25312u) it.next(), AbstractC25739b.m75911y(), null, function1, c28655q, C25307p.f99300b << 3, 4);
                    }
                    AbstractC25012a.m73392y(c28655q, false, true, true);
                    if (z4) {
                        c28655q.m87150e0(1652232387);
                        AbstractC11266d.m30469w(f13, 4, c2314t2, c28655q);
                        if (m80823g(interfaceC28601c1)) {
                            c27273p0M71780c = c24577e0.getCollapseButton();
                        } else {
                            c27273p0M71780c = c24577e0.getExpandButton();
                        }
                        if (m80823g(interfaceC28601c1)) {
                            iM46492g = C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretUp();
                        } else {
                            iM46492g = C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretDown();
                        }
                        TextResource textResourceM82267m = c27273p0M71780c.getText();
                        C2886a c2886aM8430k = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getBtS();
                        c39274gM82265k = c27273p0M71780c.getRightIcon();
                        if (c39274gM82265k != null) {
                            iM46492g = c39274gM82265k.getIcon();
                        }
                        float f17 = 0;
                        C22976l1 c22976l1 = new C22976l1(f17, f17, f17, f17);
                        Integer numValueOf = Integer.valueOf(iM46492g);
                        zM87153g3 = c28655q.m87153g(interfaceC28601c1) | c28655q.m87157i(c24577e0) | c28655q.m87153g(function1);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g3 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C26057j(c24577e0, interfaceC28601c1, function1, 4);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC27271o0.m82253b(null, false, textResourceM82267m, c2886aM8430k, null, null, numValueOf, null, false, c22976l1, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.$stable << 6) | 906166272 | (C2886a.f11498d << 9), 0, 147);
                        z14 = false;
                        c28655q.m87173q(false);
                    } else {
                        z14 = false;
                        c28655q.m87150e0(1653572021);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(true);
            }
            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
            if (c24577e0.m71782f().isEmpty()) {
                c28655q.m87150e0(1650357724);
                float f18 = ((float) 2.5d) * f14;
                C2314t c2314t5 = c2314t;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t5, 0.0f, 0.0f, 0.0f, f18, 7);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f18), c2305k, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N5);
                c28655q.m87150e0(-1571830106);
                it3 = c24577e0.m71782f().iterator();
                while (it3.hasNext()) {
                    AbstractC25303l.m74291r((InterfaceC25312u) it3.next(), AbstractC25739b.m75911y(), null, function1, c28655q, C25307p.f99300b << 3, 4);
                }
                c2314t2 = c2314t5;
                AbstractC25012a.m73392y(c28655q, false, true, false);
            } else {
                c2314t2 = c2314t;
                c28655q.m87150e0(1650873781);
                c28655q.m87173q(false);
            }
            if (c24577e0.m71781e().isEmpty()) {
                c28655q.m87150e0(1651014273);
                Modifier modifierM118995s2 = AbstractC37056f.m118995s(AbstractC1102d.m3411h(m80827k(interfaceC28670t2), AbstractC1102d.m3409f(1.0f, c2314t2)));
                if (m80823g(interfaceC28601c1)) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                zM87153g = c28655q.m87153g(interfaceC28670t2);
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v1 = C28635l.f115821a;
                if (zM87153g) {
                    objM87133R = new C2175b(interfaceC28670t2, 8);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2175b(interfaceC28670t2, 8);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifierM118995s2, z13, (Function1) objM87133R);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM44099b2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i9 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC39127r0M66763d2);
                C0209i c0209i10 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC28653p1M87165m6);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                }
                C0209i c0209i11 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N6);
                Modifier modifierM3426w2 = AbstractC1102d.m3426w(AbstractC1102d.m3409f(1.0f, c2314t2), C2299e.f9107J, true);
                zM87153g2 = c28655q.m87153g(interfaceC28593a1);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R2 = new C14362f(interfaceC28593a1, 6);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C14362f(interfaceC28593a1, 6);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3500d2 = AbstractC1131a.m3500d(modifierM3426w2, (Function1) objM87133R2);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3500d2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC28653p1M87165m7);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11, modifierM118962N7);
                c28655q.m87150e0(-885612757);
                it = c24577e0.m71781e().iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), AbstractC25739b.m75911y(), null, function1, c28655q, C25307p.f99300b << 3, 4);
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
                if (z4) {
                    c28655q.m87150e0(1652232387);
                    AbstractC11266d.m30469w(f13, 4, c2314t2, c28655q);
                    if (m80823g(interfaceC28601c1)) {
                        c27273p0M71780c = c24577e0.getCollapseButton();
                    } else {
                        c27273p0M71780c = c24577e0.getExpandButton();
                    }
                    if (m80823g(interfaceC28601c1)) {
                        iM46492g = C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretUp();
                    } else {
                        iM46492g = C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretDown();
                    }
                    TextResource textResourceM82267m2 = c27273p0M71780c.getText();
                    C2886a c2886aM8430k2 = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getBtS();
                    c39274gM82265k = c27273p0M71780c.getRightIcon();
                    if (c39274gM82265k != null) {
                        iM46492g = c39274gM82265k.getIcon();
                    }
                    float f19 = 0;
                    C22976l1 c22976l2 = new C22976l1(f19, f19, f19, f19);
                    Integer numValueOf2 = Integer.valueOf(iM46492g);
                    zM87153g3 = c28655q.m87153g(interfaceC28601c1) | c28655q.m87157i(c24577e0) | c28655q.m87153g(function1);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R3 = new C26057j(c24577e0, interfaceC28601c1, function1, 4);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C26057j(c24577e0, interfaceC28601c1, function1, 4);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27271o0.m82253b(null, false, textResourceM82267m2, c2886aM8430k2, null, null, numValueOf2, null, false, c22976l2, (InterfaceC4339a) objM87133R3, c28655q, (TextResource.$stable << 6) | 906166272 | (C2886a.f11498d << 9), 0, 147);
                    z14 = false;
                    c28655q.m87173q(false);
                } else {
                    z14 = false;
                    c28655q.m87150e0(1653572021);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
            } else {
                c28655q.m87150e0(1653585909);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Modifier m80829m(InterfaceC28670t2 interfaceC28670t2, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC15674c.m44081e(applyIf, m80827k(interfaceC28670t2) * 0.4f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m80830n(InterfaceC28593a1 interfaceC28593a1, InterfaceC39147y it) {
        AbstractC22676k.m65750j(it, "it");
        m80826j(interfaceC28593a1, (int) (it.mo3541n() & 4294967295L));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m80831o(C24577e0 c24577e0, InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        boolean zM80823g = m80823g(interfaceC28601c1);
        m80824h(interfaceC28601c1, !zM80823g);
        AnalyticEventModel analyticEventModelM82260f = !zM80823g ? c24577e0.getExpandButton().getAnalyticEvent() : c24577e0.getCollapseButton().getAnalyticEvent();
        if (analyticEventModelM82260f != null) {
            AbstractC13673n.m38578y(null, analyticEventModelM82260f, function1);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m80832p(C24577e0 c24577e0, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m80822f(c24577e0, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

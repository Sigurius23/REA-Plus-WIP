package cr2;

import am0.C0999c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2476a1;
import b91.C2886a;
import bm2.C3428b1;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hb3.AbstractC17104a0;
import hy0.AbstractC17755i2;
import hy0.C17748h;
import hy0.EnumC17727b2;
import hy0.EnumC17744g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p717lq2.AbstractC24669a;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: cr2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcr2/c;", "step", "", "isCurrentStep", "Ll83/a0;", "e", "(Lcr2/c;ZLandroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "wirFooterText", "wirFooterSubText", "j", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "footerText", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11089e {
    /* JADX INFO: renamed from: e */
    public static final void m29930e(C11087c step, boolean z4, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(383130376);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(step) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC24669a.m72061e(z4, AbstractC37817c.m121344e(-490023618, c28655q, new C2476a1(step, 6)), c28655q, ((i14 >> 3) & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11088d(step, z4, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x009e  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:21:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:25:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:29:0x0124  */
    /* JADX WARN: Code duplicated, block: B:30:0x017b  */
    /* JADX WARN: Code duplicated, block: B:37:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:47:0x0203  */
    /* JADX WARN: Code duplicated, block: B:49:0x0230  */
    /* JADX WARN: Code duplicated, block: B:50:0x0234  */
    /* JADX WARN: Code duplicated, block: B:55:0x0255  */
    /* JADX WARN: Code duplicated, block: B:59:0x0271  */
    /* JADX WARN: Code duplicated, block: B:61:0x029e  */
    /* JADX WARN: Code duplicated, block: B:62:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:67:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x02db  */
    /* JADX WARN: Code duplicated, block: B:72:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0199 A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m29931f(C11087c c11087c, InterfaceC3747i0 BasicAnimationComponent, Composer composer, int i13) {
        char c3;
        int iHashCode;
        Iterator<T> it;
        int i14;
        DefaultConstructorMarker defaultConstructorMarker;
        C28655q c28655q;
        C2307m c2307m;
        TextResource wirFooterText;
        C23454a0 c23454a0;
        TextResource wirFooterSubText;
        C2307m c2307m2;
        int iHashCode2;
        C0213j c0213j;
        C0209i c0209i;
        C23454a0 c23454a1;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i2;
        Object next;
        int i15;
        float f13;
        C28655q c28655q2;
        Composer composer2 = composer;
        C2307m c2307m3 = C2299e.f9114w;
        AbstractC22676k.m65750j(BasicAnimationComponent, "$this$BasicAnimationComponent");
        C2314t c2314t = C2314t.f9131w;
        float f14 = 8;
        float f15 = ((float) 2.5d) * f14;
        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f15, 12 * f14, f15, 0.0f, 8);
        C22957g c22957g = AbstractC22977m.f90652c;
        C2305k c2305k = C2299e.f9110M;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, composer2, 6);
        C28655q c28655q3 = (C28655q) composer2;
        int iHashCode4 = Long.hashCode(c28655q3.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer2, modifierM3398t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j3 = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q3.f115906a;
        c28655q3.m87158i0();
        if (c28655q3.f115903S) {
            c28655q3.m87163l(c0213j3);
        } else {
            c28655q3.m87178s0();
        }
        C0209i c0209i3 = C0217k.f729g;
        AbstractC28683x.m87239G(composer2, c0209i3, c23010xM66775a);
        C0209i c0209i4 = C0217k.f728f;
        AbstractC28683x.m87239G(composer2, c0209i4, interfaceC28653p1M87165m);
        C0209i c0209i5 = C0217k.f732j;
        if (c28655q3.f115903S) {
            c3 = '\f';
        } else {
            c3 = '\f';
            if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode4))) {
            }
            C0209i c0209i6 = C0217k.f726d;
            AbstractC28683x.m87239G(composer2, c0209i6, modifierM118962N);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, composer2, 0);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer2, c2314t);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j3);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(composer2, c0209i3, c23010xM66775a2);
            AbstractC28683x.m87239G(composer2, c0209i4, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i5);
            }
            AbstractC28683x.m87239G(composer2, c0209i6, modifierM118962N2);
            c28655q3.m87150e0(-149707102);
            it = c11087c.m29922f().iterator();
            i14 = 0;
            while (true) {
                defaultConstructorMarker = null;
                if (it.hasNext()) {
                    float f16 = f14;
                    c28655q = c28655q3;
                    c2307m = c2307m3;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC22953f.m66715b(composer2, AbstractC1102d.m3413j(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 2 * f16, 0.0f, 2));
                    wirFooterText = c11087c.getWirFooterText();
                    c23454a0 = C23454a0.f92919a;
                    if (wirFooterText == null) {
                        c28655q.m87150e0(270236321);
                        c28655q.m87173q(false);
                        c23454a1 = null;
                        c2307m2 = c2307m;
                    } else {
                        c28655q.m87150e0(270236322);
                        wirFooterSubText = c11087c.getWirFooterSubText();
                        if (wirFooterSubText == null) {
                            c28655q.m87150e0(1729547753);
                            c28655q.m87173q(false);
                            c23454a1 = null;
                            c2307m2 = c2307m;
                        } else {
                            c28655q.m87150e0(1729547754);
                            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(c2305k);
                            c2307m2 = c2307m;
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(composer2, horizontalAlignElement);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(composer2, C0217k.f729g, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m3);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N3);
                            int i16 = TextResource.$stable;
                            m29935j(wirFooterText, wirFooterSubText, composer2, i16 | (i16 << 3));
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                            c23454a1 = c23454a0;
                        }
                        c28655q.m87173q(false);
                    }
                    if (c23454a1 == null) {
                        c28655q.m87150e0(270536464);
                        HorizontalAlignElement horizontalAlignElement2 = new HorizontalAlignElement(C2299e.f9112O);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(composer2, horizontalAlignElement2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer2, C0217k.f729g, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m4);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N4);
                        m29933h(c11087c.getLegendText(), composer2, TextResource.$stable);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-684019722);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    return c23454a0;
                }
                next = it.next();
                i15 = i14 + 1;
                if (i14 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C11091g c11091g = (C11091g) next;
                TextResource title = c11091g.getTitle();
                TextResource value = c11091g.getValue();
                TextResource suffix = c11091g.getSuffix();
                EnumC11092h style = c11091g.getStyle();
                TextResource subtext = c11091g.getSubtext();
                EnumC17727b2 subtextState = c11091g.getSubtextState();
                int i17 = TextResource.$stable;
                AbstractC11086b.m29916d(title, value, suffix, style, subtext, subtextState, composer2, i17 | (i17 << 3) | (i17 << 6) | (i17 << 12));
                if (i14 != c11087c.m29922f().size() - 1) {
                    c28655q3.m87150e0(251909946);
                    AbstractC22953f.m66715b(composer2, AbstractC1102d.m3419p(2 * f14, c2314t));
                    f13 = f14;
                    c28655q2 = c28655q3;
                    AbstractC17755i2.m50938j(AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(composer2, C38072d.f163054b).getWhite10(), new C17748h(f14, defaultConstructorMarker)), EnumC17744g.DOTTED, null, null, null, 0L, 0L, null, composer, 48, 252);
                    composer2 = composer;
                    AbstractC22953f.m66715b(composer2, AbstractC1102d.m3419p(3 * f13, c2314t));
                    c28655q2.m87173q(false);
                } else {
                    f13 = f14;
                    c28655q2 = c28655q3;
                    c28655q2.m87150e0(252310683);
                    c28655q2.m87173q(false);
                }
                c28655q3 = c28655q2;
                f14 = f13;
                i14 = i15;
                c2307m3 = c2307m3;
                c3 = c3;
            }
        }
        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i5);
        C0209i c0209i7 = C0217k.f726d;
        AbstractC28683x.m87239G(composer2, c0209i7, modifierM118962N);
        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, composer2, 0);
        iHashCode = Long.hashCode(c28655q3.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
        Modifier modifierM118962N5 = AbstractC37056f.m118962N(composer2, c2314t);
        c28655q3.m87158i0();
        if (c28655q3.f115903S) {
            c28655q3.m87163l(c0213j3);
        } else {
            c28655q3.m87178s0();
        }
        AbstractC28683x.m87239G(composer2, c0209i3, c23010xM66775a3);
        AbstractC28683x.m87239G(composer2, c0209i4, interfaceC28653p1M87165m5);
        if (c28655q3.f115903S) {
            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i5);
        } else {
            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i5);
        }
        AbstractC28683x.m87239G(composer2, c0209i7, modifierM118962N5);
        c28655q3.m87150e0(-149707102);
        it = c11087c.m29922f().iterator();
        i14 = 0;
        while (true) {
            defaultConstructorMarker = null;
            if (it.hasNext()) {
                float f17 = f14;
                c28655q = c28655q3;
                c2307m = c2307m3;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(composer2, AbstractC1102d.m3413j(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 2 * f17, 0.0f, 2));
                wirFooterText = c11087c.getWirFooterText();
                c23454a0 = C23454a0.f92919a;
                if (wirFooterText == null) {
                    c28655q.m87150e0(270236321);
                    c28655q.m87173q(false);
                    c23454a1 = null;
                    c2307m2 = c2307m;
                } else {
                    c28655q.m87150e0(270236322);
                    wirFooterSubText = c11087c.getWirFooterSubText();
                    if (wirFooterSubText == null) {
                        c28655q.m87150e0(1729547753);
                        c28655q.m87173q(false);
                        c23454a1 = null;
                        c2307m2 = c2307m;
                    } else {
                        c28655q.m87150e0(1729547754);
                        HorizontalAlignElement horizontalAlignElement3 = new HorizontalAlignElement(c2305k);
                        c2307m2 = c2307m;
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(composer2, horizontalAlignElement3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer2, C0217k.f729g, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m6);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N6);
                        int i18 = TextResource.$stable;
                        m29935j(wirFooterText, wirFooterSubText, composer2, i18 | (i18 << 3));
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        c23454a1 = c23454a0;
                    }
                    c28655q.m87173q(false);
                }
                if (c23454a1 == null) {
                    c28655q.m87150e0(270536464);
                    HorizontalAlignElement horizontalAlignElement4 = new HorizontalAlignElement(C2299e.f9112O);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(composer2, horizontalAlignElement4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer2, C0217k.f729g, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N7);
                    m29933h(c11087c.getLegendText(), composer2, TextResource.$stable);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-684019722);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                return c23454a0;
            }
            next = it.next();
            i15 = i14 + 1;
            if (i14 >= 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C11091g c11091g2 = (C11091g) next;
            TextResource title2 = c11091g2.getTitle();
            TextResource value2 = c11091g2.getValue();
            TextResource suffix2 = c11091g2.getSuffix();
            EnumC11092h style2 = c11091g2.getStyle();
            TextResource subtext2 = c11091g2.getSubtext();
            EnumC17727b2 subtextState2 = c11091g2.getSubtextState();
            int i19 = TextResource.$stable;
            AbstractC11086b.m29916d(title2, value2, suffix2, style2, subtext2, subtextState2, composer2, i19 | (i19 << 3) | (i19 << 6) | (i19 << 12));
            if (i14 != c11087c.m29922f().size() - 1) {
                c28655q3.m87150e0(251909946);
                AbstractC22953f.m66715b(composer2, AbstractC1102d.m3419p(2 * f14, c2314t));
                f13 = f14;
                c28655q2 = c28655q3;
                AbstractC17755i2.m50938j(AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(composer2, C38072d.f163054b).getWhite10(), new C17748h(f14, defaultConstructorMarker)), EnumC17744g.DOTTED, null, null, null, 0L, 0L, null, composer, 48, 252);
                composer2 = composer;
                AbstractC22953f.m66715b(composer2, AbstractC1102d.m3419p(3 * f13, c2314t));
                c28655q2.m87173q(false);
            } else {
                f13 = f14;
                c28655q2 = c28655q3;
                c28655q2.m87150e0(252310683);
                c28655q2.m87173q(false);
            }
            c28655q3 = c28655q2;
            f14 = f13;
            i14 = i15;
            c2307m3 = c2307m3;
            c3 = c3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m29932g(C11087c c11087c, boolean z4, int i13, Composer composer, int i14) {
        m29930e(c11087c, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m29933h(TextResource footerText, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        long jM95628d;
        AbstractC22676k.m65750j(footerText, "footerText");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1886394771);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(footerText) : c28655q2.m87157i(footerText) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            float f13 = 4;
            Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(1 * f13));
            if (AbstractC8693b.m21269c(footerText)) {
                c28655q2.m87150e0(-1282117004);
                c28655q2.m87173q(false);
                jM95628d = C17919x.f69636m;
            } else {
                c28655q2.m87150e0(-1282115888);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            }
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, jM95628d, AbstractC17918w0.f69621a);
            float f14 = 8;
            AbstractC22989q.m66760a(AbstractC1102d.m3411h(((float) 4.5d) * f13, AbstractC1102d.m3424u(f14 * f13, modifierM3358c)), c28655q2, 0);
            AbstractC18489d0.m53380u((float) 0.5d, f14, c2314t, c28655q2);
            String strM21274h = AbstractC8693b.m21274h(footerText, c28655q2, (i14 & 14) | TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3428b1(footerText, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m29934i(TextResource textResource, int i13, Composer composer, int i14) {
        m29933h(textResource, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m29935j(TextResource wirFooterText, TextResource wirFooterSubText, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(wirFooterText, "wirFooterText");
        AbstractC22676k.m65750j(wirFooterSubText, "wirFooterSubText");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1228546554);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(wirFooterText) : c28655q2.m87157i(wirFooterText) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(wirFooterSubText) : c28655q2.m87157i(wirFooterSubText) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(wirFooterText, c28655q2, i16 | (i15 & 14));
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a c2886aM8417O = c38072d.m121952e(c28655q2, i17).getT2();
            long brandWhite = c38072d.m121949b(c28655q2, i17).getBrandWhite();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q2, 0, i18, 196602);
            float f13 = 8;
            AbstractC18489d0.m53380u(1, f13, c2314t, c28655q2);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(wirFooterSubText, c28655q2, i16 | ((i15 >> 3) & 14)), null, c38072d.m121949b(c28655q2, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB1(), null, c28655q2, 0, i18, 196602);
            c28655q = c28655q2;
            AbstractC31061c.m95650z(2, f13, c2314t, c28655q, true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0999c(wirFooterText, wirFooterSubText, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m29936k(TextResource textResource, TextResource textResource2, int i13, Composer composer, int i14) {
        m29935j(textResource, textResource2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

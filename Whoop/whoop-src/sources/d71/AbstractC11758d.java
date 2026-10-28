package d71;

import ai1.C0910b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import az0.AbstractC2159b;
import b30.C2663y4;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import d62.C11736b;
import e71.C12800a;
import e71.C12801b;
import gb1.AbstractC15676d;
import gb1.AbstractC15679g;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k91.C22302a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import p91.C29007a;
import qz0.AbstractC30795n;
import u61.C34555d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: d71.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\r\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Le71/a;", "group", "Ll83/a0;", "j", "(Landroidx/compose/ui/Modifier;Le71/a;Landroidx/compose/runtime/Composer;II)V", "", "Le71/b;", "bars", "", "q", "(Ljava/util/List;)F", "r", "barState", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Le71/b;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11758d {
    /* JADX INFO: renamed from: h */
    private static final void m31455h(C12801b c12801b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2132129676);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c12801b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C22302a c22302aM31447a = C11756b.f38029a.m31447a(c12801b);
            float yPercent = c12801b.getYPercent() * (-1.0f);
            float heightPercent = c12801b.getHeightPercent();
            C29007a c29007a = new C29007a(0.5f, 0.0f, false, false, 12, null);
            Modifier modifierM44107d = C2314t.f9131w;
            Modifier modifierM88144e = AbstractC29011e.m88144e(modifierM44107d, 0.5f, yPercent, 1.0f, heightPercent, c29007a);
            if (c12801b.getShowDashedBorder()) {
                c28655q.m87150e0(4286922);
                float f13 = 3;
                modifierM44107d = AbstractC15679g.m44107d(modifierM44107d, 1, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), c22302aM31447a.m64090c(), f13, f13);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(4551662);
                c28655q.m87173q(false);
            }
            Modifier modifierMo3471e = modifierM88144e.mo3471e(modifierM44107d);
            AbstractC18247a background = c12801b.getBackground();
            if (background == null) {
                c28655q.m87150e0(277244569);
                background = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite());
            } else {
                c28655q.m87150e0(277243856);
            }
            c28655q.m87173q(false);
            AbstractC2159b.m6721b(modifierMo3471e, background, c22302aM31447a, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(c12801b, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m31456i(C12801b c12801b, int i13, Composer composer, int i14) {
        m31455h(c12801b, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: j */
    public static final void m31457j(Modifier modifier, C12800a group, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q;
        C2314t c2314t;
        C38072d c38072d;
        long j7;
        Object obj;
        ?? r10;
        C28655q c28655q2;
        Object obj2;
        C28655q c28655q3;
        Object obj3;
        AbstractC22676k.m65750j(group, "group");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(2038263526);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= c28655q4.m87157i(group) ? 32 : 16;
        }
        if (c28655q4.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t2;
            }
            String strM21274h = AbstractC8693b.m21274h(group.getContentDescription(), c28655q4, 0);
            C38072d c38072d2 = C38072d.f163053a;
            long backgroundDarkStd = c38072d2.m121949b(c28655q4, 6).getBackgroundDarkStd();
            if (!group.getUseSolidBackground()) {
                backgroundDarkStd = C17919x.m51541c(0.3f, backgroundDarkStd);
            }
            C34555d topText = group.getTopText();
            Object obj4 = C28635l.f115821a;
            if (topText != null) {
                c28655q4.m87150e0(-338527849);
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC29011e.m88149j(c2314t2, group.getXPercent(), m31464q(group.m35842c()), new C29007a(0.5f, 0.0f, false, false, 12, null)), 0.0f, 0.0f, 0.0f, ((float) 0.75d) * 8, 7);
                boolean labelBackground = group.getTopText().getLabelBackground();
                boolean zM87151f = c28655q4.m87151f(backgroundDarkStd);
                Object objM87133R = c28655q4.m87133R();
                if (zM87151f || objM87133R == obj4) {
                    objM87133R = new C0910b(backgroundDarkStd, 7);
                    c28655q4.m87172p0(objM87133R);
                }
                Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM3398t, labelBackground, (Function1) objM87133R);
                String strM21274h2 = AbstractC8693b.m21274h(group.getTopText().getLabel(), c28655q4, 0);
                long jMo134584toComposableColorWaAFU9c = group.getTopText().getColor().mo134584toComposableColorWaAFU9c(c28655q4, 0);
                C2886a n13 = c38072d2.m121952e(c28655q4, 6).getN8();
                c38072d = c38072d2;
                j7 = backgroundDarkStd;
                c2314t = c2314t2;
                obj = obj4;
                r10 = 0;
                AbstractC30795n.m94707h(strM21274h2, modifierM44099b, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 3, false, 1, 0, null, n13, null, c28655q4, 0, 3120, 185848);
                C28655q c28655q5 = c28655q4;
                c28655q5.m87173q(false);
                c28655q2 = c28655q5;
            } else {
                c2314t = c2314t2;
                c38072d = c38072d2;
                j7 = backgroundDarkStd;
                obj = obj4;
                C28655q c28655q6 = c28655q4;
                r10 = 0;
                c28655q6.m87150e0(-337748292);
                c28655q6.m87173q(false);
                c28655q2 = c28655q6;
            }
            if (group.getBottomText() != null) {
                c28655q2.m87150e0(-337659942);
                float f13 = 8;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC29011e.m88149j(c2314t, group.getXPercent(), m31465r(group.m35842c()), new C29007a(0.5f, -1.0f, false, false, 12, null)), 0.0f, ((float) 0.5d) * f13, 0.0f, ((float) 0.25d) * f13, 5);
                boolean labelBackground2 = group.getBottomText().getLabelBackground();
                boolean zM87151f2 = c28655q2.m87151f(j7);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87151f2) {
                    obj3 = obj;
                } else {
                    obj3 = obj;
                    if (objM87133R2 == obj3) {
                    }
                    C28655q c28655q7 = c28655q2;
                    obj2 = obj3;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(group.getBottomText().getLabel(), c28655q2, r10), AbstractC15676d.m44099b(modifierM3398t2, labelBackground2, (Function1) objM87133R2), group.getBottomText().getColor().mo134584toComposableColorWaAFU9c(c28655q2, r10), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 3, false, 1, 0, null, c38072d.m121952e(c28655q2, 6).getN8(), null, c28655q7, 0, 3120, 185848);
                    C28655q c28655q8 = c28655q7;
                    c28655q8.m87173q(r10);
                    c28655q3 = c28655q8;
                }
                objM87133R2 = new C0910b(j7, 8);
                c28655q2.m87172p0(objM87133R2);
                C28655q c28655q9 = c28655q2;
                obj2 = obj3;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(group.getBottomText().getLabel(), c28655q2, r10), AbstractC15676d.m44099b(modifierM3398t2, labelBackground2, (Function1) objM87133R2), group.getBottomText().getColor().mo134584toComposableColorWaAFU9c(c28655q2, r10), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 3, false, 1, 0, null, c38072d.m121952e(c28655q2, 6).getN8(), null, c28655q9, 0, 3120, 185848);
                C28655q c28655q10 = c28655q9;
                c28655q10.m87173q(r10);
                c28655q3 = c28655q10;
            } else {
                obj2 = obj;
                c28655q2.m87150e0(-336852516);
                c28655q2.m87173q(r10);
                c28655q3 = c28655q2;
            }
            float xPercent = group.getXPercent();
            Float widthPercentOverride = group.getWidthPercentOverride();
            Modifier modifierM88144e = AbstractC29011e.m88144e(c2314t, xPercent, 0.0f, widthPercentOverride != null ? widthPercentOverride.floatValue() : group.getWidthPercent(), 1.0f, new C29007a(0.5f, 0.0f, false, false, 12, null));
            boolean zM87153g = c28655q3.m87153g(strM21274h);
            Object objM87133R3 = c28655q3.m87133R();
            if (zM87153g || objM87133R3 == obj2) {
                objM87133R3 = new C2663y4(strM21274h, 13);
                c28655q3.m87172p0(objM87133R3);
            }
            Modifier modifier4 = modifier2;
            Modifier modifierMo3471e = AbstractC18032n.m51775c(modifierM88144e, true, (Function1) objM87133R3).mo3471e(modifier4);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9104G, r10);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            c28655q3.m87150e0(1882624247);
            Iterator<T> it = group.m35842c().iterator();
            while (it.hasNext()) {
                m31455h((C12801b) it.next(), c28655q3, r10);
            }
            c28655q3.m87173q(r10);
            c28655q3.m87173q(true);
            modifier3 = modifier4;
            c28655q = c28655q3;
        } else {
            C28655q c28655q11 = c28655q4;
            c28655q11.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q11;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(modifier3, i13, group, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Modifier m31458k(long j7, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1125a.m3478a(C2314t.f9131w, new C0910b(j7, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m31459l(long j7, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63374D(drawBehind, j7, 0L, 0L, (((long) Float.floatToRawIntBits(6.0f)) << 32) | (((long) Float.floatToRawIntBits(6.0f)) & 4294967295L), null, 0.0f, 246);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Modifier m31460m(long j7, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1125a.m3478a(C2314t.f9131w, new C0910b(j7, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m31461n(long j7, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63374D(drawBehind, j7, 0L, 0L, (((long) Float.floatToRawIntBits(6.0f)) << 32) | (((long) Float.floatToRawIntBits(6.0f)) & 4294967295L), null, 0.0f, 246);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m31462o(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m31463p(Modifier modifier, C12800a c12800a, int i13, int i14, Composer composer, int i15) {
        m31457j(modifier, c12800a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final float m31464q(List<C12801b> list) {
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        C12801b c12801b = (C12801b) it.next();
        double heightPercent = ((double) c12801b.getHeightPercent()) + ((double) c12801b.getYPercent());
        while (it.hasNext()) {
            C12801b c12801b2 = (C12801b) it.next();
            heightPercent = Math.max(heightPercent, ((double) c12801b2.getHeightPercent()) + ((double) c12801b2.getYPercent()));
        }
        return ((float) heightPercent) * (-1);
    }

    /* JADX INFO: renamed from: r */
    private static final float m31465r(List<C12801b> list) {
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float yPercent = ((C12801b) it.next()).getYPercent();
        while (it.hasNext()) {
            yPercent = Math.min(yPercent, ((C12801b) it.next()).getYPercent());
        }
        return yPercent * (-1);
    }
}

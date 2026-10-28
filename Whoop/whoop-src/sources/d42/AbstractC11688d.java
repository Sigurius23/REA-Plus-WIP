package d42;

import a31.C0343e;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c42.C4170g;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.model.FeatureEducationImage;
import com.whoop.design.model.FeatureEducationParagraph;
import com.whoop.design.model.FeatureEducationSentence;
import gy0.AbstractC16277f;
import l83.C23454a0;
import mh.C25540h;
import mh.C25542j;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11894a;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p555vl.AbstractC36095b;
import p635y2.C39077b1;
import p635y2.C39102j;
import p701ce2.C4494b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: d42.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lc42/g;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onBackPressed", "c", "(Lc42/g;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "pregnancy_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11688d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX INFO: renamed from: c */
    public static final void m31176c(C4170g viewState, InterfaceC4339a onBackPressed, Composer composer, int i13) {
        C28655q c28655q;
        Object obj;
        ?? r10;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1236365680);
        int i14 = (i13 & 6) == 0 ? i13 | (c28655q2.m87157i(viewState) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onBackPressed) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC36095b.m114675c(c2314t, 1.0f), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM92116f0);
            InterfaceC0221l.f734a.getClass();
            char c3 = 18;
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            AbstractC6721d.a aVar = new AbstractC6721d.a(viewState.getNavBarTitle(), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                obj = objM87133R;
                Object c0343e = new C0343e(onBackPressed, 21);
                c28655q2.m87172p0(c0343e);
                obj = c0343e;
            }
            obj = objM87133R;
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) obj, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 2 * f13, 0.0f, 3 * f13, 5);
            C2314t c2314t2 = c2314t;
            boolean z13 = 0;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            c28655q2.m87150e0(-380244980);
            C28655q c28655q3 = c28655q2;
            for (FeatureEducationParagraph featureEducationParagraph : viewState.m13045b()) {
                FeatureEducationImage image = featureEducationParagraph.getImage();
                if (image == null) {
                    c28655q3.m87150e0(2113724952);
                    c28655q3.m87173q(z13);
                    r10 = z13;
                } else {
                    c28655q3.m87150e0(2113724953);
                    C25540h c25540h = new C25540h((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b));
                    c25540h.f100079c = image.getUrl();
                    C25542j c25542jM75117a = c25540h.m75117a();
                    float f14 = 4;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3397s(c2314t2, ((float) featureEducationParagraph.getInsets().getLeading()) * f14, ((float) featureEducationParagraph.getInsets().getTop()) * f14, ((float) featureEducationParagraph.getInsets().getTrailing()) * f14, ((float) featureEducationParagraph.getInsets().getBottom()) * f14));
                    C39077b1 c39077b1 = C39102j.f168202d;
                    boolean z14 = z13 ? 1 : 0;
                    AbstractC11894a.m31954c(c25542jM75117a, null, modifierM3409f, null, c39077b1, 0.0f, c28655q3, 1572912, 952);
                    c28655q3.m87173q(z14);
                    r10 = z14;
                }
                c28655q3.m87150e0(-380218148);
                C28655q c28655q4 = c28655q3;
                char c7 = c3;
                for (FeatureEducationSentence featureEducationSentence : featureEducationParagraph.getSentences()) {
                    float f15 = 4;
                    C28655q c28655q5 = c28655q4;
                    AbstractC30795n.m94707h(featureEducationSentence.getText(), AbstractC1099a.m3397s(c2314t2, ((float) featureEducationParagraph.getInsets().getLeading()) * f15, ((float) featureEducationParagraph.getInsets().getTop()) * f15, ((float) featureEducationParagraph.getInsets().getTrailing()) * f15, ((float) featureEducationParagraph.getInsets().getBottom()) * f15), featureEducationSentence.getStyle().getColor().mo134584toComposableColorWaAFU9c(c28655q4, r10), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, featureEducationSentence.getStyle().getName(), null, c28655q5, 0, C2886a.f11498d << 18, 196600);
                    c28655q4 = c28655q5;
                    c2314t2 = c2314t2;
                    c7 = c7;
                }
                c28655q4.m87173q(r10);
                z13 = r10;
                c28655q3 = c28655q4;
                c3 = c7;
            }
            AbstractC25012a.m73392y(c28655q3, z13, true, true);
            c28655q = c28655q3;
        } else {
            c28655q2.m87138X();
            c28655q = c28655q2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(viewState, onBackPressed, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m31177d(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m31178e(C4170g c4170g, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m31176c(c4170g, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

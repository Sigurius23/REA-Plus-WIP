package pj2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.model.FeatureEducationImage;
import com.whoop.design.model.FeatureEducationParagraph;
import com.whoop.design.model.FeatureEducationSentence;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.InterfaceC23459e;
import mh.C25540h;
import nj2.C26769p;
import nx1.C27225g;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p132f0.C13821r1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p395p6.C28884h1;
import p635y2.C39077b1;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28329e;
import p90.C29000h;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import ue1.AbstractC34860c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: pj2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lnj2/p;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "scrollDepthAnalyticsEvent", "Lkotlin/Function0;", "onBackPressed", "e", "(Lnj2/p;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "stress_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29304c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX INFO: renamed from: e */
    public static final void m88955e(C26769p viewState, Function1 scrollDepthAnalyticsEvent, InterfaceC4339a onBackPressed, Composer composer, int i13) {
        C28655q c28655q;
        Object obj;
        Object obj2;
        C28655q c28655q2;
        ?? r10;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(scrollDepthAnalyticsEvent, "scrollDepthAnalyticsEvent");
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1152080636);
        int i14 = (i13 & 6) == 0 ? (c28655q3.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87157i(scrollDepthAnalyticsEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q3.m87157i(onBackPressed) ? 256 : 128;
        }
        if (c28655q3.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q3, 1);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q3.m87133R();
            Object obj3 = C28635l.f115821a;
            Object obj4 = objM87133R;
            if (z4 || objM87133R == obj3) {
                Object c29000h = new C29000h(scrollDepthAnalyticsEvent, 1);
                c28655q3.m87172p0(c29000h);
                obj4 = c29000h;
            }
            AbstractC34860c.m109947c(c13821r1M92099U, (Function1) obj4, c28655q3, 0);
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(AbstractC22953f.m66724m(AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)))), c13821r1M92099U, 14), 1 * f13, 0.0f, 2);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
            AbstractC6721d.a aVar = new AbstractC6721d.a(viewState.getEducation().getNavBarTitle(), null, AbstractC38963t7.m124375e(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q3, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            boolean z13 = (i14 & 896) == 256;
            Object objM87133R2 = c28655q3.m87133R();
            Object obj5 = objM87133R2;
            if (z13 || objM87133R2 == obj3) {
                Object c28329e = new C28329e(onBackPressed, 5);
                c28655q3.m87172p0(c28329e);
                obj5 = c28329e;
            }
            Object obj6 = obj3;
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) obj5, null, null, c28655q3, AbstractC6721d.a.f25641r << 3, 53);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 2 * f13, 0.0f, 3 * f13, 5);
            C2314t c2314t2 = c2314t;
            boolean z14 = 0;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3398t);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
            c28655q3.m87150e0(-1563673526);
            C28655q c28655q4 = c28655q3;
            for (FeatureEducationParagraph featureEducationParagraph : viewState.getEducation().m79640b()) {
                FeatureEducationImage image = featureEducationParagraph.getImage();
                if (image == null) {
                    c28655q4.m87150e0(-904546448);
                    c28655q4.m87173q(z14);
                    r10 = z14;
                    obj = obj6;
                    c28655q2 = c28655q4;
                } else {
                    c28655q4.m87150e0(-904546447);
                    float f14 = 4;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3397s(c2314t2, ((float) featureEducationParagraph.getInsets().getLeading()) * f14, ((float) featureEducationParagraph.getInsets().getTop()) * f14, ((float) featureEducationParagraph.getInsets().getTrailing()) * f14, ((float) featureEducationParagraph.getInsets().getBottom()) * f14));
                    AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(image.getUrl());
                    Object objM87133R3 = c28655q4.m87133R();
                    obj = obj6;
                    if (objM87133R3 == obj) {
                        obj2 = objM87133R3;
                        Object c28884h1 = new C28884h1(23);
                        c28655q4.m87172p0(c28884h1);
                        obj2 = c28884h1;
                    }
                    obj2 = objM87133R3;
                    AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403oM64503l, null, (Function1) obj2, c28655q4, AbstractC22403o.f87638a | 384, 1);
                    C39077b1 c39077b1 = C39102j.f168199a;
                    C28655q c28655q5 = c28655q4;
                    boolean z15 = z14 ? 1 : 0;
                    AbstractC29125c.m88522c(abstractC26165aM64500i, null, modifierM3409f, null, c39077b1, 0.0f, null, c28655q5, 24624, 104);
                    C28655q c28655q6 = c28655q5;
                    c28655q6.m87173q(z15);
                    r10 = z15;
                    c28655q2 = c28655q6;
                }
                c28655q2.m87150e0(-1563646136);
                C28655q c28655q7 = c28655q2;
                for (FeatureEducationSentence featureEducationSentence : featureEducationParagraph.getSentences()) {
                    float f15 = 4;
                    C28655q c28655q8 = c28655q7;
                    AbstractC30795n.m94707h(featureEducationSentence.getText(), AbstractC1099a.m3397s(c2314t2, ((float) featureEducationParagraph.getInsets().getLeading()) * f15, ((float) featureEducationParagraph.getInsets().getTop()) * f15, ((float) featureEducationParagraph.getInsets().getTrailing()) * f15, ((float) featureEducationParagraph.getInsets().getBottom()) * f15), featureEducationSentence.getStyle().getColor().mo134584toComposableColorWaAFU9c(c28655q7, r10), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, featureEducationSentence.getStyle().getName(), null, c28655q8, 0, C2886a.f11498d << 18, 196600);
                    c28655q7 = c28655q8;
                    obj = obj;
                }
                obj6 = obj;
                c28655q7.m87173q(r10);
                c2314t2 = c2314t2;
                z14 = r10;
                c28655q4 = c28655q7;
            }
            AbstractC25012a.m73392y(c28655q4, z14, true, true);
            c28655q = c28655q4;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g((Object) viewState, scrollDepthAnalyticsEvent, (InterfaceC23459e) onBackPressed, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m88956f(Function1 function1, int i13) {
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m88957g(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m88958h(C25540h rememberImagePainter) {
        AbstractC22676k.m65750j(rememberImagePainter, "$this$rememberImagePainter");
        rememberImagePainter.f100094r = Integer.valueOf(C38072d.f163053a.m121951d().getLogo().getWhoopRounded());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m88959i(C26769p c26769p, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m88955e(c26769p, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

package rq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bm0.C3412o;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.yearinreview.HighlightedText;
import gz2.C16334a;
import hb3.AbstractC17104a0;
import java.util.List;
import jr2.AbstractC21904c;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kq2.AbstractC22776b;
import l83.C23454a0;
import l83.C23465k;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C23010x;
import p291l0.C23016z;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.AbstractC24669a;
import p718lz1.C24823a;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import ri2.C31469a;
import rm2.C31604d;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import yp2.AbstractC39706c;

/* JADX INFO: renamed from: rq2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lrq2/f;", "viewState", "", "isCurrentStep", "Ll83/a0;", "g", "(Lrq2/f;ZLandroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "image", "Landroidx/compose/ui/Modifier;", "modifier", "n", "(Lkd1/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;", "text", "l", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31729i {
    /* JADX INFO: renamed from: g */
    public static final void m98460g(C31723f viewState, boolean z4, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-698336580);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC24669a.m72061e(z4, AbstractC37817c.m121344e(891262834, c28655q, new C24823a(viewState, 19)), c28655q, ((i14 >> 3) & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31727h(viewState, z4, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m98461h(C31723f c31723f, InterfaceC3747i0 BasicAnimationComponent, Composer composer, int i13) {
        C28655q c28655q;
        boolean z4;
        C23016z c23016z;
        boolean z13;
        C23454a0 c23454a0;
        C23016z c23016z2;
        AbstractC22676k.m65750j(BasicAnimationComponent, "$this$BasicAnimationComponent");
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 8 * ((float) 6.5d), 0.0f, 0.0f, 13);
        C22949e c22949e = AbstractC22977m.f90650a;
        float f13 = 4;
        C22971k c22971kM66748k = AbstractC22977m.m66748k(3 * f13, C2299e.f9109L);
        C2305k c2305k = C2299e.f9110M;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66748k, c2305k, composer, 6);
        C28655q c28655q2 = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q2.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3398t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q2.f115906a;
        c28655q2.m87158i0();
        if (c28655q2.f115903S) {
            c28655q2.m87163l(c0213j);
        } else {
            c28655q2.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        InterfaceC35689r0 interfaceC35689r0M98444i = c31723f.getLottieWrapper();
        C23454a0 c23454a1 = C23454a0.f92919a;
        C23454a0 c23454a2 = null;
        C23016z c23016z3 = C23016z.f90757a;
        if (interfaceC35689r0M98444i == null) {
            c28655q2.m87150e0(-1060092123);
            c28655q2.m87173q(false);
            z13 = false;
            c23016z = c23016z3;
            c23454a0 = null;
            c28655q = c28655q2;
            z4 = true;
        } else {
            c28655q2.m87150e0(-1060092122);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c23016z3.m66779c(c2314t, true, 1.0f));
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C31469a(18);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C31604d(9);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q = c28655q2;
            z4 = true;
            c23016z = c23016z3;
            z13 = false;
            AbstractC35684p.m113047h(modifierM3407d, interfaceC35689r0M98444i, false, 0.0f, 1, interfaceC4339a, (Function1) objM87133R2, C39102j.f168200b, null, composer, 14376960, 268);
            c28655q.m87173q(false);
            c23454a0 = c23454a1;
        }
        if (c23454a0 == null) {
            c28655q.m87150e0(-1059692966);
            c23016z2 = c23016z;
            m98467n(c31723f.getImage(), AbstractC1102d.m3407d(1.0f, c23016z2.m66779c(c2314t, z4, 1.0f)), composer, AbstractC22403o.f87638a, z13 ? 1 : 0);
            c28655q.m87173q(z13);
        } else {
            c23016z2 = c23016z;
            c28655q.m87150e0(104350265);
            c28655q.m87173q(z13);
        }
        if (c31723f.getFooterText() == null) {
            c28655q.m87150e0(-1059431327);
            c28655q.m87173q(z13);
        } else {
            c28655q.m87150e0(-1059431326);
            Modifier modifierM66778b = c23016z2.m66778b(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 5 * f13, 0.0f, 2), c2305k);
            TextResource textResourceM98441f = c31723f.getFooterText();
            TextResource textResourceM98440e = c31723f.getFooterSubText();
            int i14 = TextResource.$stable;
            AbstractC22776b.m65990b(modifierM66778b, textResourceM98441f, textResourceM98440e, composer, (i14 << 6) | (i14 << 3));
            c28655q.m87173q(z13);
            c23454a2 = c23454a1;
        }
        if (c23454a2 == null) {
            c28655q.m87150e0(-1059050584);
            m98465l(c31723f.m98445j(), composer, z13 ? 1 : 0);
            if (c31723f.m98442g().isEmpty()) {
                c28655q.m87150e0(-68453221);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(-68782441);
                List<C23465k> listM62320h = AbstractC21904c.m62320h(c31723f.m98442g());
                C38072d c38072d = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                C2886a c2886aM8420a = c38072d.m121952e(composer, i15).getB1();
                long jM125382b1 = c38072d.m121949b(composer, i15).getWhite50();
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 5 * f13, 0.0f, 2);
                int i16 = C2886a.f11498d << 21;
                Object[] objArr = z13 ? 1 : 0;
                AbstractC30795n.m94704e(listM62320h, modifierM3396r, jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c2886aM8420a, composer, 48, i16, 131064);
                c28655q = c28655q;
                z13 = false;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
        } else {
            c28655q.m87150e0(104371948);
            c28655q.m87173q(z13);
        }
        c28655q.m87173q(true);
        return c23454a1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m98462i() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m98463j(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m98464k(C31723f c31723f, boolean z4, int i13, Composer composer, int i14) {
        m98460g(c31723f, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m98465l(List<HighlightedText> text, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-196502340);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(text) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            List<C23465k> listM62321i = AbstractC21904c.m62321i(text);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94704e(listM62321i, AbstractC1099a.m3396r(C2314t.f9131w, 5 * 4, 0.0f, 2), c38072d.m121949b(c28655q2, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(c28655q2, i15).getT1(), c28655q, 48, C2886a.f11498d << 21, 131064);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(text, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m98466m(List list, int i13, Composer composer, int i14) {
        m98465l(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m98467n(AbstractC22403o image, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(image, "image");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(26080812);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(image) : c28655q.m87157i(image) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q, AbstractC22403o.f87638a | (i15 & 14), 3), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170919l), null, null, null, 0.0f, null, c28655q, 0, 124);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16334a(image, modifier2, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m98468o(AbstractC22403o abstractC22403o, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m98467n(abstractC22403o, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

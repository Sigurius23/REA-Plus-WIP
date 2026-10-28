package d62;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aw0.C2108h;
import b91.C2886a;
import bm0.C3412o;
import c41.C4007d1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ci0.C4726a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.C9813i;
import com.whoop.profile.view.edit.preview.C9809a;
import cu2.C11132l;
import d11.C11473h;
import d30.C11546l;
import e62.AbstractC12771a;
import gy0.AbstractC16276e;
import gz0.EnumC16313m0;
import hy0.AbstractC17808z1;
import hy0.C17731c2;
import hy0.EnumC17727b2;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39140v1;
import p636y3.C39169a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: d62.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ld62/i;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "x", "(Landroidx/compose/ui/Modifier;Ld62/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lgz0/m0;", "icon", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "showArrow", "r", "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;II)V", "t", "(Landroidx/compose/runtime/Composer;I)V", "", "Lhy0/c2;", "items", "F", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "recovery-impacts-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11741g {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m31392A(int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            EnumC16313m0 enumC16313m0 = EnumC16313m0.ADVICE;
            TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, i13));
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC12771a.f43702c));
            int i15 = TextResource.$stable;
            m31421r(enumC16313m0, textResourceM21278l, textResourceM21278l2, false, c28655q, (i15 << 3) | 6 | (i15 << 6), 8);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m31393B(int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m31421r(EnumC16313m0.ADVICE, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, i13)), null, true, c28655q, (TextResource.$stable << 3) | 3078, 4);
            m31423t(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m31394C(Function1 function1, C11742h c11742h) {
        function1.invoke(c11742h.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m31395D(C11742h c11742h, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (c11742h.m31434e().isEmpty()) {
                c28655q.m87150e0(-721591626);
                EnumC16313m0 enumC16313m0M31432c = c11742h.getIcon();
                TextResource textResourceM31435f = c11742h.getTitle();
                TextResource textResourceM31433d = c11742h.getSubtitle();
                int i14 = TextResource.$stable;
                m31421r(enumC16313m0M31432c, textResourceM31435f, textResourceM31433d, false, c28655q, (i14 << 3) | (i14 << 6), 8);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-721322019);
                EnumC16313m0 enumC16313m0M31432c2 = c11742h.getIcon();
                TextResource textResourceM31435f2 = c11742h.getTitle();
                int i15 = TextResource.$stable;
                m31421r(enumC16313m0M31432c2, textResourceM31435f2, null, false, c28655q, i15 << 3, 12);
                if (AbstractC8693b.m21270d(c11742h.getDescription())) {
                    c28655q.m87150e0(-721106662);
                    float f14 = 4;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14 * f14, c2314t));
                    String strM21274h = AbstractC8693b.m21274h(c11742h.getDescription(), c28655q, i15);
                    C38072d c38072d = C38072d.f163053a;
                    int i16 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-720750131);
                    c28655q.m87173q(false);
                }
                if (c11742h.m31434e().isEmpty()) {
                    c28655q.m87150e0(-720528915);
                    c28655q.m87173q(false);
                } else {
                    AbstractC31061c.m95623C(c28655q, -720689402, c2314t, f13, c28655q);
                    m31397F(c11742h.m31434e(), c28655q, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m31396E(Modifier modifier, AbstractC11743i abstractC11743i, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m31427x(modifier, abstractC11743i, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final void m31397F(List<C17731c2> list, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(947081608);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(list);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C11739e(list, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC39125q1.m124656b(null, (InterfaceC4351m) objM87133R, c28655q, 0, 1);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(list, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final InterfaceC39130s0 m31398G(List list, InterfaceC39140v1 SubcomposeLayout, C39169a c39169a) {
        Integer num;
        AbstractC22676k.m65750j(SubcomposeLayout, "$this$SubcomposeLayout");
        float f13 = 1 * 8;
        int iMo724F = SubcomposeLayout.mo724F(f13);
        int iMo724F2 = SubcomposeLayout.mo724F(f13);
        long j7 = c39169a.f168407a;
        int iM124765i = C39169a.m124765i(j7);
        List<C17731c2> list2 = list;
        ArrayList<AbstractC39104j1> arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (C17731c2 c17731c2 : list2) {
            arrayList.add(((InterfaceC39124q0) AbstractC25265s.m74096F0(SubcomposeLayout.mo124616s0("item-" + c17731c2.getText(), new C37816b(new C4726a(c17731c2, 16), true, -1212341743)))).mo448T(j7));
        }
        AbstractC39104j1 abstractC39104j1Mo448T = ((InterfaceC39124q0) AbstractC25265s.m74096F0(SubcomposeLayout.mo124616s0("overflow", new C37816b(new C11739e(list, 0), true, 1591756333)))).mo448T(j7);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i13 = 0;
        for (AbstractC39104j1 abstractC39104j1 : arrayList) {
            int i14 = arrayList3.isEmpty() ? 0 : iMo724F;
            if (abstractC39104j1.f168211w + i13 + (arrayList2.isEmpty() ? 0 : abstractC39104j1Mo448T.f168211w) + i14 > iM124765i) {
                arrayList2.add(arrayList3);
                arrayList3 = AbstractC37056f.m118964P(abstractC39104j1);
                i13 = abstractC39104j1.f168211w;
                if (arrayList2.size() == 2) {
                    break;
                }
            } else {
                arrayList3.add(abstractC39104j1);
                i13 += abstractC39104j1.f168211w + i14;
            }
        }
        if (arrayList2.size() < 2 && !arrayList3.isEmpty()) {
            arrayList2.add(arrayList3);
        }
        int size = list.size() - AbstractC25267u.m74164j0(arrayList2).size();
        if (size > 0 && arrayList2.size() == 2) {
            List list3 = (List) arrayList2.get(1);
            Iterator it = list3.iterator();
            int i15 = 0;
            while (it.hasNext()) {
                i15 += ((AbstractC39104j1) it.next()).f168211w;
            }
            for (int size2 = ((list3.size() - 1) * iMo724F) + i15; !list3.isEmpty() && size2 + iMo724F + abstractC39104j1Mo448T.f168211w > iM124765i; size2 -= ((AbstractC39104j1) list3.remove(AbstractC37056f.m118951C(list3))).f168211w + iMo724F) {
            }
            list3.add(((InterfaceC39124q0) AbstractC25265s.m74096F0(SubcomposeLayout.mo124616s0("actual-overflow", new C37816b(new C9809a(size, 12), true, -1282493664)))).mo448T(j7));
        }
        Iterator it3 = arrayList2.iterator();
        int iIntValue = 0;
        while (it3.hasNext()) {
            Iterator it4 = ((List) it3.next()).iterator();
            if (it4.hasNext()) {
                Integer numValueOf = Integer.valueOf(((AbstractC39104j1) it4.next()).f168212x);
                while (it4.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((AbstractC39104j1) it4.next()).f168212x);
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            iIntValue += num != null ? num.intValue() : 0;
        }
        return SubcomposeLayout.mo86822W(iM124765i, ((arrayList2.size() - 1) * iMo724F2) + iIntValue, C25272z.f99163w, new C11740f(arrayList2, iMo724F2, iMo724F, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m31399H(C17731c2 c17731c2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 4;
            float f14 = ((float) 2.5d) * f13;
            float f15 = 1 * 8;
            AbstractC17808z1.m51177e(c17731c2.getText(), c17731c2.getIncludeBackground(), c17731c2.getTrendTypeState(), false, c17731c2.getIcon(), 2 * f13, null, false, 3 * f13, new C22976l1(f14, f15, f14, f15), !c17731c2.getIncludeBackground(), c17731c2.getOverflow(), 1, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB2(), null, c28655q, TextResource.$stable | 906166272, (C2886a.f11498d << 9) | 384, 16584);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m31400I(List list, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 4;
            float f14 = ((float) 2.5d) * f13;
            float f15 = 1 * 8;
            AbstractC17808z1.m51177e(AbstractC8693b.m21278l(AbstractC30060g.m92102X(AbstractC12771a.f43701b, new Object[]{Integer.valueOf(list.size())}, c28655q)), true, EnumC17727b2.NO_CHANGE, false, null, 2 * f13, null, false, 0.0f, new C22976l1(f14, f15, f14, f15), false, 2, 0, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB2(), null, c28655q, TextResource.$stable | 818086320, (C2886a.f11498d << 9) | 48, 21848);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m31401J(int i13, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 4;
            float f14 = ((float) 2.5d) * f13;
            float f15 = 1 * 8;
            AbstractC17808z1.m51177e(AbstractC8693b.m21278l(AbstractC30060g.m92102X(AbstractC12771a.f43701b, new Object[]{Integer.valueOf(i13)}, c28655q)), true, EnumC17727b2.NEUTRAL_CONCERN, false, null, 2 * f13, null, false, 0.0f, new C22976l1(f14, f15, f14, f15), false, 2, 1, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB2(), null, c28655q, TextResource.$stable | 818086320, (C2886a.f11498d << 9) | 432, 17752);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m31402K(List list, int i13, int i14, AbstractC39101i1 layout) {
        Integer num;
        AbstractC22676k.m65750j(layout, "$this$layout");
        Iterator it = list.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            List<AbstractC39104j1> list2 = (List) it.next();
            Iterator it3 = list2.iterator();
            if (it3.hasNext()) {
                Integer numValueOf = Integer.valueOf(((AbstractC39104j1) it3.next()).f168212x);
                while (it3.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((AbstractC39104j1) it3.next()).f168212x);
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            int iIntValue = num != null ? num.intValue() : 0;
            int i16 = 0;
            for (AbstractC39104j1 abstractC39104j1 : list2) {
                AbstractC39101i1.m124624n(abstractC39104j1, i16, i15, layout);
                i16 += abstractC39104j1.f168211w + i14;
            }
            i15 += iIntValue + i13;
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m31403L(List list, int i13, Composer composer, int i14) {
        m31397F(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0298  */
    /* JADX WARN: Code duplicated, block: B:103:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:104:0x02db  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:109:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d A[PHI: r0 r1
      0x009d: PHI (r0v17 com.whoop.design.util.TextResource) = 
      (r0v2 com.whoop.design.util.TextResource)
      (r0v0 com.whoop.design.util.TextResource)
      (r0v0 com.whoop.design.util.TextResource)
     binds: [B:61:0x00aa, B:55:0x0099, B:56:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r1v26 int) = (r1v9 int), (r1v7 int), (r1v28 int) binds: [B:61:0x00aa, B:55:0x0099, B:56:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:71:0x0106  */
    /* JADX WARN: Code duplicated, block: B:74:0x0119  */
    /* JADX WARN: Code duplicated, block: B:75:0x011b  */
    /* JADX WARN: Code duplicated, block: B:77:0x011e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0148  */
    /* JADX WARN: Code duplicated, block: B:81:0x014c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0159  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:95:0x01db  */
    /* JADX WARN: Code duplicated, block: B:98:0x024b  */
    /* JADX INFO: renamed from: r */
    private static final void m31421r(EnumC16313m0 enumC16313m0, TextResource textResource, TextResource textResource2, boolean z4, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        boolean z13;
        boolean z14;
        TextResource textResource3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        int i16;
        boolean z16;
        C2314t c2314t;
        int i17;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        TextResource textResource4;
        boolean z17;
        boolean z18;
        int iHashCode2;
        C38072d c38072d;
        int i18;
        float f13;
        int iHashCode3;
        int i19;
        int i24;
        int i25;
        TextResource textResourceM21267a = textResource2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1262557637);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87149e(enumC16313m0.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) != 0) {
                i25 = 128;
            } else {
                if ((i13 & 512) == 0 ? c28655q.m87153g(textResourceM21267a) : c28655q.m87157i(textResourceM21267a)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
            }
            i15 |= i25;
        }
        int i26 = i14 & 8;
        if (i26 == 0) {
            if ((i13 & 3072) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0 || c28655q.m87118C()) {
                    if ((i14 & 4) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i15 &= -897;
                    }
                    if (i26 != 0) {
                        i16 = i15;
                        z16 = true;
                    }
                    c28655q.m87175r();
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22961h c22961h = AbstractC22977m.f90656g;
                    C2306l c2306l = C2299e.f9108K;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
                    i17 = i16;
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
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    textResource4 = textResourceM21267a;
                    z17 = z16;
                    if (1.0f > 0.0d) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (!z18) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, 8, c2306l, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M53376q);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6);
                    c38072d = C38072d.f163053a;
                    i18 = C38072d.f163054b;
                    float f14 = 4;
                    f13 = f14 * f14;
                    AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1102d.m3419p(f13, c2314t), c38072d.m121949b(c28655q, i18).getWhite50(), c28655q, 432, 0);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    i19 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, ((i17 >> 3) & 14) | i19);
                    C2886a c2886aM8414L = c38072d.m121952e(c28655q, i18).getSh4();
                    long jM125430y = c38072d.m121949b(c28655q, i18).getBrandWhite();
                    i24 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q, 0, i24, 196602);
                    c28655q = c28655q;
                    if (AbstractC8693b.m21270d(textResource4)) {
                        c28655q.m87150e0(77127092);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource4, c28655q, i19 | ((i17 >> 6) & 14)), null, c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB2(), null, c28655q, 0, i24, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(77340031);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (z17) {
                        c28655q.m87150e0(-2061373171);
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 6), null, AbstractC1102d.m3419p(f13, c2314t), c38072d.m121949b(c28655q, i18).getWhite30(), c28655q, 432, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-2061105703);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    textResource3 = textResource4;
                    z15 = z17;
                } else {
                    c28655q.m87138X();
                    if ((i14 & 4) != 0) {
                        i15 &= -897;
                    }
                }
                i16 = i15;
                z16 = z13;
                c28655q.m87175r();
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22961h c22961h2 = AbstractC22977m.f90656g;
                C2306l c2306l2 = C2299e.f9108K;
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22961h2, c2306l2, c28655q, 54);
                i17 = i16;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
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
                textResource4 = textResourceM21267a;
                z17 = z16;
                if (1.0f > 0.0d) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (!z18) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q(1, 8, c2306l2, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M53376q2);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6);
                c38072d = C38072d.f163053a;
                i18 = C38072d.f163054b;
                float f15 = 4;
                f13 = f15 * f15;
                AbstractC15005f3.m43108b(c27430eM107874S2, null, AbstractC1102d.m3419p(f13, c2314t), c38072d.m121949b(c28655q, i18).getWhite50(), c28655q, 432, 0);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
                i19 = TextResource.$stable;
                String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q, ((i17 >> 3) & 14) | i19);
                C2886a c2886aM8414L2 = c38072d.m121952e(c28655q, i18).getSh4();
                long jM125430y2 = c38072d.m121949b(c28655q, i18).getBrandWhite();
                i24 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L2, null, c28655q, 0, i24, 196602);
                c28655q = c28655q;
                if (AbstractC8693b.m21270d(textResource4)) {
                    c28655q.m87150e0(77127092);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource4, c28655q, i19 | ((i17 >> 6) & 14)), null, c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB2(), null, c28655q, 0, i24, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(77340031);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (z17) {
                    c28655q.m87150e0(-2061373171);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 6), null, AbstractC1102d.m3419p(f13, c2314t), c38072d.m121949b(c28655q, i18).getWhite30(), c28655q, 432, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2061105703);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                textResource3 = textResource4;
                z15 = z17;
            } else {
                c28655q.m87138X();
                textResource3 = textResourceM21267a;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(enumC16313m0, textResource, textResource3, z15, i13, i14, 5);
            }
        }
        i15 |= 3072;
        z13 = z4;
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if ((i14 & 4) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -897;
                }
                if (i26 != 0) {
                    i16 = i15;
                    z16 = true;
                } else {
                    i16 = i15;
                    z16 = z13;
                }
            } else {
                if ((i14 & 4) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i15 &= -897;
                }
                if (i26 != 0) {
                    i16 = i15;
                    z16 = true;
                } else {
                    i16 = i15;
                    z16 = z13;
                }
            }
            c28655q.m87175r();
            c2314t = C2314t.f9131w;
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22961h c22961h3 = AbstractC22977m.f90656g;
            C2306l c2306l3 = C2299e.f9108K;
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22961h3, c2306l3, c28655q, 54);
            i17 = i16;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i8 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a3);
            C0209i c0209i9 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i10 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N7);
            textResource4 = textResourceM21267a;
            z17 = z16;
            if (1.0f > 0.0d) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z18) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
            C22994r1 c22994r1M53376q3 = AbstractC18489d0.m53376q(1, 8, c2306l3, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M53376q3);
            AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N8);
            C27430e c27430eM107874S3 = AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6);
            c38072d = C38072d.f163053a;
            i18 = C38072d.f163054b;
            float f16 = 4;
            f13 = f16 * f16;
            AbstractC15005f3.m43108b(c27430eM107874S3, null, AbstractC1102d.m3419p(f13, c2314t), c38072d.m121949b(c28655q, i18).getWhite50(), c28655q, 432, 0);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m9);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N9);
            i19 = TextResource.$stable;
            String strM21274h3 = AbstractC8693b.m21274h(textResource, c28655q, ((i17 >> 3) & 14) | i19);
            C2886a c2886aM8414L3 = c38072d.m121952e(c28655q, i18).getSh4();
            long jM125430y3 = c38072d.m121949b(c28655q, i18).getBrandWhite();
            i24 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h3, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L3, null, c28655q, 0, i24, 196602);
            c28655q = c28655q;
            if (AbstractC8693b.m21270d(textResource4)) {
                c28655q.m87150e0(77127092);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource4, c28655q, i19 | ((i17 >> 6) & 14)), null, c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB2(), null, c28655q, 0, i24, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(77340031);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (z17) {
                c28655q.m87150e0(-2061373171);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 6), null, AbstractC1102d.m3419p(f13, c2314t), c38072d.m121949b(c28655q, i18).getWhite30(), c28655q, 432, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2061105703);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            textResource3 = textResource4;
            z15 = z17;
        } else {
            c28655q.m87138X();
            textResource3 = textResourceM21267a;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(enumC16313m0, textResource, textResource3, z15, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m31422s(EnumC16313m0 enumC16313m0, TextResource textResource, TextResource textResource2, boolean z4, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m31421r(enumC16313m0, textResource, textResource2, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m31423t(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1321399963);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            Modifier modifierM3411h = AbstractC1102d.m3411h(16 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
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
            float f14 = 6 * f13;
            Modifier modifierM3424u = AbstractC1102d.m3424u(f14, AbstractC1102d.m3411h(f14, c2314t));
            InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C11132l(24);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C11473h(9);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC35684p.m113047h(modifierM3424u, dVarM113128a, false, 0.0f, 0, interfaceC4339a, (Function1) objM87133R2, null, null, c28655q, 1769478, 412);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m31424u() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m31425v(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m31426w(int i13, Composer composer, int i14) {
        m31423t(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x014a  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:70:0x015a  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: x */
    public static final void m31427x(Modifier modifier, AbstractC11743i viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        int i16;
        Modifier modifier4;
        C11742h c11742h;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        boolean z14;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(64363899);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(viewState) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C11473h(8);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                i16 = AbstractC12771a.f43700a;
                if (viewState instanceof AbstractC11743i.a) {
                    c28655q.m87150e0(1909794851);
                    z14 = (i15 & 896) == 256;
                    objM87133R2 = c28655q.m87133R();
                    if (z14 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C9813i(function4, 8);
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifier4 = modifier3;
                    AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifier3, false, null, null, (InterfaceC4339a) objM87133R2, 15), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(1314974579, c28655q, new C9809a(i16, 13)), c28655q, 12582912, 122);
                    c28655q.m87173q(false);
                } else {
                    modifier4 = modifier3;
                    if (viewState instanceof AbstractC11743i.b) {
                        c28655q.m87150e0(1910516004);
                        AbstractC31926e.m99375j(null, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-726121302, c28655q, new C9809a(i16, 14)), c28655q, 12582912, 123);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC11743i.c) {
                            throw AbstractC11895b.m32003v(1724174474, c28655q, false);
                        }
                        c28655q.m87150e0(1911205940);
                        InterfaceC25312u interfaceC25312uM31436a = ((AbstractC11743i.c) viewState).getState();
                        AbstractC22676k.m65748h(interfaceC25312uM31436a, "null cannot be cast to non-null type com.whoop.recoveryimpacts.view.RecoveryInsightsTileState");
                        c11742h = (C11742h) interfaceC25312uM31436a;
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zM87157i = c28655q.m87157i(c11742h) | z13;
                        objM87133R = c28655q.m87133R();
                        if (zM87157i || objM87133R == c28676v0) {
                            objM87133R = new C11546l(5, function4, c11742h);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM3362g = AbstractC1092a.m3362g(modifier4, false, null, null, (InterfaceC4339a) objM87133R, 15);
                        modifier4 = modifier4;
                        AbstractC31926e.m99375j(modifierM3362g, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-533190101, c28655q, new C4726a(c11742h, 17)), c28655q, 12582912, 122);
                        c28655q.m87173q(false);
                    }
                }
                function3 = function4;
                modifier2 = modifier4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(modifier2, viewState, function3, i13, i14, 23);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C11473h(8);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            i16 = AbstractC12771a.f43700a;
            if (viewState instanceof AbstractC11743i.a) {
                c28655q.m87150e0(1909794851);
                if ((i15 & 896) == 256) {
                }
                objM87133R2 = c28655q.m87133R();
                if (z14) {
                    objM87133R2 = new C9813i(function4, 8);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C9813i(function4, 8);
                    c28655q.m87172p0(objM87133R2);
                }
                modifier4 = modifier3;
                AbstractC31926e.m99375j(AbstractC1092a.m3362g(modifier3, false, null, null, (InterfaceC4339a) objM87133R2, 15), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(1314974579, c28655q, new C9809a(i16, 13)), c28655q, 12582912, 122);
                c28655q.m87173q(false);
            } else {
                modifier4 = modifier3;
                if (viewState instanceof AbstractC11743i.b) {
                    c28655q.m87150e0(1910516004);
                    AbstractC31926e.m99375j(null, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-726121302, c28655q, new C9809a(i16, 14)), c28655q, 12582912, 123);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC11743i.c) {
                        throw AbstractC11895b.m32003v(1724174474, c28655q, false);
                    }
                    c28655q.m87150e0(1911205940);
                    InterfaceC25312u interfaceC25312uM31436a2 = ((AbstractC11743i.c) viewState).getState();
                    AbstractC22676k.m65748h(interfaceC25312uM31436a2, "null cannot be cast to non-null type com.whoop.recoveryimpacts.view.RecoveryInsightsTileState");
                    c11742h = (C11742h) interfaceC25312uM31436a2;
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = c28655q.m87157i(c11742h) | z13;
                    objM87133R = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R = new C11546l(5, function4, c11742h);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C11546l(5, function4, c11742h);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifier4, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    modifier4 = modifier4;
                    AbstractC31926e.m99375j(modifierM3362g2, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-533190101, c28655q, new C4726a(c11742h, 17)), c28655q, 12582912, 122);
                    c28655q.m87173q(false);
                }
            }
            function3 = function4;
            modifier2 = modifier4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(modifier2, viewState, function3, i13, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m31428y(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m31429z(Function1 function1) {
        C23454a0 c23454a0 = C23454a0.f92919a;
        function1.invoke(c23454a0);
        return c23454a0;
    }
}

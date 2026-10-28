package yc2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bb2.C2932h;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import java.util.Locale;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26949h;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p043c4.C3948a0;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p571w3.C36776l;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p705ea2.AbstractC12919p;
import p705ea2.AbstractC12922s;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import re1.C31324k;
import se.AbstractC32411b;
import w71.C36891k;
import wb3.AbstractC37056f;
import wr0.C37526f;
import wr0.C37550r;
import x81.C38072d;
import xc2.EnumC38190a;
import xc2.InterfaceC38191b;
import xc2.InterfaceC38193d;
import xo1.C38492a;
import y71.C39272e;
import yb1.C39389a;

/* JADX INFO: renamed from: yc2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aE\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lxc2/d;", "viewState", "Lkotlin/Function1;", "Lxc2/b;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "dismiss", "G", "(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lxc2/d$b;", "z", "(Lxc2/d$b;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lxc2/d$d;", "O", "(Lxc2/d$d;Landroidx/compose/runtime/Composer;I)V", "Lxc2/a;", "error", "", "plan", "t", "(Lxc2/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39436c {

    /* JADX INFO: renamed from: yc2.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f169677a;

        static {
            int[] iArr = new int[EnumC38190a.values().length];
            try {
                iArr[EnumC38190a.SWITCH_BILLING_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38190a.FETCH_BILLING_MODAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f169677a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m125951A(InterfaceC38191b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m125952B() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m125953C(InterfaceC38193d.b bVar, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(((C1101c) BoxWithConstraints).m3403d());
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44026a1 = AbstractC15673b0.m44026a1(AbstractC1102d.m3409f(1.0f, c2314t), fMo743q0);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44026a1);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.a(AbstractC12919p.f44468b), null, null, c28655q, AbstractC22403o.a.f87639c, 3), AbstractC8693b.m21273g(AbstractC12922s.f44580O, c28655q, 0), AbstractC1102d.m3409f(1.0f, c2314t), null, C39102j.f168205g, 0.0f, null, c28655q, 24960, 104);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, true));
            String strM122329e = bVar.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a c2886aM8435p = c38072d.m121952e(c28655q, i15).getH2();
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, ((float) 1.25d) * f13, 0.0f, 2);
            C36775k c36775k = new C36775k(3);
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM122329e, modifierM3396r, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8435p, null, c28655q, 48, i16, 196088);
            float f14 = 2 * f13;
            AbstractC30795n.m94707h(bVar.getSubtitle(), AbstractC1099a.m3397s(c2314t, f14, 1 * f13, f14, 3 * f13), c38072d.m121949b(c28655q, i15).getGreyL5(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, i16, 196088);
            String strM122325a = bVar.getAcceptCta();
            EnumC27284v enumC27284v = EnumC27284v.TextMedium;
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(bVar);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C37550r(function1, bVar, 20);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(null, enumC27284v, strM122325a, false, 0L, null, false, (InterfaceC4339a) objM87133R, c28655q, 48, 121);
            String upperCase = bVar.getRejectCta().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            long jM125430y2 = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a c2886aM8428i = c38072d.m121952e(c28655q, i15).getBtL();
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, ((float) 3.5d) * f13, 5);
            boolean zM87153g2 = c28655q.m87153g(interfaceC4339a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C39272e(interfaceC4339a, 6);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC30795n.m94707h(upperCase, AbstractC1092a.m3362g(modifierM3398t, false, null, null, (InterfaceC4339a) objM87133R2, 15), jM125430y2, 0L, null, null, null, 0L, C36776l.f157352c, null, 0L, 0, false, 0, 0, null, c2886aM8428i, null, c28655q, 100663296, i16, 196344);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m125954D(Function1 function1, InterfaceC38193d.b bVar) {
        function1.invoke(new InterfaceC38191b.b(bVar.getPlan()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m125955E(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m125956F(InterfaceC38193d.b bVar, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m125992z(bVar, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    public static final void m125957G(InterfaceC38193d viewState, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2105444861);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39389a(5);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (i17 != 0) {
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C39434a(0);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a = (InterfaceC4339a) objM87133R2;
            }
            C3948a0 c3948a0 = new C3948a0(true, false, true);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C39434a(1);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC32411b.m101089d((InterfaceC4339a) objM87133R3, c3948a0, AbstractC37817c.m121344e(-411577318, c28655q, new C39435b(viewState, function1, interfaceC4339a, 0)), c28655q, 438);
        } else {
            c28655q.m87138X();
        }
        Function1 function2 = function1;
        InterfaceC4339a interfaceC4339a2 = interfaceC4339a;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(viewState, function2, interfaceC4339a2, i13, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m125958H(InterfaceC38191b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m125959I() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m125960J() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m125961K(InterfaceC38193d interfaceC38193d, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 4;
            AbstractC12889b.m36263b(AbstractC1102d.m3411h(138 * f13, C2314t.f9131w), AbstractC33253j.m105489e(((float) 1.5d) * f13), 0L, null, 0 * f13, AbstractC37817c.m121344e(-1663228803, c28655q, new C39435b(interfaceC38193d, function1, interfaceC4339a, 1)), c28655q, 1769478, 28);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x0100  */
    /* JADX WARN: Code duplicated, block: B:36:0x014d  */
    /* JADX WARN: Code duplicated, block: B:38:0x016d  */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m125962L(InterfaceC38193d interfaceC38193d, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        InterfaceC4339a interfaceC4339a2;
        boolean zM87153g;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (interfaceC38193d instanceof InterfaceC38193d.a) {
                c28655q.m87150e0(-1717851507);
                InterfaceC38193d.a aVar = (InterfaceC38193d.a) interfaceC38193d;
                m125986t(aVar.getType(), aVar.getPlan(), function1, interfaceC4339a, c28655q, 0, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (AbstractC22676k.m65745e(interfaceC38193d, InterfaceC38193d.c.f163559a)) {
                c28655q.m87150e0(1884259771);
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(false);
            } else {
                if (interfaceC38193d instanceof InterfaceC38193d.d) {
                    c28655q.m87150e0(1884267223);
                    m125965O((InterfaceC38193d.d) interfaceC38193d, c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    if (!(interfaceC38193d instanceof InterfaceC38193d.b)) {
                        throw AbstractC11895b.m32003v(1884246047, c28655q, false);
                    }
                    c28655q.m87150e0(1884271077);
                    interfaceC4339a2 = interfaceC4339a;
                    m125992z((InterfaceC38193d.b) interfaceC38193d, function1, interfaceC4339a2, c28655q, 0, 0);
                    c28655q.m87173q(false);
                }
                if (interfaceC38193d instanceof InterfaceC38193d.c) {
                    c28655q.m87150e0(-1716544609);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1716938619);
                    AbstractC6721d.a aVar2 = new AbstractC6721d.a(null, null, null, null, Integer.valueOf(AbstractC16319p0.m46430a().getAction().getCross()), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62229E), null, null, false, null, null, null, null, null, null, null, 65487, null);
                    zM87153g = c28655q.m87153g(interfaceC4339a2);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == C28635l.f115821a) {
                        objM87133R = new C39272e(interfaceC4339a2, 7);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC6719b.m20143d(null, aVar2, null, null, (InterfaceC4339a) objM87133R, null, c28655q, AbstractC6721d.a.f25641r << 3, 45);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
            }
            interfaceC4339a2 = interfaceC4339a;
            if (interfaceC38193d instanceof InterfaceC38193d.c) {
                c28655q.m87150e0(-1716938619);
                AbstractC6721d.a aVar3 = new AbstractC6721d.a(null, null, null, null, Integer.valueOf(AbstractC16319p0.m46430a().getAction().getCross()), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62229E), null, null, false, null, null, null, null, null, null, null, 65487, null);
                zM87153g = c28655q.m87153g(interfaceC4339a2);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = new C39272e(interfaceC4339a2, 7);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C39272e(interfaceC4339a2, 7);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC6719b.m20143d(null, aVar3, null, null, (InterfaceC4339a) objM87133R, null, c28655q, AbstractC6721d.a.f25641r << 3, 45);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1716544609);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m125963M(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m125964N(InterfaceC38193d interfaceC38193d, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m125957G(interfaceC38193d, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O */
    public static final void m125965O(InterfaceC38193d.d viewState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-934661761);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(viewState.getTitle()), 0L, null, 6, null), AbstractC8693b.m21278l(viewState.getSubtitle()), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2932h(viewState, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m125966P(InterfaceC38193d.d dVar, int i13, Composer composer, int i14) {
        m125965O(dVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:72:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x0103  */
    /* JADX WARN: Code duplicated, block: B:76:0x011d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0127  */
    /* JADX WARN: Code duplicated, block: B:82:0x0163  */
    /* JADX WARN: Code duplicated, block: B:85:0x0170  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static final void m125986t(EnumC38190a error, String plan, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        InterfaceC4339a interfaceC4339a4;
        char c3;
        char c7;
        char c14;
        boolean z13;
        Object objM87133R;
        boolean z14;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(error, "error");
        AbstractC22676k.m65750j(plan, "plan");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1577336678);
        int i18 = 2;
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87149e(error.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(plan) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C39389a(6);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C38492a(29);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC12922s.f44573K0, null, i18, 0 == true ? 1 : 0), false, null, 6, null);
                    TextResource textResourceM21267a = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC12922s.f44575L0, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
                    if ((i15 & 14) == 4) {
                        c3 = true;
                    } else {
                        c3 = false;
                    }
                    if ((i15 & 896) == 256) {
                        c7 = true;
                    } else {
                        c7 = false;
                    }
                    boolean z15 = c3 | c7;
                    if ((i15 & 112) == 32) {
                        c14 = true;
                    } else {
                        c14 = false;
                    }
                    z13 = (z15 ? 1 : 0) | c14;
                    objM87133R = c28655q2.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C31324k(25, error, function4, plan);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC12922s.f44571J0, objArr2 == true ? 1 : 0, i18, objArr == true ? 1 : 0);
                    z14 = (i15 & 7168) == 2048;
                    objM87133R2 = c28655q2.m87133R();
                    if (z14 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C39272e(interfaceC4339a4, 5);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    int i24 = 196608 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                    int i25 = TextResource.C8688b.f25889c;
                    c28655q = c28655q2;
                    AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, interfaceC4339a5, true, false, c8688b2, interfaceC4339a6, null, false, false, c28655q, i24 | (i25 << 9) | (i25 << 21), 0, 3652);
                    interfaceC4339a3 = interfaceC4339a4;
                    function3 = function4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C36891k(error, plan, function3, interfaceC4339a3, i13, i14, 16);
                }
            }
            i15 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C39389a(6);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C38492a(29);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC12922s.f44573K0, null, i18, 0 == true ? 1 : 0), false, null, 6, null);
                TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC12922s.f44575L0, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
                if ((i15 & 14) == 4) {
                    c3 = true;
                } else {
                    c3 = false;
                }
                if ((i15 & 896) == 256) {
                    c7 = true;
                } else {
                    c7 = false;
                }
                boolean z16 = c3 | c7;
                if ((i15 & 112) == 32) {
                    c14 = true;
                } else {
                    c14 = false;
                }
                z13 = (z16 ? 1 : 0) | c14;
                objM87133R = c28655q2.m87133R();
                if (z13) {
                    objM87133R = new C31324k(25, error, function4, plan);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C31324k(25, error, function4, plan);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC12922s.f44571J0, objArr4 == true ? 1 : 0, i18, objArr3 == true ? 1 : 0);
                if ((i15 & 7168) == 2048) {
                }
                objM87133R2 = c28655q2.m87133R();
                if (z14) {
                    objM87133R2 = new C39272e(interfaceC4339a4, 5);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C39272e(interfaceC4339a4, 5);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
                int i26 = 196608 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                int i27 = TextResource.C8688b.f25889c;
                c28655q = c28655q2;
                AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688b3, interfaceC4339a7, true, false, c8688b4, interfaceC4339a8, null, false, false, c28655q, i26 | (i27 << 9) | (i27 << 21), 0, 3652);
                interfaceC4339a3 = interfaceC4339a4;
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(error, plan, function3, interfaceC4339a3, i13, i14, 16);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C39389a(6);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C38492a(29);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC12922s.f44573K0, null, i18, 0 == true ? 1 : 0), false, null, 6, null);
                TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC12922s.f44575L0, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
                if ((i15 & 14) == 4) {
                    c3 = true;
                } else {
                    c3 = false;
                }
                if ((i15 & 896) == 256) {
                    c7 = true;
                } else {
                    c7 = false;
                }
                boolean z17 = c3 | c7;
                if ((i15 & 112) == 32) {
                    c14 = true;
                } else {
                    c14 = false;
                }
                z13 = (z17 ? 1 : 0) | c14;
                objM87133R = c28655q2.m87133R();
                if (z13) {
                    objM87133R = new C31324k(25, error, function4, plan);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C31324k(25, error, function4, plan);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC12922s.f44571J0, objArr6 == true ? 1 : 0, i18, objArr5 == true ? 1 : 0);
                if ((i15 & 7168) == 2048) {
                }
                objM87133R2 = c28655q2.m87133R();
                if (z14) {
                    objM87133R2 = new C39272e(interfaceC4339a4, 5);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C39272e(interfaceC4339a4, 5);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R2;
                int i28 = 196608 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                int i29 = TextResource.C8688b.f25889c;
                c28655q = c28655q2;
                AbstractC33199m0.m105214F(bVar3, textResourceM21267a3, null, c8688b5, interfaceC4339a9, true, false, c8688b6, interfaceC4339a10, null, false, false, c28655q, i28 | (i29 << 9) | (i29 << 21), 0, 3652);
                interfaceC4339a3 = interfaceC4339a4;
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k(error, plan, function3, interfaceC4339a3, i13, i14, 16);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C39389a(6);
                    c28655q2.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            if (i16 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C38492a(29);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC12922s.f44573K0, null, i18, 0 == true ? 1 : 0), false, null, 6, null);
            TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
            TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC12922s.f44575L0, 0 == true ? 1 : 0, i18, 0 == true ? 1 : 0);
            if ((i15 & 14) == 4) {
                c3 = true;
            } else {
                c3 = false;
            }
            if ((i15 & 896) == 256) {
                c7 = true;
            } else {
                c7 = false;
            }
            boolean z18 = c3 | c7;
            if ((i15 & 112) == 32) {
                c14 = true;
            } else {
                c14 = false;
            }
            z13 = (z18 ? 1 : 0) | c14;
            objM87133R = c28655q2.m87133R();
            if (z13) {
                objM87133R = new C31324k(25, error, function4, plan);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C31324k(25, error, function4, plan);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R;
            TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC12922s.f44571J0, objArr8 == true ? 1 : 0, i18, objArr7 == true ? 1 : 0);
            if ((i15 & 7168) == 2048) {
            }
            objM87133R2 = c28655q2.m87133R();
            if (z14) {
                objM87133R2 = new C39272e(interfaceC4339a4, 5);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C39272e(interfaceC4339a4, 5);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R2;
            int i210 = 196608 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
            int i211 = TextResource.C8688b.f25889c;
            c28655q = c28655q2;
            AbstractC33199m0.m105214F(bVar4, textResourceM21267a4, null, c8688b7, interfaceC4339a11, true, false, c8688b8, interfaceC4339a12, null, false, false, c28655q, i210 | (i211 << 9) | (i211 << 21), 0, 3652);
            interfaceC4339a3 = interfaceC4339a4;
            function3 = function4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(error, plan, function3, interfaceC4339a3, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m125987u(InterfaceC38191b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m125988v() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m125989w(EnumC38190a enumC38190a, Function1 function1, String str) {
        int i13 = a.f169677a[enumC38190a.ordinal()];
        if (i13 == 1) {
            function1.invoke(new InterfaceC38191b.b(str));
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(new InterfaceC38191b.a(str));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m125990x(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m125991y(EnumC38190a enumC38190a, String str, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m125986t(enumC38190a, str, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    public static final void m125992z(InterfaceC38193d.b viewState, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-714622098);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39389a(7);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (i17 != 0) {
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C39434a(2);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a = (InterfaceC4339a) objM87133R2;
            }
            AbstractC22953f.m66714a(null, null, false, AbstractC37817c.m121344e(-1563169448, c28655q, new C26949h((Object) viewState, function1, (Object) interfaceC4339a, 28)), c28655q, 3072, 7);
        } else {
            c28655q.m87138X();
        }
        Function1 function2 = function1;
        InterfaceC4339a interfaceC4339a2 = interfaceC4339a;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(viewState, function2, interfaceC4339a2, i13, i14, 22);
        }
    }
}

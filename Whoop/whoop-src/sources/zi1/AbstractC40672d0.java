package zi1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4339a;
import ck1.C4789l;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import e93.AbstractC12889b;
import hy0.AbstractC17799w1;
import kd1.C22411w;
import kotlin.C2000e1;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.C17903p;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31919h;
import p748zc1.C40349h7;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import ti1.AbstractC33852d;
import wb3.AbstractC37056f;
import x81.C38072d;
import xi1.InterfaceC38321a;
import yi1.C39582p;
import yi1.EnumC39580n;

/* JADX INFO: renamed from: zi1.d0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a[\u0010\u0012\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lyi1/p;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Lyi1/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/navigation/e;", "navAction", "Lyi1/n;", "iconState", "Lcom/whoop/design/util/TextResource;", "cardTitle", "cardSubtitle", "", "leftIcon", "rightIcon", "i", "(Lcom/whoop/navigation/e;Lyi1/n;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "kennel_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40672d0 {

    /* JADX INFO: renamed from: zi1.d0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f175591a;

        static {
            int[] iArr = new int[EnumC39580n.values().length];
            try {
                iArr[EnumC39580n.AllNotifications.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f175591a = iArr;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m132027f(C39582p itemState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-922197810);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C40349h7(27);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            Function1 function3 = function1;
            if (itemState.getIconState() == EnumC39580n.Error) {
                c28655q.m87150e0(1710990827);
                AbstractC40690t.m132128c(null, null, c28655q, 0, 3);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1711046224);
                C9598e c9598eM126462a = itemState.getMenuItemState().getDestination();
                EnumC39580n enumC39580nM126467a = itemState.getIconState();
                TextResource textResourceM126466e = itemState.getMenuItemState().getTitle();
                TextResource textResourceM126465d = itemState.getMenuItemState().getSubtitle();
                int iM126463b = itemState.getMenuItemState().getLeftIcon();
                int iM126464c = itemState.getMenuItemState().getRightIcon();
                int i17 = C9598e.f28134d;
                int i18 = TextResource.$stable;
                m132030i(c9598eM126462a, enumC39580nM126467a, textResourceM126466e, textResourceM126465d, iM126463b, iM126464c, function3, c28655q, i17 | (i18 << 6) | (i18 << 9) | ((i15 << 15) & 3670016));
                c28655q.m87173q(false);
            }
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40670c0(itemState, i13, function2, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m132028g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m132029h(C39582p c39582p, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m132027f(c39582p, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final void m132030i(C9598e c9598e, EnumC39580n enumC39580n, TextResource textResource, TextResource textResource2, int i13, int i14, Function1 function1, Composer composer, int i15) {
        int i16;
        int i17;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1578384043);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? c28655q2.m87153g(c9598e) : c28655q2.m87157i(c9598e) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= c28655q2.m87149e(enumC39580n == null ? -1 : enumC39580n.ordinal()) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= (i15 & 512) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= (i15 & 4096) == 0 ? c28655q2.m87153g(textResource2) : c28655q2.m87157i(textResource2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            i17 = i13;
            i16 |= c28655q2.m87149e(i17) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            i17 = i13;
        }
        if ((196608 & i15) == 0) {
            i16 |= c28655q2.m87149e(i14) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i15) == 0) {
            i16 |= c28655q2.m87157i(function1) ? 1048576 : 524288;
        }
        boolean z4 = true;
        if (c28655q2.m87135U(i16 & 1, (599187 & i16) != 599186)) {
            boolean z13 = c9598e != null;
            Modifier modifierM3362g = C2314t.f9131w;
            if (z13) {
                c28655q2.m87150e0(-336780599);
                boolean z14 = (3670016 & i16) == 1048576;
                if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !c28655q2.m87157i(c9598e))) {
                    z4 = false;
                }
                boolean z15 = z14 | z4;
                Object objM87133R = c28655q2.m87133R();
                if (z15 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C4789l(function1, c9598e, 17);
                    c28655q2.m87172p0(objM87133R);
                }
                modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R, 15);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-336647051);
                c28655q2.m87173q(false);
            }
            c28655q = c28655q2;
            AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, modifierM3362g), C22411w.f87680a.m64535a().m64090c(), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), null, 0, AbstractC37817c.m121344e(-885282286, c28655q2, new C31919h(enumC39580n, i17, z13, i14, textResource, textResource2)), c28655q, 1769472, 24);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2000e1(c9598e, enumC39580n, textResource, textResource2, i13, i14, function1, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m132031j(Function1 function1, C9598e c9598e) {
        if (c9598e == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        function1.invoke(new InterfaceC38321a.h(c9598e));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m132032k(EnumC39580n enumC39580n, int i13, boolean z4, int i14, TextResource textResource, TextResource textResource2, Composer composer, int i15) {
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            float f13 = 2 * 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierMo3400a = C1100b.f4583a.mo3400a(c2314t, C2299e.f9117z);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3400a);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            if (enumC39580n != null) {
                c28655q.m87150e0(-1911206990);
                if (a.f175591a[enumC39580n.ordinal()] == 1) {
                    c28655q.m87150e0(-1911141549);
                    c0209i = c0209i4;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC33852d.f141778k), AbstractC1102d.m3419p(20, c2314t), enumC39580n.getIconColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 384, 0);
                    c28655q.m87173q(false);
                } else {
                    c0209i = c0209i4;
                    c28655q.m87150e0(-1910690654);
                    AbstractC17799w1.m51149e(i13, enumC39580n.getIconColor().mo134584toComposableColorWaAFU9c(c28655q, 0), enumC39580n.getIconBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                c0209i3 = c0209i3;
                c0209i5 = c0209i5;
                c0209i = c0209i4;
                c0209i2 = c0209i2;
                c28655q.m87150e0(-1910320390);
                c28655q.m87173q(false);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
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
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            if (textResource != null) {
                c28655q.m87150e0(1411942081);
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1412202512);
                c28655q.m87173q(false);
            }
            if (textResource2 != null) {
                c28655q = c28655q;
                c28655q.m87150e0(1412257537);
                String strM21274h2 = AbstractC8693b.m21274h(textResource2, c28655q, TextResource.$stable);
                C38072d c38072d2 = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i17).getB2(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q;
                c28655q.m87150e0(1412517968);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (z4) {
                c28655q.m87150e0(-1909541577);
                C28655q c28655q3 = c28655q;
                AbstractC29125c.m88522c(AbstractC29125c.m88500I(i14, c28655q, 0), null, AbstractC1102d.m3419p(20, c2314t), null, null, 0.0f, new C17903p(C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 5), c28655q3, 432, 56);
                c28655q = c28655q3;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1909231174);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m132033l(C9598e c9598e, EnumC39580n enumC39580n, TextResource textResource, TextResource textResource2, int i13, int i14, Function1 function1, int i15, Composer composer, int i16) {
        m132030i(c9598e, enumC39580n, textResource, textResource2, i13, i14, function1, composer, AbstractC28683x.m87244L(i15 | 1));
        return C23454a0.f92919a;
    }
}

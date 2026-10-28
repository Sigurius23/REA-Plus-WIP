package ny0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.TextResource;
import ih1.C18522f;
import k81.EnumC22291a;
import l83.C23454a0;
import lf0.C23967s0;
import mi2.C25592o;
import no0.C26960m0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p291l0.AbstractC22989q;
import p291l0.C22976l1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import p745y81.InterfaceC39332e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: ny0.i0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lny0/i0;", "Lm91/f;", "Lny0/p0;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lny0/p0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27259i0 implements InterfaceC25297f<C27273p0> {

    /* JADX INFO: renamed from: ny0.i0$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f109085a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f109086b;

        static {
            int[] iArr = new int[EnumC27267m0.values().length];
            try {
                iArr[EnumC27267m0.FILLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27267m0.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27267m0.HIGHLIGHTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f109085a = iArr;
            int[] iArr2 = new int[EnumC22291a.values().length];
            try {
                iArr2[EnumC22291a.TRAILING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC22291a.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC22291a.LEADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f109086b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m82179f(C27273p0 c27273p0, Function1 function1, Modifier buttonModifier, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(buttonModifier, "buttonModifier");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(buttonModifier) ? 4 : 2);
        } else {
            i14 = i13;
        }
        int i15 = 1;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i16 = a.f109085a[c27273p0.getStyle().ordinal()];
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 == 1) {
                c28655q.m87150e0(849488318);
                Modifier modifierM3429z = AbstractC1102d.m3429z(buttonModifier, null, 3);
                boolean enabled = c27273p0.getEnabled();
                C39274g rightIcon = c27273p0.getRightIcon();
                Integer numValueOf = rightIcon != null ? Integer.valueOf(rightIcon.getIcon()) : null;
                float f13 = 4;
                Modifier modifierM3419p = AbstractC1102d.m3419p(f13 * f13, C2314t.f9131w);
                TextResource text = c27273p0.getText();
                C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                C38072d c38072d = C38072d.f163053a;
                C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, 6).getWhite10(), c38072d.m121949b(c28655q, 6).getBrandWhite(), c38072d.m121949b(c28655q, 6).getWhite10(), c38072d.m121949b(c28655q, 6).getWhite20(), c28655q, 0, 0);
                C2886a c2886aM8438s = AbstractC2890e.m8450e().getH5();
                float f14 = 2;
                float f15 = f14 * f13;
                float f16 = 8;
                float f17 = f14 * f16;
                float f18 = ((float) 1.5d) * f16;
                C22976l1 c22976l2 = new C22976l1(f17, f18, f17, f18);
                boolean zM87157i = c28655q.m87157i(c27273p0) | c28655q.m87153g(function1);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C25592o(c27273p0, function1, 14);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27292z.m82338e(modifierM3429z, enabled, false, null, null, null, numValueOf, modifierM3419p, text, c15077m1M43196a, null, null, c2886aM8438s, f15, c22976l2, (InterfaceC4339a) objM87133R, c28655q, 12586368, 27696, 1072);
                c28655q.m87173q(false);
            } else {
                if (i16 != 2 && i16 != 3) {
                    throw AbstractC11895b.m32003v(849487062, c28655q, false);
                }
                c28655q.m87150e0(565720838);
                TextResource text2 = c27273p0.getText();
                Object actionArgument = c27273p0.getActionArgument();
                if (actionArgument == null && (actionArgument = c27273p0.getDismissEvent()) == null) {
                    actionArgument = c27273p0.getNavigationAction();
                }
                Object obj = actionArgument;
                int i17 = i14;
                C39274g leftIcon = c27273p0.getLeftIcon();
                C39274g rightIcon2 = c27273p0.getRightIcon();
                boolean trimStartGutter = c27273p0.getTrimStartGutter();
                boolean enabled2 = c27273p0.getEnabled();
                InterfaceC39332e tint = c27273p0.getTint();
                InterfaceC21430b tintGradient = c27273p0.getTintGradient();
                boolean useTextPadding = c27273p0.getUseTextPadding();
                boolean zM87157i2 = c28655q.m87157i(c27273p0) | c28655q.m87153g(function1);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C23967s0(c27273p0, function1, i15);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27265l0.m82217i(buttonModifier, null, text2, leftIcon, rightIcon2, enabled2, tint, tintGradient, useTextPadding, trimStartGutter, null, obj, (Function1) objM87133R2, c28655q, i17 & 14, 0, 1026);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m82180g(C27273p0 c27273p0, Function1 function1) {
        AnalyticEventModel analyticEvent = c27273p0.getAnalyticEvent();
        if (analyticEvent != null) {
            AbstractC13673n.m38578y(null, analyticEvent, function1);
        }
        Object actionArgument = c27273p0.getActionArgument();
        if (actionArgument == null && (actionArgument = c27273p0.getDismissEvent()) == null) {
            actionArgument = c27273p0.getNavigationAction();
        }
        function1.invoke(actionArgument);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m82181h(C27273p0 c27273p0, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        AnalyticEventModel analyticEvent = c27273p0.getAnalyticEvent();
        if (analyticEvent != null) {
            AbstractC13673n.m38578y(null, analyticEvent, function1);
        }
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m82182i(C27259i0 c27259i0, Modifier modifier, C27273p0 c27273p0, Function1 function1, int i13, Composer composer, int i14) {
        c27259i0.Compose(modifier, c27273p0, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C27273p0 itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1955069537);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C37816b c37816bM121344e = AbstractC37817c.m121344e(-320903394, c28655q, new C18522f(28, itemState, onViewEvent));
            EnumC22291a alignment = itemState.getAlignment();
            int[] iArr = a.f109086b;
            int i15 = iArr[alignment.ordinal()];
            if (i15 == 1 || i15 == 2) {
                c28655q.m87150e0(-572274810);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(iArr[itemState.getAlignment().ordinal()] == 1 ? C2299e.f9103F : C2299e.f9102E, false);
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
                c37816bM121344e.invoke(C2314t.f9131w, c28655q, 54);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                if (i15 != 3) {
                    throw AbstractC11895b.m32003v(1921199295, c28655q, false);
                }
                c28655q.m87150e0(1921215281);
                c37816bM121344e.invoke(modifier, c28655q, Integer.valueOf((i14 & 14) | 48));
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26960m0(this, modifier, itemState, onViewEvent, i13, 19);
        }
    }
}

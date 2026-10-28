package p41;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.navigation.models.GenericInteraction;
import java.util.Locale;
import l83.C23454a0;
import no0.C26954j0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28330f;
import p745y81.AbstractC39330c;
import pz0.AbstractC29641d;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: p41.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lp41/j;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lp41/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "checked", "l", "(Lp41/j;Z)Ljava/lang/Object;", "isChecked", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28838i {

    /* JADX INFO: renamed from: p41.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f116730a;

        static {
            int[] iArr = new int[EnumC28840k.values().length];
            try {
                iArr[EnumC28840k.TILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC28840k.PLAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f116730a = iArr;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m87715e(Modifier modifier, C28839j state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2132293948);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            boolean zM87155h = c28655q.m87155h(state.getIsChecked());
            Object objM87133R = c28655q.m87133R();
            if (zM87155h || objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(state.getIsChecked()));
                c28655q.m87172p0(objM87133R);
            }
            C37816b c37816bM121344e = AbstractC37817c.m121344e(-615339430, c28655q, new C28837h(state, (InterfaceC28601c1) objM87133R, onViewEvent, 0));
            int i17 = a.f116730a[state.getStyle().ordinal()];
            if (i17 == 1) {
                c28655q.m87150e0(435127515);
                AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, modifier4), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite5(), null, null, null, 0.0f, c37816bM121344e, c28655q, 12582912, 122);
                c28655q.m87173q(false);
            } else {
                if (i17 != 2) {
                    throw AbstractC11895b.m32003v(435126081, c28655q, false);
                }
                c28655q.m87150e0(435133453);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
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
                c37816bM121344e.invoke(c28655q, 6);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(modifier3, state, onViewEvent, i13, i14, 12);
        }
    }

    /* JADX INFO: renamed from: f */
    private static final boolean m87716f(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    private static final void m87717g(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m87718h(C28839j c28839j, InterfaceC28601c1 interfaceC28601c1, Function1 function1, Composer composer, int i13) {
        String strM87723a;
        C2886a c2886aM8420a;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 2 * f13, ((float) 1.5d) * f13);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            EnumC28840k enumC28840kM87724b = c28839j.getStyle();
            EnumC28840k enumC28840k = EnumC28840k.TILE;
            if (enumC28840kM87724b == enumC28840k) {
                strM87723a = c28839j.getLabel().toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(strM87723a, "toUpperCase(...)");
            } else {
                strM87723a = c28839j.getLabel();
            }
            String str = strM87723a;
            if (c28839j.getStyle() == enumC28840k) {
                c28655q.m87150e0(1217238585);
                c2886aM8420a = C38072d.f163053a.m121952e(c28655q, 6).getSh4();
            } else {
                c28655q.m87150e0(1217239576);
                c2886aM8420a = C38072d.f163053a.m121952e(c28655q, 6).getB1();
            }
            c28655q.m87173q(false);
            C2886a c2886a = c2886aM8420a;
            long jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(str, new LayoutWeightElement(1.0f, true), jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q, 0, 0, 196600);
            AbstractC39330c.m125320b(0L, c28839j.getToggledOnColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, 0L, AbstractC37817c.m121344e(-1127888593, c28655q, new C28837h(c28839j, interfaceC28601c1, function1, 1)), c28655q, 24576, 13);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m87719i(C28839j c28839j, InterfaceC28601c1 interfaceC28601c1, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87716f = m87716f(interfaceC28601c1);
            boolean z4 = !c28839j.getIsReadOnly();
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1) | c28655q.m87153g(function1) | c28655q.m87157i(c28839j);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C26954j0(function1, c28839j, interfaceC28601c1, 9);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, zM87716f, z4, 0L, null, null, (Function1) objM87133R, c28655q, 0, 57);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m87720j(Function1 function1, C28839j c28839j, InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m87717g(interfaceC28601c1, z4);
        function1.invoke(m87722l(c28839j, z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m87721k(Modifier modifier, C28839j c28839j, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m87715e(modifier, c28839j, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final Object m87722l(C28839j c28839j, boolean z4) {
        GenericInteraction genericInteractionM87706a = null;
        if (z4) {
            C28835f c28835fM87725c = c28839j.getToggleInteraction();
            if (c28835fM87725c != null) {
                genericInteractionM87706a = c28835fM87725c.getToggleOnInteraction();
            }
        } else {
            if (z4) {
                throw new NoWhenBranchMatchedException();
            }
            C28835f c28835fM87725c2 = c28839j.getToggleInteraction();
            if (c28835fM87725c2 != null) {
                genericInteractionM87706a = c28835fM87725c2.getToggleOffInteraction();
            }
        }
        return genericInteractionM87706a == null ? new C28834e(z4) : genericInteractionM87706a;
    }
}

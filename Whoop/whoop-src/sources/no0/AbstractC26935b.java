package no0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.navigation.models.GenericInteraction;
import ge3.AbstractC15751g;
import l83.C23454a0;
import lo0.C24568a;
import m31.C25002h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.AbstractC11352g;
import p208i2.AbstractC17918w0;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: no0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llo0/a;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Llo0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isButtonPressed", "", "indicationScale", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26935b {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m80426c(Modifier modifier, C24568a c24568a, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1449712862);
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(c24568a) : c28655q.m87157i(c24568a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * 4);
            boolean zM87155h = c28655q.m87155h(c24568a.getIsSelected());
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87155h || objM87133R == c28676v0) {
                objM87133R = c24568a.getIsSelected() ? c24568a.getSelectedColor() : EnumC39333f.WHITE_10;
                c28655q.m87172p0(objM87133R);
            }
            EnumC39333f enumC39333f = (EnumC39333f) objM87133R;
            boolean zM87155h2 = c28655q.m87155h(c24568a.getIsSelected());
            Object objM87133R2 = c28655q.m87133R();
            Modifier modifier5 = null;
            if (zM87155h2 || objM87133R2 == c28676v0) {
                objM87133R2 = c24568a.getIsSelected() ? c24568a.getSelectedBorderColor() : null;
                c28655q.m87172p0(objM87133R2);
            }
            EnumC39333f enumC39333f2 = (EnumC39333f) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R3;
            Modifier modifier6 = c2314t;
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(m80427d(AbstractC15751g.m44460m(interfaceC21083i, c28655q, 6)) ? 0.95f : 1.0f, null, null, null, c28655q, 0, 30);
            Modifier modifier7 = modifier4;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1127a.m3488c(modifier4, m80428e(interfaceC28670t2M30588b), m80428e(interfaceC28670t2M30588b), 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524284), c33252iM105489e);
            if (enumC39333f2 == null) {
                c28655q.m87150e0(1796164787);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1796164788);
                Modifier modifierM44455h = AbstractC15751g.m44455h(modifier6, (float) 1.5d, enumC39333f2.mo134584toComposableColorWaAFU9c(c28655q, 0), c33252iM105489e);
                c28655q.m87173q(false);
                modifier5 = modifierM44455h;
            }
            if (modifier5 != null) {
                modifier6 = modifier5;
            }
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r.mo3471e(modifier6), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC17918w0.f69621a);
            boolean z4 = ((i17 & 896) == 256) | ((i17 & 112) == 32 || ((i17 & 64) != 0 && c28655q.m87157i(c24568a)));
            Object objM87133R4 = c28655q.m87133R();
            if (z4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C26964o0(1, c24568a, function1);
                c28655q.m87172p0(objM87133R4);
            }
            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3358c, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R4, 28);
            float f13 = 8;
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3395q(modifierM3360e, 2 * f13, ((float) 1.5d) * f13), "appointment_button_" + c24568a.getId());
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
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
            String text = c24568a.getText();
            C38072d c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            AbstractC30795n.m94707h(text, null, c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, i18).getN8(), null, c28655q, 0, (C2886a.f11498d << 18) | 3120, 186362);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier7;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(modifier3, c24568a, function1, i13, i14, 11);
        }
    }

    /* JADX INFO: renamed from: d */
    private static final boolean m80427d(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    private static final float m80428e(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m80429f(C24568a c24568a, Function1 function1) {
        GenericInteraction interaction = c24568a.getInteraction();
        if (interaction != null) {
            function1.invoke(interaction);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m80430g(Modifier modifier, C24568a c24568a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m80426c(modifier, c24568a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

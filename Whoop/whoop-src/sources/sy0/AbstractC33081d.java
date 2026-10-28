package sy0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import s51.C32205b;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: sy0.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lsy0/e;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", "c", "(Lsy0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33081d {
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0128  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m104793c(C33082e viewState, Function1 onViewEvent, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        boolean z13;
        boolean z14;
        Integer spacerSize;
        int iIntValue;
        Modifier modifierM3409f;
        boolean z15;
        boolean z16;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1938910997);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (!(viewState.getCheckboxType() instanceof AbstractC33088k.c) || (viewState.getCheckboxType() instanceof AbstractC33088k.h)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13 || AbstractC39414r.m125890i0(viewState.getLabel())) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                TextResource textResourceM21278l = AbstractC8693b.m21278l(viewState.getLabel());
                AbstractC33088k checkboxType = viewState.getCheckboxType();
                boolean isToggled = viewState.getIsToggled();
                spacerSize = viewState.getSpacerSize();
                if (spacerSize != null) {
                    iIntValue = spacerSize.intValue();
                } else {
                    iIntValue = 3;
                }
                if (z14) {
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                } else {
                    modifierM3409f = modifier4;
                }
                long brandWhite = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
                long jMo134584toComposableColorWaAFU9c = viewState.getToggledColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q2.m87157i(viewState))) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | ((i15 & 112) == 32);
                objM87133R = c28655q2.m87133R();
                if (z16 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C33080c(viewState, onViewEvent, 0);
                    c28655q2.m87172p0(objM87133R);
                }
                modifier3 = modifier4;
                c28655q = c28655q2;
                AbstractC33087j.m104824f(textResourceM21278l, checkboxType, isToggled, false, iIntValue, brandWhite, modifierM3409f, null, false, jMo134584toComposableColorWaAFU9c, (Function1) objM87133R, c28655q, 0, 0, 392);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32205b((Object) viewState, (InterfaceC23459e) onViewEvent, modifier3, i13, i14, 21);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (viewState.getCheckboxType() instanceof AbstractC33088k.c) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (z13) {
                z14 = false;
            } else {
                z14 = false;
            }
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(viewState.getLabel());
            AbstractC33088k checkboxType2 = viewState.getCheckboxType();
            boolean isToggled2 = viewState.getIsToggled();
            spacerSize = viewState.getSpacerSize();
            if (spacerSize != null) {
                iIntValue = spacerSize.intValue();
            } else {
                iIntValue = 3;
            }
            if (z14) {
                modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            } else {
                modifierM3409f = modifier4;
            }
            long brandWhite2 = C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite();
            long jMo134584toComposableColorWaAFU9c2 = viewState.getToggledColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
            if ((i15 & 14) != 4) {
                z15 = true;
            } else {
                z15 = true;
            }
            z16 = z15 | ((i15 & 112) == 32);
            objM87133R = c28655q2.m87133R();
            if (z16) {
                objM87133R = new C33080c(viewState, onViewEvent, 0);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C33080c(viewState, onViewEvent, 0);
                c28655q2.m87172p0(objM87133R);
            }
            modifier3 = modifier4;
            c28655q = c28655q2;
            AbstractC33087j.m104824f(textResourceM21278l2, checkboxType2, isToggled2, false, iIntValue, brandWhite2, modifierM3409f, null, false, jMo134584toComposableColorWaAFU9c2, (Function1) objM87133R, c28655q, 0, 0, 392);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b((Object) viewState, (InterfaceC23459e) onViewEvent, modifier3, i13, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m104794d(C33082e c33082e, Function1 function1, boolean z4) {
        C33078a toggleInteraction = c33082e.getToggleInteraction();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (toggleInteraction == null) {
            return c23454a0;
        }
        function1.invoke(z4 ? toggleInteraction.getToggleOnInteraction() : toggleInteraction.getToggleOffInteraction());
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m104795e(C33082e c33082e, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m104793c(c33082e, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}

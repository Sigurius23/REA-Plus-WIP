package tj1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bv2.C3675b;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import gj1.AbstractC15919b;
import ih2.C18526a;
import l83.C23454a0;
import nj1.AbstractC26751a;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import x81.C38072d;

/* JADX INFO: renamed from: tj1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"", "isConnected", "Lkotlin/Function1;", "Lnj1/a;", "Ll83/a0;", "onClick", "c", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "health-connect_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33866a {
    /* JADX INFO: renamed from: c */
    public static final void m107087c(boolean z4, Function1 onClick, Composer composer, int i13) {
        int i14;
        long jM125377a;
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(371850170);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onClick) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = z4 ? AbstractC15919b.f60214c : AbstractC15919b.f60213b;
            if (z4) {
                c28655q.m87150e0(865739044);
                jM125377a = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(865740134);
                jM125377a = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAction();
                c28655q.m87173q(false);
            }
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM21273g = AbstractC8693b.m21273g(i15, c28655q, 0);
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3394p(5 * f13, AbstractC1102d.m3409f(1.0f, C2314t.f9131w)), 0.0f, 0.0f, 0.0f, 1 * f13, 7);
            boolean z13 = ((i14 & 112) == 32) | ((i14 & 14) == 4);
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C3675b(onClick, z4, 10);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(modifierM3398t, enumC27284v, strM21273g, false, jM125377a, null, false, (InterfaceC4339a) objM87133R, c28655q, 54, 104);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18526a(z4, onClick, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m107088d(Function1 function1, boolean z4) {
        function1.invoke(z4 ? AbstractC26751a.c.f106397a : AbstractC26751a.b.f106396a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m107089e(boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m107087c(z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

package ky2;

import a11.C0133k;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import iy0.C21026a;
import l83.C23454a0;
import ny0.AbstractC27271o0;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: ky2.h */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "text", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "c", "(Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22899h {
    /* JADX INFO: renamed from: c */
    public static final void m66621c(TextResource text, InterfaceC4339a onClick, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1553404729);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(text) : c28655q.m87157i(text) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onClick) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 2 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f13, 0.0f, f13, f13, 2);
            C2886a c2886aM8430k = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getBtS();
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C21026a(onClick, 15);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27271o0.m82253b(modifierM3398t, false, text, c2886aM8430k, null, null, null, null, false, null, (InterfaceC4339a) objM87133R, c28655q, ((i14 << 6) & 896) | (TextResource.$stable << 6) | 196614 | (C2886a.f11498d << 9), 0, 978);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0133k(i13, 1, onClick, text);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m66622d(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m66623e(TextResource textResource, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m66621c(textResource, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

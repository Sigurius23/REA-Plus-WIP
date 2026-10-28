package g40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import java.util.Set;
import n53.C26318e;
import p163g1.C15160u4;
import p390p1.C28655q;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C15341e implements InterfaceC15455z2, InterfaceC15445x2 {

    /* JADX INFO: renamed from: a */
    public final C26318e f57648a;

    /* JADX INFO: renamed from: b */
    public final C26318e f57649b;

    public C15341e(C26318e c26318e) {
        this.f57648a = c26318e;
        this.f57649b = AbstractC3269g.m9518y(c26318e, new C15160u4(10));
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43544f() {
        return this.f57649b;
    }

    @Override // g40.InterfaceC15445x2
    /* JADX INFO: renamed from: i */
    public final void mo43545i(boolean z4, InterfaceC15450y2 interfaceC15450y2, Modifier modifier, Set set, IdentifierSpec identifierSpec, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-349463991);
        int i14 = i13 >> 3;
        AbstractC35785b.m113406b(z4, this, set, identifierSpec, modifier, c28655q, (i13 & 14) | ((i13 >> 12) & 112) | (i14 & 896) | (i14 & 7168) | ((i13 << 6) & 57344), 0);
        c28655q.m87173q(false);
    }
}

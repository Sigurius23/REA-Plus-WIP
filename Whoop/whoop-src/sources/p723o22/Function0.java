package p723o22;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import l83.C23454a0;
import p127ev.AbstractC13673n;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p702ch0.C4651t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import uv0.AbstractC35283c;
import x81.C38072d;

/* JADX INFO: renamed from: o22.d, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onBackClicked", "b", "(Lc93/a;Landroidx/compose/runtime/Composer;I)V", "pairing-ui_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {
    /* JADX INFO: renamed from: b */
    public static final void m82899b(InterfaceC4339a onBackClicked, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onBackClicked, "onBackClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(409129002);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onBackClicked) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(null, null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65523, null), null, onBackClicked, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i14 << 9) & 7168), 53);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4651t(i13, 13, onBackClicked);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m82900c(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m82899b(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

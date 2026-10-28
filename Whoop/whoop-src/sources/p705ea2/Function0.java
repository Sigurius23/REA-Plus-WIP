package p705ea2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.TextResource;
import hi0.AbstractC17312j;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p702ch0.C4651t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ea2.b0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onClose", "b", "(Lc93/a;Landroidx/compose/runtime/Composer;I)V", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {
    /* JADX INFO: renamed from: b */
    public static final void m36302b(InterfaceC4339a onClose, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a;
        AbstractC22676k.m65750j(onClose, "onClose");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(703225309);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onClose) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            interfaceC4339a = onClose;
            AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20174b(new TextResource.C8688b(AbstractC17312j.f66968a1, null, 2, null), "Settings Screen Title", "Settings Close Button"), null, interfaceC4339a, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i14 << 9) & 7168), 53);
        } else {
            interfaceC4339a = onClose;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4651t(i13, 5, interfaceC4339a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m36303c(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m36302b(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

package hh0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import cp0.C10965i;
import d42.C11690f;
import hb1.C17085h;
import l83.C23454a0;
import p026b2.C2314t;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p702ch0.Function0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v41.AbstractC35661d0;

/* JADX INFO: renamed from: hh0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "filePath", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "d", "(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17287g {
    /* JADX INFO: renamed from: d */
    public static final void m48960d(String filePath, InterfaceC4339a onDismiss, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(filePath, "filePath");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1741968522);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(filePath) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onDismiss) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Function0.m14387c(onDismiss, AbstractC37817c.m121344e(-336223697, c28655q, new C11690f(filePath, 1)), c28655q, ((i14 >> 3) & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10965i(filePath, onDismiss, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m48961e(String str, InterfaceC23013y FullScreenPreviewDialog, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(FullScreenPreviewDialog, "$this$FullScreenPreviewDialog");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(FullScreenPreviewDialog) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM66779c = ((C23016z) FullScreenPreviewDialog).m66779c(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), true, 1.0f);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C17085h(14);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC35661d0.m112931y(modifierM66779c, str, null, null, (Function1) objM87133R, true, false, false, false, 0, null, c28655q, 221184, 0, 1996);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m48962f(Throwable it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m48963g(String str, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m48960d(str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}

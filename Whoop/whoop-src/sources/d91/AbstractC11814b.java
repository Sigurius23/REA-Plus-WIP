package d91;

import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import kd1.AbstractC22413y;
import l83.C23454a0;
import p390p1.C28655q;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.AbstractC38073e;

/* JADX INFO: renamed from: d91.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Lkotlin/Function0;", "Ll83/a0;", "content", "c", "(Landroidx/compose/ui/platform/ComposeView;Lc93/m;)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11814b {
    /* JADX INFO: renamed from: c */
    public static final void m31673c(ComposeView composeView, InterfaceC4351m content) {
        AbstractC22676k.m65750j(composeView, "<this>");
        AbstractC22676k.m65750j(content, "content");
        composeView.setContent(new C37816b(new C11813a(0, content), true, -737087188));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m31674d(InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(-1904847343, c28655q, new C11813a(1, interfaceC4351m)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m31675e(InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC22413y.m64547h(c28655q, 0);
            interfaceC4351m.invoke(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}

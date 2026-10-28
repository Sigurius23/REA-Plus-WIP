package cl1;

import bl1.C3371b;
import bl1.InterfaceC3370a;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.navigation.AiAction;
import dp0.InterfaceC12251g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import zk1.AbstractC40838b;
import zk1.C40839c;

/* JADX INFO: renamed from: cl1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/navigation/AiAction;", "aiAction", "Lbl1/b;", "analyticsHelper", "Ldp0/g;", "globalCoachManager", "Lzk1/c;", "navRouter", "Ll83/a0;", "a", "(Lcom/whoop/navigation/AiAction;Lbl1/b;Ldp0/g;Lzk1/c;)V", "help-center_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4799b {
    /* JADX INFO: renamed from: a */
    public static final void m15162a(AiAction aiAction, C3371b analyticsHelper, InterfaceC12251g globalCoachManager, C40839c navRouter) {
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(globalCoachManager, "globalCoachManager");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        analyticsHelper.m9738a(new InterfaceC3370a.c(null, null, null, null, null, 31, null));
        if (aiAction == null) {
            analyticsHelper.m9738a(new InterfaceC3370a.d(false, "fallback", null, null, null, null, null, null, 248, null));
            navRouter.m132350a(AbstractC40838b.d.f176050a);
            return;
        }
        String sourceType = aiAction.getSourceType();
        if (sourceType.length() <= 0) {
            sourceType = null;
        }
        analyticsHelper.m9738a(new InterfaceC3370a.d(true, "new_stack", sourceType, null, null, null, null, null, 248, null));
        InterfaceC12251g.m34132f(globalCoachManager, 0L, null, AbstractC6219a.m18524b(aiAction, true), 3, null);
    }
}

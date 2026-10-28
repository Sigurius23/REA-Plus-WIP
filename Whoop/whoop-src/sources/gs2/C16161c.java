package gs2;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import hs2.InterfaceC17607a;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gs2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lgs2/c;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "<init>", "(Lj02/o0;Leb/a0;)V", "Lcom/whoop/navigation/e;", "navAction", "Ll83/a0;", "a", "(Lcom/whoop/navigation/e;)V", "Lhs2/a$g;", NotificationCompat.CATEGORY_EVENT, "b", "(Lhs2/a$g;)V", "Lj02/o0;", "Leb/a0;", "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16161c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    public C16161c(InterfaceC21159o0 navigator, AbstractC12939a0 navController) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        this.navigator = navigator;
        this.navController = navController;
    }

    /* JADX INFO: renamed from: a */
    private final void m45703a(C9598e navAction) {
        this.navController.m36410z();
        this.navigator.mo59392a(navAction);
    }

    /* JADX INFO: renamed from: b */
    public final void m45704b(InterfaceC17607a.g event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC17607a.a) {
            m45703a(((InterfaceC17607a.a) event).getNavAction());
        } else {
            if (!(event instanceof InterfaceC17607a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navController.m36410z();
        }
    }
}

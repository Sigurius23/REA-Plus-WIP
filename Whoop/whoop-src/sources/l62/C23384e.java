package l62;

import androidx.core.app.NotificationCompat;
import h62.AbstractC16981a;
import h62.C16982b;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p236j.AbstractC21065d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l62.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ll62/e;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "Lj/d;", "Ll62/g;", "activityResultLauncher", "Lh62/b;", "analyticsHelper", "<init>", "(Leb/a0;Lj02/o0;Lj/d;Lh62/b;)V", "Ll62/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Ll62/a;)V", "Leb/a0;", "b", "Lj02/o0;", "c", "Lj/d;", "d", "Lh62/b;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23384e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC21065d activityResultLauncher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C16982b analyticsHelper;

    public C23384e(AbstractC12939a0 navController, InterfaceC21159o0 navigator, AbstractC21065d abstractC21065d, C16982b analyticsHelper) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.navController = navController;
        this.navigator = navigator;
        this.activityResultLauncher = abstractC21065d;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: renamed from: a */
    public final void m67685a(AbstractC23380a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC23380a.a) {
            this.navController.m36410z();
            return;
        }
        if (event instanceof AbstractC23380a.b) {
            this.navigator.mo59392a(((AbstractC23380a.b) event).getAction());
            return;
        }
        if (!(event instanceof AbstractC23380a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC23380a.c cVar = (AbstractC23380a.c) event;
        this.analyticsHelper.m47809a(new AbstractC16981a.j(null, null, cVar.getSource(), cVar.getCodeNumber(), null, 19, null), "Onboarding");
        AbstractC21065d abstractC21065d = this.activityResultLauncher;
        if (abstractC21065d != null) {
            abstractC21065d.mo4052a(new C23386g(cVar.getShareMessage(), cVar.getCode()), null);
        }
    }
}

package et1;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import ss1.C32948a;

/* JADX INFO: renamed from: et1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Let1/b;", "", "Leb/a0;", "fragmentNavController", "Lj02/o0;", "navigator", "Lss1/a;", "analytics", "<init>", "(Leb/a0;Lj02/o0;Lss1/a;)V", "Let1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Let1/a;)V", "Leb/a0;", "b", "Lj02/o0;", "c", "Lss1/a;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13598b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 fragmentNavController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C32948a analytics;

    public C13598b(AbstractC12939a0 fragmentNavController, InterfaceC21159o0 navigator, C32948a analytics) {
        AbstractC22676k.m65750j(fragmentNavController, "fragmentNavController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.fragmentNavController = fragmentNavController;
        this.navigator = navigator;
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m38422a(InterfaceC13597a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(InterfaceC13597a.c.f48067a)) {
            this.navigator.mo59393b(new AbstractC21155m0.f3("ECG_EDUCATION", "ARTICLE", "Labrador details", null, null, 24, null));
            return;
        }
        if (event.equals(InterfaceC13597a.a.f48065a)) {
            this.analytics.m104032f();
            this.fragmentNavController.m36402q(Uri.parse("android-app://com.whoop/labradorAboutFragment"));
        } else {
            if (!event.equals(InterfaceC13597a.b.f48066a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.fragmentNavController.m36410z();
            this.fragmentNavController.m36410z();
            this.fragmentNavController.m36402q(Uri.parse("android-app://com.whoop/labradorResultsFragment"));
        }
    }
}

package mt1;

import android.net.Uri;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ss1.C32948a;

/* JADX INFO: renamed from: mt1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lmt1/a;", "", "Leb/a0;", "navController", "Lss1/a;", "analytics", "<init>", "(Leb/a0;Lss1/a;)V", "Ll83/a0;", "a", "()V", "Leb/a0;", "b", "Lss1/a;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25939a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C32948a analytics;

    public C25939a(AbstractC12939a0 navController, C32948a analytics) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.navController = navController;
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m76742a() {
        this.analytics.m104034h();
        Uri uri = Uri.parse("android-app://com.whoop/labradorDeviceLocationFragment");
        this.navController.m36410z();
        this.navController.m36402q(uri);
    }
}

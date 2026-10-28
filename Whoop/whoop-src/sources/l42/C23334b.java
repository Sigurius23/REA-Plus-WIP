package l42;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import or2.C28216y;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l42.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Ll42/b;", "", "Leb/a0;", "navController", "Lor2/y;", "externalLinkNavigator", "Landroid/app/Activity;", "activity", "", "deleteAccountUrl", "privacyPolicyUrl", "<init>", "(Leb/a0;Lor2/y;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "Ll42/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Ll42/a;)V", "Leb/a0;", "b", "Lor2/y;", "c", "Landroid/app/Activity;", "d", "Ljava/lang/String;", "e", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23334b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Activity activity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String deleteAccountUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String privacyPolicyUrl;

    public C23334b(AbstractC12939a0 navController, C28216y externalLinkNavigator, Activity activity, String deleteAccountUrl, String privacyPolicyUrl) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(deleteAccountUrl, "deleteAccountUrl");
        AbstractC22676k.m65750j(privacyPolicyUrl, "privacyPolicyUrl");
        this.navController = navController;
        this.externalLinkNavigator = externalLinkNavigator;
        this.activity = activity;
        this.deleteAccountUrl = deleteAccountUrl;
        this.privacyPolicyUrl = privacyPolicyUrl;
    }

    /* JADX INFO: renamed from: a */
    public final void m67567a(AbstractC23333a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC23333a.a.f92512a)) {
            this.navController.m36410z();
        } else if (event.equals(AbstractC23333a.b.f92513a)) {
            C28216y.m85414y(this.externalLinkNavigator, this.activity, this.deleteAccountUrl, false, 4, null);
        } else {
            if (!event.equals(AbstractC23333a.c.f92514a)) {
                throw new NoWhenBranchMatchedException();
            }
            C28216y.m85414y(this.externalLinkNavigator, this.activity, this.privacyPolicyUrl, false, 4, null);
        }
    }
}

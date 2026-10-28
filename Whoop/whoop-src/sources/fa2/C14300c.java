package fa2;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import com.whoop.settings.about.AbstractC10092a;
import fi0.InterfaceC14515a;
import or2.C28216y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fa2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lfa2/c;", "", "Lfi0/a;", "analytics", "Lor2/y;", "externalLinkNavigator", "<init>", "(Lfi0/a;Lor2/y;)V", "Lcom/whoop/settings/about/a;", NotificationCompat.CATEGORY_EVENT, "Landroid/app/Activity;", "activity", "", "eventName", "Lkotlin/Function1;", "Ll83/a0;", "onNavigate", "a", "(Lcom/whoop/settings/about/a;Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lfi0/a;", "b", "Lor2/y;", "c", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14300c {

    /* JADX INFO: renamed from: d */
    public static final int f52213d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    public C14300c(InterfaceC14515a analytics, C28216y externalLinkNavigator) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        this.analytics = analytics;
        this.externalLinkNavigator = externalLinkNavigator;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m40905b(C14300c c14300c, AbstractC10092a abstractC10092a, Activity activity, String str, Function1 function1, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str = "Settings - About";
        }
        c14300c.m40906a(abstractC10092a, activity, str, function1);
    }

    /* JADX INFO: renamed from: a */
    public final void m40906a(AbstractC10092a event, Activity activity, String eventName, Function1 onNavigate) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(eventName, "eventName");
        AbstractC22676k.m65750j(onNavigate, "onNavigate");
        if (event instanceof AbstractC10092a.f) {
            this.analytics.mo41424f("Terms of Use", "Open", null, eventName);
            this.analytics.mo41424f("Help", "Open", null, "Navigate Terms of Use");
            this.externalLinkNavigator.m85433v(activity);
            return;
        }
        if (event instanceof AbstractC10092a.c) {
            this.analytics.mo41424f("Privacy Policy", "Open", null, eventName);
            this.analytics.mo41424f("Help", "Open", null, "Navigate Terms of Use");
            this.externalLinkNavigator.m85429r(activity);
            return;
        }
        if (event instanceof AbstractC10092a.a) {
            this.analytics.mo41424f("Open Source Licenses", "Open", null, eventName);
            onNavigate.invoke("android-app://com.whoop/settings/opensourcelicenses");
            return;
        }
        if (event instanceof AbstractC10092a.b) {
            this.analytics.mo41424f("Patents", "Open", null, eventName);
            this.externalLinkNavigator.m85427p(activity);
        } else if (event instanceof AbstractC10092a.d) {
            this.analytics.mo41424f("Regulatory Labels", "Open", null, eventName);
            onNavigate.invoke("android-app://com.whoop/settings/regulatorylabels");
        } else {
            if (!(event instanceof AbstractC10092a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            this.analytics.mo41424f("Safety & Regulatory", "Open", null, eventName);
            this.externalLinkNavigator.m85431t(activity);
        }
    }
}

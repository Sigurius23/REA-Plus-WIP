package x82;

import android.app.PendingIntent;
import android.content.Context;
import hi0.AbstractC17307e;
import hi0.AbstractC17309g;
import p114eb.C12966j0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: x82.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lx82/g;", "Lx82/f;", "Lx82/b;", "navDeepLinkBuilder", "<init>", "(Lx82/b;)V", "Landroid/content/Context;", "context", "Landroid/app/PendingIntent;", "a", "(Landroid/content/Context;)Landroid/app/PendingIntent;", "b", "f", "c", "d", "e", "Lx82/b;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38080g implements InterfaceC38079f {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C38075b navDeepLinkBuilder;

    /* JADX INFO: renamed from: x82.g$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, m65681d2 = {"Lx82/g$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lx82/b;", "navDeepLinkBuilder", "Landroid/app/PendingIntent;", "d", "(Landroid/content/Context;Lx82/b;)Landroid/app/PendingIntent;", "c", "", "ACTION_ACKNOWLEDGED", "Ljava/lang/String;", "ACTION_DISMISSED", "ACTION_SLEEP_ACKNOWLEDGED", "ACTION_SLEEP_DISMISSED", "DISMISS_ACTION_TYPE", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public final PendingIntent m121996c(Context context, C38075b navDeepLinkBuilder) {
            C12966j0 c12966j0M121979a = navDeepLinkBuilder.m121979a(context);
            c12966j0M121979a.m36448g(AbstractC17309g.f66902a);
            C12966j0.m36442f(c12966j0M121979a, AbstractC17307e.f66792n3);
            return c12966j0M121979a.m36444b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final PendingIntent m121997d(Context context, C38075b navDeepLinkBuilder) {
            C12966j0 c12966j0M121979a = navDeepLinkBuilder.m121979a(context);
            c12966j0M121979a.m36448g(AbstractC17309g.f66902a);
            C12966j0.m36442f(c12966j0M121979a, AbstractC17307e.f66562D2);
            return c12966j0M121979a.m36444b();
        }

        private Companion() {
        }
    }

    public C38080g(C38075b navDeepLinkBuilder) {
        AbstractC22676k.m65750j(navDeepLinkBuilder, "navDeepLinkBuilder");
        this.navDeepLinkBuilder = navDeepLinkBuilder;
    }

    @Override // x82.InterfaceC38079f
    /* JADX INFO: renamed from: a */
    public PendingIntent mo121988a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return INSTANCE.m121997d(context, this.navDeepLinkBuilder);
    }

    @Override // x82.InterfaceC38079f
    /* JADX INFO: renamed from: b */
    public PendingIntent mo121989b(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return INSTANCE.m121996c(context, this.navDeepLinkBuilder);
    }

    @Override // x82.InterfaceC38079f
    /* JADX INFO: renamed from: c */
    public PendingIntent mo121990c(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return INSTANCE.m121997d(context, this.navDeepLinkBuilder);
    }

    @Override // x82.InterfaceC38079f
    /* JADX INFO: renamed from: d */
    public PendingIntent mo121991d(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return this.navDeepLinkBuilder.m121980b(context, "SleepLowBattery:Dismissed");
    }

    @Override // x82.InterfaceC38079f
    /* JADX INFO: renamed from: e */
    public PendingIntent mo121992e(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return INSTANCE.m121997d(context, this.navDeepLinkBuilder);
    }

    @Override // x82.InterfaceC38079f
    /* JADX INFO: renamed from: f */
    public PendingIntent mo121993f(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return this.navDeepLinkBuilder.m121980b(context, "LowBattery:Dismissed");
    }
}

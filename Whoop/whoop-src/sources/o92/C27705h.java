package o92;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import c12.C3853d;
import c12.EnumC3851b;
import com.whoop.data.featureFlags.CoreFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import hi0.AbstractC17307e;
import m92.AbstractC25319b;
import m92.C25323f;
import p114eb.C12966j0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import uv0.AbstractC35283c;

/* JADX INFO: renamed from: o92.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lo92/h;", "Lm92/b;", "Lo92/s;", "pushContext", "Landroid/content/Context;", "context", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "ffChecker", "", "logTag", "<init>", "(Lo92/s;Landroid/content/Context;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/lang/String;)V", "Lm92/f;", "dataMap", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "J", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "K", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "L", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27705h extends AbstractC25319b {

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: M */
    public static final int f111603M = 8;

    /* JADX INFO: renamed from: N */
    public static final C3853d f111604N;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final FeatureFlagChecker ffChecker;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: o92.h$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lo92/h$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "Lc12/d;", "SETTINGS", "Lc12/d;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m83745a(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            C27705h.f111604N.m11806e(manager, context);
        }

        private Companion() {
        }
    }

    static {
        C3853d c3853dM11813l = new C3853d(EnumC3851b.MAX, "00250_StrapBattery", AbstractC35283c.f150206w).m11811j(true).m11813l(true);
        AbstractC22676k.m65749i(c3853dM11813l, "setVibrationEnabled(...)");
        f111604N = c3853dM11813l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27705h(C27721s pushContext, Context context, FeatureFlagChecker ffChecker, String logTag) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(ffChecker, "ffChecker");
        AbstractC22676k.m65750j(logTag, "logTag");
        this.context = context;
        this.ffChecker = ffChecker;
        this.logTag = logTag;
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) {
        PendingIntent pendingIntentM36444b;
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        String string = context.getString(AbstractC35283c.f150190g);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = context.getString(AbstractC35283c.f150189f);
        AbstractC22676k.m65749i(string2, "getString(...)");
        NotificationCompat.Builder contentText = AbstractC25319b.m74341e(this, context, null, 2, null).setAutoCancel(true).setContentTitle(string).setContentText(string2);
        AbstractC22676k.m65749i(contentText, "setContentText(...)");
        f111604N.m11805a(contentText);
        contentText.setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(string).bigText(string2));
        if (this.ffChecker.isFeatureEnabled(CoreFeatureFlagsKt.BATTERY_NOTIFICATIONS_TO_DEVICE_SETTINGS)) {
            C12966j0 c12966j0M74345c = m74345c(context);
            C12966j0.m36442f(c12966j0M74345c, AbstractC17307e.f66792n3);
            pendingIntentM36444b = c12966j0M74345c.m36444b();
        } else {
            C12966j0 c12966j0M74345c2 = m74345c(context);
            C12966j0.m36442f(c12966j0M74345c2, AbstractC17307e.f66562D2);
            pendingIntentM36444b = c12966j0M74345c2.m36444b();
        }
        contentText.setContentIntent(pendingIntentM36444b);
        Notification notificationBuild = contentText.build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        AbstractC25319b.m74344y(this, 115, notificationBuild, context, string, string2, null, 32, null);
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C27705h(C27721s c27721s, Context context, FeatureFlagChecker featureFlagChecker, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27721s, context, featureFlagChecker, (i13 & 8) != 0 ? "DeadBatteryPushNotification" : str);
    }
}

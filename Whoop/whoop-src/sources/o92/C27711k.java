package o92;

import android.app.Notification;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import e93.AbstractC12889b;
import hi0.AbstractC17307e;
import l83.C23465k;
import m92.AbstractC25319b;
import m92.C25323f;
import p114eb.C12966j0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;

/* JADX INFO: renamed from: o92.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\rB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lo92/k;", "Lm92/b;", "Lo92/s;", "pushContext", "", "logTag", "<init>", "(Lo92/s;Ljava/lang/String;)V", "Lm92/f;", "dataMap", "Landroid/content/Context;", "context", "Ll83/a0;", "a", "(Lm92/f;Landroid/content/Context;)V", "I", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "J", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27711k extends AbstractC25319b {

    /* JADX INFO: renamed from: K */
    public static final int f111651K = 8;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String logTag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27711k(C27721s pushContext, String logTag) {
        super(pushContext);
        AbstractC22676k.m65750j(pushContext, "pushContext");
        AbstractC22676k.m65750j(logTag, "logTag");
        this.logTag = logTag;
    }

    @Override // m92.InterfaceC25322e
    /* JADX INFO: renamed from: a */
    public void mo24524a(C25323f dataMap, Context context) {
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        try {
            String strM74353r = m74353r(dataMap, "title");
            String strM74353r2 = m74353r(dataMap, "body");
            C12966j0 c12966j0M74345c = m74345c(context);
            C12966j0.m36442f(c12966j0M74345c, AbstractC17307e.f66592I2);
            c12966j0M74345c.m36447e(AbstractC12889b.m36273g(new C23465k("integrationId", "healthex"), new C23465k("source", "push_notification")));
            NotificationCompat.Builder autoCancel = AbstractC25319b.m74341e(this, context, null, 2, null).setContentIntent(c12966j0M74345c.m36444b()).setContentTitle(strM74353r).setContentText(strM74353r2).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(strM74353r).bigText(strM74353r2)).setAutoCancel(true);
            AbstractC22676k.m65749i(autoCancel, "setAutoCancel(...)");
            Notification notificationBuild = autoCancel.build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
            AbstractC25319b.m74344y(this, 127, notificationBuild, context, strM74353r, strM74353r2, null, 32, null);
        } catch (Exception e5) {
            m74350l().mo85230v("Failed to display HealthEx push notification", e5, new AbstractC30556a.a[0]);
        }
    }

    @Override // m92.AbstractC25319b
    /* JADX INFO: renamed from: n, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C27711k(C27721s c27721s, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27721s, (i13 & 2) != 0 ? "HealthExPushNotification" : str);
    }
}

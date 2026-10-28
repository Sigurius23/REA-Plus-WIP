package c12;

import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import b12.AbstractC2289e;
import b12.AbstractC2290f;
import b12.AbstractC2291g;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c12.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0011"}, m65681d2 = {"Lc12/e;", "Lc12/c;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "b", "(Landroid/content/Context;)Landroid/app/NotificationManager;", "Landroidx/core/app/NotificationCompat$Builder;", "a", "(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;", "Lc12/d;", "Lc12/d;", "SETTINGS_GENERAL", "c", "SETTINGS_ALERTS", "notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3854e implements InterfaceC3852c {

    /* JADX INFO: renamed from: a */
    public static final C3854e f15775a = new C3854e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final C3853d SETTINGS_GENERAL = new C3853d(EnumC3851b.HIGH, "00100_General", AbstractC2291g.f9089b);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final C3853d SETTINGS_ALERTS;

    static {
        C3853d c3853dM11811j = new C3853d(EnumC3851b.URGENT, "00200_Alerts", AbstractC2291g.f9088a).m11813l(true).m11811j(true);
        AbstractC22676k.m65749i(c3853dM11811j, "setLightsEnabled(...)");
        SETTINGS_ALERTS = c3853dM11811j;
    }

    private C3854e() {
    }

    @Override // c12.InterfaceC3852c
    /* JADX INFO: renamed from: a */
    public NotificationCompat.Builder mo11800a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        NotificationCompat.Builder color = new NotificationCompat.Builder(context, "00100_General").setAutoCancel(true).setSmallIcon(AbstractC2290f.f9087a).setColor(AbstractC32122c.getColor(context, AbstractC2289e.f9086a));
        AbstractC22676k.m65749i(color, "setColor(...)");
        return color;
    }

    @Override // c12.InterfaceC3852c
    /* JADX INFO: renamed from: b */
    public NotificationManager mo11801b(Context context) {
        AbstractC22676k.m65750j(context, "context");
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        SETTINGS_GENERAL.m11806e(notificationManager, context);
        SETTINGS_ALERTS.m11806e(notificationManager, context);
        return notificationManager;
    }
}

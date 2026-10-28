package vk2;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import kk2.AbstractC22551d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uv0.AbstractC35281a;
import uv0.AbstractC35282b;

/* JADX INFO: renamed from: vk2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lvk2/c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/PendingIntent;", "b", "(Landroid/content/Context;)Landroid/app/PendingIntent;", "Landroid/app/Notification;", "a", "(Landroid/content/Context;)Landroid/app/Notification;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36091c {

    /* JADX INFO: renamed from: a */
    public static final C36091c f154231a = new C36091c();

    private C36091c() {
    }

    /* JADX INFO: renamed from: b */
    private final PendingIntent m114637b(Context context) {
        Intent intent;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        Intent flags = null;
        if (launchIntentForPackage != null && (intent = launchIntentForPackage.setPackage(null)) != null) {
            flags = intent.setFlags(270532608);
        }
        PendingIntent activity = PendingIntent.getActivity(context, 930182746, flags, 67108864);
        AbstractC22676k.m65749i(activity, "getActivity(...)");
        return activity;
    }

    /* JADX INFO: renamed from: a */
    public final Notification m114638a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        Notification notificationBuild = new NotificationCompat.Builder(context, "06000_RealTimeActivities").setContentTitle(context.getString(AbstractC22551d.f88666H)).setContentText(context.getString(AbstractC22551d.f88665G)).setTicker(context.getString(AbstractC22551d.f88665G)).setSmallIcon(AbstractC35282b.f150162a).setColor(context.getColor(AbstractC35281a.f150161a)).setOngoing(true).setShowWhen(false).setCategory("workout").setContentIntent(m114637b(context)).build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        return notificationBuild;
    }
}

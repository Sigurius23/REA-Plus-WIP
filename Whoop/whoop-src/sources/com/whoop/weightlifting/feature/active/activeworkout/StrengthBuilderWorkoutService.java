package com.whoop.weightlifting.feature.active.activeworkout;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import cu2.AbstractC11128h;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pu2.AbstractC29555c;
import uv0.AbstractC35281a;
import uv0.AbstractC35282b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\f"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/StrengthBuilderWorkoutService;", "Landroid/app/Service;", "<init>", "()V", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "onBind", "Landroid/os/IBinder;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StrengthBuilderWorkoutService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        Notification notificationBuild = new NotificationCompat.Builder(this, "06000_RealTimeActivities").setContentTitle(AbstractC32122c.getString(this, AbstractC11128h.f35436W)).setContentText(AbstractC32122c.getString(this, AbstractC11128h.f35433V)).setTicker(AbstractC32122c.getString(this, AbstractC11128h.f35433V)).setSmallIcon(AbstractC35282b.f150162a).setColor(AbstractC32122c.getColor(this, AbstractC35281a.f150161a)).setContentIntent(AbstractC29555c.m90539b(this, null, 1, null)).setOngoing(true).setShowWhen(false).setCategory("workout").build();
        AbstractC22676k.m65749i(notificationBuild, "build(...)");
        startForeground(105, notificationBuild);
        return 1;
    }
}

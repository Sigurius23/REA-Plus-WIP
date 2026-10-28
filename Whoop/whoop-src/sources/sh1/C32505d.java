package sh1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.location.LocationRequest;
import com.whoop.gps.collector.BackgroundLocationReceiver;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sh1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lsh1/d;", "", "<init>", "()V", "Lcom/google/android/gms/location/LocationRequest;", "a", "()Lcom/google/android/gms/location/LocationRequest;", "Landroid/content/Context;", "context", "Landroid/app/PendingIntent;", "b", "(Landroid/content/Context;)Landroid/app/PendingIntent;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32505d {
    /* JADX INFO: renamed from: a */
    public final LocationRequest m101501a() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.m15630k(102);
        locationRequest.m15629i(300000L);
        locationRequest.m15628h(300000L);
        locationRequest.m15631s(500.0f);
        return locationRequest;
    }

    /* JADX INFO: renamed from: b */
    public final PendingIntent m101502b(Context context) {
        AbstractC22676k.m65750j(context, "context");
        Intent intent = new Intent(context, (Class<?>) BackgroundLocationReceiver.class);
        intent.setAction("com.whoop.gps.LOCATION_UPDATE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 1001, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        AbstractC22676k.m65749i(broadcast, "getBroadcast(...)");
        return broadcast;
    }
}

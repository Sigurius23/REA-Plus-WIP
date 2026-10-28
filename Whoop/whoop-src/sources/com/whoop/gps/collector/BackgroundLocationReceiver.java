package com.whoop.gps.collector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import s51.C32219p;
import sh1.C32507f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/gps/collector/BackgroundLocationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Ll83/a0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lsh1/f;", "a", "Ll83/h;", "b", "()Lsh1/f;", "koinHelper", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BackgroundLocationReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC23462h koinHelper = AbstractC30060g.m92088H(new C32219p(29));

    /* JADX INFO: renamed from: b */
    private final C32507f m21469b() {
        return (C32507f) this.koinHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C32507f m21470c() {
        return new C32507f(null, 1, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(intent, "intent");
        Parcelable.Creator<LocationResult> creator = LocationResult.CREATOR;
        LocationResult locationResult = !intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") ? null : (LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
        if (locationResult != null) {
            List<? extends Location> list = locationResult.f20590w;
            m21469b().getLogger().mo85216g(AbstractC2875y.m8296i(list.size(), "GPS RECEIVER: Received ", " location(s)"), new AbstractC30556a.a[0]);
            m21469b().m101511d(list);
        }
    }
}

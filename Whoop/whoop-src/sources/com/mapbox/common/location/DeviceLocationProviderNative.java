package com.mapbox.common.location;

import android.app.PendingIntent;
import android.os.Looper;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.Cancelable;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000  2\u00020\u0001:\u0002 !B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096 ¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096 ¢\u0006\u0004\b\u000e\u0010\nJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096 ¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0005¨\u0006\""}, m65681d2 = {"Lcom/mapbox/common/location/DeviceLocationProviderNative;", "Lcom/mapbox/common/location/DeviceLocationProvider;", "", "peer", "<init>", "(J)V", "Lcom/mapbox/common/location/LocationObserver;", "observer", "Ll83/a0;", "addLocationObserver", "(Lcom/mapbox/common/location/LocationObserver;)V", "Landroid/os/Looper;", "looper", "(Lcom/mapbox/common/location/LocationObserver;Landroid/os/Looper;)V", "removeLocationObserver", "Lcom/mapbox/common/location/GetLocationCallback;", "callback", "Lcom/mapbox/common/Cancelable;", "getLastLocation", "(Lcom/mapbox/common/location/GetLocationCallback;)Lcom/mapbox/common/Cancelable;", "Landroid/app/PendingIntent;", "pendingIntent", "requestLocationUpdates", "(Landroid/app/PendingIntent;)V", "removeLocationUpdates", "", "getName", "()Ljava/lang/String;", "J", "getPeer", "()J", "setPeer", "Companion", "DeviceLocationProviderPeerCleaner", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class DeviceLocationProviderNative implements DeviceLocationProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/mapbox/common/location/DeviceLocationProviderNative$Companion;", "", "<init>", "()V", "", "peer", "Ll83/a0;", "cleanNativePeer", "(J)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void cleanNativePeer(long peer) {
            DeviceLocationProviderNative.cleanNativePeer(peer);
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/mapbox/common/location/DeviceLocationProviderNative$DeviceLocationProviderPeerCleaner;", "Ljava/lang/Runnable;", "", "peer", "<init>", "(J)V", "Ll83/a0;", "run", "()V", "J", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class DeviceLocationProviderPeerCleaner implements Runnable {
        private final long peer;

        public DeviceLocationProviderPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            DeviceLocationProviderNative.INSTANCE.cleanNativePeer(this.peer);
        }
    }

    public DeviceLocationProviderNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new DeviceLocationProviderPeerCleaner(j7));
    }

    public static final native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.location.LocationProvider
    public native void addLocationObserver(LocationObserver observer);

    @Override // com.mapbox.common.location.LocationProvider
    public void addLocationObserver(LocationObserver observer, Looper looper) {
        AbstractC22676k.m65750j(observer, "observer");
        AbstractC22676k.m65750j(looper, "looper");
        throw new RuntimeException("There should be no native DeviceLocationProvider");
    }

    @Override // com.mapbox.common.location.LocationProvider
    public native Cancelable getLastLocation(GetLocationCallback callback);

    @Override // com.mapbox.common.location.DeviceLocationProvider
    public native String getName();

    public final long getPeer() {
        return this.peer;
    }

    @Override // com.mapbox.common.location.LocationProvider
    public native void removeLocationObserver(LocationObserver observer);

    @Override // com.mapbox.common.location.DeviceLocationProvider
    public void removeLocationUpdates(PendingIntent pendingIntent) {
        AbstractC22676k.m65750j(pendingIntent, "pendingIntent");
        throw new RuntimeException("There should be no native DeviceLocationProvider");
    }

    @Override // com.mapbox.common.location.DeviceLocationProvider
    public void requestLocationUpdates(PendingIntent pendingIntent) {
        AbstractC22676k.m65750j(pendingIntent, "pendingIntent");
        throw new RuntimeException("There should be no native DeviceLocationProvider");
    }

    public final void setPeer(long j7) {
        this.peer = j7;
    }
}

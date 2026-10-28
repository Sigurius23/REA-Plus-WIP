package com.mapbox.common.location;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\rR&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\u00128\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lcom/mapbox/common/location/BaseLocationProvider;", "Lcom/mapbox/common/location/LocationProvider;", "<init>", "()V", "", "Lcom/mapbox/common/location/Location;", "locations", "Ll83/a0;", "notifyLocationUpdate", "(Ljava/util/List;)V", "Lcom/mapbox/common/location/LocationObserver;", "observer", "addLocationObserver", "(Lcom/mapbox/common/location/LocationObserver;)V", "Landroid/os/Looper;", "looper", "(Lcom/mapbox/common/location/LocationObserver;Landroid/os/Looper;)V", "removeLocationObserver", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroid/os/Handler;", "observers", "Ljava/util/concurrent/ConcurrentHashMap;", "getObservers", "()Ljava/util/concurrent/ConcurrentHashMap;", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public abstract class BaseLocationProvider implements LocationProvider {
    protected static final Companion Companion = new Companion(null);
    protected static final Handler EMPTY_HANDLER = new Handler(Looper.getMainLooper());
    private final ConcurrentHashMap<LocationObserver, Handler> observers = new ConcurrentHashMap<>();

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0084\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0004X\u0085\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m65681d2 = {"Lcom/mapbox/common/location/BaseLocationProvider$Companion;", "", "()V", "EMPTY_HANDLER", "Landroid/os/Handler;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyLocationUpdate$lambda$1$lambda$0(LocationObserver observer, List locations) {
        AbstractC22676k.m65750j(observer, "$observer");
        AbstractC22676k.m65750j(locations, "$locations");
        observer.onLocationUpdateReceived(locations);
    }

    @Override // com.mapbox.common.location.LocationProvider
    public void addLocationObserver(LocationObserver observer) {
        AbstractC22676k.m65750j(observer, "observer");
        ConcurrentHashMap<LocationObserver, Handler> concurrentHashMap = this.observers;
        Looper looperMyLooper = Looper.myLooper();
        concurrentHashMap.put(observer, looperMyLooper != null ? new Handler(looperMyLooper) : EMPTY_HANDLER);
    }

    public final ConcurrentHashMap<LocationObserver, Handler> getObservers() {
        return this.observers;
    }

    public void notifyLocationUpdate(List<? extends Location> locations) {
        AbstractC22676k.m65750j(locations, "locations");
        for (Map.Entry<LocationObserver, Handler> entry : this.observers.entrySet()) {
            LocationObserver key = entry.getKey();
            Handler value = entry.getValue();
            if (AbstractC22676k.m65745e(value, EMPTY_HANDLER) || AbstractC22676k.m65745e(value.getLooper(), Looper.myLooper())) {
                key.onLocationUpdateReceived(locations);
            } else {
                value.post(new RunnableC5436e(3, key, locations));
            }
        }
    }

    @Override // com.mapbox.common.location.LocationProvider
    public void removeLocationObserver(LocationObserver observer) {
        AbstractC22676k.m65750j(observer, "observer");
        this.observers.remove(observer);
    }

    @Override // com.mapbox.common.location.LocationProvider
    public void addLocationObserver(LocationObserver observer, Looper looper) {
        AbstractC22676k.m65750j(observer, "observer");
        AbstractC22676k.m65750j(looper, "looper");
        this.observers.put(observer, new Handler(looper));
    }
}

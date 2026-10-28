package com.mapbox.common.geofencing;

import androidx.core.app.NotificationCompat;
import com.mapbox.bindgen.CleanerService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097 ¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0097 ¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0097 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0097 ¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lcom/mapbox/common/geofencing/GeofencingObserverNative;", "Lcom/mapbox/common/geofencing/GeofencingObserver;", "", "nativePeer", "<init>", "(J)V", "Lcom/mapbox/common/geofencing/GeofencingEvent;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "onEntry", "(Lcom/mapbox/common/geofencing/GeofencingEvent;)V", "onDwell", "onExit", "Lcom/mapbox/common/geofencing/GeofencingError;", "error", "onError", "(Lcom/mapbox/common/geofencing/GeofencingError;)V", "", "isConsentGiven", "onUserConsentChanged", "(Z)V", "peer", "J", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class GeofencingObserverNative implements GeofencingObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/mapbox/common/geofencing/GeofencingObserverNative$Companion;", "", "<init>", "()V", "", "peer", "Ll83/a0;", "cleanNativePeer", "(J)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cleanNativePeer(long peer) {
            GeofencingObserverNative.cleanNativePeer(peer);
        }

        private Companion() {
        }
    }

    private GeofencingObserverNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new RunnableC5421a(j7, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(long j7) {
        INSTANCE.cleanNativePeer(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.geofencing.GeofencingObserver
    public native void onDwell(GeofencingEvent event);

    @Override // com.mapbox.common.geofencing.GeofencingObserver
    public native void onEntry(GeofencingEvent event);

    @Override // com.mapbox.common.geofencing.GeofencingObserver
    public native void onError(GeofencingError error);

    @Override // com.mapbox.common.geofencing.GeofencingObserver
    public native void onExit(GeofencingEvent event);

    @Override // com.mapbox.common.geofencing.GeofencingObserver
    public native void onUserConsentChanged(boolean isConsentGiven);
}

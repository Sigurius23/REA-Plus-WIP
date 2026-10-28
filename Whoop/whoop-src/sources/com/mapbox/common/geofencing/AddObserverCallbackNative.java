package com.mapbox.common.geofencing;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096 ¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/mapbox/common/geofencing/AddObserverCallbackNative;", "Lcom/mapbox/common/geofencing/AddObserverCallback;", "", "nativePeer", "<init>", "(J)V", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/common/geofencing/GeofencingError;", "Lcom/mapbox/bindgen/None;", "result", "Ll83/a0;", "run", "(Lcom/mapbox/bindgen/Expected;)V", "peer", "J", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
final class AddObserverCallbackNative implements AddObserverCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/mapbox/common/geofencing/AddObserverCallbackNative$Companion;", "", "<init>", "()V", "", "peer", "Ll83/a0;", "cleanNativePeer", "(J)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cleanNativePeer(long peer) {
            AddObserverCallbackNative.cleanNativePeer(peer);
        }

        private Companion() {
        }
    }

    private AddObserverCallbackNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new RunnableC5421a(j7, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(long j7) {
        INSTANCE.cleanNativePeer(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.geofencing.AddObserverCallback
    public native void run(Expected<GeofencingError, None> result);
}

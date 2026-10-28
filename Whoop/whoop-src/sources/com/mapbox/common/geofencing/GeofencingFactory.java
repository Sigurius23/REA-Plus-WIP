package com.mapbox.common.geofencing;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/mapbox/common/geofencing/GeofencingFactory;", "", "", "nativePeer", "<init>", "(J)V", "Ll83/a0;", "setPeer", "peer", "J", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class GeofencingFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0087 ¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\f\u0010\u0003J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0087 ¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lcom/mapbox/common/geofencing/GeofencingFactory$Companion;", "", "<init>", "()V", "", "peer", "Ll83/a0;", "cleanNativePeer", "(J)V", "Lcom/mapbox/common/geofencing/GeofencingService;", "getOrCreate", "()Lcom/mapbox/common/geofencing/GeofencingService;", "reset", "custom", "setUserDefined", "(Lcom/mapbox/common/geofencing/GeofencingService;)V", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cleanNativePeer(long peer) {
            GeofencingFactory.cleanNativePeer(peer);
        }

        public final GeofencingService getOrCreate() {
            return GeofencingFactory.getOrCreate();
        }

        public final void reset() {
            GeofencingFactory.reset();
        }

        public final void setUserDefined(GeofencingService custom) {
            GeofencingFactory.setUserDefined(custom);
        }

        private Companion() {
        }
    }

    static {
        BaseMapboxInitializer.INSTANCE.init(MapboxSDKCommonInitializerImpl.class);
    }

    public GeofencingFactory(long j7) {
        setPeer(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cleanNativePeer(long j7);

    public static final native GeofencingService getOrCreate();

    public static final native void reset();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPeer$lambda$0(long j7) {
        INSTANCE.cleanNativePeer(j7);
    }

    public static final native void setUserDefined(GeofencingService geofencingService);

    public final void setPeer(long nativePeer) {
        this.peer = nativePeer;
        if (nativePeer == 0) {
            return;
        }
        CleanerService.register(this, new RunnableC5421a(nativePeer, 9));
    }
}

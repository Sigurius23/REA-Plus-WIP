package com.mapbox.common.geofencing;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/mapbox/common/geofencing/GeofencingUtils;", "", "", "nativePeer", "<init>", "(J)V", "Ll83/a0;", "setPeer", "peer", "J", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class GeofencingUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0087 ¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tH\u0087 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tH\u0087 ¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lcom/mapbox/common/geofencing/GeofencingUtils$Companion;", "", "<init>", "()V", "", "peer", "Ll83/a0;", "cleanNativePeer", "(J)V", "", "isConsentGiven", "Lcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;", "callback", "setUserConsent", "(ZLcom/mapbox/common/geofencing/GeofencingUtilsUserConsentResponseCallback;)V", "getUserConsent", "()Z", "isActive", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cleanNativePeer(long peer) {
            GeofencingUtils.cleanNativePeer(peer);
        }

        public final boolean getUserConsent() {
            return GeofencingUtils.getUserConsent();
        }

        public final boolean isActive() {
            return GeofencingUtils.isActive();
        }

        public final void setUserConsent(boolean isConsentGiven, GeofencingUtilsUserConsentResponseCallback callback) {
            GeofencingUtils.setUserConsent(isConsentGiven, callback);
        }

        private Companion() {
        }
    }

    static {
        BaseMapboxInitializer.INSTANCE.init(MapboxSDKCommonInitializerImpl.class);
    }

    public GeofencingUtils(long j7) {
        setPeer(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cleanNativePeer(long j7);

    public static final native boolean getUserConsent();

    public static final native boolean isActive();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPeer$lambda$0(long j7) {
        INSTANCE.cleanNativePeer(j7);
    }

    public static final native void setUserConsent(boolean z4, GeofencingUtilsUserConsentResponseCallback geofencingUtilsUserConsentResponseCallback);

    public final void setPeer(long nativePeer) {
        this.peer = nativePeer;
        if (nativePeer == 0) {
            return;
        }
        CleanerService.register(this, new RunnableC5421a(nativePeer, 12));
    }
}

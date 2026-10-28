package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/mapbox/common/MapboxSupport;", "", "", "nativePeer", "<init>", "(J)V", "Ll83/a0;", "setPeer", "peer", "J", "Companion", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class MapboxSupport {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long peer;

    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0087 ¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u000e\u001a\u00020\nH\u0087 ¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/mapbox/common/MapboxSupport$Companion;", "", "<init>", "()V", "", "peer", "Ll83/a0;", "cleanNativePeer", "(J)V", "Lcom/mapbox/bindgen/Expected;", "", "Lcom/mapbox/bindgen/DataRef;", "getSupportPackageData", "()Lcom/mapbox/bindgen/Expected;", "fileName", "Lcom/mapbox/bindgen/None;", "saveSupportPackageToFile", "(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cleanNativePeer(long peer) {
            MapboxSupport.cleanNativePeer(peer);
        }

        public final Expected<String, DataRef> getSupportPackageData() {
            return MapboxSupport.getSupportPackageData();
        }

        public final Expected<String, None> saveSupportPackageToFile(String fileName) {
            return MapboxSupport.saveSupportPackageToFile(fileName);
        }

        private Companion() {
        }
    }

    static {
        BaseMapboxInitializer.INSTANCE.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MapboxSupport(long j7) {
        setPeer(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cleanNativePeer(long j7);

    public static final native Expected<String, DataRef> getSupportPackageData();

    public static final native Expected<String, None> saveSupportPackageToFile(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPeer$lambda$0(long j7) {
        INSTANCE.cleanNativePeer(j7);
    }

    public final void setPeer(final long nativePeer) {
        this.peer = nativePeer;
        if (nativePeer == 0) {
            return;
        }
        CleanerService.register(this, new Runnable() { // from class: com.mapbox.common.f
            @Override // java.lang.Runnable
            public final void run() {
                MapboxSupport.setPeer$lambda$0(nativePeer);
            }
        });
    }
}

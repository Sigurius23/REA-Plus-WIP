package live.hms.video.sdk;

import java.util.List;
import live.hms.video.interactivity.HmsInteractivityCenter;
import live.hms.video.sdk.managers.IManager;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.SDKUpdate;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m65681d2 = {"Llive/hms/video/sdk/HmsWhiteBoardManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;", "store", "Llive/hms/video/sdk/SDKStore;", "<init>", "(Llive/hms/video/sdk/SDKStore;)V", "getStore", "()Llive/hms/video/sdk/SDKStore;", "manage", "", "Llive/hms/video/sdk/models/SDKUpdate;", "params", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HmsWhiteBoardManager implements IManager<HMSNotifications.WhiteboardInfo> {
    private final SDKStore store;

    public HmsWhiteBoardManager(SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        this.store = store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.WhiteboardInfo params) {
        AbstractC22676k.m65750j(params, "params");
        HmsInteractivityCenter hmsInteractivityCenter = getStore().getHmsInteractivityCenter();
        if (hmsInteractivityCenter != null) {
            hmsInteractivityCenter.handleWhiteBoardStateNotification$lib_release(params);
        }
        return C25271y.f99162w;
    }
}

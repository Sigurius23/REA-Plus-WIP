package live.hms.video.sdk.managers;

import java.util.ArrayList;
import java.util.List;
import live.hms.video.error.HMSException;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSHLSStreamingState;
import live.hms.video.sdk.models.HMSHLSVariant;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.enums.HMSRoomUpdate;
import live.hms.video.sdk.models.enums.HMSStreamingState;
import live.hms.video.sdk.peerlist.models.BeamStreamingStates;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m65681d2 = {"Llive/hms/video/sdk/managers/HLSUpdateManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$HlsUpdateNotification;", "store", "Llive/hms/video/sdk/SDKStore;", "<init>", "(Llive/hms/video/sdk/SDKStore;)V", "getStore", "()Llive/hms/video/sdk/SDKStore;", "manage", "", "Llive/hms/video/sdk/models/SDKUpdate;", "params", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HLSUpdateManager implements IManager<HMSNotifications.HlsUpdateNotification> {
    private final SDKStore store;

    public HLSUpdateManager(SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        this.store = store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.HlsUpdateNotification params) {
        HMSStreamingState hMSStreamingState;
        HMSHLSVariant hMSHLSVariant;
        BeamStreamingStates state$lib_release;
        HMSHLSVariant hMSHLSVariant2;
        BeamStreamingStates state$lib_release2;
        HMSHLSVariant hMSHLSVariant3;
        BeamStreamingStates state$lib_release3;
        AbstractC22676k.m65750j(params, "params");
        HMSRoom hMSRoom = getStore().get_room();
        if (hMSRoom == null) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        HMSStreamingState state = hMSRoom.getHlsStreamingState().getState();
        ArrayList<HMSHLSVariant> variants = params.getVariants();
        if (state != ((variants == null || (hMSHLSVariant3 = variants.get(0)) == null || (state$lib_release3 = hMSHLSVariant3.getState$lib_release()) == null) ? null : state$lib_release3.toHMSStreamingState())) {
            ArrayList<HMSHLSVariant> variants2 = params.getVariants();
            boolean z4 = ((variants2 == null || (hMSHLSVariant2 = (HMSHLSVariant) AbstractC25265s.m74100H0(variants2)) == null || (state$lib_release2 = hMSHLSVariant2.getState$lib_release()) == null) ? null : state$lib_release2.toHMSStreamingState()) == HMSStreamingState.STARTED;
            ArrayList<HMSHLSVariant> variants3 = params.getVariants();
            HMSNotifications.ServerError serverError = params.getServerError();
            HMSException hmsException = serverError != null ? serverError.toHmsException() : null;
            ArrayList<HMSHLSVariant> variants4 = params.getVariants();
            if (variants4 == null || (hMSHLSVariant = (HMSHLSVariant) AbstractC25265s.m74100H0(variants4)) == null || (state$lib_release = hMSHLSVariant.getState$lib_release()) == null || (hMSStreamingState = state$lib_release.toHMSStreamingState()) == null) {
                hMSStreamingState = HMSStreamingState.NONE;
            }
            hMSRoom.setHlsStreamingState$lib_release(new HMSHLSStreamingState(z4, variants3, hmsException, hMSStreamingState));
            arrayList.add(new SDKUpdate.Room(HMSRoomUpdate.HLS_STREAMING_STATE_UPDATED));
        }
        return arrayList;
    }
}

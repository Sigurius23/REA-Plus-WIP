package live.hms.video.sdk.managers;

import java.util.ArrayList;
import java.util.List;
import live.hms.video.error.HMSException;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSBrowserRecordingState;
import live.hms.video.sdk.models.HMSHlsRecordingConfig;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.HMSServerRecordingState;
import live.hms.video.sdk.models.HmsHlsRecordingState;
import live.hms.video.sdk.models.RecordingType;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.enums.HMSRecordingState;
import live.hms.video.sdk.models.enums.HMSRoomUpdate;
import live.hms.video.sdk.peerlist.models.BeamRecordingStates;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m65681d2 = {"Llive/hms/video/sdk/managers/RecordingUpdateManager;", "Llive/hms/video/sdk/managers/IManager;", "Llive/hms/video/sdk/models/HMSNotifications$RecordUpdateNotification;", "store", "Llive/hms/video/sdk/SDKStore;", "<init>", "(Llive/hms/video/sdk/SDKStore;)V", "getStore", "()Llive/hms/video/sdk/SDKStore;", "manage", "", "Llive/hms/video/sdk/models/SDKUpdate;", "params", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class RecordingUpdateManager implements IManager<HMSNotifications.RecordUpdateNotification> {
    private final SDKStore store;

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecordingType.values().length];
            try {
                iArr[RecordingType.SFU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecordingType.BROWSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecordingType.HLS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RecordingUpdateManager(SDKStore store) {
        AbstractC22676k.m65750j(store, "store");
        this.store = store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public SDKStore getStore() {
        return this.store;
    }

    @Override // live.hms.video.sdk.managers.IManager
    public List<SDKUpdate> manage(HMSNotifications.RecordUpdateNotification params) {
        HMSRecordingState hMSRecordingState;
        HMSRecordingState hMSRecordingState2;
        HMSRecordingState hMSRecordingState3;
        AbstractC22676k.m65750j(params, "params");
        HMSRoom hMSRoom = getStore().get_room();
        if (hMSRoom == null) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = WhenMappings.$EnumSwitchMapping$0[params.getType().ordinal()];
        if (i13 == 1) {
            HMSRecordingState state = hMSRoom.getServerRecordingState().getState();
            BeamRecordingStates state2 = params.getState();
            if (state != (state2 != null ? state2.toHMSRecordingState() : null)) {
                boolean z4 = params.getState() == BeamRecordingStates.started || params.getState() == BeamRecordingStates.resumed;
                HMSNotifications.ServerError error = params.getError();
                HMSException hmsException = error != null ? error.toHmsException() : null;
                Long startedAt = params.getStartedAt();
                BeamRecordingStates state3 = params.getState();
                if (state3 == null || (hMSRecordingState = state3.toHMSRecordingState()) == null) {
                    hMSRecordingState = HMSRecordingState.NONE;
                }
                hMSRoom.setServerRecordingState$lib_release(new HMSServerRecordingState(z4, hmsException, startedAt, hMSRecordingState));
                arrayList.add(new SDKUpdate.Room(HMSRoomUpdate.SERVER_RECORDING_STATE_UPDATED));
            }
        } else if (i13 == 2) {
            HMSRecordingState state4 = hMSRoom.getBrowserRecordingState().getState();
            BeamRecordingStates state5 = params.getState();
            if (state4 != (state5 != null ? state5.toHMSRecordingState() : null)) {
                boolean z13 = params.getState() == BeamRecordingStates.started || params.getState() == BeamRecordingStates.resumed;
                HMSNotifications.ServerError error2 = params.getError();
                HMSException hmsException2 = error2 != null ? error2.toHmsException() : null;
                Long startedAt2 = params.getStartedAt();
                Long stoppedAt = params.getStoppedAt();
                boolean z14 = params.getState() == BeamRecordingStates.initialised;
                BeamRecordingStates state6 = params.getState();
                if (state6 == null || (hMSRecordingState2 = state6.toHMSRecordingState()) == null) {
                    hMSRecordingState2 = HMSRecordingState.NONE;
                }
                hMSRoom.setBrowserRecordingState$lib_release(new HMSBrowserRecordingState(z13, hmsException2, startedAt2, stoppedAt, z14, hMSRecordingState2));
                arrayList.add(new SDKUpdate.Room(HMSRoomUpdate.BROWSER_RECORDING_STATE_UPDATED));
                return arrayList;
            }
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            HMSRecordingState state7 = hMSRoom.getHlsRecordingState().getState();
            BeamRecordingStates state8 = params.getState();
            if (state7 != (state8 != null ? state8.toHMSRecordingState() : null)) {
                Boolean boolValueOf = Boolean.valueOf(params.getState() == BeamRecordingStates.started || params.getState() == BeamRecordingStates.resumed);
                Long startedAt3 = params.getStartedAt();
                HMSHlsRecordingConfig hlsRecordingConfig = hMSRoom.getHlsRecordingState().getHlsRecordingConfig();
                HMSNotifications.ServerError error3 = params.getError();
                HMSException hmsException3 = error3 != null ? error3.toHmsException() : null;
                BeamRecordingStates state9 = params.getState();
                if (state9 == null || (hMSRecordingState3 = state9.toHMSRecordingState()) == null) {
                    hMSRecordingState3 = HMSRecordingState.NONE;
                }
                hMSRoom.setHlsRecordingState$lib_release(new HmsHlsRecordingState(boolValueOf, startedAt3, hlsRecordingConfig, hmsException3, hMSRecordingState3));
                arrayList.add(new SDKUpdate.Room(HMSRoomUpdate.HLS_RECORDING_STATE_UPDATED));
                return arrayList;
            }
        }
        return arrayList;
    }
}

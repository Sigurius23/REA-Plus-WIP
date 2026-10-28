package live.hms.video.sdk.managers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSBrowserRecordingState;
import live.hms.video.sdk.models.HMSHLSStreamingState;
import live.hms.video.sdk.models.HMSHLSVariant;
import live.hms.video.sdk.models.HMSHlsRecordingConfig;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.HMSRtmpStreamingState;
import live.hms.video.sdk.models.HMSServerRecordingState;
import live.hms.video.sdk.models.HmsHlsRecordingState;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.Transcriptions;
import live.hms.video.sdk.models.enums.HMSRecordingState;
import live.hms.video.sdk.models.enums.HMSRoomUpdate;
import live.hms.video.sdk.models.enums.HMSStreamingState;
import live.hms.video.sdk.peerlist.models.BeamRecordingStates;
import live.hms.video.sdk.peerlist.models.BeamStreamingStates;
import live.hms.video.sdk.peerlist.models.Browser;
import live.hms.video.sdk.peerlist.models.Hls;
import live.hms.video.sdk.peerlist.models.Recording;
import live.hms.video.sdk.peerlist.models.Sfu;
import live.hms.video.utils.HMSLogger;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/sdk/managers/UseCaseUpdateHmsRoom;", "", "<init>", "()V", "Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;", "newRoom", "Llive/hms/video/sdk/SDKStore;", "store", "Ll83/a0;", "saveHMSRoom", "(Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;Llive/hms/video/sdk/SDKStore;)V", "", "Llive/hms/video/sdk/models/SDKUpdate;", "updateHmsRoom", "(Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;Llive/hms/video/sdk/SDKStore;)Ljava/util/List;", "", "TAG", "Ljava/lang/String;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class UseCaseUpdateHmsRoom {
    private final String TAG = "UseCaseUpdateRecordingStreaming";

    private final void saveHMSRoom(HMSNotifications.InitialRoom newRoom, SDKStore store) {
        Hls hls;
        HMSRecordingState hMSRecordingState;
        HMSNotifications.Hls hls2;
        HMSStreamingState hMSStreamingState;
        HMSHLSVariant hMSHLSVariant;
        BeamStreamingStates state$lib_release;
        HMSHLSVariant hMSHLSVariant2;
        Sfu sfu;
        HMSRecordingState hMSRecordingState2;
        Browser browser;
        HMSRecordingState hMSRecordingState3;
        HMSNotifications.Rtmp rtmp;
        HMSStreamingState hMSStreamingState2;
        Object next;
        HMSRoom hMSRoom = store.get_room();
        if (newRoom == null || hMSRoom == null) {
            return;
        }
        List<Transcriptions> transcriptions = newRoom.getTranscriptions();
        if (transcriptions != null) {
            for (Transcriptions transcriptions2 : transcriptions) {
                Iterator<T> it = hMSRoom.get_transcriptions$lib_release().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((Transcriptions) next).getMode() != transcriptions2.getMode());
                Transcriptions transcriptions3 = (Transcriptions) next;
                if (transcriptions3 != null) {
                    transcriptions3.update$lib_release(transcriptions2);
                } else {
                    hMSRoom.get_transcriptions$lib_release().add(transcriptions2);
                }
            }
        }
        hMSRoom.setStartedAt(Long.valueOf(newRoom.getStartedAt()));
        hMSRoom.setSessionId$lib_release(newRoom.getSessionId());
        hMSRoom.setName(newRoom.getName());
        hMSRoom.setRoomId(newRoom.getRoomId());
        HMSNotifications.Streaming streaming = newRoom.getStreaming();
        if (streaming != null && (rtmp = streaming.getRtmp()) != null) {
            boolean z4 = rtmp.getState() == BeamStreamingStates.started;
            Long startedAt = rtmp.getStartedAt();
            Long stoppedAt = rtmp.getStoppedAt();
            BeamStreamingStates state = rtmp.getState();
            if (state == null || (hMSStreamingState2 = state.toHMSStreamingState()) == null) {
                hMSStreamingState2 = HMSStreamingState.NONE;
            }
            hMSRoom.setRtmpHMSRtmpStreamingState$lib_release(new HMSRtmpStreamingState(z4, null, startedAt, stoppedAt, hMSStreamingState2));
        }
        Recording recording = newRoom.getRecording();
        if (recording != null && (browser = recording.getBrowser()) != null) {
            boolean z13 = browser.getState() == BeamRecordingStates.started || browser.getState() == BeamRecordingStates.resumed;
            Long startedAt2 = browser.getStartedAt();
            Long stoppedAt2 = browser.getStoppedAt();
            boolean z14 = browser.getState() == BeamRecordingStates.initialised;
            BeamRecordingStates state2 = browser.getState();
            if (state2 == null || (hMSRecordingState3 = state2.toHMSRecordingState()) == null) {
                hMSRecordingState3 = HMSRecordingState.NONE;
            }
            hMSRoom.setBrowserRecordingState$lib_release(new HMSBrowserRecordingState(z13, null, startedAt2, stoppedAt2, z14, hMSRecordingState3));
        }
        Recording recording2 = newRoom.getRecording();
        if (recording2 != null && (sfu = recording2.getSfu()) != null) {
            boolean z15 = sfu.getState() == BeamRecordingStates.started || sfu.getState() == BeamRecordingStates.resumed;
            Long startedAt3 = sfu.getStartedAt();
            BeamRecordingStates state3 = sfu.getState();
            if (state3 == null || (hMSRecordingState2 = state3.toHMSRecordingState()) == null) {
                hMSRecordingState2 = HMSRecordingState.NONE;
            }
            hMSRoom.setServerRecordingState$lib_release(new HMSServerRecordingState(z15, null, startedAt3, hMSRecordingState2));
        }
        HMSNotifications.Streaming streaming2 = newRoom.getStreaming();
        if (streaming2 != null && (hls2 = streaming2.getHls()) != null) {
            ArrayList<HMSHLSVariant> variants = hls2.getVariants();
            boolean z16 = ((variants == null || (hMSHLSVariant2 = (HMSHLSVariant) AbstractC25265s.m74100H0(variants)) == null) ? null : hMSHLSVariant2.getState$lib_release()) == BeamStreamingStates.started;
            ArrayList<HMSHLSVariant> variants2 = hls2.getVariants();
            ArrayList<HMSHLSVariant> variants3 = hls2.getVariants();
            if (variants3 == null || (hMSHLSVariant = (HMSHLSVariant) AbstractC25265s.m74100H0(variants3)) == null || (state$lib_release = hMSHLSVariant.getState$lib_release()) == null || (hMSStreamingState = state$lib_release.toHMSStreamingState()) == null) {
                hMSStreamingState = HMSStreamingState.NONE;
            }
            hMSRoom.setHlsStreamingState$lib_release(new HMSHLSStreamingState(z16, variants2, null, hMSStreamingState));
        }
        Recording recording3 = newRoom.getRecording();
        if (recording3 == null || (hls = recording3.getHls()) == null) {
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(hls.getState() == BeamRecordingStates.started || hls.getState() == BeamRecordingStates.resumed);
        Long startedAt4 = hls.getStartedAt();
        HMSHlsRecordingConfig hlsRecordingConfig = hls.getHlsRecordingConfig();
        BeamRecordingStates state4 = hls.getState();
        if (state4 == null || (hMSRecordingState = state4.toHMSRecordingState()) == null) {
            hMSRecordingState = HMSRecordingState.NONE;
        }
        hMSRoom.setHlsRecordingState$lib_release(new HmsHlsRecordingState(boolValueOf, startedAt4, hlsRecordingConfig, null, hMSRecordingState));
    }

    public final List<SDKUpdate> updateHmsRoom(HMSNotifications.InitialRoom newRoom, SDKStore store) {
        HMSRecordingState hMSRecordingState;
        HMSRecordingState hMSRecordingState2;
        HMSStreamingState hMSStreamingState;
        Enum state$lib_release;
        HMSRecordingState hMSRecordingState3;
        Hls hls;
        BeamRecordingStates state;
        HMSNotifications.Hls hls2;
        ArrayList<HMSHLSVariant> variants;
        HMSHLSVariant hMSHLSVariant;
        HMSNotifications.Rtmp rtmp;
        BeamStreamingStates state2;
        Sfu sfu;
        BeamRecordingStates state3;
        Browser browser;
        BeamRecordingStates state4;
        AbstractC22676k.m65750j(store, "store");
        ArrayList arrayList = new ArrayList();
        HMSRoom hMSRoom = store.get_room();
        if (newRoom == null || hMSRoom == null) {
            if (newRoom == null) {
                HMSLogger.m71137e(this.TAG, "new room received is null");
                return arrayList;
            }
            if (hMSRoom == null) {
                HMSLogger.m71137e(this.TAG, "Local room from SDK Store was null");
            }
            return arrayList;
        }
        HMSRecordingState state5 = hMSRoom.getBrowserRecordingState().getState();
        Recording recording = newRoom.getRecording();
        if (recording == null || (browser = recording.getBrowser()) == null || (state4 = browser.getState()) == null || (hMSRecordingState = state4.toHMSRecordingState()) == null) {
            hMSRecordingState = HMSRecordingState.NONE;
        }
        if (state5 != hMSRecordingState) {
            arrayList.add(new SDKUpdate.Room(HMSRoomUpdate.BROWSER_RECORDING_STATE_UPDATED));
        }
        HMSRecordingState state6 = hMSRoom.getServerRecordingState().getState();
        Recording recording2 = newRoom.getRecording();
        if (recording2 == null || (sfu = recording2.getSfu()) == null || (state3 = sfu.getState()) == null || (hMSRecordingState2 = state3.toHMSRecordingState()) == null) {
            hMSRecordingState2 = HMSRecordingState.NONE;
        }
        if (state6 != hMSRecordingState2) {
            arrayList.add(new SDKUpdate.Room(HMSRoomUpdate.SERVER_RECORDING_STATE_UPDATED));
        }
        HMSStreamingState state7 = hMSRoom.getRtmpHMSRtmpStreamingState().getState();
        HMSNotifications.Streaming streaming = newRoom.getStreaming();
        if (streaming == null || (rtmp = streaming.getRtmp()) == null || (state2 = rtmp.getState()) == null || (hMSStreamingState = state2.toHMSStreamingState()) == null) {
            hMSStreamingState = HMSStreamingState.NONE;
        }
        if (state7 != hMSStreamingState) {
            arrayList.add(new SDKUpdate.Room(HMSRoomUpdate.RTMP_STREAMING_STATE_UPDATED));
        }
        Enum state8 = hMSRoom.getHlsStreamingState().getState();
        HMSNotifications.Streaming streaming2 = newRoom.getStreaming();
        if (streaming2 == null || (hls2 = streaming2.getHls()) == null || (variants = hls2.getVariants()) == null || (hMSHLSVariant = (HMSHLSVariant) AbstractC25265s.m74100H0(variants)) == null || (state$lib_release = hMSHLSVariant.getState$lib_release()) == null) {
            state$lib_release = HMSStreamingState.NONE;
        }
        if (state8 != state$lib_release) {
            arrayList.add(new SDKUpdate.Room(HMSRoomUpdate.HLS_STREAMING_STATE_UPDATED));
        }
        HMSRecordingState state9 = hMSRoom.getHlsRecordingState().getState();
        Recording recording3 = newRoom.getRecording();
        if (recording3 == null || (hls = recording3.getHls()) == null || (state = hls.getState()) == null || (hMSRecordingState3 = state.toHMSRecordingState()) == null) {
            hMSRecordingState3 = HMSRecordingState.NONE;
        }
        if (state9 != hMSRecordingState3) {
            arrayList.add(new SDKUpdate.Room(HMSRoomUpdate.HLS_RECORDING_STATE_UPDATED));
        }
        if (!AbstractC22676k.m65745e(hMSRoom.getTranscriptions(), newRoom.getTranscriptions()) && (!hMSRoom.getTranscriptions().isEmpty() || newRoom.getTranscriptions() != null)) {
            arrayList.add(new SDKUpdate.Room(HMSRoomUpdate.TRANSCRIPTIONS_UPDATED));
        }
        saveHMSRoom(newRoom, store);
        return arrayList;
    }
}

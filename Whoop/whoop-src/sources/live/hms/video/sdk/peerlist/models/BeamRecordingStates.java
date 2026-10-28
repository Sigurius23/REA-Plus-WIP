package live.hms.video.sdk.peerlist.models;

import ge3.AbstractC15751g;
import io.getstream.chat.android.models.MessageType;
import live.hms.video.sdk.models.enums.HMSRecordingState;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, m65681d2 = {"Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;", "", "<init>", "(Ljava/lang/String;I)V", "none", "initialised", "paused", "resumed", "started", "stopped", MessageType.FAILED, "toHMSRecordingState", "Llive/hms/video/sdk/models/enums/HMSRecordingState;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public enum BeamRecordingStates {
    none,
    initialised,
    paused,
    resumed,
    started,
    stopped,
    failed;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BeamRecordingStates.values().length];
            try {
                iArr[BeamRecordingStates.none.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeamRecordingStates.initialised.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeamRecordingStates.paused.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeamRecordingStates.resumed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BeamRecordingStates.started.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BeamRecordingStates.stopped.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BeamRecordingStates.failed.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final HMSRecordingState toHMSRecordingState() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return HMSRecordingState.NONE;
            case 2:
                return HMSRecordingState.STARTING;
            case 3:
                return HMSRecordingState.PAUSED;
            case 4:
                return HMSRecordingState.RESUMED;
            case 5:
                return HMSRecordingState.STARTED;
            case 6:
                return HMSRecordingState.STOPPED;
            case 7:
                return HMSRecordingState.FAILED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
